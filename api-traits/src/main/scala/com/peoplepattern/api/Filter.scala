package com.peoplepattern.api

import com.peoplepattern.api.FilterRequest
import com.peoplepattern.api.FilterResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

/**
  * Filter profiles.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Filter {

    @RemoteMethod(method = "POST", path = "/filter")
    def filter(@Body filterRequest: FilterRequest ) : FilterResponse;

}
