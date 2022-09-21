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

package com.twilio.rest.proxy.v1.service.session.participant;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.util.List;
import java.net.URI;

import java.util.List;



import java.net.URI;

/*
    * Twilio - Proxy
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.35.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class MessageInteractionCreator extends Creator<MessageInteraction>{
    private String serviceSid;
    private String sessionSid;
    private String participantSid;
    private String body;
    private List<URI> mediaUrl;

    public MessageInteractionCreator(final String serviceSid, final String sessionSid, final String participantSid, final String body) {
        this.serviceSid = serviceSid;
        this.sessionSid = sessionSid;
        this.participantSid = participantSid;
        this.body = body;
    }
    public MessageInteractionCreator(final String serviceSid, final String sessionSid, final String participantSid, final List<URI> mediaUrl) {
        this.serviceSid = serviceSid;
        this.sessionSid = sessionSid;
        this.participantSid = participantSid;
        this.mediaUrl = mediaUrl;
    }

    public MessageInteractionCreator setBody(final String body){
        this.body = body;
        return this;
    }
    public MessageInteractionCreator setMediaUrl(final List<URI> mediaUrl){
        this.mediaUrl = mediaUrl;
        return this;
    }
    public MessageInteractionCreator setMediaUrl(final URI mediaUrl){
        return setMediaUrl(Promoter.listOfOne(mediaUrl));
    }

    public MessageInteractionCreator setMediaUrl(final String mediaUrl){
        return setMediaUrl(Promoter.uriFromString(mediaUrl));
    }

    @Override
    public MessageInteraction create(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Sessions/{SessionSid}/Participants/{ParticipantSid}/MessageInteractions";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"SessionSid"+"}", this.sessionSid.toString());
        path = path.replace("{"+"ParticipantSid"+"}", this.participantSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PROXY.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("MessageInteraction creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return MessageInteraction.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (body != null) {
            request.addPostParam("Body", body);
    
        }
        if (mediaUrl != null) {
            for (URI prop : mediaUrl) {
                request.addPostParam("MediaUrl", prop.toString());
            }
    
        }
    }
}
