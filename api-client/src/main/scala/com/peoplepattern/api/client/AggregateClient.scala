package com.peoplepattern.api.client

import java.io.StringReader
import java.util.Optional

import com.peoplepattern.api.Aggregate
import com.peoplepattern.api.AggregateRequest
import com.peoplepattern.api.AggregateResponse
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils

import scala.util.Try

class AggregateClient extends PeoplePattern
  with Aggregate {

//  override def aggregate(request: AggregateRequest): Optional[AggregateResponse] = {
//    val resource = restClient.getRemoteResource(classOf[Aggregate])
//    val response = resource.aggregate(request)
//    response
//  }

  override def aggregate(request: AggregateRequest): Optional[AggregateResponse] = {
    val json = new StringReader(MAPPER.writeValueAsString(request))
    val call = restClient.doPost(Aggregate.PATH, json)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return java.util.Optional.empty[AggregateResponse]
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[AggregateResponse])
    java.util.Optional.of(result)
  }

}