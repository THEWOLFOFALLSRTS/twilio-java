/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Studio
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.studio.v2.flow;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.List;
import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class FlowRevision extends Resource {
    private static final long serialVersionUID = 84648223923809L;


    public static FlowRevisionFetcher fetcher(final String pathSid, final String pathRevision){
        return new FlowRevisionFetcher(pathSid, pathRevision);
    }


    public static FlowRevisionReader reader(final String pathSid){
        return new FlowRevisionReader(pathSid);
    }


    /**
    * Converts a JSON String into a FlowRevision object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return FlowRevision object represented by the provided JSON
    */
    public static FlowRevision fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FlowRevision.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a FlowRevision object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return FlowRevision object represented by the provided JSON
    */
    public static FlowRevision fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FlowRevision.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Status {
        DRAFT("draft"),
        PUBLISHED("published");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final Map<String, Object> definition;
    private final FlowRevision.Status status;
    private final Integer revision;
    private final String commitMessage;
    private final Boolean valid;
    private final List<Map<String, Object>> errors;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private FlowRevision(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("definition")
        final Map<String, Object> definition,

        @JsonProperty("status")
        final FlowRevision.Status status,

        @JsonProperty("revision")
        final Integer revision,

        @JsonProperty("commit_message")
        final String commitMessage,

        @JsonProperty("valid")
        final Boolean valid,

        @JsonProperty("errors")
        final List<Map<String, Object>> errors,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.definition = definition;
        this.status = status;
        this.revision = revision;
        this.commitMessage = commitMessage;
        this.valid = valid;
        this.errors = errors;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final Map<String, Object> getDefinition() {
            return this.definition;
        }
        public final FlowRevision.Status getStatus() {
            return this.status;
        }
        public final Integer getRevision() {
            return this.revision;
        }
        public final String getCommitMessage() {
            return this.commitMessage;
        }
        public final Boolean getValid() {
            return this.valid;
        }
        public final List<Map<String, Object>> getErrors() {
            return this.errors;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FlowRevision other = (FlowRevision) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(definition, other.definition) &&  Objects.equals(status, other.status) &&  Objects.equals(revision, other.revision) &&  Objects.equals(commitMessage, other.commitMessage) &&  Objects.equals(valid, other.valid) &&  Objects.equals(errors, other.errors) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, friendlyName, definition, status, revision, commitMessage, valid, errors, dateCreated, dateUpdated, url);
    }

}

