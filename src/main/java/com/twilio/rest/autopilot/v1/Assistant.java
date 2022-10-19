/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Autopilot
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.autopilot.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Assistant extends Resource {
    private static final long serialVersionUID = 228555803413487L;

    public static AssistantCreator creator(){
        return new AssistantCreator();
    }

    public static AssistantFetcher fetcher(final String pathSid){
        return new AssistantFetcher(pathSid);
    }

    public static AssistantDeleter deleter(final String pathSid){
        return new AssistantDeleter(pathSid);
    }

    public static AssistantReader reader(){
        return new AssistantReader();
    }

    public static AssistantUpdater updater(final String pathSid){
        return new AssistantUpdater(pathSid);
    }

    /**
    * Converts a JSON String into a Assistant object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Assistant object represented by the provided JSON
    */
    public static Assistant fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Assistant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Assistant object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Assistant object represented by the provided JSON
    */
    public static Assistant fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Assistant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final String latestModelBuildSid;
    private final Map<String, String> links;
    private final Boolean logQueries;
    private final String developmentStage;
    private final Boolean needsModelBuild;
    private final String sid;
    private final String uniqueName;
    private final URI url;
    private final URI callbackUrl;
    private final String callbackEvents;

    @JsonCreator
    private Assistant(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("latest_model_build_sid")
        final String latestModelBuildSid,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("log_queries")
        final Boolean logQueries,

        @JsonProperty("development_stage")
        final String developmentStage,

        @JsonProperty("needs_model_build")
        final Boolean needsModelBuild,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("callback_url")
        final URI callbackUrl,

        @JsonProperty("callback_events")
        final String callbackEvents
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.latestModelBuildSid = latestModelBuildSid;
        this.links = links;
        this.logQueries = logQueries;
        this.developmentStage = developmentStage;
        this.needsModelBuild = needsModelBuild;
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.url = url;
        this.callbackUrl = callbackUrl;
        this.callbackEvents = callbackEvents;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getLatestModelBuildSid() {
            return this.latestModelBuildSid;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }
        public final Boolean getLogQueries() {
            return this.logQueries;
        }
        public final String getDevelopmentStage() {
            return this.developmentStage;
        }
        public final Boolean getNeedsModelBuild() {
            return this.needsModelBuild;
        }
        public final String getSid() {
            return this.sid;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final URI getCallbackUrl() {
            return this.callbackUrl;
        }
        public final String getCallbackEvents() {
            return this.callbackEvents;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Assistant other = (Assistant) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(latestModelBuildSid, other.latestModelBuildSid) &&  Objects.equals(links, other.links) &&  Objects.equals(logQueries, other.logQueries) &&  Objects.equals(developmentStage, other.developmentStage) &&  Objects.equals(needsModelBuild, other.needsModelBuild) &&  Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(url, other.url) &&  Objects.equals(callbackUrl, other.callbackUrl) &&  Objects.equals(callbackEvents, other.callbackEvents)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, friendlyName, latestModelBuildSid, links, logQueries, developmentStage, needsModelBuild, sid, uniqueName, url, callbackUrl, callbackEvents);
    }

}

