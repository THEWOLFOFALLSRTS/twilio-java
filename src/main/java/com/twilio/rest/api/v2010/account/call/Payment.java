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
import com.twilio.converter.Promoter;
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
public class Payment extends Resource {
    private static final long serialVersionUID = 159828087372868L;

    public static PaymentCreator creator(final String callSid, final String idempotencyKey, final URI statusCallback){
        return new PaymentCreator(callSid, idempotencyKey, statusCallback);
    }
    public static PaymentCreator creator(final String accountSid, final String callSid, final String idempotencyKey, final URI statusCallback){
        return new PaymentCreator(accountSid, callSid, idempotencyKey, statusCallback);
    }




    public static PaymentUpdater updater(final String callSid, final String sid, final String idempotencyKey, final URI statusCallback){
        return new PaymentUpdater(callSid, sid, idempotencyKey, statusCallback);
    }
    public static PaymentUpdater updater(final String accountSid, final String callSid, final String sid, final String idempotencyKey, final URI statusCallback){
        return new PaymentUpdater(accountSid, callSid, sid, idempotencyKey, statusCallback);
    }

    /**
    * Converts a JSON String into a Payment object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Payment object represented by the provided JSON
    */
    public static Payment fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Payment.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Payment object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Payment object represented by the provided JSON
    */
    public static Payment fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Payment.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum BankAccountType {
        CONSUMER_CHECKING("consumer-checking"),
        CONSUMER_SAVINGS("consumer-savings"),
        COMMERCIAL_CHECKING("commercial-checking");

        private final String value;

        private BankAccountType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static BankAccountType forValue(final String value) {
            return Promoter.enumFromString(value, BankAccountType.values());
        }
    }
    public enum Capture {
        PAYMENT_CARD_NUMBER("payment-card-number"),
        EXPIRATION_DATE("expiration-date"),
        SECURITY_CODE("security-code"),
        POSTAL_CODE("postal-code"),
        BANK_ROUTING_NUMBER("bank-routing-number"),
        BANK_ACCOUNT_NUMBER("bank-account-number");

        private final String value;

        private Capture(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Capture forValue(final String value) {
            return Promoter.enumFromString(value, Capture.values());
        }
    }
    public enum PaymentMethod {
        CREDIT_CARD("credit-card"),
        ACH_DEBIT("ach-debit");

        private final String value;

        private PaymentMethod(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static PaymentMethod forValue(final String value) {
            return Promoter.enumFromString(value, PaymentMethod.values());
        }
    }
    public enum Status {
        COMPLETE("complete"),
        CANCEL("cancel");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }
    public enum TokenType {
        ONE_TIME("one-time"),
        REUSABLE("reusable");

        private final String value;

        private TokenType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static TokenType forValue(final String value) {
            return Promoter.enumFromString(value, TokenType.values());
        }
    }

    private final String accountSid;
    private final String callSid;
    private final String sid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI uri;

    @JsonCreator
    private Payment(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("call_sid")
        final String callSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("uri")
        final URI uri
    ) {
        this.accountSid = accountSid;
        this.callSid = callSid;
        this.sid = sid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.uri = uri;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getCallSid() {
            return this.callSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final URI getUri() {
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

        Payment other = (Payment) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(callSid, other.callSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(uri, other.uri)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, callSid, sid, dateCreated, dateUpdated, uri);
    }

}

