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

package com.twilio.rest.insights.v1;

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

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Setting extends Resource {
    private static final long serialVersionUID = 24698393526973L;


    public static SettingFetcher fetcher(){
        return new SettingFetcher();
    }



    public static SettingUpdater updater(){
        return new SettingUpdater();
    }

    /**
    * Converts a JSON String into a Setting object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Setting object represented by the provided JSON
    */
    public static Setting fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Setting.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Setting object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Setting object represented by the provided JSON
    */
    public static Setting fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Setting.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Boolean advancedFeatures;
    private final Boolean voiceTrace;
    private final URI url;

    @JsonCreator
    private Setting(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("advanced_features")
        final Boolean advancedFeatures,

        @JsonProperty("voice_trace")
        final Boolean voiceTrace,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.advancedFeatures = advancedFeatures;
        this.voiceTrace = voiceTrace;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Boolean getAdvancedFeatures() {
            return this.advancedFeatures;
        }
        public final Boolean getVoiceTrace() {
            return this.voiceTrace;
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

        Setting other = (Setting) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(advancedFeatures, other.advancedFeatures) &&  Objects.equals(voiceTrace, other.voiceTrace) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, advancedFeatures, voiceTrace, url);
    }

}

