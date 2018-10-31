package com.peoplepattern.api

import java.util.List

import org.apache.juneau.http.annotation.Query
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod;

/**
  * Created by sblackmon on 3/3/16.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Connections {

  @RemoteMethod(method = "GET", path = "has")
  def hasConnections (
                       @Query index : String,
                       @Query actor_id : String,
                       @Query verb : String
                     ) : Boolean;

  @RemoteMethod(method = "GET", path = "count")
  def countConnections (
                         @Query index : String,
                         @Query actor_id : String,
                         @Query verb : String
                       ) : Long;

  @RemoteMethod(method = "GET")
  def getConnections (
                       @Query index : String,
                       @Query actor_id : String,
                       @Query verb : String
                     ) : List[String];

  @RemoteMethod(method = "POST", path = "add")
  def addConnections (
                       @Query index : String,
                       @Query actor_id : String,
                       @Query verb : String,
                       @Query object_ids : List[String]
                     )

}
