package com.playing.utils

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * Created by imana on 8/15/2016.
  */
object SparkConfig {

  // Create context with 2 second batch interval
  val sparkConf = new SparkConf().setAppName("PlayingSparkStreaming")
  val ssc = new StreamingContext(sparkConf, Seconds(2))

}
