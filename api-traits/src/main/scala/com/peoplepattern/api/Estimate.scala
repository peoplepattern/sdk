package com.peoplepattern.api

import com.peoplepattern.api.EstimateRequest
import com.peoplepattern.api.EstimateResponse
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

@RemoteInterface(path = "https://api.peoplepattern.com")
trait Estimate {

    @RemoteMethod(method = "POST", path = "/estimate")
    def estimate(@Body request: EstimateRequest): EstimateResponse

}
