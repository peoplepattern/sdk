
package com.peoplepattern.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.juneau.annotation.BeanProperty;
import org.apache.streams.config.StreamsConfiguration;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "$schema",
    "configuration",
    "execution",
    "externalId",
    "group",
    "job",
    "labels",
    "user"
})
public class BaseJobExecution
    extends StreamsConfiguration
    implements Serializable
{

    @JsonProperty("$schema")
    @BeanProperty("$schema")
    private String $schema = "http://schemata.peoplepattern.com/BaseJobExecution.json";
    @JsonProperty("configuration")
    @BeanProperty("configuration")
    private String configuration;
    @JsonProperty("execution")
    @BeanProperty("execution")
    private Long execution;
    @JsonProperty("externalId")
    @BeanProperty("externalId")
    private String externalId;
    @JsonProperty("group")
    @BeanProperty("group")
    private String group;
    @JsonProperty("job")
    @BeanProperty("job")
    private String job;
    @JsonProperty("labels")
    @BeanProperty("labels")
    @Valid
    private List<String> labels = new ArrayList<String>();
    @JsonProperty("user")
    @BeanProperty("user")
    private String user;

    /**
     * 
     * @return
     *     The $schema
     */
    @JsonProperty("$schema")
    @BeanProperty("$schema")
    public String get$schema() {
        return $schema;
    }

    /**
     * 
     * @param $schema
     *     The $schema
     */
    @JsonProperty("$schema")
    @BeanProperty("$schema")
    public void set$schema(String $schema) {
        this.$schema = $schema;
    }

    public BaseJobExecution with$schema(String $schema) {
        this.$schema = $schema;
        return this;
    }

    /**
     * 
     * @return
     *     The configuration
     */
    @JsonProperty("configuration")
    @BeanProperty("configuration")
    public String getConfiguration() {
        return configuration;
    }

    /**
     * 
     * @param configuration
     *     The configuration
     */
    @JsonProperty("configuration")
    @BeanProperty("configuration")
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public BaseJobExecution withConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * 
     * @return
     *     The execution
     */
    @JsonProperty("execution")
    @BeanProperty("execution")
    public Long getExecution() {
        return execution;
    }

    /**
     * 
     * @param execution
     *     The execution
     */
    @JsonProperty("execution")
    @BeanProperty("execution")
    public void setExecution(Long execution) {
        this.execution = execution;
    }

    public BaseJobExecution withExecution(Long execution) {
        this.execution = execution;
        return this;
    }

    /**
     * 
     * @return
     *     The externalId
     */
    @JsonProperty("externalId")
    @BeanProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * 
     * @param externalId
     *     The externalId
     */
    @JsonProperty("externalId")
    @BeanProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public BaseJobExecution withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

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

    public BaseJobExecution withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * 
     * @return
     *     The job
     */
    @JsonProperty("job")
    @BeanProperty("job")
    public String getJob() {
        return job;
    }

    /**
     * 
     * @param job
     *     The job
     */
    @JsonProperty("job")
    @BeanProperty("job")
    public void setJob(String job) {
        this.job = job;
    }

    public BaseJobExecution withJob(String job) {
        this.job = job;
        return this;
    }

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    @BeanProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    @BeanProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public BaseJobExecution withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 
     * @return
     *     The user
     */
    @JsonProperty("user")
    @BeanProperty("user")
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    @JsonProperty("user")
    @BeanProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    public BaseJobExecution withUser(String user) {
        this.user = user;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append($schema).append(configuration).append(execution).append(externalId).append(group).append(job).append(labels).append(user).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaseJobExecution) == false) {
            return false;
        }
        BaseJobExecution rhs = ((BaseJobExecution) other);
        return new EqualsBuilder().append($schema, rhs.$schema).append(configuration, rhs.configuration).append(execution, rhs.execution).append(externalId, rhs.externalId).append(group, rhs.group).append(job, rhs.job).append(labels, rhs.labels).append(user, rhs.user).isEquals();
    }

}
