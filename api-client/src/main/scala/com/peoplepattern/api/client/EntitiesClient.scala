package com.peoplepattern.api.client

import java.io.StringReader
import java.util.Optional

import com.peoplepattern.api.Categories
import com.peoplepattern.api.Entities
import com.peoplepattern.pdb.Portrait
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils
import org.apache.streams.pojo.json.Collection

import scala.util.Try

class EntitiesClient extends PeoplePattern
  with Entities {

  override def entity(entityId : String) : Optional[Portrait] = {
    val call = restClient.doGet(Categories.PATH)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) Optional.empty()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[Portrait])
    Optional.of(result)
  }

  override def entities(entityIds : Collection) : Collection = {
    val json = new StringReader(MAPPER.writeValueAsString(entityIds))
    val call = restClient.doPost(Entities.PATH, json)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new Collection()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[Collection])
    result
  }

}