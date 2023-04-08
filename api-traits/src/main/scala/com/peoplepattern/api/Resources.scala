package com.peoplepattern.api

import java.io.StringReader
import java.util.List
import java.util.Optional
import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.annotation.RestMethod
import org.apache.juneau.rest.client.remote.RemoteMethod

import javax.ws.rs.HttpMethod;

object Resources {
    final val ROOT_PATH = "/resources"
    final val FOLDER_PATH = "/{folder}"
    final val FILE_PATH = "/{file}"
}

/**
 * Created by sblackmon on 5/18/16.
 */
@RemoteInterface(path = "https://api.peoplepattern.com")
trait Resources {

    @RemoteMethod(method = HttpMethod.HEAD, path = Resources.ROOT_PATH + Resources.FOLDER_PATH + Resources.FILE_PATH)
    @throws(classOf[Exception])
    def check(folder : String, file : String) : Optional[String]

    @RemoteMethod(method = "POST")
    @throws(classOf[Exception])
    def copy(fromPath : String, toPath : String ) : Boolean;

    @RemoteMethod(method = "GET", path = Resources.ROOT_PATH + Resources.FOLDER_PATH + Resources.FILE_PATH)
    @throws(classOf[Exception])
    def get(folder : String, file : String) : Optional[String]

    @RemoteMethod(method = "GET", path = Resources.ROOT_PATH + Resources.FOLDER_PATH)
    @throws(classOf[Exception])
    def list(folder : String) : List[String];

    @RemoteMethod(method = "PUT", path = Resources.ROOT_PATH + Resources.FOLDER_PATH + Resources.FILE_PATH)
    @throws(classOf[Exception])
    def save(folder : String, file : String, content : String, format : String) : Boolean;

}
