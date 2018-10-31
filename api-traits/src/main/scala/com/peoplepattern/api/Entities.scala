package com.peoplepattern.api

import com.google.common.base.Optional
import com.peoplepattern.pdb.Portrait
import org.apache.juneau.http.annotation.Body
import org.apache.juneau.http.annotation.Query
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod
import org.apache.streams.pojo.json.Collection

/**
  * Created by sblackmon on 6/6/16.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Entities {

  @RemoteMethod(method = "GET", path = "/entities")
  def entity(@Query entityId : String) : Optional[Portrait];

  @RemoteMethod(method = "POST", path = "/entities")
  def entities(@Body entityIds : Collection) : Collection;

}
