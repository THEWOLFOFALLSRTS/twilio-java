/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1.service;

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

import java.util.List;
import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ShortCode extends Resource {
    private static final long serialVersionUID = 25601319717810L;

    public static ShortCodeCreator creator(final String pathServiceSid, final String shortCodeSid){
        return new ShortCodeCreator(pathServiceSid, shortCodeSid);
    }

    public static ShortCodeFetcher fetcher(final String pathServiceSid, final String pathSid){
        return new ShortCodeFetcher(pathServiceSid, pathSid);
    }

    public static ShortCodeDeleter deleter(final String pathServiceSid, final String pathSid){
        return new ShortCodeDeleter(pathServiceSid, pathSid);
    }

    public static ShortCodeReader reader(final String pathServiceSid){
        return new ShortCodeReader(pathServiceSid);
    }


    /**
    * Converts a JSON String into a ShortCode object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return ShortCode object represented by the provided JSON
    */
    public static ShortCode fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ShortCode.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a ShortCode object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return ShortCode object represented by the provided JSON
    */
    public static ShortCode fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ShortCode.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String shortCode;
    private final String countryCode;
    private final List<String> capabilities;
    private final URI url;

    @JsonCreator
    private ShortCode(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("short_code")
        final String shortCode,

        @JsonProperty("country_code")
        final String countryCode,

        @JsonProperty("capabilities")
        final List<String> capabilities,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.shortCode = shortCode;
        this.countryCode = countryCode;
        this.capabilities = capabilities;
        this.url = url;
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
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getShortCode() {
            return this.shortCode;
        }
        public final String getCountryCode() {
            return this.countryCode;
        }
        public final List<String> getCapabilities() {
            return this.capabilities;
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

        ShortCode other = (ShortCode) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(shortCode, other.shortCode) &&  Objects.equals(countryCode, other.countryCode) &&  Objects.equals(capabilities, other.capabilities) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, serviceSid, dateCreated, dateUpdated, shortCode, countryCode, capabilities, url);
    }

}

