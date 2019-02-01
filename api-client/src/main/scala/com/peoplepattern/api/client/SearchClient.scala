package com.peoplepattern.api.client

import com.peoplepattern.api.Search
import com.peoplepattern.api.SearchRequest
import com.peoplepattern.api.SearchResponse

class SearchClient extends PeoplePattern
  with Search {


  override def search(request: SearchRequest): SearchResponse = {
    val resource = restClient.getRemoteResource(classOf[Search])
    val response = resource.search(request)
    response
  }

}