package com.peoplepattern.api.client

import com.google.common.base.Optional
import com.peoplepattern.api.Aggregate
import com.peoplepattern.api.AggregateRequest
import com.peoplepattern.api.AggregateResponse

class AggregateClient extends PeoplePattern
  with Aggregate {

  override def aggregate(request: AggregateRequest): Optional[AggregateResponse] = {
    val resource = restClient.getRemoteResource(classOf[Aggregate])
    val response = resource.aggregate(request)
    response
  }

}