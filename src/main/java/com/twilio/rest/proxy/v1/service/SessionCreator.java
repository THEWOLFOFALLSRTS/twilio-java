/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Proxy
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.proxy.v1.service;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.util.List;
import java.util.Map;
import com.twilio.converter.Converter;
import java.time.ZonedDateTime;

import java.util.List;
import java.util.Map;



public class SessionCreator extends Creator<Session>{
    private String pathServiceSid;
    private String uniqueName;
    private ZonedDateTime dateExpiry;
    private Integer ttl;
    private Session.Mode mode;
    private Session.Status status;
    private List<Map<String, Object>> participants;
    private Boolean failOnParticipantConflict;

    public SessionCreator(final String pathServiceSid) {
        this.pathServiceSid = pathServiceSid;
    }

    public SessionCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public SessionCreator setDateExpiry(final ZonedDateTime dateExpiry){
        this.dateExpiry = dateExpiry;
        return this;
    }
    public SessionCreator setTtl(final Integer ttl){
        this.ttl = ttl;
        return this;
    }
    public SessionCreator setMode(final Session.Mode mode){
        this.mode = mode;
        return this;
    }
    public SessionCreator setStatus(final Session.Status status){
        this.status = status;
        return this;
    }
    public SessionCreator setParticipants(final List<Map<String, Object>> participants){
        this.participants = participants;
        return this;
    }
    public SessionCreator setParticipants(final Map<String, Object> participants){
        return setParticipants(Promoter.listOfOne(participants));
    }
    public SessionCreator setFailOnParticipantConflict(final Boolean failOnParticipantConflict){
        this.failOnParticipantConflict = failOnParticipantConflict;
        return this;
    }

    @Override
    public Session create(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Sessions";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PROXY.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Session creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Session.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (dateExpiry != null) {
            request.addPostParam("DateExpiry", dateExpiry.toInstant().toString());

        }
        if (ttl != null) {
            request.addPostParam("Ttl", ttl.toString());
    
        }
        if (mode != null) {
            request.addPostParam("Mode", mode.toString());
    
        }
        if (status != null) {
            request.addPostParam("Status", status.toString());
    
        }
        if (participants != null) {
            for (Map<String, Object> prop : participants) {
                request.addPostParam("Participants", Converter.mapToJson(prop));
            }
    
        }
        if (failOnParticipantConflict != null) {
            request.addPostParam("FailOnParticipantConflict", failOnParticipantConflict.toString());
    
        }
    }
}
