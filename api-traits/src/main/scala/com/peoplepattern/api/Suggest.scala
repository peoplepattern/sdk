package com.peoplepattern.api

import com.fasterxml.jackson.databind.node.ArrayNode
import com.google.common.base.Optional
import com.peoplepattern.api.SuggestRequest
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

/**
  * Suggest (auto-complete) terms on a specified field.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Suggest {

    /*
      Prefix-based auto-completion on fields configured to support it.
      Request: search prefix, field, limit
      Response: possible completions
     */
    @RemoteMethod(method = "POST", path = "/suggest")
    def suggest(@Body request : SuggestRequest ) : Optional[ArrayNode];

}
