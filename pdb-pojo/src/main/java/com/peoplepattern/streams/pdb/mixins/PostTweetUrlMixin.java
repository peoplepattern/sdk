package com.peoplepattern.streams.pdb.mixins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.streams.twitter.Url;
import org.apache.streams.twitter.pojo.Hashtag;

import java.util.List;

/**
 * Created by sblackmon on 11/16/15.
 */
public abstract class PostTweetUrlMixin extends Url {

    @Override
    @JsonIgnore
    public abstract List<Object> getIndices();

    @Override
    @JsonIgnore
    public abstract String getDisplayUrl();

    @Override
    @JsonIgnore
    public abstract String getUrl();
}
