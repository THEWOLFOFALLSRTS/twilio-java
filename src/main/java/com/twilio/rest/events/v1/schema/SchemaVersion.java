/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Events
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.events.v1.schema;

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

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class SchemaVersion extends Resource {
    private static final long serialVersionUID = 232564429627083L;


    public static SchemaVersionFetcher fetcher(final String id, final Integer schemaVersion){
        return new SchemaVersionFetcher(id, schemaVersion);
    }


    public static SchemaVersionReader reader(final String id){
        return new SchemaVersionReader(id);
    }


    /**
    * Converts a JSON String into a SchemaVersion object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SchemaVersion object represented by the provided JSON
    */
    public static SchemaVersion fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SchemaVersion.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SchemaVersion object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SchemaVersion object represented by the provided JSON
    */
    public static SchemaVersion fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SchemaVersion.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String id;
    private final Integer schemaVersion;
    private final ZonedDateTime dateCreated;
    private final URI url;
    private final URI raw;

    @JsonCreator
    private SchemaVersion(
        @JsonProperty("id")
        final String id,

        @JsonProperty("schema_version")
        final Integer schemaVersion,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("raw")
        final URI raw
    ) {
        this.id = id;
        this.schemaVersion = schemaVersion;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.url = url;
        this.raw = raw;
    }

        public final String getId() {
            return this.id;
        }
        public final Integer getSchemaVersion() {
            return this.schemaVersion;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final URI getRaw() {
            return this.raw;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SchemaVersion other = (SchemaVersion) o;

        return Objects.equals(id, other.id) &&  Objects.equals(schemaVersion, other.schemaVersion) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(url, other.url) &&  Objects.equals(raw, other.raw)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schemaVersion, dateCreated, url, raw);
    }

}

