/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Insights
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.insights.v1.conference;

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
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.List;
import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ConferenceParticipant extends Resource {
    private static final long serialVersionUID = 67216866718855L;


    public static ConferenceParticipantFetcher fetcher(final String pathConferenceSid, final String pathParticipantSid){
        return new ConferenceParticipantFetcher(pathConferenceSid, pathParticipantSid);
    }


    public static ConferenceParticipantReader reader(final String pathConferenceSid){
        return new ConferenceParticipantReader(pathConferenceSid);
    }


    /**
    * Converts a JSON String into a ConferenceParticipant object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return ConferenceParticipant object represented by the provided JSON
    */
    public static ConferenceParticipant fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ConferenceParticipant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a ConferenceParticipant object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return ConferenceParticipant object represented by the provided JSON
    */
    public static ConferenceParticipant fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ConferenceParticipant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum CallDirection {
        INBOUND("inbound"),
        OUTBOUND("outbound");

        private final String value;

        private CallDirection(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CallDirection forValue(final String value) {
            return Promoter.enumFromString(value, CallDirection.values());
        }
    }
    public enum CallStatus {
        ANSWERED("answered"),
        COMPLETED("completed"),
        BUSY("busy"),
        FAIL("fail"),
        NOANSWER("noanswer"),
        RINGING("ringing"),
        CANCELED("canceled");

        private final String value;

        private CallStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CallStatus forValue(final String value) {
            return Promoter.enumFromString(value, CallStatus.values());
        }
    }
    public enum CallType {
        CARRIER("carrier"),
        CLIENT("client"),
        SIP("sip");

        private final String value;

        private CallType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CallType forValue(final String value) {
            return Promoter.enumFromString(value, CallType.values());
        }
    }
    public enum JitterBufferSize {
        LARGE("large"),
        SMALL("small"),
        MEDIUM("medium"),
        OFF("off");

        private final String value;

        private JitterBufferSize(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static JitterBufferSize forValue(final String value) {
            return Promoter.enumFromString(value, JitterBufferSize.values());
        }
    }
    public enum ProcessingState {
        COMPLETE("complete"),
        IN_PROGRESS("in_progress"),
        TIMEOUT("timeout");

        private final String value;

        private ProcessingState(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static ProcessingState forValue(final String value) {
            return Promoter.enumFromString(value, ProcessingState.values());
        }
    }
    public enum Region {
        US1("us1"),
        US2("us2"),
        AU1("au1"),
        BR1("br1"),
        IE1("ie1"),
        JP1("jp1"),
        SG1("sg1"),
        DE1("de1");

        private final String value;

        private Region(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Region forValue(final String value) {
            return Promoter.enumFromString(value, Region.values());
        }
    }

    private final String participantSid;
    private final String label;
    private final String conferenceSid;
    private final String callSid;
    private final String accountSid;
    private final ConferenceParticipant.CallDirection callDirection;
    private final String from;
    private final String to;
    private final ConferenceParticipant.CallStatus callStatus;
    private final String countryCode;
    private final Boolean isModerator;
    private final ZonedDateTime joinTime;
    private final ZonedDateTime leaveTime;
    private final Integer durationSeconds;
    private final Integer outboundQueueLength;
    private final Integer outboundTimeInQueue;
    private final ConferenceParticipant.JitterBufferSize jitterBufferSize;
    private final Boolean isCoach;
    private final List<String> coachedParticipants;
    private final ConferenceParticipant.Region participantRegion;
    private final ConferenceParticipant.Region conferenceRegion;
    private final ConferenceParticipant.CallType callType;
    private final ConferenceParticipant.ProcessingState processingState;
    private final Map<String, Object> properties;
    private final Map<String, Object> events;
    private final Map<String, Object> metrics;
    private final URI url;

    @JsonCreator
    private ConferenceParticipant(
        @JsonProperty("participant_sid")
        final String participantSid,

        @JsonProperty("label")
        final String label,

        @JsonProperty("conference_sid")
        final String conferenceSid,

        @JsonProperty("call_sid")
        final String callSid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("call_direction")
        final ConferenceParticipant.CallDirection callDirection,

        @JsonProperty("from")
        final String from,

        @JsonProperty("to")
        final String to,

        @JsonProperty("call_status")
        final ConferenceParticipant.CallStatus callStatus,

        @JsonProperty("country_code")
        final String countryCode,

        @JsonProperty("is_moderator")
        final Boolean isModerator,

        @JsonProperty("join_time")
        final String joinTime,

        @JsonProperty("leave_time")
        final String leaveTime,

        @JsonProperty("duration_seconds")
        final Integer durationSeconds,

        @JsonProperty("outbound_queue_length")
        final Integer outboundQueueLength,

        @JsonProperty("outbound_time_in_queue")
        final Integer outboundTimeInQueue,

        @JsonProperty("jitter_buffer_size")
        final ConferenceParticipant.JitterBufferSize jitterBufferSize,

        @JsonProperty("is_coach")
        final Boolean isCoach,

        @JsonProperty("coached_participants")
        final List<String> coachedParticipants,

        @JsonProperty("participant_region")
        final ConferenceParticipant.Region participantRegion,

        @JsonProperty("conference_region")
        final ConferenceParticipant.Region conferenceRegion,

        @JsonProperty("call_type")
        final ConferenceParticipant.CallType callType,

        @JsonProperty("processing_state")
        final ConferenceParticipant.ProcessingState processingState,

        @JsonProperty("properties")
        final Map<String, Object> properties,

        @JsonProperty("events")
        final Map<String, Object> events,

        @JsonProperty("metrics")
        final Map<String, Object> metrics,

        @JsonProperty("url")
        final URI url
    ) {
        this.participantSid = participantSid;
        this.label = label;
        this.conferenceSid = conferenceSid;
        this.callSid = callSid;
        this.accountSid = accountSid;
        this.callDirection = callDirection;
        this.from = from;
        this.to = to;
        this.callStatus = callStatus;
        this.countryCode = countryCode;
        this.isModerator = isModerator;
        this.joinTime = DateConverter.iso8601DateTimeFromString(joinTime);
        this.leaveTime = DateConverter.iso8601DateTimeFromString(leaveTime);
        this.durationSeconds = durationSeconds;
        this.outboundQueueLength = outboundQueueLength;
        this.outboundTimeInQueue = outboundTimeInQueue;
        this.jitterBufferSize = jitterBufferSize;
        this.isCoach = isCoach;
        this.coachedParticipants = coachedParticipants;
        this.participantRegion = participantRegion;
        this.conferenceRegion = conferenceRegion;
        this.callType = callType;
        this.processingState = processingState;
        this.properties = properties;
        this.events = events;
        this.metrics = metrics;
        this.url = url;
    }

        public final String getParticipantSid() {
            return this.participantSid;
        }
        public final String getLabel() {
            return this.label;
        }
        public final String getConferenceSid() {
            return this.conferenceSid;
        }
        public final String getCallSid() {
            return this.callSid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final ConferenceParticipant.CallDirection getCallDirection() {
            return this.callDirection;
        }
        public final String getFrom() {
            return this.from;
        }
        public final String getTo() {
            return this.to;
        }
        public final ConferenceParticipant.CallStatus getCallStatus() {
            return this.callStatus;
        }
        public final String getCountryCode() {
            return this.countryCode;
        }
        public final Boolean getIsModerator() {
            return this.isModerator;
        }
        public final ZonedDateTime getJoinTime() {
            return this.joinTime;
        }
        public final ZonedDateTime getLeaveTime() {
            return this.leaveTime;
        }
        public final Integer getDurationSeconds() {
            return this.durationSeconds;
        }
        public final Integer getOutboundQueueLength() {
            return this.outboundQueueLength;
        }
        public final Integer getOutboundTimeInQueue() {
            return this.outboundTimeInQueue;
        }
        public final ConferenceParticipant.JitterBufferSize getJitterBufferSize() {
            return this.jitterBufferSize;
        }
        public final Boolean getIsCoach() {
            return this.isCoach;
        }
        public final List<String> getCoachedParticipants() {
            return this.coachedParticipants;
        }
        public final ConferenceParticipant.Region getParticipantRegion() {
            return this.participantRegion;
        }
        public final ConferenceParticipant.Region getConferenceRegion() {
            return this.conferenceRegion;
        }
        public final ConferenceParticipant.CallType getCallType() {
            return this.callType;
        }
        public final ConferenceParticipant.ProcessingState getProcessingState() {
            return this.processingState;
        }
        public final Map<String, Object> getProperties() {
            return this.properties;
        }
        public final Map<String, Object> getEvents() {
            return this.events;
        }
        public final Map<String, Object> getMetrics() {
            return this.metrics;
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

        ConferenceParticipant other = (ConferenceParticipant) o;

        return Objects.equals(participantSid, other.participantSid) &&  Objects.equals(label, other.label) &&  Objects.equals(conferenceSid, other.conferenceSid) &&  Objects.equals(callSid, other.callSid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(callDirection, other.callDirection) &&  Objects.equals(from, other.from) &&  Objects.equals(to, other.to) &&  Objects.equals(callStatus, other.callStatus) &&  Objects.equals(countryCode, other.countryCode) &&  Objects.equals(isModerator, other.isModerator) &&  Objects.equals(joinTime, other.joinTime) &&  Objects.equals(leaveTime, other.leaveTime) &&  Objects.equals(durationSeconds, other.durationSeconds) &&  Objects.equals(outboundQueueLength, other.outboundQueueLength) &&  Objects.equals(outboundTimeInQueue, other.outboundTimeInQueue) &&  Objects.equals(jitterBufferSize, other.jitterBufferSize) &&  Objects.equals(isCoach, other.isCoach) &&  Objects.equals(coachedParticipants, other.coachedParticipants) &&  Objects.equals(participantRegion, other.participantRegion) &&  Objects.equals(conferenceRegion, other.conferenceRegion) &&  Objects.equals(callType, other.callType) &&  Objects.equals(processingState, other.processingState) &&  Objects.equals(properties, other.properties) &&  Objects.equals(events, other.events) &&  Objects.equals(metrics, other.metrics) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantSid, label, conferenceSid, callSid, accountSid, callDirection, from, to, callStatus, countryCode, isModerator, joinTime, leaveTime, durationSeconds, outboundQueueLength, outboundTimeInQueue, jitterBufferSize, isCoach, coachedParticipants, participantRegion, conferenceRegion, callType, processingState, properties, events, metrics, url);
    }

}

