package com.peoplepattern.api

import com.peoplepattern.api.SearchRequest
import com.peoplepattern.api.SearchResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

/**
  * Search for profiles.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Search {

    @RemoteMethod(method = "POST", path = "/search")
    def search(@Body searchRequest: SearchRequest ) : SearchResponse;

}
