package com.peoplepattern.api

import java.util.Optional
import com.peoplepattern.api.AggregateRequest
import com.peoplepattern.api.AggregateResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

object Aggregate {
  final val PATH = "/aggregate"
}

/**
  * Aggregate details about groups of profiles.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Aggregate {

  /*
    Aggregates predictions of individual documents using default
    aggregation strategies by field type.  Field type is derived
    from index mapping.  Appropriate bin sizes per field would be
    deployed with the API / SDK, overridable via typesafe.

    String field - terms aggregations
      returns {count : Int, [{key : String, percentage : Double(0,1]}]}
    Numeric field - histogram aggregation
      returns {count : Int, [{floor : Double, percentage : Double(0,1]}]}
    [{String,Double(0,1]}] field - terms aggregation with sum across probabilities divided by sample size
      returns {count : Int, [{key: String, percentage : Double(0,1]}]
      entirely new, computes percentage across all documents

    result object takes form:
      {
        "field": {field result},
        "field2": {field2 result}
      }

  */
  @RemoteMethod(method = "POST", path = Aggregate.PATH)
  def aggregate(@Body aggregateRequest: AggregateRequest ) : Optional[AggregateResponse];

}
