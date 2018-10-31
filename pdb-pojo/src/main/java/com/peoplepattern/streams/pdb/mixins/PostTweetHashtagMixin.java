package com.peoplepattern.streams.pdb.mixins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.streams.twitter.Url;
import org.apache.streams.twitter.pojo.Entities;
import org.apache.streams.twitter.pojo.Hashtag;
import org.apache.streams.twitter.pojo.Tweet;
import org.apache.streams.twitter.pojo.UserMentions;

import java.util.List;

/**
 * Created by sblackmon on 11/16/15.
 */
public abstract class PostTweetHashtagMixin extends Hashtag {

    @Override
    @JsonIgnore
    public abstract List<Object> getIndices();

}
