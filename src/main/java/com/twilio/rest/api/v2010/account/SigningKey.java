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

package com.twilio.rest.api.v2010.account;

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

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class SigningKey extends Resource {
    private static final long serialVersionUID = 35259719636912L;


    public static SigningKeyFetcher fetcher(final String pathSid){
        return new SigningKeyFetcher(pathSid);
    }
    public static SigningKeyFetcher fetcher(final String pathAccountSid, final String pathSid){
        return new SigningKeyFetcher(pathAccountSid, pathSid);
    }

    public static SigningKeyDeleter deleter(final String pathSid){
        return new SigningKeyDeleter(pathSid);
    }
    public static SigningKeyDeleter deleter(final String pathAccountSid, final String pathSid){
        return new SigningKeyDeleter(pathAccountSid, pathSid);
    }

    public static SigningKeyReader reader(){
        return new SigningKeyReader();
    }
    public static SigningKeyReader reader(final String pathAccountSid){
        return new SigningKeyReader(pathAccountSid);
    }

    public static SigningKeyUpdater updater(final String pathSid){
        return new SigningKeyUpdater(pathSid);
    }
    public static SigningKeyUpdater updater(final String pathAccountSid, final String pathSid){
        return new SigningKeyUpdater(pathAccountSid, pathSid);
    }

    /**
    * Converts a JSON String into a SigningKey object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SigningKey object represented by the provided JSON
    */
    public static SigningKey fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SigningKey.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SigningKey object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SigningKey object represented by the provided JSON
    */
    public static SigningKey fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SigningKey.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String friendlyName;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;

    @JsonCreator
    private SigningKey(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated
    ) {
        this.sid = sid;
        this.friendlyName = friendlyName;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
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

        SigningKey other = (SigningKey) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, friendlyName, dateCreated, dateUpdated);
    }

}

