package com.peoplepattern.streams.pdb.mixins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import org.apache.streams.twitter.pojo.Tweet;
import org.apache.streams.twitter.pojo.User;

import java.util.List;

/**
 * Created by sblackmon on 11/16/15.
 */
@JsonIgnoreType
public abstract class PostUserMixin extends User {


}
