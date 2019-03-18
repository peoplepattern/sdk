package com.peoplepattern.api.client

import java.io.StringReader
import java.util
import java.util.Optional

import com.peoplepattern.api.Resources
import com.peoplepattern.api.ValidateResponse
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils

import scala.util.Try

class ResourcesClient extends PeoplePattern
  with Resources {

  //  override def lookup(request: LookupRequest): LookupResponse = {
//    val resource = restClient.getRemoteResource(classOf[Lookup])
//    val response = resource.lookup(request)
//    response
//  }
//  override def validate(json: String): ValidateResponse = {
//    throw new NotImplementedError()
//  }
//
//  override def validateConfiguration(contenttype: String, project: String, job: String, schema: String, configKey: String): ValidateResponse = {
//    throw new NotImplementedError()
//  }
//
//  override def validateResource(contenttype: String, resourceGroup: String, resourceKey: String, schema: String): ValidateResponse = {
//    throw new NotImplementedError()
//  }
//
//  override def validateRequest(contenttype: String, resourceGroup: String, resourceKey: String, schema: String): ValidateResponse = {
//    throw new NotImplementedError()
//  }
  override def listResources(resourceGroup: String): util.Collection[String] = {
    throw new NotImplementedError()
  }

  override def getResource(resourceGroup: String, resourceKey: String): Optional[String] = {
    val call = restClient.doGet(Resources.ROOT_PATH + "/" + resourceGroup + "/" + resourceKey)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return Optional.empty();
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    Optional.of(entityString);
  }

  override def saveResource(format: String, resourceGroup: String, resource: String): Optional[String] = {
    throw new NotImplementedError()
  }

  override def saveResource(format: String, resourceGroup: String, resourceKey: String, resource: String): Boolean = {
    throw new NotImplementedError()
  }

  override def linkResource(format: String, fromGroup: String, fromKey: String, toGroup: String, toKey: String): Boolean = {
    throw new NotImplementedError()
  }
}