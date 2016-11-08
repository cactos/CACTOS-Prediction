name := "CACTOS Predictor Spark Project"

version := "1.0"

scalaVersion := "2.10.5"

resolvers ++= Seq(
  "Apache Repo"   at "https://repository.apache.org/content/repositories/releases",  
  "Thrift-Repo"   at "http://people.apache.org/~rawson/repo"
)

libraryDependencies ++= Seq(
        "org.apache.spark" %% "spark-core" % "1.6.0",
        //"org.apache.hadoop" % "hadoop-core" % "2.6.0",
        "org.apache.hbase" % "hbase" % "1.1.1",
        "org.apache.spark" %% "spark-mllib" % "1.6.0"
)

