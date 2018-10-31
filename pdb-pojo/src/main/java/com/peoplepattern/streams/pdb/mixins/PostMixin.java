package com.peoplepattern.streams.pdb.mixins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import org.apache.streams.pojo.json.verbs.Post;
import org.apache.streams.twitter.pojo.Tweet;
import org.apache.streams.twitter.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sblackmon on 11/16/15.
 */
public abstract class PostMixin extends Post {

    @Override
    @JsonIgnore
    public abstract String getTitle();

}
