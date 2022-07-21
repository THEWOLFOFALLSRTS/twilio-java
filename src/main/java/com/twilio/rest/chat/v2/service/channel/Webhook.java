/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Chat
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.chat.v2.service.channel;

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
public class Webhook extends Resource {
    private static final long serialVersionUID = 255428526997916L;

    public static WebhookCreator creator(final String serviceSid, final String channelSid, final Webhook.Type type){
        return new WebhookCreator(serviceSid, channelSid, type);
    }

    public static WebhookFetcher fetcher(final String serviceSid, final String channelSid, final String sid){
        return new WebhookFetcher(serviceSid, channelSid, sid);
    }

    public static WebhookDeleter deleter(final String serviceSid, final String channelSid, final String sid){
        return new WebhookDeleter(serviceSid, channelSid, sid);
    }

    public static WebhookReader reader(final String serviceSid, final String channelSid){
        return new WebhookReader(serviceSid, channelSid);
    }

    public static WebhookUpdater updater(final String serviceSid, final String channelSid, final String sid){
        return new WebhookUpdater(serviceSid, channelSid, sid);
    }

    /**
    * Converts a JSON String into a Webhook object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Webhook object represented by the provided JSON
    */
    public static Webhook fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Webhook.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Webhook object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Webhook object represented by the provided JSON
    */
    public static Webhook fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Webhook.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Method {
        GET("GET"),
        POST("POST");

        private final String value;

        private Method(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Method forValue(final String value) {
            return Promoter.enumFromString(value, Method.values());
        }
    }
    public enum Type {
        WEBHOOK("webhook"),
        TRIGGER("trigger"),
        STUDIO("studio");

        private final String value;

        private Type(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Type forValue(final String value) {
            return Promoter.enumFromString(value, Type.values());
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final String channelSid;
    private final String type;
    private final URI url;
    private final Map<String, Object> _configuration;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;

    @JsonCreator
    private Webhook(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("channel_sid")
        final String channelSid,

        @JsonProperty("type")
        final String type,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("configuration")
        final Map<String, Object> _configuration,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.channelSid = channelSid;
        this.type = type;
        this.url = url;
        this._configuration = _configuration;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getChannelSid() {
            return this.channelSid;
        }
        public final String getType() {
            return this.type;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, Object> get_configuration() {
            return this._configuration;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Webhook other = (Webhook) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(channelSid, other.channelSid) &&  Objects.equals(type, other.type) &&  Objects.equals(url, other.url) &&  Objects.equals(_configuration, other._configuration) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, serviceSid, channelSid, type, url, _configuration, dateCreated, dateUpdated);
    }

}

