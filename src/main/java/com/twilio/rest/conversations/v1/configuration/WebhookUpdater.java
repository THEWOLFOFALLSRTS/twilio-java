/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Conversations
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.conversations.v1.configuration;

import com.twilio.base.Updater;
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



/*
    * Twilio - Conversations
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.35.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class WebhookUpdater extends Updater<Webhook>{
    private String method;
    private List<String> filters;
    private String preWebhookUrl;
    private String postWebhookUrl;
    private Webhook.Target target;

    public WebhookUpdater(){
    }

    public WebhookUpdater setMethod(final String method){
        this.method = method;
        return this;
    }
    public WebhookUpdater setFilters(final List<String> filters){
        this.filters = filters;
        return this;
    }
    public WebhookUpdater setFilters(final String filters){
        return setFilters(Promoter.listOfOne(filters));
    }
    public WebhookUpdater setPreWebhookUrl(final String preWebhookUrl){
        this.preWebhookUrl = preWebhookUrl;
        return this;
    }
    public WebhookUpdater setPostWebhookUrl(final String postWebhookUrl){
        this.postWebhookUrl = postWebhookUrl;
        return this;
    }
    public WebhookUpdater setTarget(final Webhook.Target target){
        this.target = target;
        return this;
    }

    @Override
    public Webhook update(final TwilioRestClient client){
        String path = "/v1/Configuration/Webhooks";


        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Webhook update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Webhook.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (method != null) {
            request.addPostParam("Method", method);
    
        }
        if (filters != null) {
            for (String prop : filters) {
                request.addPostParam("Filters", prop);
            }
    
        }
        if (preWebhookUrl != null) {
            request.addPostParam("PreWebhookUrl", preWebhookUrl);
    
        }
        if (postWebhookUrl != null) {
            request.addPostParam("PostWebhookUrl", postWebhookUrl);
    
        }
        if (target != null) {
            request.addPostParam("Target", target.toString());
    
        }
    }
}
