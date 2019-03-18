package com.peoplepattern.api.client

import java.io.StringReader

import com.peoplepattern.api.Filter
import com.peoplepattern.api.FilterRequest
import com.peoplepattern.api.FilterResponse
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils

import scala.util.Try

class FilterClient extends PeoplePattern
  with Filter {

  override def filter(request: FilterRequest): FilterResponse = {
    val json = new StringReader(MAPPER.writeValueAsString(request))
    val call = restClient.doPost(Filter.PATH, json)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new FilterResponse()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[FilterResponse])
    result
  }
}