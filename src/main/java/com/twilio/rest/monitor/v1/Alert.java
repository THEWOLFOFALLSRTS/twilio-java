/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Monitor
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.monitor.v1;

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
public class Alert extends Resource {
    private static final long serialVersionUID = 14184743930644L;


    public static AlertFetcher fetcher(final String pathSid){
        return new AlertFetcher(pathSid);
    }


    public static AlertReader reader(){
        return new AlertReader();
    }


    /**
    * Converts a JSON String into a Alert object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Alert object represented by the provided JSON
    */
    public static Alert fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Alert.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Alert object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Alert object represented by the provided JSON
    */
    public static Alert fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Alert.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String alertText;
    private final String apiVersion;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateGenerated;
    private final ZonedDateTime dateUpdated;
    private final String errorCode;
    private final String logLevel;
    private final String moreInfo;
    private final HttpMethod requestMethod;
    private final String requestUrl;
    private final String requestVariables;
    private final String resourceSid;
    private final String responseBody;
    private final String responseHeaders;
    private final String sid;
    private final URI url;
    private final String requestHeaders;
    private final String serviceSid;

    @JsonCreator
    private Alert(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("alert_text")
        final String alertText,

        @JsonProperty("api_version")
        final String apiVersion,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_generated")
        final String dateGenerated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("error_code")
        final String errorCode,

        @JsonProperty("log_level")
        final String logLevel,

        @JsonProperty("more_info")
        final String moreInfo,

        @JsonProperty("request_method")
        final HttpMethod requestMethod,

        @JsonProperty("request_url")
        final String requestUrl,

        @JsonProperty("request_variables")
        final String requestVariables,

        @JsonProperty("resource_sid")
        final String resourceSid,

        @JsonProperty("response_body")
        final String responseBody,

        @JsonProperty("response_headers")
        final String responseHeaders,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("request_headers")
        final String requestHeaders,

        @JsonProperty("service_sid")
        final String serviceSid
    ) {
        this.accountSid = accountSid;
        this.alertText = alertText;
        this.apiVersion = apiVersion;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateGenerated = DateConverter.iso8601DateTimeFromString(dateGenerated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.errorCode = errorCode;
        this.logLevel = logLevel;
        this.moreInfo = moreInfo;
        this.requestMethod = requestMethod;
        this.requestUrl = requestUrl;
        this.requestVariables = requestVariables;
        this.resourceSid = resourceSid;
        this.responseBody = responseBody;
        this.responseHeaders = responseHeaders;
        this.sid = sid;
        this.url = url;
        this.requestHeaders = requestHeaders;
        this.serviceSid = serviceSid;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getAlertText() {
            return this.alertText;
        }
        public final String getApiVersion() {
            return this.apiVersion;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateGenerated() {
            return this.dateGenerated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getErrorCode() {
            return this.errorCode;
        }
        public final String getLogLevel() {
            return this.logLevel;
        }
        public final String getMoreInfo() {
            return this.moreInfo;
        }
        public final HttpMethod getRequestMethod() {
            return this.requestMethod;
        }
        public final String getRequestUrl() {
            return this.requestUrl;
        }
        public final String getRequestVariables() {
            return this.requestVariables;
        }
        public final String getResourceSid() {
            return this.resourceSid;
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
        public final URI getUrl() {
            return this.url;
        }
        public final String getRequestHeaders() {
            return this.requestHeaders;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Alert other = (Alert) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(alertText, other.alertText) &&  Objects.equals(apiVersion, other.apiVersion) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateGenerated, other.dateGenerated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(errorCode, other.errorCode) &&  Objects.equals(logLevel, other.logLevel) &&  Objects.equals(moreInfo, other.moreInfo) &&  Objects.equals(requestMethod, other.requestMethod) &&  Objects.equals(requestUrl, other.requestUrl) &&  Objects.equals(requestVariables, other.requestVariables) &&  Objects.equals(resourceSid, other.resourceSid) &&  Objects.equals(responseBody, other.responseBody) &&  Objects.equals(responseHeaders, other.responseHeaders) &&  Objects.equals(sid, other.sid) &&  Objects.equals(url, other.url) &&  Objects.equals(requestHeaders, other.requestHeaders) &&  Objects.equals(serviceSid, other.serviceSid)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, alertText, apiVersion, dateCreated, dateGenerated, dateUpdated, errorCode, logLevel, moreInfo, requestMethod, requestUrl, requestVariables, resourceSid, responseBody, responseHeaders, sid, url, requestHeaders, serviceSid);
    }

}

