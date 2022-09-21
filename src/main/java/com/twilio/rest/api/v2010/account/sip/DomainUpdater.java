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

package com.twilio.rest.api.v2010.account.sip;

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

import java.net.URI;




/*
    * Twilio - Api
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.35.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class DomainUpdater extends Updater<Domain>{
    private String sid;
    private String accountSid;
    private String friendlyName;
    private HttpMethod voiceFallbackMethod;
    private URI voiceFallbackUrl;
    private HttpMethod voiceMethod;
    private HttpMethod voiceStatusCallbackMethod;
    private URI voiceStatusCallbackUrl;
    private URI voiceUrl;
    private Boolean sipRegistration;
    private String domainName;
    private Boolean emergencyCallingEnabled;
    private Boolean secure;
    private String byocTrunkSid;
    private String emergencyCallerSid;

    public DomainUpdater(final String sid){
        this.sid = sid;
    }
    public DomainUpdater(final String accountSid, final String sid){
        this.accountSid = accountSid;
        this.sid = sid;
    }

    public DomainUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public DomainUpdater setVoiceFallbackMethod(final HttpMethod voiceFallbackMethod){
        this.voiceFallbackMethod = voiceFallbackMethod;
        return this;
    }
    public DomainUpdater setVoiceFallbackUrl(final URI voiceFallbackUrl){
        this.voiceFallbackUrl = voiceFallbackUrl;
        return this;
    }

    public DomainUpdater setVoiceFallbackUrl(final String voiceFallbackUrl){
        return setVoiceFallbackUrl(Promoter.uriFromString(voiceFallbackUrl));
    }
    public DomainUpdater setVoiceMethod(final HttpMethod voiceMethod){
        this.voiceMethod = voiceMethod;
        return this;
    }
    public DomainUpdater setVoiceStatusCallbackMethod(final HttpMethod voiceStatusCallbackMethod){
        this.voiceStatusCallbackMethod = voiceStatusCallbackMethod;
        return this;
    }
    public DomainUpdater setVoiceStatusCallbackUrl(final URI voiceStatusCallbackUrl){
        this.voiceStatusCallbackUrl = voiceStatusCallbackUrl;
        return this;
    }

    public DomainUpdater setVoiceStatusCallbackUrl(final String voiceStatusCallbackUrl){
        return setVoiceStatusCallbackUrl(Promoter.uriFromString(voiceStatusCallbackUrl));
    }
    public DomainUpdater setVoiceUrl(final URI voiceUrl){
        this.voiceUrl = voiceUrl;
        return this;
    }

    public DomainUpdater setVoiceUrl(final String voiceUrl){
        return setVoiceUrl(Promoter.uriFromString(voiceUrl));
    }
    public DomainUpdater setSipRegistration(final Boolean sipRegistration){
        this.sipRegistration = sipRegistration;
        return this;
    }
    public DomainUpdater setDomainName(final String domainName){
        this.domainName = domainName;
        return this;
    }
    public DomainUpdater setEmergencyCallingEnabled(final Boolean emergencyCallingEnabled){
        this.emergencyCallingEnabled = emergencyCallingEnabled;
        return this;
    }
    public DomainUpdater setSecure(final Boolean secure){
        this.secure = secure;
        return this;
    }
    public DomainUpdater setByocTrunkSid(final String byocTrunkSid){
        this.byocTrunkSid = byocTrunkSid;
        return this;
    }
    public DomainUpdater setEmergencyCallerSid(final String emergencyCallerSid){
        this.emergencyCallerSid = emergencyCallerSid;
        return this;
    }

    @Override
    public Domain update(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/SIP/Domains/{Sid}.json";

        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());
        path = path.replace("{"+"Sid"+"}", this.sid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Domain update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Domain.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (voiceFallbackMethod != null) {
            request.addPostParam("VoiceFallbackMethod", voiceFallbackMethod.toString());
    
        }
        if (voiceFallbackUrl != null) {
            request.addPostParam("VoiceFallbackUrl", voiceFallbackUrl.toString());
    
        }
        if (voiceMethod != null) {
            request.addPostParam("VoiceMethod", voiceMethod.toString());
    
        }
        if (voiceStatusCallbackMethod != null) {
            request.addPostParam("VoiceStatusCallbackMethod", voiceStatusCallbackMethod.toString());
    
        }
        if (voiceStatusCallbackUrl != null) {
            request.addPostParam("VoiceStatusCallbackUrl", voiceStatusCallbackUrl.toString());
    
        }
        if (voiceUrl != null) {
            request.addPostParam("VoiceUrl", voiceUrl.toString());
    
        }
        if (sipRegistration != null) {
            request.addPostParam("SipRegistration", sipRegistration.toString());
    
        }
        if (domainName != null) {
            request.addPostParam("DomainName", domainName);
    
        }
        if (emergencyCallingEnabled != null) {
            request.addPostParam("EmergencyCallingEnabled", emergencyCallingEnabled.toString());
    
        }
        if (secure != null) {
            request.addPostParam("Secure", secure.toString());
    
        }
        if (byocTrunkSid != null) {
            request.addPostParam("ByocTrunkSid", byocTrunkSid);
    
        }
        if (emergencyCallerSid != null) {
            request.addPostParam("EmergencyCallerSid", emergencyCallerSid);
    
        }
    }
}
