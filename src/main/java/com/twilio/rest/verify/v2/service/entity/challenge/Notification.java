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

package com.twilio.rest.verify.v2.service.entity.challenge;

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
public class Notification extends Resource {
    private static final long serialVersionUID = 216794200802882L;

    public static NotificationCreator creator(final String pathServiceSid, final String pathIdentity, final String pathChallengeSid){
        return new NotificationCreator(pathServiceSid, pathIdentity, pathChallengeSid);
    }





    /**
    * Converts a JSON String into a Notification object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Notification object represented by the provided JSON
    */
    public static Notification fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Notification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Notification object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Notification object represented by the provided JSON
    */
    public static Notification fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Notification.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final String entitySid;
    private final String identity;
    private final String challengeSid;
    private final String priority;
    private final Integer ttl;
    private final ZonedDateTime dateCreated;

    @JsonCreator
    private Notification(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("entity_sid")
        final String entitySid,

        @JsonProperty("identity")
        final String identity,

        @JsonProperty("challenge_sid")
        final String challengeSid,

        @JsonProperty("priority")
        final String priority,

        @JsonProperty("ttl")
        final Integer ttl,

        @JsonProperty("date_created")
        final String dateCreated
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.entitySid = entitySid;
        this.identity = identity;
        this.challengeSid = challengeSid;
        this.priority = priority;
        this.ttl = ttl;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
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
        public final String getEntitySid() {
            return this.entitySid;
        }
        public final String getIdentity() {
            return this.identity;
        }
        public final String getChallengeSid() {
            return this.challengeSid;
        }
        public final String getPriority() {
            return this.priority;
        }
        public final Integer getTtl() {
            return this.ttl;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Notification other = (Notification) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(entitySid, other.entitySid) &&  Objects.equals(identity, other.identity) &&  Objects.equals(challengeSid, other.challengeSid) &&  Objects.equals(priority, other.priority) &&  Objects.equals(ttl, other.ttl) &&  Objects.equals(dateCreated, other.dateCreated)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, serviceSid, entitySid, identity, challengeSid, priority, ttl, dateCreated);
    }

}

