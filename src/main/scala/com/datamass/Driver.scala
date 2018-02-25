package com.datamass

import org.apache.log4j.Logger

object Driver {
  private val logger = Logger.getLogger(getClass)

  def main(args: Array[String]): Unit = {

    while(true) {
      logger.info("Kafka message comes in")
      Thread.sleep(10000)
      logger.error("Kafka message error in processing")
      Thread.sleep(10000)
    }

  }

}
