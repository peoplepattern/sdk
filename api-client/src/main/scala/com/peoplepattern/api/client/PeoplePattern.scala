package com.peoplepattern.api.client

import org.apache.juneau.json.JsonParser
import org.apache.juneau.json.JsonSerializer
import org.apache.juneau.rest.client.RestClient
import org.apache.juneau.rest.client.RetryOn
import org.apache.streams.config.StreamsConfigurator
import org.apache.streams.juneau.JodaDateSwap

object PeoplePattern {

  lazy val config = StreamsConfigurator.getConfig().getConfig("com.peoplepattern.api.client.PeoplePattern")

  def URL = if( config.hasPath("URL") ) config.getString("URL") else "https://api.peoplepattern.com"

  def AUTHORIZATION = if( config.hasPath("AUTHORIZATION") ) config.getString("AUTHORIZATION") else ""

}

class PeoplePattern extends Serializable {

  lazy val parser = JsonParser.create()
    .
    .debug()
    .ignoreUnknownBeanProperties(true)
    .ignorePropertiesWithoutSetters(true)
    .pojoSwaps(classOf[JodaDateSwap])
    .build()

  lazy val serializer = JsonSerializer.create()
    .debug()
    .pojoSwaps(classOf[JodaDateSwap])
    .trimEmptyCollections(true)
    .trimNullProperties(true)
    .trimEmptyMaps(true)
    .build()

  lazy val restClientBuilder = RestClient.create()
    .authorization(PeoplePattern.AUTHORIZATION)
    .beansRequireSerializable(true)
    .debug()
    .debugOutputLines(100)
    .disableCookieManagement()
    .disableRedirectHandling()
    .maxConnPerRoute(10)
    .maxConnTotal(100)
    .parser(parser)
    .retryable(5, 5000, RetryOn.DEFAULT)
    .serializer(serializer)

  lazy val restClient : RestClient = restClientBuilder
    .rootUrl(PeoplePattern.URL)
    .build()

}
