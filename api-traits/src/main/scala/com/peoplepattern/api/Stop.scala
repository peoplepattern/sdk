package com.peoplepattern.api

import com.peoplepattern.api.StatusResponse
import com.peoplepattern.api.StopRequest
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

@RemoteInterface(path = "https://api.peoplepattern.com")
trait Stop {

  @RemoteMethod(method = "POST", path = "/stop")
  def stop(request: StopRequest): StatusResponse

}
