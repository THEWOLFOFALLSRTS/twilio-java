/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.taskrouter.v1.workspace.worker;

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

import java.util.List;
import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class WorkersRealTimeStatistics extends Resource {
    private static final long serialVersionUID = 209947407394347L;


    public static WorkersRealTimeStatisticsFetcher fetcher(final String workspaceSid){
        return new WorkersRealTimeStatisticsFetcher(workspaceSid);
    }




    /**
    * Converts a JSON String into a WorkersRealTimeStatistics object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return WorkersRealTimeStatistics object represented by the provided JSON
    */
    public static WorkersRealTimeStatistics fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkersRealTimeStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a WorkersRealTimeStatistics object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return WorkersRealTimeStatistics object represented by the provided JSON
    */
    public static WorkersRealTimeStatistics fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkersRealTimeStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final List<Map<String, Object>> activityStatistics;
    private final Integer totalWorkers;
    private final String workspaceSid;
    private final URI url;

    @JsonCreator
    private WorkersRealTimeStatistics(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("activity_statistics")
        final List<Map<String, Object>> activityStatistics,

        @JsonProperty("total_workers")
        final Integer totalWorkers,

        @JsonProperty("workspace_sid")
        final String workspaceSid,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.activityStatistics = activityStatistics;
        this.totalWorkers = totalWorkers;
        this.workspaceSid = workspaceSid;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final List<Map<String, Object>> getActivityStatistics() {
            return this.activityStatistics;
        }
        public final Integer getTotalWorkers() {
            return this.totalWorkers;
        }
        public final String getWorkspaceSid() {
            return this.workspaceSid;
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

        WorkersRealTimeStatistics other = (WorkersRealTimeStatistics) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(activityStatistics, other.activityStatistics) &&  Objects.equals(totalWorkers, other.totalWorkers) &&  Objects.equals(workspaceSid, other.workspaceSid) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, activityStatistics, totalWorkers, workspaceSid, url);
    }

}

