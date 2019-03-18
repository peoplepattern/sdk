package com.peoplepattern.api

import com.peoplepattern.api.SearchRequest
import com.peoplepattern.api.SearchResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

object Search {
    final val PATH = "/search"
}

/**
  * Search for profiles.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Search {

    @RemoteMethod(method = "POST", path = Search.PATH)
    def search(@Body searchRequest: SearchRequest ) : SearchResponse;

}
