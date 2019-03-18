package com.peoplepattern.api

import com.peoplepattern.api.CountRequest
import com.peoplepattern.api.CountResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

object Count {
  final val PATH = "/count"
}

/**
  * Count profiles matching a search
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Count {

  @RemoteMethod(method = "POST", path = Count.PATH)
  def count(@Body countRequest: CountRequest ) : CountResponse;

}
