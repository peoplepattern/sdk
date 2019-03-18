package com.peoplepattern.api

import com.peoplepattern.api.LookupRequest
import com.peoplepattern.api.LookupResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

object Lookup {
  final val PATH = "/lookup"
}

/**
  * Lookup details about one or more profiles.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Lookup {

  @RemoteMethod(method = "POST", path = Lookup.PATH)
  def lookup(@Body request : LookupRequest) : LookupResponse

}
