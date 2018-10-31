package com.peoplepattern.streams.pdb.mixins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.streams.twitter.pojo.Hashtag;
import org.apache.streams.twitter.pojo.UserMentions;

import java.util.List;

/**
 * Created by sblackmon on 11/16/15.
 */
public abstract class PostTweetUserMentionsMixin extends UserMentions {

    @Override
    @JsonIgnore
    public abstract List<Object> getIndices();

    @Override
    @JsonIgnore
    public abstract Long getId();

    @Override
    @JsonIgnore
    public abstract String getIdStr();

    @Override
    @JsonIgnore
    public abstract String getName();


}
