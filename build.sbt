name := """playing-spark-streaming"""

version := "1.0"

scalaVersion := "2.11.8"

// Spark Dependencies
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.0.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-8_2.11
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-8" % "2.0.0"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
