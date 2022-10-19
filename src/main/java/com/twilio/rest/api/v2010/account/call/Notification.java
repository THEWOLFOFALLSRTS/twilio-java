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

package com.twilio.rest.api.v2010.account.call;

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
import com.twilio.http.HttpMethod;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Notification extends Resource {
    private static final long serialVersionUID = 162458167875227L;


    public static NotificationFetcher fetcher(final String pathCallSid, final String pathSid){
        return new NotificationFetcher(pathCallSid, pathSid);
    }
    public static NotificationFetcher fetcher(final String pathAccountSid, final String pathCallSid, final String pathSid){
        return new NotificationFetcher(pathAccountSid, pathCallSid, pathSid);
    }


    public static NotificationReader reader(final String pathCallSid){
        return new NotificationReader(pathCallSid);
    }
    public static NotificationReader reader(final String pathAccountSid, final String pathCallSid){
        return new NotificationReader(pathAccountSid, pathCallSid);
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

    private final String accountSid;
    private final String apiVersion;
    private final String callSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String errorCode;
    private final String log;
    private final ZonedDateTime messageDate;
    private final String messageText;
    private final URI moreInfo;
    private final HttpMethod requestMethod;
    private final URI requestUrl;
    private final String requestVariables;
    private final String responseBody;
    private final String responseHeaders;
    private final String sid;
    private final String uri;

    @JsonCreator
    private Notification(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("api_version")
        final String apiVersion,

        @JsonProperty("call_sid")
        final String callSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("error_code")
        final String errorCode,

        @JsonProperty("log")
        final String log,

        @JsonProperty("message_date")
        final String messageDate,

        @JsonProperty("message_text")
        final String messageText,

        @JsonProperty("more_info")
        final URI moreInfo,

        @JsonProperty("request_method")
        final HttpMethod requestMethod,

        @JsonProperty("request_url")
        final URI requestUrl,

        @JsonProperty("request_variables")
        final String requestVariables,

        @JsonProperty("response_body")
        final String responseBody,

        @JsonProperty("response_headers")
        final String responseHeaders,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("uri")
        final String uri
    ) {
        this.accountSid = accountSid;
        this.apiVersion = apiVersion;
        this.callSid = callSid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.errorCode = errorCode;
        this.log = log;
        this.messageDate = DateConverter.rfc2822DateTimeFromString(messageDate);
        this.messageText = messageText;
        this.moreInfo = moreInfo;
        this.requestMethod = requestMethod;
        this.requestUrl = requestUrl;
        this.requestVariables = requestVariables;
        this.responseBody = responseBody;
        this.responseHeaders = responseHeaders;
        this.sid = sid;
        this.uri = uri;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getApiVersion() {
            return this.apiVersion;
        }
        public final String getCallSid() {
            return this.callSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getErrorCode() {
            return this.errorCode;
        }
        public final String getLog() {
            return this.log;
        }
        public final ZonedDateTime getMessageDate() {
            return this.messageDate;
        }
        public final String getMessageText() {
            return this.messageText;
        }
        public final URI getMoreInfo() {
            return this.moreInfo;
        }
        public final HttpMethod getRequestMethod() {
            return this.requestMethod;
        }
        public final URI getRequestUrl() {
            return this.requestUrl;
        }
        public final String getRequestVariables() {
            return this.requestVariables;
        }
        public final String getResponseBody() {
            return this.responseBody;
        }
        public final String getResponseHeaders() {
            return this.responseHeaders;
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

        Notification other = (Notification) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(apiVersion, other.apiVersion) &&  Objects.equals(callSid, other.callSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(errorCode, other.errorCode) &&  Objects.equals(log, other.log) &&  Objects.equals(messageDate, other.messageDate) &&  Objects.equals(messageText, other.messageText) &&  Objects.equals(moreInfo, other.moreInfo) &&  Objects.equals(requestMethod, other.requestMethod) &&  Objects.equals(requestUrl, other.requestUrl) &&  Objects.equals(requestVariables, other.requestVariables) &&  Objects.equals(responseBody, other.responseBody) &&  Objects.equals(responseHeaders, other.responseHeaders) &&  Objects.equals(sid, other.sid) &&  Objects.equals(uri, other.uri)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, apiVersion, callSid, dateCreated, dateUpdated, errorCode, log, messageDate, messageText, moreInfo, requestMethod, requestUrl, requestVariables, responseBody, responseHeaders, sid, uri);
    }

}

