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
public class RateLimit extends Resource {
    private static final long serialVersionUID = 244381337050590L;

    public static RateLimitCreator creator(final String serviceSid, final String uniqueName){
        return new RateLimitCreator(serviceSid, uniqueName);
    }

    public static RateLimitFetcher fetcher(final String serviceSid, final String sid){
        return new RateLimitFetcher(serviceSid, sid);
    }

    public static RateLimitDeleter deleter(final String serviceSid, final String sid){
        return new RateLimitDeleter(serviceSid, sid);
    }

    public static RateLimitReader reader(final String serviceSid){
        return new RateLimitReader(serviceSid);
    }

    public static RateLimitUpdater updater(final String serviceSid, final String sid){
        return new RateLimitUpdater(serviceSid, sid);
    }

    /**
    * Converts a JSON String into a RateLimit object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return RateLimit object represented by the provided JSON
    */
    public static RateLimit fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RateLimit.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a RateLimit object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return RateLimit object represented by the provided JSON
    */
    public static RateLimit fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RateLimit.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String serviceSid;
    private final String accountSid;
    private final String uniqueName;
    private final String description;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private RateLimit(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("description")
        final String description,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.sid = sid;
        this.serviceSid = serviceSid;
        this.accountSid = accountSid;
        this.uniqueName = uniqueName;
        this.description = description;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
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
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final String getDescription() {
            return this.description;
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
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RateLimit other = (RateLimit) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(description, other.description) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, serviceSid, accountSid, uniqueName, description, dateCreated, dateUpdated, url, links);
    }

}

