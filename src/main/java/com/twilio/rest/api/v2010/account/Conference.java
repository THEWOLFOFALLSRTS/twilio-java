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
import com.twilio.converter.Promoter;
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
public class Conference extends Resource {
    private static final long serialVersionUID = 143481327355997L;


    public static ConferenceFetcher fetcher(final String pathSid){
        return new ConferenceFetcher(pathSid);
    }
    public static ConferenceFetcher fetcher(final String pathAccountSid, final String pathSid){
        return new ConferenceFetcher(pathAccountSid, pathSid);
    }


    public static ConferenceReader reader(){
        return new ConferenceReader();
    }
    public static ConferenceReader reader(final String pathAccountSid){
        return new ConferenceReader(pathAccountSid);
    }

    public static ConferenceUpdater updater(final String pathSid){
        return new ConferenceUpdater(pathSid);
    }
    public static ConferenceUpdater updater(final String pathAccountSid, final String pathSid){
        return new ConferenceUpdater(pathAccountSid, pathSid);
    }

    /**
    * Converts a JSON String into a Conference object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Conference object represented by the provided JSON
    */
    public static Conference fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Conference.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Conference object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Conference object represented by the provided JSON
    */
    public static Conference fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Conference.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum ReasonConferenceEnded {
        CONFERENCE_ENDED_VIA_API("conference-ended-via-api"),
        PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_LEFT("participant-with-end-conference-on-exit-left"),
        PARTICIPANT_WITH_END_CONFERENCE_ON_EXIT_KICKED("participant-with-end-conference-on-exit-kicked"),
        LAST_PARTICIPANT_KICKED("last-participant-kicked"),
        LAST_PARTICIPANT_LEFT("last-participant-left");

        private final String value;

        private ReasonConferenceEnded(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static ReasonConferenceEnded forValue(final String value) {
            return Promoter.enumFromString(value, ReasonConferenceEnded.values());
        }
    }
    public enum Status {
        INIT("init"),
        IN_PROGRESS("in-progress"),
        COMPLETED("completed");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }
    public enum UpdateStatus {
        COMPLETED("completed");

        private final String value;

        private UpdateStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static UpdateStatus forValue(final String value) {
            return Promoter.enumFromString(value, UpdateStatus.values());
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String apiVersion;
    private final String friendlyName;
    private final String region;
    private final String sid;
    private final Conference.Status status;
    private final String uri;
    private final Map<String, String> subresourceUris;
    private final Conference.ReasonConferenceEnded reasonConferenceEnded;
    private final String callSidEndingConference;

    @JsonCreator
    private Conference(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("api_version")
        final String apiVersion,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("region")
        final String region,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("status")
        final Conference.Status status,

        @JsonProperty("uri")
        final String uri,

        @JsonProperty("subresource_uris")
        final Map<String, String> subresourceUris,

        @JsonProperty("reason_conference_ended")
        final Conference.ReasonConferenceEnded reasonConferenceEnded,

        @JsonProperty("call_sid_ending_conference")
        final String callSidEndingConference
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.apiVersion = apiVersion;
        this.friendlyName = friendlyName;
        this.region = region;
        this.sid = sid;
        this.status = status;
        this.uri = uri;
        this.subresourceUris = subresourceUris;
        this.reasonConferenceEnded = reasonConferenceEnded;
        this.callSidEndingConference = callSidEndingConference;
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
        public final String getApiVersion() {
            return this.apiVersion;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getRegion() {
            return this.region;
        }
        public final String getSid() {
            return this.sid;
        }
        public final Conference.Status getStatus() {
            return this.status;
        }
        public final String getUri() {
            return this.uri;
        }
        public final Map<String, String> getSubresourceUris() {
            return this.subresourceUris;
        }
        public final Conference.ReasonConferenceEnded getReasonConferenceEnded() {
            return this.reasonConferenceEnded;
        }
        public final String getCallSidEndingConference() {
            return this.callSidEndingConference;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Conference other = (Conference) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(apiVersion, other.apiVersion) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(region, other.region) &&  Objects.equals(sid, other.sid) &&  Objects.equals(status, other.status) &&  Objects.equals(uri, other.uri) &&  Objects.equals(subresourceUris, other.subresourceUris) &&  Objects.equals(reasonConferenceEnded, other.reasonConferenceEnded) &&  Objects.equals(callSidEndingConference, other.callSidEndingConference)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, apiVersion, friendlyName, region, sid, status, uri, subresourceUris, reasonConferenceEnded, callSidEndingConference);
    }

}

