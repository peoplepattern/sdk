package com.peoplepattern.api

import org.apache.juneau.http.annotation.Path
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod
import org.apache.streams.pojo.json.Collection

object Categories {
  final val PATH = "/categories"
  final val CATEGORY_PATH = "/categories/{categoryId}"
}

/**
  * Created by sblackmon on 6/6/16.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Categories {

  @RemoteMethod(method = "GET", path = Categories.PATH)
  def categories() : Collection;

  @RemoteMethod(method = "GET", path = Categories.CATEGORY_PATH)
  def entitiesInCategory( @Path("categoryId") categoryId : String) : Collection;

}
