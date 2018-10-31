package com.peoplepattern.api

import com.fasterxml.jackson.databind.node.ObjectNode
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod

/**
  * A Taxonomy is a specified traversal strategy for the entities database, capable of returning
  *   a set of related categories and entities in a nested tree.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Taxonomy {

  @RemoteMethod(method = "GET", path = "/taxonomy")
  def taxonomy() : ObjectNode;

  //  @RemoteMethod(method = "GET")
  //  def tree(@Query taxonomyId : String) : Optional[ObjectNode];
  //
  //  @RemoteMethod(method = "GET")
  //  def tree(@Query taxonomyId : String, rootId : String) : Optional[ObjectNode];
}
