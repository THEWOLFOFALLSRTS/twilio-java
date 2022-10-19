/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Media
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.media.v1;

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
import com.twilio.http.HttpMethod;

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
public class PlayerStreamer extends Resource {
    private static final long serialVersionUID = 145873037286640L;

    public static PlayerStreamerCreator creator(){
        return new PlayerStreamerCreator();
    }

    public static PlayerStreamerFetcher fetcher(final String pathSid){
        return new PlayerStreamerFetcher(pathSid);
    }


    public static PlayerStreamerReader reader(){
        return new PlayerStreamerReader();
    }

    public static PlayerStreamerUpdater updater(final String pathSid, final PlayerStreamer.UpdateStatus status){
        return new PlayerStreamerUpdater(pathSid, status);
    }

    /**
    * Converts a JSON String into a PlayerStreamer object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return PlayerStreamer object represented by the provided JSON
    */
    public static PlayerStreamer fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PlayerStreamer.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a PlayerStreamer object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return PlayerStreamer object represented by the provided JSON
    */
    public static PlayerStreamer fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PlayerStreamer.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum EndedReason {
        ENDED_VIA_API("ended-via-api"),
        MAX_DURATION_EXCEEDED("max-duration-exceeded"),
        STREAM_DISCONNECTED_BY_SOURCE("stream-disconnected-by-source"),
        UNEXPECTED_FAILURE("unexpected-failure");

        private final String value;

        private EndedReason(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static EndedReason forValue(final String value) {
            return Promoter.enumFromString(value, EndedReason.values());
        }
    }
    public enum Order {
        ASC("asc"),
        DESC("desc");

        private final String value;

        private Order(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Order forValue(final String value) {
            return Promoter.enumFromString(value, Order.values());
        }
    }
    public enum Status {
        CREATED("created"),
        STARTED("started"),
        ENDED("ended"),
        FAILED("failed");

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
    public enum UpdateStatus {
        ENDED("ended");

        private final String value;

        private UpdateStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static UpdateStatus forValue(final String value) {
            return Promoter.enumFromString(value, UpdateStatus.values());
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Boolean video;
    private final Map<String, String> links;
    private final String sid;
    private final PlayerStreamer.Status status;
    private final URI url;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final PlayerStreamer.EndedReason endedReason;
    private final Integer maxDuration;

    @JsonCreator
    private PlayerStreamer(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("video")
        final Boolean video,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("status")
        final PlayerStreamer.Status status,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("status_callback")
        final URI statusCallback,

        @JsonProperty("status_callback_method")
        final HttpMethod statusCallbackMethod,

        @JsonProperty("ended_reason")
        final PlayerStreamer.EndedReason endedReason,

        @JsonProperty("max_duration")
        final Integer maxDuration
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.video = video;
        this.links = links;
        this.sid = sid;
        this.status = status;
        this.url = url;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.endedReason = endedReason;
        this.maxDuration = maxDuration;
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
        public final Boolean getVideo() {
            return this.video;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }
        public final String getSid() {
            return this.sid;
        }
        public final PlayerStreamer.Status getStatus() {
            return this.status;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final URI getStatusCallback() {
            return this.statusCallback;
        }
        public final HttpMethod getStatusCallbackMethod() {
            return this.statusCallbackMethod;
        }
        public final PlayerStreamer.EndedReason getEndedReason() {
            return this.endedReason;
        }
        public final Integer getMaxDuration() {
            return this.maxDuration;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PlayerStreamer other = (PlayerStreamer) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(video, other.video) &&  Objects.equals(links, other.links) &&  Objects.equals(sid, other.sid) &&  Objects.equals(status, other.status) &&  Objects.equals(url, other.url) &&  Objects.equals(statusCallback, other.statusCallback) &&  Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&  Objects.equals(endedReason, other.endedReason) &&  Objects.equals(maxDuration, other.maxDuration)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, video, links, sid, status, url, statusCallback, statusCallbackMethod, endedReason, maxDuration);
    }

}

