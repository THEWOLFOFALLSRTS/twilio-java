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

package com.twilio.rest.preview.sync.service.document;

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
public class DocumentPermission extends Resource {
    private static final long serialVersionUID = 90173038651529L;


    public static DocumentPermissionFetcher fetcher(final String pathServiceSid, final String pathDocumentSid, final String pathIdentity){
        return new DocumentPermissionFetcher(pathServiceSid, pathDocumentSid, pathIdentity);
    }

    public static DocumentPermissionDeleter deleter(final String pathServiceSid, final String pathDocumentSid, final String pathIdentity){
        return new DocumentPermissionDeleter(pathServiceSid, pathDocumentSid, pathIdentity);
    }

    public static DocumentPermissionReader reader(final String pathServiceSid, final String pathDocumentSid){
        return new DocumentPermissionReader(pathServiceSid, pathDocumentSid);
    }

    public static DocumentPermissionUpdater updater(final String pathServiceSid, final String pathDocumentSid, final String pathIdentity, final Boolean read, final Boolean write, final Boolean manage){
        return new DocumentPermissionUpdater(pathServiceSid, pathDocumentSid, pathIdentity, read, write, manage);
    }

    /**
    * Converts a JSON String into a DocumentPermission object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return DocumentPermission object represented by the provided JSON
    */
    public static DocumentPermission fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DocumentPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a DocumentPermission object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return DocumentPermission object represented by the provided JSON
    */
    public static DocumentPermission fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DocumentPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String documentSid;
    private final String identity;
    private final Boolean read;
    private final Boolean write;
    private final Boolean manage;
    private final URI url;

    @JsonCreator
    private DocumentPermission(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("service_sid")
        final String serviceSid,

        @JsonProperty("document_sid")
        final String documentSid,

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
        this.documentSid = documentSid;
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
        public final String getDocumentSid() {
            return this.documentSid;
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

        DocumentPermission other = (DocumentPermission) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(serviceSid, other.serviceSid) &&  Objects.equals(documentSid, other.documentSid) &&  Objects.equals(identity, other.identity) &&  Objects.equals(read, other.read) &&  Objects.equals(write, other.write) &&  Objects.equals(manage, other.manage) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, serviceSid, documentSid, identity, read, write, manage, url);
    }

}

