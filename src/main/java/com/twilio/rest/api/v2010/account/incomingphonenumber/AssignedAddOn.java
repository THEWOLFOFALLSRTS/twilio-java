/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account.incomingphonenumber;

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
import java.time.ZonedDateTime;

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class AssignedAddOn extends Resource {
    private static final long serialVersionUID = 114193682949091L;

    public static AssignedAddOnCreator creator(final String pathResourceSid, final String installedAddOnSid){
        return new AssignedAddOnCreator(pathResourceSid, installedAddOnSid);
    }
    public static AssignedAddOnCreator creator(final String pathAccountSid, final String pathResourceSid, final String installedAddOnSid){
        return new AssignedAddOnCreator(pathAccountSid, pathResourceSid, installedAddOnSid);
    }

    public static AssignedAddOnFetcher fetcher(final String pathResourceSid, final String pathSid){
        return new AssignedAddOnFetcher(pathResourceSid, pathSid);
    }
    public static AssignedAddOnFetcher fetcher(final String pathAccountSid, final String pathResourceSid, final String pathSid){
        return new AssignedAddOnFetcher(pathAccountSid, pathResourceSid, pathSid);
    }

    public static AssignedAddOnDeleter deleter(final String pathResourceSid, final String pathSid){
        return new AssignedAddOnDeleter(pathResourceSid, pathSid);
    }
    public static AssignedAddOnDeleter deleter(final String pathAccountSid, final String pathResourceSid, final String pathSid){
        return new AssignedAddOnDeleter(pathAccountSid, pathResourceSid, pathSid);
    }

    public static AssignedAddOnReader reader(final String pathResourceSid){
        return new AssignedAddOnReader(pathResourceSid);
    }
    public static AssignedAddOnReader reader(final String pathAccountSid, final String pathResourceSid){
        return new AssignedAddOnReader(pathAccountSid, pathResourceSid);
    }


    /**
    * Converts a JSON String into a AssignedAddOn object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return AssignedAddOn object represented by the provided JSON
    */
    public static AssignedAddOn fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AssignedAddOn.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a AssignedAddOn object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return AssignedAddOn object represented by the provided JSON
    */
    public static AssignedAddOn fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AssignedAddOn.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String resourceSid;
    private final String friendlyName;
    private final String description;
    private final Map<String, Object> configuration;
    private final String uniqueName;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String uri;
    private final Map<String, String> subresourceUris;

    @JsonCreator
    private AssignedAddOn(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("resource_sid")
        final String resourceSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("description")
        final String description,

        @JsonProperty("configuration")
        final Map<String, Object> configuration,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("uri")
        final String uri,

        @JsonProperty("subresource_uris")
        final Map<String, String> subresourceUris
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.resourceSid = resourceSid;
        this.friendlyName = friendlyName;
        this.description = description;
        this.configuration = configuration;
        this.uniqueName = uniqueName;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.uri = uri;
        this.subresourceUris = subresourceUris;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getResourceSid() {
            return this.resourceSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getDescription() {
            return this.description;
        }
        public final Map<String, Object> getConfiguration() {
            return this.configuration;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getUri() {
            return this.uri;
        }
        public final Map<String, String> getSubresourceUris() {
            return this.subresourceUris;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AssignedAddOn other = (AssignedAddOn) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(resourceSid, other.resourceSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(description, other.description) &&  Objects.equals(configuration, other.configuration) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(uri, other.uri) &&  Objects.equals(subresourceUris, other.subresourceUris)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, resourceSid, friendlyName, description, configuration, uniqueName, dateCreated, dateUpdated, uri, subresourceUris);
    }

}

