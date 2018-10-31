package com.peoplepattern.api

import com.peoplepattern.api.CountRequest
import com.peoplepattern.api.CountResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

/**
  * Count profiles matching a search
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Count {

  @RemoteMethod(method = "POST", path = "/count")
  def count(@Body countRequest: CountRequest ) : CountResponse;

}
