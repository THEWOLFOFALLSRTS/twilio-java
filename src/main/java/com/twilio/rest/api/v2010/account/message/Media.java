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

package com.twilio.rest.api.v2010.account.message;

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
public class Media extends Resource {
    private static final long serialVersionUID = 86856561367712L;


    public static MediaFetcher fetcher(final String pathMessageSid, final String pathSid){
        return new MediaFetcher(pathMessageSid, pathSid);
    }
    public static MediaFetcher fetcher(final String pathAccountSid, final String pathMessageSid, final String pathSid){
        return new MediaFetcher(pathAccountSid, pathMessageSid, pathSid);
    }

    public static MediaDeleter deleter(final String pathMessageSid, final String pathSid){
        return new MediaDeleter(pathMessageSid, pathSid);
    }
    public static MediaDeleter deleter(final String pathAccountSid, final String pathMessageSid, final String pathSid){
        return new MediaDeleter(pathAccountSid, pathMessageSid, pathSid);
    }

    public static MediaReader reader(final String pathMessageSid){
        return new MediaReader(pathMessageSid);
    }
    public static MediaReader reader(final String pathAccountSid, final String pathMessageSid){
        return new MediaReader(pathAccountSid, pathMessageSid);
    }


    /**
    * Converts a JSON String into a Media object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Media object represented by the provided JSON
    */
    public static Media fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Media.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Media object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Media object represented by the provided JSON
    */
    public static Media fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Media.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String contentType;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String parentSid;
    private final String sid;
    private final String uri;

    @JsonCreator
    private Media(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("content_type")
        final String contentType,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("parent_sid")
        final String parentSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("uri")
        final String uri
    ) {
        this.accountSid = accountSid;
        this.contentType = contentType;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.parentSid = parentSid;
        this.sid = sid;
        this.uri = uri;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getContentType() {
            return this.contentType;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getParentSid() {
            return this.parentSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final String getUri() {
            return this.uri;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Media other = (Media) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(contentType, other.contentType) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(parentSid, other.parentSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(uri, other.uri)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, contentType, dateCreated, dateUpdated, parentSid, sid, uri);
    }

}

