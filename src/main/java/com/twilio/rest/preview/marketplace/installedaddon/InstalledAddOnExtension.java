/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.marketplace.installedaddon;

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
public class InstalledAddOnExtension extends Resource {
    private static final long serialVersionUID = 244872409958696L;


    public static InstalledAddOnExtensionFetcher fetcher(final String pathInstalledAddOnSid, final String pathSid){
        return new InstalledAddOnExtensionFetcher(pathInstalledAddOnSid, pathSid);
    }


    public static InstalledAddOnExtensionReader reader(final String pathInstalledAddOnSid){
        return new InstalledAddOnExtensionReader(pathInstalledAddOnSid);
    }

    public static InstalledAddOnExtensionUpdater updater(final String pathInstalledAddOnSid, final String pathSid, final Boolean enabled){
        return new InstalledAddOnExtensionUpdater(pathInstalledAddOnSid, pathSid, enabled);
    }

    /**
    * Converts a JSON String into a InstalledAddOnExtension object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return InstalledAddOnExtension object represented by the provided JSON
    */
    public static InstalledAddOnExtension fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InstalledAddOnExtension.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a InstalledAddOnExtension object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return InstalledAddOnExtension object represented by the provided JSON
    */
    public static InstalledAddOnExtension fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InstalledAddOnExtension.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String installedAddOnSid;
    private final String friendlyName;
    private final String productName;
    private final String uniqueName;
    private final Boolean enabled;
    private final URI url;

    @JsonCreator
    private InstalledAddOnExtension(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("installed_add_on_sid")
        final String installedAddOnSid,

        @JsonProperty("friendly_name")
        final String friendlyName,

        @JsonProperty("product_name")
        final String productName,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("enabled")
        final Boolean enabled,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.installedAddOnSid = installedAddOnSid;
        this.friendlyName = friendlyName;
        this.productName = productName;
        this.uniqueName = uniqueName;
        this.enabled = enabled;
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getInstalledAddOnSid() {
            return this.installedAddOnSid;
        }
        public final String getFriendlyName() {
            return this.friendlyName;
        }
        public final String getProductName() {
            return this.productName;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final Boolean getEnabled() {
            return this.enabled;
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

        InstalledAddOnExtension other = (InstalledAddOnExtension) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(installedAddOnSid, other.installedAddOnSid) &&  Objects.equals(friendlyName, other.friendlyName) &&  Objects.equals(productName, other.productName) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(enabled, other.enabled) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, installedAddOnSid, friendlyName, productName, uniqueName, enabled, url);
    }

}

