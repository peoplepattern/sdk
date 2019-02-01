package com.peoplepattern.api.client

import com.peoplepattern.api.Lookup
import com.peoplepattern.api.LookupRequest
import com.peoplepattern.api.LookupResponse

class LookupClient extends PeoplePattern
  with Lookup {

  override def lookup(request: LookupRequest): LookupResponse = {
    val resource = restClient.getRemoteResource(classOf[Lookup])
    val response = resource.lookup(request)
    response
  }

}