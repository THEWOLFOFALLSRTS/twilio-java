/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Sync
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.sync.v1.service;

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
    * Twilio - Sync
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class SyncListCreator extends Creator<SyncList>{
    private String serviceSid;
    private String uniqueName;
    private Integer ttl;
    private Integer collectionTtl;

    public SyncListCreator(final String serviceSid) {
        this.serviceSid = serviceSid;
    }

    public SyncListCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public SyncListCreator setTtl(final Integer ttl){
        this.ttl = ttl;
        return this;
    }
    public SyncListCreator setCollectionTtl(final Integer collectionTtl){
        this.collectionTtl = collectionTtl;
        return this;
    }

    @Override
    public SyncList create(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Lists";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.SYNC.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SyncList creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SyncList.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (ttl != null) {
            request.addPostParam("Ttl", ttl.toString());
    
        }
        if (collectionTtl != null) {
            request.addPostParam("CollectionTtl", collectionTtl.toString());
    
        }
    }
}
