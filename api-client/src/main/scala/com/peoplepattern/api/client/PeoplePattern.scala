package com.peoplepattern.api.client

import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.juneau.json.JsonParser
import org.apache.juneau.json.JsonSerializer
import org.apache.juneau.rest.client.RestClient
import org.apache.streams.config.StreamsConfigurator
import org.apache.streams.juneau.JodaDateSwap
import org.apache.juneau.BeanContext.BEAN_debug
import org.apache.streams.jackson.StreamsJacksonMapper

class PeoplePattern extends Serializable {

  lazy val config = StreamsConfigurator.getConfig().getConfig("com.peoplepattern.api.client.PeoplePattern")

  def url() = if( config.hasPath("URL") ) config.getString("URL") else "https://api.peoplepattern.com"

  def authorization() = if( config.hasPath("AUTHORIZATION") ) config.getString("AUTHORIZATION") else ""

  val MAPPER: ObjectMapper = StreamsJacksonMapper.getInstance

  lazy val parser = JsonParser.create()
    .debug()
    .ignoreUnknownBeanProperties(true)
    .ignoreUnknownNullBeanProperties(true)
    .ignorePropertiesWithoutSetters(true)
    .pojoSwaps(classOf[JodaDateSwap])
    .set(BEAN_debug, true)
    .build()

  lazy val serializer = JsonSerializer.create()
    .debug()
    .pojoSwaps(classOf[JodaDateSwap])
    .set(BEAN_debug, true)
    .trimEmptyCollections(true)
    .trimNullProperties(true)
    .trimEmptyMaps(true)
    .build()

  lazy val restClientBuilder = RestClient.create()
    .authorization(authorization())
    .autoCloseStreams()
    .beansRequireSerializable(true)
    .debug()
    .debugOutputLines(100)
    .disableAutomaticRetries()
    .disableCookieManagement()
    .disableRedirectHandling()
    .ignoreInvocationExceptionsOnGetters(true)
    .ignoreInvocationExceptionsOnSetters(true)
    .json()
    .maxConnPerRoute(10)
    .maxConnTotal(100)
    .parser(parser)
    .pojoSwaps(classOf[JodaDateSwap])
    .set(BEAN_debug, true)
    .serializer(serializer)

  lazy val restClient : RestClient = restClientBuilder
    .rootUrl(url())
    .build()

}
