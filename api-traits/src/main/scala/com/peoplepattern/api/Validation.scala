package com.peoplepattern.api

import java.util.Optional

import org.apache.juneau.http.annotation.Header
import org.apache.juneau.http.annotation.Path
import org.apache.juneau.http.annotation.Query
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod;

object Validation {
    final val ROOT_PATH = "/validate"
    final val CONFIG_PATH = "/config/{config}"
    final val RESOURCE_PATH = "/resource/{resourceGroup}/{resourceKey}"
    final val REQUEST_PATH = "/request/{resourceGroup}/{resourceKey}"
}

/**
 * Created by sblackmon on 5/18/16.
 */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Validation {

    @RemoteMethod(method = "POST", path = Validation.ROOT_PATH)
    def validate(json : String) : ValidateResponse;

    @RemoteMethod(method = "GET", path = Validation.ROOT_PATH + Validation.CONFIG_PATH)
    def validateConfiguration(
       @Header(name = "Content-Type", _default = Array("application/json")) contenttype: String,
       @Query("project") project: String,
       @Query("job") job: String,
       @Query("schema") schema: String,
       @Path("config") configKey: String
     ) : ValidateResponse

    @RemoteMethod(method = "GET", path = Validation.ROOT_PATH + Validation.RESOURCE_PATH)
    def validateResource(
      @Header(name = "Content-Type", _default = Array("application/json")) contenttype: String,
      @Path("resourceGroup") resourceGroup: String,
      @Path("resourceKey") resourceKey: String,
      @Query("schema") schema: String
    ) : ValidateResponse

    @RemoteMethod(method = "GET", path = Validation.ROOT_PATH + Validation.REQUEST_PATH)
    def validateRequest(
      @Header(name = "Content-Type", _default = Array("application/json")) contenttype: String,
      @Path("resourceGroup") resourceGroup: String,
      @Path("resourceKey") resourceKey: String,
      @Query("schema") schema: String
    ) : ValidateResponse

}
