
package com.peoplepattern.api;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.juneau.annotation.BeanProperty;
import org.apache.streams.pojo.json.ActivityObject;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "$schema",
    "objectType",
    "job",
    "status",
    "requested_size",
    "audience_size",
    "service",
    "configuration",
    "execution",
    "builder",
    "seed",
    "handle",
    "created_at",
    "updated_at",
    "date_started",
    "date_completed"
})
public class ReportMetadata
    extends ActivityObject
    implements Serializable
{

    @JsonProperty("$schema")
    @BeanProperty("$schema")
    private String $schema = "http://schemata.peoplepattern.com/ReportMetadata.json";
    @JsonProperty("objectType")
    @BeanProperty("objectType")
    private String objectType = "report";
    @JsonProperty("job")
    @BeanProperty("job")
    private String job;
    @JsonProperty("status")
    @BeanProperty("status")
    private String status;
    @JsonProperty("requested_size")
    @BeanProperty("requested_size")
    private Long requestedSize;
    @JsonProperty("audience_size")
    @BeanProperty("audience_size")
    private Long audienceSize;
    @JsonProperty("service")
    @BeanProperty("service")
    private String service;
    @JsonProperty("configuration")
    @BeanProperty("configuration")
    private String configuration;
    @JsonProperty("execution")
    @BeanProperty("execution")
    private Long execution;
    @JsonProperty("builder")
    @BeanProperty("builder")
    private String builder;
    @JsonProperty("seed")
    @BeanProperty("seed")
    private String seed;
    @JsonProperty("handle")
    @BeanProperty("handle")
    private String handle;
    @JsonProperty("created_at")
    @BeanProperty("created_at")
    private DateTime createdAt;
    @JsonProperty("updated_at")
    @BeanProperty("updated_at")
    private DateTime updatedAt;
    @JsonProperty("date_started")
    @BeanProperty("date_started")
    private DateTime dateStarted;
    @JsonProperty("date_completed")
    @BeanProperty("date_completed")
    private DateTime dateCompleted;

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

    public ReportMetadata with$schema(String $schema) {
        this.$schema = $schema;
        return this;
    }

    /**
     * 
     * @return
     *     The objectType
     */
    @JsonProperty("objectType")
    @BeanProperty("objectType")
    public String getObjectType() {
        return objectType;
    }

    /**
     * 
     * @param objectType
     *     The objectType
     */
    @JsonProperty("objectType")
    @BeanProperty("objectType")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ReportMetadata withObjectType(String objectType) {
        this.objectType = objectType;
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

    public ReportMetadata withJob(String job) {
        this.job = job;
        return this;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    @BeanProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    @BeanProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public ReportMetadata withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * @return
     *     The requestedSize
     */
    @JsonProperty("requested_size")
    @BeanProperty("requested_size")
    public Long getRequestedSize() {
        return requestedSize;
    }

    /**
     * 
     * @param requestedSize
     *     The requested_size
     */
    @JsonProperty("requested_size")
    @BeanProperty("requested_size")
    public void setRequestedSize(Long requestedSize) {
        this.requestedSize = requestedSize;
    }

    public ReportMetadata withRequestedSize(Long requestedSize) {
        this.requestedSize = requestedSize;
        return this;
    }

    /**
     * 
     * @return
     *     The audienceSize
     */
    @JsonProperty("audience_size")
    @BeanProperty("audience_size")
    public Long getAudienceSize() {
        return audienceSize;
    }

    /**
     * 
     * @param audienceSize
     *     The audience_size
     */
    @JsonProperty("audience_size")
    @BeanProperty("audience_size")
    public void setAudienceSize(Long audienceSize) {
        this.audienceSize = audienceSize;
    }

    public ReportMetadata withAudienceSize(Long audienceSize) {
        this.audienceSize = audienceSize;
        return this;
    }

    /**
     * 
     * @return
     *     The service
     */
    @JsonProperty("service")
    @BeanProperty("service")
    public String getService() {
        return service;
    }

    /**
     * 
     * @param service
     *     The service
     */
    @JsonProperty("service")
    @BeanProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    public ReportMetadata withService(String service) {
        this.service = service;
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

    public ReportMetadata withConfiguration(String configuration) {
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

    public ReportMetadata withExecution(Long execution) {
        this.execution = execution;
        return this;
    }

    /**
     * 
     * @return
     *     The builder
     */
    @JsonProperty("builder")
    @BeanProperty("builder")
    public String getBuilder() {
        return builder;
    }

    /**
     * 
     * @param builder
     *     The builder
     */
    @JsonProperty("builder")
    @BeanProperty("builder")
    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public ReportMetadata withBuilder(String builder) {
        this.builder = builder;
        return this;
    }

    /**
     * 
     * @return
     *     The seed
     */
    @JsonProperty("seed")
    @BeanProperty("seed")
    public String getSeed() {
        return seed;
    }

    /**
     * 
     * @param seed
     *     The seed
     */
    @JsonProperty("seed")
    @BeanProperty("seed")
    public void setSeed(String seed) {
        this.seed = seed;
    }

    public ReportMetadata withSeed(String seed) {
        this.seed = seed;
        return this;
    }

    /**
     * 
     * @return
     *     The handle
     */
    @JsonProperty("handle")
    @BeanProperty("handle")
    public String getHandle() {
        return handle;
    }

    /**
     * 
     * @param handle
     *     The handle
     */
    @JsonProperty("handle")
    @BeanProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    public ReportMetadata withHandle(String handle) {
        this.handle = handle;
        return this;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    @BeanProperty("created_at")
    public DateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    @BeanProperty("created_at")
    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ReportMetadata withCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    @BeanProperty("updated_at")
    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    @BeanProperty("updated_at")
    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ReportMetadata withUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 
     * @return
     *     The dateStarted
     */
    @JsonProperty("date_started")
    @BeanProperty("date_started")
    public DateTime getDateStarted() {
        return dateStarted;
    }

    /**
     * 
     * @param dateStarted
     *     The date_started
     */
    @JsonProperty("date_started")
    @BeanProperty("date_started")
    public void setDateStarted(DateTime dateStarted) {
        this.dateStarted = dateStarted;
    }

    public ReportMetadata withDateStarted(DateTime dateStarted) {
        this.dateStarted = dateStarted;
        return this;
    }

    /**
     * 
     * @return
     *     The dateCompleted
     */
    @JsonProperty("date_completed")
    @BeanProperty("date_completed")
    public DateTime getDateCompleted() {
        return dateCompleted;
    }

    /**
     * 
     * @param dateCompleted
     *     The date_completed
     */
    @JsonProperty("date_completed")
    @BeanProperty("date_completed")
    public void setDateCompleted(DateTime dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public ReportMetadata withDateCompleted(DateTime dateCompleted) {
        this.dateCompleted = dateCompleted;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append($schema).append(objectType).append(job).append(status).append(requestedSize).append(audienceSize).append(service).append(configuration).append(execution).append(builder).append(seed).append(handle).append(createdAt).append(updatedAt).append(dateStarted).append(dateCompleted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReportMetadata) == false) {
            return false;
        }
        ReportMetadata rhs = ((ReportMetadata) other);
        return new EqualsBuilder().append($schema, rhs.$schema).append(objectType, rhs.objectType).append(job, rhs.job).append(status, rhs.status).append(requestedSize, rhs.requestedSize).append(audienceSize, rhs.audienceSize).append(service, rhs.service).append(configuration, rhs.configuration).append(execution, rhs.execution).append(builder, rhs.builder).append(seed, rhs.seed).append(handle, rhs.handle).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(dateStarted, rhs.dateStarted).append(dateCompleted, rhs.dateCompleted).isEquals();
    }

}
