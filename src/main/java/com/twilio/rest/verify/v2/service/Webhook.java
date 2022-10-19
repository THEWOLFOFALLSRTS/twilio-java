/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Verify
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.verify.v2.service;

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
import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Webhook extends Resource {
    private static final long serialVersionUID = 178052740611913L;

    public static WebhookCreator creator(final String pathServiceSid, final String friendlyName, final List<String> eventTypes, final String webhookUrl){
        return new WebhookCreator(pathServiceSid, friendlyName, eventTypes, webhookUrl);
    }

    public static WebhookFetcher fetcher(final String pathServiceSid, final String pathSid){
        return new WebhookFetcher(pathServiceSid, pathSid);
    }

    public static WebhookDeleter deleter(final String pathServiceSid, final String pathSid){
        return new WebhookDeleter(pathServiceSid, pathSid);
    }

    public static WebhookReader reader(final String pathServiceSid){
        return new WebhookReader(pathServiceSid);
    }

    public static WebhookUpdater updater(final String pathServiceSid, final String pathSid){
        return new WebhookUpdater(pathServiceSid, pathSid);
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
    public enum Methods {
        GET("GET"),
        POST("POST");

        private final String value;

        private Methods(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Methods forValue(final String value) {
            return Promoter.enumFromString(value, Methods.values());
        }
    }
    public enum Status {
        ENABLED("enabled"),
        DISABLED("disabled");

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
    public enum Version {
        V1("v1"),
        V2("v2");

        private final String value;

        private Version(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Version forValue(final String value) {
            return Promoter.enumFromString(value, Version.values());
        }
    }

    private final String sid;
    private final String serviceSid;
    private final String accountSid;
    private final String friendlyName;
    private final List<String> eventTypes;
    private final Webhook.Status status;
    private final Webhook.Version version;
    private final URI webhookUrl;
    private final Webhook.Methods webhookMethod;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private Webhook(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("event_types")
        final List<String> eventTypes,

        @JsonProperty("status")
        final Webhook.Status status,

        @JsonProperty("version")
        final Webhook.Version version,

        @JsonProperty("webhook_url")
        final URI webhookUrl,

        @JsonProperty("webhook_method")
        final Webhook.Methods webhookMethod,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.serviceSid = serviceSid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.eventTypes = eventTypes;
        this.status = status;
        this.version = version;
        this.webhookUrl = webhookUrl;
        this.webhookMethod = webhookMethod;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final List<String> getEventTypes() {
            return this.eventTypes;
        }
        public final Webhook.Status getStatus() {
            return this.status;
        }
        public final Webhook.Version getVersion() {
            return this.version;
        }
        public final URI getWebhookUrl() {
            return this.webhookUrl;
        }
        public final Webhook.Methods getWebhookMethod() {
            return this.webhookMethod;
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

        Webhook other = (Webhook) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(eventTypes, other.eventTypes) &&  Objects.equals(status, other.status) &&  Objects.equals(version, other.version) &&  Objects.equals(webhookUrl, other.webhookUrl) &&  Objects.equals(webhookMethod, other.webhookMethod) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, serviceSid, accountSid, friendlyName, eventTypes, status, version, webhookUrl, webhookMethod, dateCreated, dateUpdated, url);
    }

}

