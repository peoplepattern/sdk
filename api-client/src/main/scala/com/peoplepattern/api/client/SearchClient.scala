package com.peoplepattern.api.client

import java.io.StringReader

import com.peoplepattern.api.Search
import com.peoplepattern.api.SearchRequest
import com.peoplepattern.api.SearchResponse
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils
import org.apache.streams.pojo.json.Collection

import scala.util.Try

class SearchClient extends PeoplePattern
  with Search {

//  override def search(request: SearchRequest): SearchResponse = {
//    val resource = restClient.getRemoteResource(classOf[Search])
//    val response = resource.search(request)
//    response
//  }

  override def search(request: SearchRequest): SearchResponse = {
    val json = new StringReader(MAPPER.writeValueAsString(request))
    val call = restClient.doPost(Search.PATH, json)
    val attempt = Try(call.getResponse)
    Thread.sleep(1000)
    if( attempt.isFailure ) return new SearchResponse()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[SearchResponse])
    result
  }

}