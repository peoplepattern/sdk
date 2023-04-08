package com.peoplepattern.api

import com.peoplepattern.api.ExecutionsRequest
import com.peoplepattern.api.ExecutionsResponse
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

@RemoteInterface(path = "https://api.peoplepattern.com")
trait Executions {

  @RemoteMethod(method = "POST", path = "/executions")
  @throws(classOf[Exception])
  def executions(request: ExecutionsRequest): ExecutionsResponse

}
