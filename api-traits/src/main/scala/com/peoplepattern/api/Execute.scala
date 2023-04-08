package com.peoplepattern.api

import com.peoplepattern.api.ExecuteRequest
import com.peoplepattern.api.ExecuteResponse
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

object Execute {
  final val PATH = "/execute"
}

@RemoteInterface(path = "https://api.peoplepattern.com")
trait Execute {

  @RemoteMethod(method = "POST", path = Execute.PATH)
  @throws(classOf[Exception])
  def execute(request: ExecuteRequest): ExecuteResponse

}
