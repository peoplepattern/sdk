package com.peoplepattern.api.client

import java.io.StringReader

import com.peoplepattern.api.Build
import com.peoplepattern.api.ConnectionListProviderConfiguration
import org.apache.http.HttpEntity
import org.apache.http.util.EntityUtils
import org.apache.streams.pojo.json.Collection
import org.apache.streams.twitter.config.SevenDaySearchProviderConfiguration
import org.apache.streams.twitter.config.ThirtyDaySearchProviderConfiguration
import org.apache.streams.twitter.config.TwitterEngagersProviderConfiguration
import org.apache.streams.twitter.config.TwitterFollowingConfiguration

import scala.util.Try

class BuildClient extends PeoplePattern
  with Build {

  override def url() = "http://api-streams-collection-staging.marathon.mesos:10001"

  override def postConnectionList(request: ConnectionListProviderConfiguration): Collection = {
    val json = new StringReader(MAPPER.writeValueAsString(request))
    val call = restClient.doPost(Build.PATH + Build.CONNECTIONLIST_PATH, json)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new Collection()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[Collection])
    result
  }

  override def postSevenDaySearch(buildRequest: SevenDaySearchProviderConfiguration): Collection = {
    throw new NotImplementedError()
  }

  override def postThirtyDaySearch(buildRequest: ThirtyDaySearchProviderConfiguration): Collection = {
    throw new NotImplementedError()
  }

  override def postTwitterEngagersProvider(buildRequest: TwitterEngagersProviderConfiguration): Collection = {
    throw new NotImplementedError()
  }

  override def postTwitterFollowingProvider(request: TwitterFollowingConfiguration): Collection = {
    val json = new StringReader(MAPPER.writeValueAsString(request))
    val call = restClient.doPost(Build.PATH + Build.TWITTERFOLLOWING_PATH, json)
    val attempt = Try(call.getResponse)
    if( attempt.isFailure ) return new Collection()
    val entity: HttpEntity = attempt.get.getEntity
    val entityString: String = EntityUtils.toString(entity)
    val result = MAPPER.readValue(entityString, classOf[Collection])
    result
  }

}
