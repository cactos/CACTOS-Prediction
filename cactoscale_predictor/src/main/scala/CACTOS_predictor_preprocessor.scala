import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

import scala.collection.JavaConverters._ 
import scala.collection.JavaConversions._
import java.nio.ByteBuffer
import scala.collection.mutable.ListBuffer

import org.apache.hadoop.hbase.{HBaseConfiguration, HTableDescriptor}
import org.apache.hadoop.hbase.mapreduce.TableInputFormat
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.client.Result

import org.apache.hadoop.hbase.client.ResultScanner
import org.apache.hadoop.hbase.client.Scan
import org.apache.hadoop.hbase.filter.Filter
import org.apache.hadoop.hbase.filter.PrefixFilter
import org.apache.hadoop.hbase.filter.ColumnPrefixFilter

import org.apache.hadoop.hbase.client.HBaseAdmin 
import org.apache.hadoop.hbase.HColumnDescriptor
import org.apache.hadoop.hbase.HTableDescriptor
import org.apache.hadoop.hbase.client.Get
import org.apache.hadoop.hbase.client.HBaseAdmin
import org.apache.hadoop.hbase.client.HTable 
import org.apache.hadoop.hbase.HConstants

import org.apache.hadoop.hbase.util.Bytes

import org.apache.spark.rdd.NewHadoopRDD
import org.apache.spark.rdd.RDD

//to use linux commands like rm
import scala.sys.process._

//to check if model file already exists..
import java.nio.file.{Paths, Files}

//for mathematical calculations..
import java.lang.Math
import math._

//for machine-learning purposes...
import org.apache.spark.mllib.linalg._
import org.apache.spark.mllib.stat.Statistics

//for exception handling..
import scala.util.Try

//for turning off console logs..
import org.apache.log4j.Logger
import org.apache.log4j.Level

object CACTOS_predictor_preprocessor {
	def main(args: Array[String]) {
    // Spark configuration...
    val sparkConf = new SparkConf().setAppName("CACTOS_predictor_preprocessor")
    val sc = new SparkContext(sparkConf)

    // Turning console logs off...
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)

    //start timestamp..
    val startTimestamp: Long = System.currentTimeMillis

     //reading from first input file..
     val inputD1 = "CACTOS_predictor_raw_data/workload_joblist.txt"
     val inputD1_rdd = sc.textFile(inputD1, 2).cache()
     val inputD1_rdd2 = inputD1_rdd.map(x => x.split(' ')).map {case Array(f1,f2,f3,f4,f5,f6) => (f1,f2,f3,f4,f5)}
     val inputD1_rdd_final = inputD1_rdd2.zipWithIndex.map {case (row, index) => (index+1,row)}
      
     //inputD1_rdd_final.collect.foreach(println)

     //reading from second input file..
     val inputD2 = "CACTOS_predictor_raw_data/molpro-jobs-history.txt"
     val inputD2_rdd = sc.textFile(inputD2, 2).cache()
     val inputD2_list = inputD2_rdd.collect.toList

     var inputD2_finalListBuffer = new ListBuffer[String]()  

     //println("total vm rows: "  + inputD2_finalListBuffer.size)

     //reading from HBase storage..
     for( row <- 0 until inputD2_list.size) {
     	 if(inputD2_list(row).contains("spawned"))
     	 {
     	 	if(inputD2_list(row-1).contains("job") && row>0) {
     	     var vmID = inputD2_list(row).split(" ")(3)
     	     var jobID = inputD2_list(row-1).split(" ")(2)
     	     //println("current row: " + jobID + "," + vmID)
     	     var exe_time = getHbaseData(vmID)
     	     inputD2_finalListBuffer += (jobID + "," + vmID + "," + exe_time)
     	     //println("current row: " + jobID + "," + vmID + "," + exe_time)
     	     
     	 		}
     	 }
     }
     
      val inputD2_rdd2 = sc.parallelize(inputD2_finalListBuffer.toSeq)
      val inputD2_rdd_final = inputD2_rdd2.map(x => x.split(',')).map {case Array(f1,f2,f3) => (f1.toLong,(f2,f3))}
      //inputD2_rdd_final.collect.foreach(println)

      //join data from different sources..
      val inputALL = inputD1_rdd_final.join(inputD2_rdd_final).sortBy(_._1) //sorted by job id
      val inputAllFinal = inputALL.map(x => (x._1,x._2._1._1,x._2._1._2,x._2._1._3,x._2._1._4,x._2._1._5,
                                             x._2._2._1,x._2._2._2))
      
      inputAllFinal.collect.foreach(println)

      //save data into the input file..
      var fileExists = Files.exists(Paths.get("CACTOS_predictor_input_data"))
      if (fileExists == true)
      println("rm -r CACTOS_predictor_input_data" !!)
      inputAllFinal.coalesce(1).saveAsTextFile("CACTOS_predictor_input_data")
      println("\n\nProcessed data saved in file >>>>>>> CACTOS_predictor_input_data")
    
      //Caculating execution time..
      val endTimestamp: Long = System.currentTimeMillis
      val executionTime: Long = (endTimestamp - startTimestamp)/1000//in seconds..
      println("\n\nTotal Processing Time >>>>> " + executionTime + " seconds / " + executionTime/60 + " minutes\n\n")
     
   }

  //get the execution time from the HBase storage..
  def getHbaseData(vmID: String):Long = {
    // Hbase configuration..
    val hbaseConf = HBaseConfiguration.create()
    hbaseConf.set(HConstants.ZOOKEEPER_QUORUM, "monitoring01:2181");
    hbaseConf.set(HConstants.ZOOKEEPER_QUORUM, "monitoring02:2181");
    hbaseConf.set(HConstants.ZOOKEEPER_QUORUM, "monitoring03:2181");
    hbaseConf.set(HConstants.ZOOKEEPER_QUORUM, "monitoring04:2181");
    hbaseConf.set(HConstants.ZOOKEEPER_QUORUM, "monitoring05:2181");
    hbaseConf.set(HConstants.ZOOKEEPER_ZNODE_PARENT, "/hbase");
    hbaseConf.set("zookeeper.session.timeout", Integer.toString(600000))
    hbaseConf.set("zookeeper.recovery.retry", Integer.toString(3))
    
    //hbaseConf.set("hbase.rpc.timeout", Integer.toString(600000))
    //hbaseConf.set("hbase.client.scanner.timeout.period", Integer.toString(600000))
    //hbaseConf.set("hbase.cells.scanned.per.heartbeat.check", Integer.toString(600000))
    //hbaseConf.set("hbase.regionserver.lease.period", "400000")
    
                 
    val table = new HTable(hbaseConf, "VMHistory") 
    //val scan = new Scan(Bytes.toBytes("00132f21-6a45-4392-9a99-a27188c13385"),Bytes.toBytes("00132f21-6a45-4392-9a99-a27188c13385-999999999"))

    var exeTime: Long = 0
    
    try {
    
    val scan = new Scan(Bytes.toBytes(vmID),Bytes.toBytes(vmID + "-999999999"))
    //scan.setCaching(100)
    scan.addFamily ("hardware".getBytes())
    
    val scanner = table.getScanner(scan)
    val resultList: List[Result] = scanner.iterator.toList

    println("\nTotal hbase entries for VM -> " + vmID + " >>>>>>>>>>>> " + resultList.size)
    var timestampArray:Array[Long] = new Array[Long](0)

    try {
      for (result <- resultList) 
      {
           var rowKey = Bytes.toString(result.getRow())
           timestampArray +:= rowKey.split("-")(5).toLong
         }       	
       }
      finally {
      scanner.close
     }
     
     if(timestampArray.size > 0)
     {
       var minTimeStamp = timestampArray.reduceLeft(_ min _)
       var maxTimeStamp = timestampArray.reduceLeft(_ max _)
       exeTime = maxTimeStamp - minTimeStamp
     }

     }
     catch {
    	        case e: Exception => println("\nException >>>>>>>>>>>> " + e.toString)
    }


     /*
     println("total timestamp entries >>>>>>>>>>>> " + timestampArray.size)
     println("minimum timestamp  >>>>>>>>>>>> " + minTimeStamp)
     println("maximum timestamp  >>>>>>>>>>>> " + maxTimeStamp)
     println("EXECUTION TIME  >>>>>>>>>>>> " + exeTime)
     */

     exeTime //return value
    	
    }
  }