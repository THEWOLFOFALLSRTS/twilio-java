/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Media
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.media.v1.playerstreamer;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Media
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class PlaybackGrantCreator extends Creator<PlaybackGrant>{
    private String sid;
    private Integer ttl;
    private String accessControlAllowOrigin;

    public PlaybackGrantCreator(final String sid) {
        this.sid = sid;
    }

    public PlaybackGrantCreator setTtl(final Integer ttl){
        this.ttl = ttl;
        return this;
    }
    public PlaybackGrantCreator setAccessControlAllowOrigin(final String accessControlAllowOrigin){
        this.accessControlAllowOrigin = accessControlAllowOrigin;
        return this;
    }

    @Override
    public PlaybackGrant create(final TwilioRestClient client){
        String path = "/v1/PlayerStreamers/{Sid}/PlaybackGrant";

        path = path.replace("{"+"Sid"+"}", this.sid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.MEDIA.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("PlaybackGrant creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return PlaybackGrant.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (ttl != null) {
            request.addPostParam("Ttl", ttl.toString());
    
        }
        if (accessControlAllowOrigin != null) {
            request.addPostParam("AccessControlAllowOrigin", accessControlAllowOrigin);
    
        }
    }
}
