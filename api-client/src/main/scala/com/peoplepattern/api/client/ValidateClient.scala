package com.peoplepattern.api.client

import java.io.StringReader

import com.peoplepattern.api.Lookup
import com.peoplepattern.api.LookupRequest
import com.peoplepattern.api.LookupResponse
import com.peoplepattern.api.ValidateResponse
import com.peoplepattern.api.Validation
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils

import scala.util.Try

class ValidateClient extends PeoplePattern
  with Validation {

  override def url() = "http://api-streams-validation-prod.marathon.mesos:10007"

  //  override def lookup(request: LookupRequest): LookupResponse = {
//    val resource = restClient.getRemoteResource(classOf[Lookup])
//    val response = resource.lookup(request)
//    response
//  }
  override def validate(json: String): ValidateResponse = {
    throw new NotImplementedError()
  }

  override def validateConfiguration(contenttype: String, project: String, job: String, schema: String, configKey: String): ValidateResponse = {
    throw new NotImplementedError()
  }

  override def validateResource(contenttype: String, resourceGroup: String, resourceKey: String, schema: String): ValidateResponse = {
    throw new NotImplementedError()
  }

  override def validateRequest(contenttype: String, resourceGroup: String, resourceKey: String, schema: String): ValidateResponse = {
    throw new NotImplementedError()
  }
}