/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Chat
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.chat.v2.service;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;


import java.util.List;



/*
    * Twilio - Chat
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class RoleUpdater extends Updater<Role>{
    private String serviceSid;
    private String sid;
    private List<String> permission;

    public RoleUpdater(final String serviceSid, final String sid, final List<String> permission){
        this.serviceSid = serviceSid;
        this.sid = sid;
        this.permission = permission;
    }

    public RoleUpdater setPermission(final List<String> permission){
        this.permission = permission;
        return this;
    }

    @Override
    public Role update(final TwilioRestClient client){
        String path = "/v2/Services/{ServiceSid}/Roles/{Sid}";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"Sid"+"}", this.sid.toString());
        path = path.replace("{"+"Permission"+"}", this.permission.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.CHAT.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Role update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Role.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (permission != null) {
            for (String prop : permission) {
                request.addPostParam("Permission", prop);
            }
    
        }
    }
}
