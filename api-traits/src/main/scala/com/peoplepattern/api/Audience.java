
package com.peoplepattern.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
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
import org.apache.streams.pojo.json.ActivityObject;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "totalItems",
    "items"
})
public class Audience implements Serializable
{

    @JsonProperty("totalItems")
    @BeanProperty("totalItems")
    private Long totalItems;
    @JsonProperty("items")
    @BeanProperty("items")
    @Valid
    private List<ActivityObject> items = new ArrayList<ActivityObject>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The totalItems
     */
    @JsonProperty("totalItems")
    @BeanProperty("totalItems")
    public Long getTotalItems() {
        return totalItems;
    }

    /**
     * 
     * @param totalItems
     *     The totalItems
     */
    @JsonProperty("totalItems")
    @BeanProperty("totalItems")
    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Audience withTotalItems(Long totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    /**
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    @BeanProperty("items")
    public List<ActivityObject> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    @BeanProperty("items")
    public void setItems(List<ActivityObject> items) {
        this.items = items;
    }

    public Audience withItems(List<ActivityObject> items) {
        this.items = items;
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

    public Audience withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(items).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Audience) == false) {
            return false;
        }
        Audience rhs = ((Audience) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(items, rhs.items).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
