package com.peoplepattern.api

import java.util.Collection
import java.util.Optional

import org.apache.juneau.remote.RemoteInterface;

/**
 * Created by sblackmon on 5/18/16.
 */
@RemoteInterface
trait Resources {

    def listResources(resourceGroup : String) : Collection[String];

    def getResource(resourceGroup : String, resourceKey : String) : Optional[String]

    def saveResource(format : String, resourceGroup : String, resource : String) : Optional[String];

    def saveResource(format : String, resourceGroup : String, resourceKey : String, resource : String) : Boolean;

    def linkResource(format : String, fromGroup : String, fromKey : String, toGroup : String, toKey : String) : Boolean;

}
