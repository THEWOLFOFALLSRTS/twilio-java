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
public class MediaRecording extends Resource {
    private static final long serialVersionUID = 72032948872402L;


    public static MediaRecordingFetcher fetcher(final String pathSid){
        return new MediaRecordingFetcher(pathSid);
    }

    public static MediaRecordingDeleter deleter(final String pathSid){
        return new MediaRecordingDeleter(pathSid);
    }

    public static MediaRecordingReader reader(){
        return new MediaRecordingReader();
    }


    /**
    * Converts a JSON String into a MediaRecording object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return MediaRecording object represented by the provided JSON
    */
    public static MediaRecording fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MediaRecording.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a MediaRecording object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return MediaRecording object represented by the provided JSON
    */
    public static MediaRecording fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, MediaRecording.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Format {
        MP4("mp4"),
        WEBM("webm");

        private final String value;

        private Format(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Format forValue(final String value) {
            return Promoter.enumFromString(value, Format.values());
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
        PROCESSING("processing"),
        COMPLETED("completed"),
        DELETED("deleted"),
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

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Integer duration;
    private final MediaRecording.Format format;
    private final Map<String, String> links;
    private final String processorSid;
    private final String resolution;
    private final String sourceSid;
    private final String sid;
    private final Long mediaSize;
    private final MediaRecording.Status status;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final URI url;

    @JsonCreator
    private MediaRecording(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("duration")
        final Integer duration,

        @JsonProperty("format")
        final MediaRecording.Format format,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("processor_sid")
        final String processorSid,

        @JsonProperty("resolution")
        final String resolution,

        @JsonProperty("source_sid")
        final String sourceSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("media_size")
        final Long mediaSize,

        @JsonProperty("status")
        final MediaRecording.Status status,

        @JsonProperty("status_callback")
        final URI statusCallback,

        @JsonProperty("status_callback_method")
        final HttpMethod statusCallbackMethod,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.duration = duration;
        this.format = format;
        this.links = links;
        this.processorSid = processorSid;
        this.resolution = resolution;
        this.sourceSid = sourceSid;
        this.sid = sid;
        this.mediaSize = mediaSize;
        this.status = status;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.url = url;
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
        public final Integer getDuration() {
            return this.duration;
        }
        public final MediaRecording.Format getFormat() {
            return this.format;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }
        public final String getProcessorSid() {
            return this.processorSid;
        }
        public final String getResolution() {
            return this.resolution;
        }
        public final String getSourceSid() {
            return this.sourceSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final Long getMediaSize() {
            return this.mediaSize;
        }
        public final MediaRecording.Status getStatus() {
            return this.status;
        }
        public final URI getStatusCallback() {
            return this.statusCallback;
        }
        public final HttpMethod getStatusCallbackMethod() {
            return this.statusCallbackMethod;
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

        MediaRecording other = (MediaRecording) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(duration, other.duration) &&  Objects.equals(format, other.format) &&  Objects.equals(links, other.links) &&  Objects.equals(processorSid, other.processorSid) &&  Objects.equals(resolution, other.resolution) &&  Objects.equals(sourceSid, other.sourceSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(mediaSize, other.mediaSize) &&  Objects.equals(status, other.status) &&  Objects.equals(statusCallback, other.statusCallback) &&  Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, duration, format, links, processorSid, resolution, sourceSid, sid, mediaSize, status, statusCallback, statusCallbackMethod, url);
    }

}

