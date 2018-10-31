package com.peoplepattern.api

import org.apache.juneau.http.annotation.Query
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

@RemoteInterface(path = "https://api.peoplepattern.com")
trait Progress {

  @RemoteMethod(method = "GET", path = "/progress")
  def getProgress(@Query("execution") execution: java.lang.Long, @Query("measure") measure : String = "result.json"): java.lang.Double

  def setProgress(execution: java.lang.Long, measure : String = "result.json", progress: java.lang.Double): Unit

  def computeProgress(execution: java.lang.Long, measure : String = "result.json"): java.lang.Double

}
