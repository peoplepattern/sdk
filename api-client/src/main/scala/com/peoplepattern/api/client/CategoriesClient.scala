package com.peoplepattern.api.client

import com.peoplepattern.api.Categories
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils
import org.apache.juneau.http.annotation.Path
import org.apache.streams.pojo.json.Collection

import scala.util.Try

class CategoriesClient extends PeoplePattern
  with Categories {

  override def categories() : Collection = {
    val call = restClient.doGet(Categories.PATH)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new Collection()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[Collection])
    result
  }

  override def entitiesInCategory( @Path("categoryId") categoryId : String) : Collection = {
    val path = Categories.PATH + "/" + categoryId;
    val call = restClient.doGet(path)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new Collection()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[Collection])
    result
  }

}