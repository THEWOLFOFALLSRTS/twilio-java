/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Verify
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.verify.v2;

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;
import java.time.ZonedDateTime;





/*
    * Twilio - Verify
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class VerificationAttemptReader extends Reader<VerificationAttempt> {
    private ZonedDateTime dateCreatedAfter;
    private ZonedDateTime dateCreatedBefore;
    private String channelDataTo;
    private String country;
    private VerificationAttempt.Channels channel;
    private String verifyServiceSid;
    private String verificationSid;
    private VerificationAttempt.ConversionStatus status;
    private Integer pageSize;

    public VerificationAttemptReader(){
    }

    public VerificationAttemptReader setDateCreatedAfter(final ZonedDateTime dateCreatedAfter){
        this.dateCreatedAfter = dateCreatedAfter;
        return this;
    }
    public VerificationAttemptReader setDateCreatedBefore(final ZonedDateTime dateCreatedBefore){
        this.dateCreatedBefore = dateCreatedBefore;
        return this;
    }
    public VerificationAttemptReader setChannelDataTo(final String channelDataTo){
        this.channelDataTo = channelDataTo;
        return this;
    }
    public VerificationAttemptReader setCountry(final String country){
        this.country = country;
        return this;
    }
    public VerificationAttemptReader setChannel(final VerificationAttempt.Channels channel){
        this.channel = channel;
        return this;
    }
    public VerificationAttemptReader setVerifyServiceSid(final String verifyServiceSid){
        this.verifyServiceSid = verifyServiceSid;
        return this;
    }
    public VerificationAttemptReader setVerificationSid(final String verificationSid){
        this.verificationSid = verificationSid;
        return this;
    }
    public VerificationAttemptReader setStatus(final VerificationAttempt.ConversionStatus status){
        this.status = status;
        return this;
    }
    public VerificationAttemptReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<VerificationAttempt> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<VerificationAttempt> firstPage(final TwilioRestClient client) {
        String path = "/v2/Attempts";

        Request request = new Request(
            HttpMethod.GET,
            Domains.VERIFY.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<VerificationAttempt> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("VerificationAttempt read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "attempts",
            response.getContent(),
            VerificationAttempt.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<VerificationAttempt> previousPage(final Page<VerificationAttempt> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.VERIFY.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<VerificationAttempt> nextPage(final Page<VerificationAttempt> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.VERIFY.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<VerificationAttempt> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (dateCreatedAfter != null) {
            request.addQueryParam("DateCreatedAfter", dateCreatedAfter.toInstant().toString());
        }

        if (dateCreatedBefore != null) {
            request.addQueryParam("DateCreatedBefore", dateCreatedBefore.toInstant().toString());
        }

        if (channelDataTo != null) {
    
            request.addQueryParam("ChannelData.To", channelDataTo);
        }
        if (country != null) {
    
            request.addQueryParam("Country", country);
        }
        if (channel != null) {
    
            request.addQueryParam("Channel", channel.toString());
        }
        if (verifyServiceSid != null) {
    
            request.addQueryParam("VerifyServiceSid", verifyServiceSid);
        }
        if (verificationSid != null) {
    
            request.addQueryParam("VerificationSid", verificationSid);
        }
        if (status != null) {
    
            request.addQueryParam("Status", status.toString());
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}

