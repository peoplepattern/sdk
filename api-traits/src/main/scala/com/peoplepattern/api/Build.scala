package com.peoplepattern.api

import java.util.Optional

import org.apache.juneau.http.annotation.Body
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod
import org.apache.streams.pojo.json.Collection
import org.apache.streams.twitter.config.SevenDaySearchProviderConfiguration
import org.apache.streams.twitter.config.ThirtyDaySearchProviderConfiguration
import org.apache.streams.twitter.config.TwitterEngagersProviderConfiguration
import org.apache.streams.twitter.config.TwitterFollowingConfiguration

object Build {
  final val PATH = "/build"
  final val CONNECTIONLIST_PATH = "/ConnectionList"
  final val SEVENDAYSEARCH_PATH = "/SevenDaySearch"
  final val THIRTYDAYSEARCH_PATH = "/ThirtyDaySearch"
  final val TWITTERENGAGERS_PATH = "/TwitterEngagersProvider"
  final val TWITTERFOLLOWING_PATH = "/TwitterFollowingProvider"
}

/**
  * Aggregate details about groups of profiles.
  */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Build {

  /*
    Various ways to build an audience
  */
  @RemoteMethod(method = "POST", path = Build.PATH + Build.CONNECTIONLIST_PATH)
  def postConnectionList(@Body buildRequest: ConnectionListProviderConfiguration ) : Collection;

  @RemoteMethod(method = "POST", path = Build.PATH + Build.SEVENDAYSEARCH_PATH)
  def postSevenDaySearch(@Body buildRequest: SevenDaySearchProviderConfiguration ) : Collection;

  @RemoteMethod(method = "POST", path = Build.PATH + Build.THIRTYDAYSEARCH_PATH)
  def postThirtyDaySearch(@Body buildRequest: ThirtyDaySearchProviderConfiguration ) : Collection;

  @RemoteMethod(method = "POST", path = Build.PATH + Build.TWITTERENGAGERS_PATH)
  def postTwitterEngagersProvider(@Body buildRequest: TwitterEngagersProviderConfiguration ) : Collection;

  @RemoteMethod(method = "POST", path = Build.PATH + Build.TWITTERFOLLOWING_PATH)
  def postTwitterFollowingProvider(@Body buildRequest: TwitterFollowingConfiguration ) : Collection;

}
