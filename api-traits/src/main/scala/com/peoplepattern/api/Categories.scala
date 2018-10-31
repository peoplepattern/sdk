package com.peoplepattern.api

import org.apache.juneau.http.annotation.Path
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod
import org.apache.streams.pojo.json.Collection

/**
  * Created by sblackmon on 6/6/16.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Categories {

  @RemoteMethod(method = "GET", path = "/categories")
  def categories() : Collection;

  @RemoteMethod(method = "GET", path = "/categories/{categoryId}")
  def entitiesInCategory( @Path("categoryId") categoryId : String) : Collection;

}
