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

import java.util.List;
import java.util.Objects;


import com.twilio.type.IceServer;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Token extends Resource {
    private static final long serialVersionUID = 218446728059095L;

    public static TokenCreator creator(){
        return new TokenCreator();
    }
    public static TokenCreator creator(final String accountSid){
        return new TokenCreator(accountSid);
    }





    /**
    * Converts a JSON String into a Token object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Token object represented by the provided JSON
    */
    public static Token fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Token.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Token object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Token object represented by the provided JSON
    */
    public static Token fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Token.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final List<IceServer> iceServers;
    private final String password;
    private final String ttl;
    private final String username;

    @JsonCreator
    private Token(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("ice_servers")
        final List<IceServer> iceServers,

        @JsonProperty("password")
        final String password,

        @JsonProperty("ttl")
        final String ttl,

        @JsonProperty("username")
        final String username
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.iceServers = iceServers;
        this.password = password;
        this.ttl = ttl;
        this.username = username;
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
        public final List<IceServer> getIceServers() {
            return this.iceServers;
        }
        public final String getPassword() {
            return this.password;
        }
        public final String getTtl() {
            return this.ttl;
        }
        public final String getUsername() {
            return this.username;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Token other = (Token) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(iceServers, other.iceServers) &&  Objects.equals(password, other.password) &&  Objects.equals(ttl, other.ttl) &&  Objects.equals(username, other.username)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, iceServers, password, ttl, username);
    }

}

