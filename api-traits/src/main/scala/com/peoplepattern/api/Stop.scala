package com.peoplepattern.api

import com.peoplepattern.api.StatusResponse
import com.peoplepattern.api.StopRequest
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

object Stop {
  final val PATH = "/stop"
}

@RemoteInterface(path = "https://api.peoplepattern.com")
trait Stop {

  @RemoteMethod(method = "POST", path = Stop.PATH)
  def stop(request: StopRequest): StatusResponse

}
