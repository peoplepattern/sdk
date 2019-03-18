package com.peoplepattern.api.client

import java.io.StringReader

import com.peoplepattern.api.Check
import com.peoplepattern.api.CheckRequest
import com.peoplepattern.api.CheckResponse
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils

import scala.util.Try

class CheckClient extends PeoplePattern
  with Check {

  override def check(request: CheckRequest): CheckResponse = {
    val json = new StringReader(MAPPER.writeValueAsString(request))
    val call = restClient.doPost(Check.PATH, json)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new CheckResponse()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[CheckResponse])
    result
  }
}