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
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class AvailablePhoneNumberCountry extends Resource {
    private static final long serialVersionUID = 173167903952303L;


    public static AvailablePhoneNumberCountryFetcher fetcher(final String pathCountryCode){
        return new AvailablePhoneNumberCountryFetcher(pathCountryCode);
    }
    public static AvailablePhoneNumberCountryFetcher fetcher(final String pathAccountSid, final String pathCountryCode){
        return new AvailablePhoneNumberCountryFetcher(pathAccountSid, pathCountryCode);
    }


    public static AvailablePhoneNumberCountryReader reader(){
        return new AvailablePhoneNumberCountryReader();
    }
    public static AvailablePhoneNumberCountryReader reader(final String pathAccountSid){
        return new AvailablePhoneNumberCountryReader(pathAccountSid);
    }


    /**
    * Converts a JSON String into a AvailablePhoneNumberCountry object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return AvailablePhoneNumberCountry object represented by the provided JSON
    */
    public static AvailablePhoneNumberCountry fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AvailablePhoneNumberCountry.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a AvailablePhoneNumberCountry object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return AvailablePhoneNumberCountry object represented by the provided JSON
    */
    public static AvailablePhoneNumberCountry fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AvailablePhoneNumberCountry.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String countryCode;
    private final String country;
    private final URI uri;
    private final Boolean beta;
    private final Map<String, String> subresourceUris;

    @JsonCreator
    private AvailablePhoneNumberCountry(
        @JsonProperty("country_code")
        final String countryCode,

        @JsonProperty("country")
        final String country,

        @JsonProperty("uri")
        final URI uri,

        @JsonProperty("beta")
        final Boolean beta,

        @JsonProperty("subresource_uris")
        final Map<String, String> subresourceUris
    ) {
        this.countryCode = countryCode;
        this.country = country;
        this.uri = uri;
        this.beta = beta;
        this.subresourceUris = subresourceUris;
    }

        public final String getCountryCode() {
            return this.countryCode;
        }
        public final String getCountry() {
            return this.country;
        }
        public final URI getUri() {
            return this.uri;
        }
        public final Boolean getBeta() {
            return this.beta;
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

        AvailablePhoneNumberCountry other = (AvailablePhoneNumberCountry) o;

        return Objects.equals(countryCode, other.countryCode) &&  Objects.equals(country, other.country) &&  Objects.equals(uri, other.uri) &&  Objects.equals(beta, other.beta) &&  Objects.equals(subresourceUris, other.subresourceUris)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, country, uri, beta, subresourceUris);
    }

}

