package com.peoplepattern.api

import java.util.Collection
import java.util.Optional

import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod;

object Resources {
    final val ROOT_PATH = "/resources"
    final val GROUP_PATH = "/{resourceGroup}"
    final val RESOURCE_PATH = "/{resourceGroup}/{resourceKey}"
}

/**
 * Created by sblackmon on 5/18/16.
 */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Resources {

    @RemoteMethod(method = "GET", path = Resources.ROOT_PATH + Resources.GROUP_PATH)
    def listResources(resourceGroup : String) : Collection[String];

    @RemoteMethod(method = "GET", path = Resources.ROOT_PATH + Resources.RESOURCE_PATH)
    def getResource(resourceGroup : String, resourceKey : String) : Optional[String]

    @RemoteMethod(method = "POST", path = Resources.ROOT_PATH + Resources.GROUP_PATH)
    def saveResource(format : String, resourceGroup : String, resource : String) : Optional[String];

    @RemoteMethod(method = "PUT", path = Resources.ROOT_PATH + Resources.RESOURCE_PATH)
    def saveResource(format : String, resourceGroup : String, resourceKey : String, resource : String) : Boolean;

    def linkResource(format : String, fromGroup : String, fromKey : String, toGroup : String, toKey : String) : Boolean;

}
