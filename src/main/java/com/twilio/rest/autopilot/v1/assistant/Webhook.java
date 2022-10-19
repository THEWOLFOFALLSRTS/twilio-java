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

package com.twilio.rest.autopilot.v1.assistant;

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

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Webhook extends Resource {
    private static final long serialVersionUID = 211848885870919L;

    public static WebhookCreator creator(final String pathAssistantSid, final String uniqueName, final String events, final URI webhookUrl){
        return new WebhookCreator(pathAssistantSid, uniqueName, events, webhookUrl);
    }

    public static WebhookFetcher fetcher(final String pathAssistantSid, final String pathSid){
        return new WebhookFetcher(pathAssistantSid, pathSid);
    }

    public static WebhookDeleter deleter(final String pathAssistantSid, final String pathSid){
        return new WebhookDeleter(pathAssistantSid, pathSid);
    }

    public static WebhookReader reader(final String pathAssistantSid){
        return new WebhookReader(pathAssistantSid);
    }

    public static WebhookUpdater updater(final String pathAssistantSid, final String pathSid){
        return new WebhookUpdater(pathAssistantSid, pathSid);
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

    private final URI url;
    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String assistantSid;
    private final String sid;
    private final String uniqueName;
    private final String events;
    private final URI webhookUrl;
    private final String webhookMethod;

    @JsonCreator
    private Webhook(
        @JsonProperty("url")
        final URI url,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("assistant_sid")
        final String assistantSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("events")
        final String events,

        @JsonProperty("webhook_url")
        final URI webhookUrl,

        @JsonProperty("webhook_method")
        final String webhookMethod
    ) {
        this.url = url;
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.events = events;
        this.webhookUrl = webhookUrl;
        this.webhookMethod = webhookMethod;
    }

        public final URI getUrl() {
            return this.url;
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
        public final String getAssistantSid() {
            return this.assistantSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final String getEvents() {
            return this.events;
        }
        public final URI getWebhookUrl() {
            return this.webhookUrl;
        }
        public final String getWebhookMethod() {
            return this.webhookMethod;
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

        return Objects.equals(url, other.url) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(assistantSid, other.assistantSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(events, other.events) &&  Objects.equals(webhookUrl, other.webhookUrl) &&  Objects.equals(webhookMethod, other.webhookMethod)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, accountSid, dateCreated, dateUpdated, assistantSid, sid, uniqueName, events, webhookUrl, webhookMethod);
    }

}

