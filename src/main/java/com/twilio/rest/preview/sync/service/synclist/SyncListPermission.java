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

package com.twilio.rest.preview.sync.service.synclist;

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
public class SyncListPermission extends Resource {
    private static final long serialVersionUID = 225550881347017L;


    public static SyncListPermissionFetcher fetcher(final String pathServiceSid, final String pathListSid, final String pathIdentity){
        return new SyncListPermissionFetcher(pathServiceSid, pathListSid, pathIdentity);
    }

    public static SyncListPermissionDeleter deleter(final String pathServiceSid, final String pathListSid, final String pathIdentity){
        return new SyncListPermissionDeleter(pathServiceSid, pathListSid, pathIdentity);
    }

    public static SyncListPermissionReader reader(final String pathServiceSid, final String pathListSid){
        return new SyncListPermissionReader(pathServiceSid, pathListSid);
    }

    public static SyncListPermissionUpdater updater(final String pathServiceSid, final String pathListSid, final String pathIdentity, final Boolean read, final Boolean write, final Boolean manage){
        return new SyncListPermissionUpdater(pathServiceSid, pathListSid, pathIdentity, read, write, manage);
    }

    /**
    * Converts a JSON String into a SyncListPermission object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SyncListPermission object represented by the provided JSON
    */
    public static SyncListPermission fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncListPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SyncListPermission object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SyncListPermission object represented by the provided JSON
    */
    public static SyncListPermission fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncListPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String listSid;
    private final String identity;
    private final Boolean read;
    private final Boolean write;
    private final Boolean manage;
    private final URI url;

    @JsonCreator
    private SyncListPermission(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("list_sid")
        final String listSid,

        @JsonProperty("identity")
        final String identity,

        @JsonProperty("read")
        final Boolean read,

        @JsonProperty("write")
        final Boolean write,

        @JsonProperty("manage")
        final Boolean manage,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.listSid = listSid;
        this.identity = identity;
        this.read = read;
        this.write = write;
        this.manage = manage;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getServiceSid() {
            return this.serviceSid;
        }
        public final String getListSid() {
            return this.listSid;
        }
        public final String getIdentity() {
            return this.identity;
        }
        public final Boolean getRead() {
            return this.read;
        }
        public final Boolean getWrite() {
            return this.write;
        }
        public final Boolean getManage() {
            return this.manage;
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

        SyncListPermission other = (SyncListPermission) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(listSid, other.listSid) &&  Objects.equals(identity, other.identity) &&  Objects.equals(read, other.read) &&  Objects.equals(write, other.write) &&  Objects.equals(manage, other.manage) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, serviceSid, listSid, identity, read, write, manage, url);
    }

}

