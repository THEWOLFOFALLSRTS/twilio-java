/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Voice
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.voice.v1;

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
import java.net.URI;




import java.net.URI;

/*
    * Twilio - Voice
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.35.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ByocTrunkCreator extends Creator<ByocTrunk>{
    private String friendlyName;
    private URI voiceUrl;
    private HttpMethod voiceMethod;
    private URI voiceFallbackUrl;
    private HttpMethod voiceFallbackMethod;
    private URI statusCallbackUrl;
    private HttpMethod statusCallbackMethod;
    private Boolean cnamLookupEnabled;
    private String connectionPolicySid;
    private String fromDomainSid;

    public ByocTrunkCreator() {
    }

    public ByocTrunkCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public ByocTrunkCreator setVoiceUrl(final URI voiceUrl){
        this.voiceUrl = voiceUrl;
        return this;
    }

    public ByocTrunkCreator setVoiceUrl(final String voiceUrl){
        return setVoiceUrl(Promoter.uriFromString(voiceUrl));
    }
    public ByocTrunkCreator setVoiceMethod(final HttpMethod voiceMethod){
        this.voiceMethod = voiceMethod;
        return this;
    }
    public ByocTrunkCreator setVoiceFallbackUrl(final URI voiceFallbackUrl){
        this.voiceFallbackUrl = voiceFallbackUrl;
        return this;
    }

    public ByocTrunkCreator setVoiceFallbackUrl(final String voiceFallbackUrl){
        return setVoiceFallbackUrl(Promoter.uriFromString(voiceFallbackUrl));
    }
    public ByocTrunkCreator setVoiceFallbackMethod(final HttpMethod voiceFallbackMethod){
        this.voiceFallbackMethod = voiceFallbackMethod;
        return this;
    }
    public ByocTrunkCreator setStatusCallbackUrl(final URI statusCallbackUrl){
        this.statusCallbackUrl = statusCallbackUrl;
        return this;
    }

    public ByocTrunkCreator setStatusCallbackUrl(final String statusCallbackUrl){
        return setStatusCallbackUrl(Promoter.uriFromString(statusCallbackUrl));
    }
    public ByocTrunkCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod){
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }
    public ByocTrunkCreator setCnamLookupEnabled(final Boolean cnamLookupEnabled){
        this.cnamLookupEnabled = cnamLookupEnabled;
        return this;
    }
    public ByocTrunkCreator setConnectionPolicySid(final String connectionPolicySid){
        this.connectionPolicySid = connectionPolicySid;
        return this;
    }
    public ByocTrunkCreator setFromDomainSid(final String fromDomainSid){
        this.fromDomainSid = fromDomainSid;
        return this;
    }

    @Override
    public ByocTrunk create(final TwilioRestClient client){
        String path = "/v1/ByocTrunks";


        Request request = new Request(
            HttpMethod.POST,
            Domains.VOICE.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("ByocTrunk creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ByocTrunk.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (voiceUrl != null) {
            request.addPostParam("VoiceUrl", voiceUrl.toString());
    
        }
        if (voiceMethod != null) {
            request.addPostParam("VoiceMethod", voiceMethod.toString());
    
        }
        if (voiceFallbackUrl != null) {
            request.addPostParam("VoiceFallbackUrl", voiceFallbackUrl.toString());
    
        }
        if (voiceFallbackMethod != null) {
            request.addPostParam("VoiceFallbackMethod", voiceFallbackMethod.toString());
    
        }
        if (statusCallbackUrl != null) {
            request.addPostParam("StatusCallbackUrl", statusCallbackUrl.toString());
    
        }
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
    
        }
        if (cnamLookupEnabled != null) {
            request.addPostParam("CnamLookupEnabled", cnamLookupEnabled.toString());
    
        }
        if (connectionPolicySid != null) {
            request.addPostParam("ConnectionPolicySid", connectionPolicySid);
    
        }
        if (fromDomainSid != null) {
            request.addPostParam("FromDomainSid", fromDomainSid);
    
        }
    }
}
