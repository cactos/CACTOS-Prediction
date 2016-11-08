import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

import scala.collection.JavaConverters._ 
import scala.collection.JavaConversions._
import java.nio.ByteBuffer
import scala.collection.mutable.ListBuffer

import org.apache.spark.rdd.NewHadoopRDD
import org.apache.spark.rdd.RDD

//for Linear Regression..
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.regression.LinearRegressionModel
import org.apache.spark.mllib.regression.LinearRegressionWithSGD
import org.apache.spark.mllib.feature.{StandardScaler, StandardScalerModel}

//for mathematical calculations..
import java.lang.Math
import math._

//for exception handling..
import scala.util.Try

//for turning off console logs..
import org.apache.log4j.Logger
import org.apache.log4j.Level

//to use linux commands like rm
import scala.sys.process._

//to check if model file already exists..
import java.nio.file.{Paths, Files}

object CACTOS_predictor_executor_2 {

  //Spark configuration...
  val sparkConf = new SparkConf().setAppName("CACTOS_predictor_executor_2")
  val sc = new SparkContext(sparkConf)
    
	def main(args: Array[String]) {
    
    // Turning console logs off...
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)

    //start timestamp..
    val startTimestamp: Long = System.currentTimeMillis

    if (args.size > 3 && args.size < 6)
     {
     // Load and parse the data
     val data = sc.textFile("CACTOS_predictor_input_data/part-00000")
     val data2 = data.map(x=>x.replace(')', ' ').trim)
     val data3 = data2.map(x=>x.replace('(', ' ').trim)
     val data4 = data3.map(x => x.split(',')).map {case Array(f1,f2,f3,f4,f5,f6,f7,f8) => (f1,f2,f3,f4,f5,f6,f7,f8)}
     val data5 = data4.filter(_._8.toDouble!=0.0)
     val data6 = data5.filter(_._2.trim == args(0)) // command line argument 0 - core number (eg. 1, 2 etc)
     val data7 = data6.filter(_._5.trim == args(1)) // command line argument 1 - input file (e.g lccsd-SP02, lccsd-SP01 etc)
     val data8 = data7.filter(_._6.trim == args(2))// command line argument 2 - disk type (eg. ssd, hdd etc)
     val data9 = data8.map {case (f1,f2,f3,f4,f5,f6,f7,f8) => (f4.toDouble,Array(f3.toDouble,(f8.toDouble/(60*1000))))}

     //data9.map(x=>(x._1,x._2(0),x._2(1))).collect.foreach(println)
     
     val parsedData = data9.map { line =>
     LabeledPoint(line._1, Vectors.dense(line._2))
     }.cache()

     println ("\n\n<<<<<<<< Parsed input data (execution time (in minutes), [VM_memory, Molpro_memory]) >>>>>>>>>>")
     parsedData.collect.foreach(println)

     var modelID = args(0) + "_" +  args(1)+ "_" +  args(2)
     var fileExists = Files.exists(Paths.get("models_executor_2/" + modelID))
     var stepSize = 0.001

     if(args(3) == "build") {
       if (parsedData.count>0) {
         if (args.size == 5)
         stepSize = args(4).toDouble      
         generateModel(modelID, parsedData, stepSize)
     }
     else
        println("\n\nData for [" + modelID + "] doesn't exist!"
         + "\nPlease reload input data from HBase")
      
     }
     else {
       val data10 = data8.filter(_._3.trim == args(3))// //command line argument 3 - VM RAM size
       //println("total records: " + data10.count)
       //data10.collect.foreach(println)
       if (data10.count>0) {
         var minExeVal = data10.map(_._8).min().toDouble
         val data11 = data10.filter(_._8.toDouble == minExeVal)
         println ("\n\nMolpro memory for minimum execution time with " + modelID + "_" + args(3) 
            + " => core_numbers, input_file, disk_type, VM_memory]:\n "
            + data11.map(_._4).take(1)(0) + " GB (searched value from database) \n\n") 
       }
     else {
      if (fileExists == true) {
        if (args.size == 5)
        {
      	 val prediction = executePredictor(modelID, args(3), args(4))
         println ("\n\nMolpro memory for minimum execution time with " + modelID + "_" + args(3) + "_" + args(4) 
           + " => core_numbers, input_file, disk_type, VM_memory Expected_execution_time (in mins)]:\n "
           + prediction + " GB (predicted value form learned model) \n\n")
        }
        else
          println("\n\nIncorrect number of commandline arguments! it should be like:" + 
                 "\n[core_numbers input_file disk_type VM_memory Expected_execution_time (in mins)] \n\n")
       }
       else
         println("\n\nModel for [" + modelID + "] doesn't exist! please build the model using commadline arguments:" 
           + "\n[core_numbers input_file disk_type build] or" 
           + "\n[core_numbers input_file disk_type build step_size] \n\n")
     }
    }
   }
	
   else
       println("\n\nIncorrect number of commandline arguments!" + 
       " it should be like\n[core_numbers input_file disk_type build] or" +
       "\n[core_numbers input_file disk_type build step_size] or " + 
       "\n[core_numbers input_file disk_type VM_memory] or " + 
       "\n[core_numbers input_file disk_type VM_memory Expected_execution_time (in mins)] \n\n")
     
     //Caculating execution time..
      val endTimestamp: Long = System.currentTimeMillis
      val executionTime: Long = (endTimestamp - startTimestamp)/1000//in seconds..
      println("\n\nTotal analysis time >>>>> " + executionTime + " seconds / " + executionTime/60 + " minutes\n\n")
     
  }

  // Building the model..
  def generateModel(modelID:String, parsedData: RDD[org.apache.spark.mllib.regression.LabeledPoint], stepSizeCarried:Double) = {
  
     val numIterations = 100
     //val stepSize = 0.001
     val stepSize = stepSizeCarried
     val model = LinearRegressionWithSGD.train(parsedData, numIterations, stepSize)
     
     // Evaluating model on training data and computing training error
     val valuesAndPreds = parsedData.map { point =>
     val prediction = model.predict(point.features)
     (point.label, prediction)
     }

     valuesAndPreds.collect().foreach(println)
     val MSE = valuesAndPreds.map{ case(v, p) => math.pow((v - p), 2)}.mean()
     println("\n\nTraining Mean Squared Error = " + MSE)
     println("\nImprove training by tuning stepSize argument like (default is 0.001):" +
     "\n[core_numbers input_file disk_type build step_size] \n\n")

     //Save the model
     var fileExists = Files.exists(Paths.get("models_executor_2/" + modelID))
     if (fileExists == true)
     println("rm -r models_executor_2/" + modelID !!)
     model.save(sc, "models_executor_2/" + modelID)

  }

  //Executing the predictor..
  def executePredictor(modelID:String, arg3:String, arg4:String):Double = {
     val storedModel = LinearRegressionModel.load(sc, "models_executor_2/" + modelID)      
     var commandInput = Vectors.dense(Array(arg3.toDouble, arg4.toDouble)) //command line argument 3 - VM RAM size, argument 4 - Molpro RAM size
     val prediction = storedModel.predict(commandInput)
     prediction
  }
  
}
   