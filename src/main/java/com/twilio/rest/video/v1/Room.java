/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Video
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.video.v1;

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
import com.twilio.http.HttpMethod;

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
public class Room extends Resource {
    private static final long serialVersionUID = 125815238148049L;

    public static RoomCreator creator(){
        return new RoomCreator();
    }

    public static RoomFetcher fetcher(final String sid){
        return new RoomFetcher(sid);
    }


    public static RoomReader reader(){
        return new RoomReader();
    }

    public static RoomUpdater updater(final String sid, final Room.RoomStatus status){
        return new RoomUpdater(sid, status);
    }

    /**
    * Converts a JSON String into a Room object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Room object represented by the provided JSON
    */
    public static Room fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Room.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Room object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Room object represented by the provided JSON
    */
    public static Room fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Room.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum RoomStatus {
        IN_PROGRESS("in-progress"),
        COMPLETED("completed"),
        FAILED("failed");

        private final String value;

        private RoomStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static RoomStatus forValue(final String value) {
            return Promoter.enumFromString(value, RoomStatus.values());
        }
    }
    public enum RoomType {
        GO("go"),
        PEER_TO_PEER("peer-to-peer"),
        GROUP("group"),
        GROUP_SMALL("group-small");

        private final String value;

        private RoomType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static RoomType forValue(final String value) {
            return Promoter.enumFromString(value, RoomType.values());
        }
    }
    public enum VideoCodec {
        VP8("VP8"),
        H264("H264");

        private final String value;

        private VideoCodec(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static VideoCodec forValue(final String value) {
            return Promoter.enumFromString(value, VideoCodec.values());
        }
    }

    private final String sid;
    private final Room.RoomStatus status;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String accountSid;
    private final Boolean enableTurn;
    private final String uniqueName;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final ZonedDateTime endTime;
    private final Integer duration;
    private final Room.RoomType type;
    private final Integer maxParticipants;
    private final Integer maxParticipantDuration;
    private final Integer maxConcurrentPublishedTracks;
    private final Boolean recordParticipantsOnConnect;
    private final List<Room.VideoCodec> videoCodecs;
    private final String mediaRegion;
    private final Boolean audioOnly;
    private final Integer emptyRoomTimeout;
    private final Integer unusedRoomTimeout;
    private final Boolean largeRoom;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Room(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("status")
        final Room.RoomStatus status,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("enable_turn")
        final Boolean enableTurn,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("status_callback")
        final URI statusCallback,

        @JsonProperty("status_callback_method")
        final HttpMethod statusCallbackMethod,

        @JsonProperty("end_time")
        final String endTime,

        @JsonProperty("duration")
        final Integer duration,

        @JsonProperty("type")
        final Room.RoomType type,

        @JsonProperty("max_participants")
        final Integer maxParticipants,

        @JsonProperty("max_participant_duration")
        final Integer maxParticipantDuration,

        @JsonProperty("max_concurrent_published_tracks")
        final Integer maxConcurrentPublishedTracks,

        @JsonProperty("record_participants_on_connect")
        final Boolean recordParticipantsOnConnect,

        @JsonProperty("video_codecs")
        final List<Room.VideoCodec> videoCodecs,

        @JsonProperty("media_region")
        final String mediaRegion,

        @JsonProperty("audio_only")
        final Boolean audioOnly,

        @JsonProperty("empty_room_timeout")
        final Integer emptyRoomTimeout,

        @JsonProperty("unused_room_timeout")
        final Integer unusedRoomTimeout,

        @JsonProperty("large_room")
        final Boolean largeRoom,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.sid = sid;
        this.status = status;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.accountSid = accountSid;
        this.enableTurn = enableTurn;
        this.uniqueName = uniqueName;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.duration = duration;
        this.type = type;
        this.maxParticipants = maxParticipants;
        this.maxParticipantDuration = maxParticipantDuration;
        this.maxConcurrentPublishedTracks = maxConcurrentPublishedTracks;
        this.recordParticipantsOnConnect = recordParticipantsOnConnect;
        this.videoCodecs = videoCodecs;
        this.mediaRegion = mediaRegion;
        this.audioOnly = audioOnly;
        this.emptyRoomTimeout = emptyRoomTimeout;
        this.unusedRoomTimeout = unusedRoomTimeout;
        this.largeRoom = largeRoom;
        this.url = url;
        this.links = links;
    }

        public final String getSid() {
            return this.sid;
        }
        public final Room.RoomStatus getStatus() {
            return this.status;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Boolean getEnableTurn() {
            return this.enableTurn;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final URI getStatusCallback() {
            return this.statusCallback;
        }
        public final HttpMethod getStatusCallbackMethod() {
            return this.statusCallbackMethod;
        }
        public final ZonedDateTime getEndTime() {
            return this.endTime;
        }
        public final Integer getDuration() {
            return this.duration;
        }
        public final Room.RoomType getType() {
            return this.type;
        }
        public final Integer getMaxParticipants() {
            return this.maxParticipants;
        }
        public final Integer getMaxParticipantDuration() {
            return this.maxParticipantDuration;
        }
        public final Integer getMaxConcurrentPublishedTracks() {
            return this.maxConcurrentPublishedTracks;
        }
        public final Boolean getRecordParticipantsOnConnect() {
            return this.recordParticipantsOnConnect;
        }
        public final List<Room.VideoCodec> getVideoCodecs() {
            return this.videoCodecs;
        }
        public final String getMediaRegion() {
            return this.mediaRegion;
        }
        public final Boolean getAudioOnly() {
            return this.audioOnly;
        }
        public final Integer getEmptyRoomTimeout() {
            return this.emptyRoomTimeout;
        }
        public final Integer getUnusedRoomTimeout() {
            return this.unusedRoomTimeout;
        }
        public final Boolean getLargeRoom() {
            return this.largeRoom;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Room other = (Room) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(status, other.status) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(enableTurn, other.enableTurn) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(statusCallback, other.statusCallback) &&  Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&  Objects.equals(endTime, other.endTime) &&  Objects.equals(duration, other.duration) &&  Objects.equals(type, other.type) &&  Objects.equals(maxParticipants, other.maxParticipants) &&  Objects.equals(maxParticipantDuration, other.maxParticipantDuration) &&  Objects.equals(maxConcurrentPublishedTracks, other.maxConcurrentPublishedTracks) &&  Objects.equals(recordParticipantsOnConnect, other.recordParticipantsOnConnect) &&  Objects.equals(videoCodecs, other.videoCodecs) &&  Objects.equals(mediaRegion, other.mediaRegion) &&  Objects.equals(audioOnly, other.audioOnly) &&  Objects.equals(emptyRoomTimeout, other.emptyRoomTimeout) &&  Objects.equals(unusedRoomTimeout, other.unusedRoomTimeout) &&  Objects.equals(largeRoom, other.largeRoom) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, status, dateCreated, dateUpdated, accountSid, enableTurn, uniqueName, statusCallback, statusCallbackMethod, endTime, duration, type, maxParticipants, maxParticipantDuration, maxConcurrentPublishedTracks, recordParticipantsOnConnect, videoCodecs, mediaRegion, audioOnly, emptyRoomTimeout, unusedRoomTimeout, largeRoom, url, links);
    }

}

