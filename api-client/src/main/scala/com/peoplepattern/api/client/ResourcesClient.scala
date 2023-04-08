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
  override def list(folder : String): util.List[String] = {
    throw new NotImplementedError()
  }

  def get(folder : String, file : String) : Optional[String] = {
    throw new NotImplementedError()
  }

  def save(folder : String, file : String, content : String, format : String) : Boolean = {
    throw new NotImplementedError()
  }

  def copy(fromPath : String, toPath : String ) : Boolean = {
    throw new NotImplementedError()
  }

  def check(folder : String, file : String) : Optional[String] = {
    throw new NotImplementedError()
  }

}
