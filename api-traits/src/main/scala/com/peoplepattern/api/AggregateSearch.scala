package com.peoplepattern.api

import com.google.common.base.Optional
import com.peoplepattern.api.AggregateResponse
import com.peoplepattern.api.AggregateSearchRequest
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

/**
  * Aggregate details about groups of profiles derived from a search.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait AggregateSearch {

  @RemoteMethod(method = "POST", path = "/searchaggregate")
  def aggregateSearch(@Body aggregateSearchRequest: AggregateSearchRequest ) : Optional[AggregateResponse];

}
