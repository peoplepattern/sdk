package com.peoplepattern.api

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ArrayNode
import com.google.common.base.Optional
;

/**
  * A filter describes a search criteria for finding documents related to an entity.
  *
  * The compound filter methods merge multiple criteria into a search that will match all entities.
  */
trait Filters {

  def filters(entityId : String) : Optional[ArrayNode];

  def filters(entityIds : java.util.List[String]) : Optional[ArrayNode];

  def compoundFilter(entityId : String) : Optional[JsonNode];

  def compoundFilter(entityIds : java.util.List[String]) : Optional[JsonNode];

}
