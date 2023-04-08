package com.peoplepattern.api

import com.peoplepattern.api.StatusRequest
import com.peoplepattern.api.StatusResponse
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

object Status {
  final val PATH = "/status"
}

@RemoteInterface(path = "https://api.peoplepattern.com")
trait Status {

  @RemoteMethod(method = "GET", path = Status.PATH)
  @throws(classOf[Exception])
  def getStatus(statusRequest: StatusRequest): StatusResponse

  @RemoteMethod(method = "POST", path = Status.PATH)
  @throws(classOf[Exception])
  def setStatus(status: StatusResponse): Unit

}
