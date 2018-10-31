package com.peoplepattern.api

import com.peoplepattern.api.CheckRequest
import com.peoplepattern.api.CheckResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

/**
  * Created by sblackmon on 3/3/16.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Check {

  @RemoteMethod(method = "POST", path = "/check")
  def check(@Body request : CheckRequest) : CheckResponse

}
