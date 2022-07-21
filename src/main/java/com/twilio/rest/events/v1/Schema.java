/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Events
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.events.v1;

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
public class Schema extends Resource {
    private static final long serialVersionUID = 100183907119303L;


    public static SchemaFetcher fetcher(final String id){
        return new SchemaFetcher(id);
    }




    /**
    * Converts a JSON String into a Schema object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Schema object represented by the provided JSON
    */
    public static Schema fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Schema.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Schema object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Schema object represented by the provided JSON
    */
    public static Schema fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Schema.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String id;
    private final URI url;
    private final Map<String, String> links;
    private final ZonedDateTime latestVersionDateCreated;
    private final Integer latestVersion;

    @JsonCreator
    private Schema(
        @JsonProperty("id")
        final String id,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links,

        @JsonProperty("latest_version_date_created")
        final String latestVersionDateCreated,

        @JsonProperty("latest_version")
        final Integer latestVersion
    ) {
        this.id = id;
        this.url = url;
        this.links = links;
        this.latestVersionDateCreated = DateConverter.iso8601DateTimeFromString(latestVersionDateCreated);
        this.latestVersion = latestVersion;
    }

        public final String getId() {
            return this.id;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }
        public final ZonedDateTime getLatestVersionDateCreated() {
            return this.latestVersionDateCreated;
        }
        public final Integer getLatestVersion() {
            return this.latestVersion;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Schema other = (Schema) o;

        return Objects.equals(id, other.id) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links) &&  Objects.equals(latestVersionDateCreated, other.latestVersionDateCreated) &&  Objects.equals(latestVersion, other.latestVersion)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, links, latestVersionDateCreated, latestVersion);
    }

}

