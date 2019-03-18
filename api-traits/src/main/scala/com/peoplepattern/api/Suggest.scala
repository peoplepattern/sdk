package com.peoplepattern.api

import com.fasterxml.jackson.databind.node.ArrayNode
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

import java.util.Optional;

object Suggest {
    final val PATH = "/suggest"
}

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
    @RemoteMethod(method = "POST", path = Suggest.PATH)
    def suggest(@Body request : SuggestRequest ) : Optional[ArrayNode];

}
