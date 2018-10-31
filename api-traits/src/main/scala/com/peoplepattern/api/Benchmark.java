
package com.peoplepattern.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.juneau.annotation.BeanProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "group",
    "key"
})
public class Benchmark implements Serializable
{

    @JsonProperty("group")
    @BeanProperty("group")
    private String group;
    @JsonProperty("key")
    @BeanProperty("key")
    private String key;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The group
     */
    @JsonProperty("group")
    @BeanProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * 
     * @param group
     *     The group
     */
    @JsonProperty("group")
    @BeanProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public Benchmark withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 
     * @return
     *     The key
     */
    @JsonProperty("key")
    @BeanProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    @JsonProperty("key")
    @BeanProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public Benchmark withKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    @BeanProperty(name = "*")
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    @BeanProperty(name = "*")
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Benchmark withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(group).append(key).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Benchmark) == false) {
            return false;
        }
        Benchmark rhs = ((Benchmark) other);
        return new EqualsBuilder().append(group, rhs.group).append(key, rhs.key).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
