/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.ipmessaging.v2.service.channel;

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

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Message extends Resource {
    private static final long serialVersionUID = 210901647084119L;

    public static MessageCreator creator(final String pathServiceSid, final String pathChannelSid){
        return new MessageCreator(pathServiceSid, pathChannelSid);
    }

    public static MessageFetcher fetcher(final String pathServiceSid, final String pathChannelSid, final String pathSid){
        return new MessageFetcher(pathServiceSid, pathChannelSid, pathSid);
    }

    public static MessageDeleter deleter(final String pathServiceSid, final String pathChannelSid, final String pathSid){
        return new MessageDeleter(pathServiceSid, pathChannelSid, pathSid);
    }

    public static MessageReader reader(final String pathServiceSid, final String pathChannelSid){
        return new MessageReader(pathServiceSid, pathChannelSid);
    }

    public static MessageUpdater updater(final String pathServiceSid, final String pathChannelSid, final String pathSid){
        return new MessageUpdater(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
    * Converts a JSON String into a Message object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Message object represented by the provided JSON
    */
    public static Message fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Message object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Message object represented by the provided JSON
    */
    public static Message fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum OrderType {
        ASC("asc"),
        DESC("desc");

        private final String value;

        private OrderType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static OrderType forValue(final String value) {
            return Promoter.enumFromString(value, OrderType.values());
        }
    }
    public enum WebhookEnabledType {
        TRUE("true"),
        FALSE("false");

        private final String value;

        private WebhookEnabledType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static WebhookEnabledType forValue(final String value) {
            return Promoter.enumFromString(value, WebhookEnabledType.values());
        }
    }

    private final String sid;
    private final String accountSid;
    private final String attributes;
    private final String serviceSid;
    private final String to;
    private final String channelSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String lastUpdatedBy;
    private final Boolean wasEdited;
    private final String from;
    private final String body;
    private final Integer index;
    private final String type;
    private final Map<String, Object> media;
    private final URI url;

    @JsonCreator
    private Message(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("attributes")
        final String attributes,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("to")
        final String to,

        @JsonProperty("channel_sid")
        final String channelSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("last_updated_by")
        final String lastUpdatedBy,

        @JsonProperty("was_edited")
        final Boolean wasEdited,

        @JsonProperty("from")
        final String from,

        @JsonProperty("body")
        final String body,

        @JsonProperty("index")
        final Integer index,

        @JsonProperty("type")
        final String type,

        @JsonProperty("media")
        final Map<String, Object> media,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.attributes = attributes;
        this.serviceSid = serviceSid;
        this.to = to;
        this.channelSid = channelSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.lastUpdatedBy = lastUpdatedBy;
        this.wasEdited = wasEdited;
        this.from = from;
        this.body = body;
        this.index = index;
        this.type = type;
        this.media = media;
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getAttributes() {
            return this.attributes;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getTo() {
            return this.to;
        }
        public final String getChannelSid() {
            return this.channelSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getLastUpdatedBy() {
            return this.lastUpdatedBy;
        }
        public final Boolean getWasEdited() {
            return this.wasEdited;
        }
        public final String getFrom() {
            return this.from;
        }
        public final String getBody() {
            return this.body;
        }
        public final Integer getIndex() {
            return this.index;
        }
        public final String getType() {
            return this.type;
        }
        public final Map<String, Object> getMedia() {
            return this.media;
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

        Message other = (Message) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(attributes, other.attributes) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(to, other.to) &&  Objects.equals(channelSid, other.channelSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(lastUpdatedBy, other.lastUpdatedBy) &&  Objects.equals(wasEdited, other.wasEdited) &&  Objects.equals(from, other.from) &&  Objects.equals(body, other.body) &&  Objects.equals(index, other.index) &&  Objects.equals(type, other.type) &&  Objects.equals(media, other.media) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, attributes, serviceSid, to, channelSid, dateCreated, dateUpdated, lastUpdatedBy, wasEdited, from, body, index, type, media, url);
    }

}

