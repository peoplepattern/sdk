package com.peoplepattern.api.client

import java.io.StringReader

import com.peoplepattern.api.Lookup
import com.peoplepattern.api.LookupRequest
import com.peoplepattern.api.LookupResponse
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.util.EntityUtils
import org.apache.juneau.rest.client.RestCall

import scala.util.Try

class LookupClient extends PeoplePattern
  with Lookup {

  override def url() = "http://api-pdb-access-prod.marathon.mesos:10000"

  //  override def lookup(request: LookupRequest): LookupResponse = {
//    val resource = restClient.getRemoteResource(classOf[Lookup])
//    val response = resource.lookup(request)
//    response
//  }

  override def lookup(request: LookupRequest): LookupResponse = {
    val json = new StringReader(MAPPER.writeValueAsString(request))
    val call = restClient.doPost(Lookup.PATH, json)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new LookupResponse()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[LookupResponse])
    result
  }
}