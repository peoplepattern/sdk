package com.peoplepattern.api

import java.io.StringReader
import java.util.Collection
import java.util.Optional

import org.apache.juneau.remote.RemoteInterface
import org.apache.juneau.rest.client.remote.RemoteMethod;

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

    @RemoteMethod(method = "GET", path = Resources.ROOT_PATH + Resources.FOLDER_PATH)
    def list(folder : String) : Collection[String];

    @RemoteMethod(method = "GET", path = Resources.ROOT_PATH + Resources.FOLDER_PATH + Resources.FILE_PATH)
    def get(folder : String, file : String) : Optional[String]

    @RemoteMethod(method = "PUT", path = Resources.ROOT_PATH + Resources.FOLDER_PATH + Resources.FILE_PATH)
    def save(folder : String, file : String, content : String, format : String) : Boolean;

    @RemoteMethod(method = "POST")
    def copy(fromPath : String, toPath : String ) : Boolean;

    @RemoteMethod(method = "OPTIONS", path = Resources.ROOT_PATH + Resources.FOLDER_PATH + Resources.FILE_PATH)
    def contentType(folder : String, file : String) : Optional[String]

}
