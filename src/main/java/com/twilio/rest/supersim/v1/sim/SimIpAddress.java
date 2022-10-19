/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Supersim
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.supersim.v1.sim;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class SimIpAddress extends Resource {
    private static final long serialVersionUID = 38184968632200L;




    public static SimIpAddressReader reader(final String pathSimSid){
        return new SimIpAddressReader(pathSimSid);
    }


    /**
    * Converts a JSON String into a SimIpAddress object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return SimIpAddress object represented by the provided JSON
    */
    public static SimIpAddress fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SimIpAddress.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a SimIpAddress object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return SimIpAddress object represented by the provided JSON
    */
    public static SimIpAddress fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SimIpAddress.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum IpAddressVersion {
        IPV4("IPv4"),
        IPV6("IPv6");

        private final String value;

        private IpAddressVersion(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static IpAddressVersion forValue(final String value) {
            return Promoter.enumFromString(value, IpAddressVersion.values());
        }
    }

    private final String ipAddress;
    private final SimIpAddress.IpAddressVersion ipAddressVersion;

    @JsonCreator
    private SimIpAddress(
        @JsonProperty("ip_address")
        final String ipAddress,

        @JsonProperty("ip_address_version")
        final SimIpAddress.IpAddressVersion ipAddressVersion
    ) {
        this.ipAddress = ipAddress;
        this.ipAddressVersion = ipAddressVersion;
    }

        public final String getIpAddress() {
            return this.ipAddress;
        }
        public final SimIpAddress.IpAddressVersion getIpAddressVersion() {
            return this.ipAddressVersion;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SimIpAddress other = (SimIpAddress) o;

        return Objects.equals(ipAddress, other.ipAddress) &&  Objects.equals(ipAddressVersion, other.ipAddressVersion)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddress, ipAddressVersion);
    }

}

