package com.peoplepattern.streams.pdb.mixins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import org.apache.streams.twitter.pojo.Tweet;
import org.apache.streams.twitter.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sblackmon on 11/16/15.
 */
public abstract class PostTweetMixin extends Tweet {

    @Override
    @JsonIgnore
    public abstract Boolean getTruncated();
    @Override
    @JsonIgnore
    public abstract String getFilterLevel();
    @Override
    @JsonIgnore
    public abstract List<Object> getContributors();
    @Override
    @JsonIgnore
    public abstract String getInReplyToStatusIdStr();
    @Override
    @JsonIgnore
    public abstract String getInReplyToUserIdStr();
    @Override
    @JsonIgnore
    public abstract Boolean getFavorited();
    @Override
    @JsonIgnore
    public abstract Boolean getPossiblySensitive();
    @Override
    @JsonIgnore
    public abstract Long getInReplyToStatusId();
    @Override
    @JsonIgnore
    public abstract Long getInReplyToUserId();
    @Override
    @JsonIgnore
    public abstract Long getRetweetCount();

}
