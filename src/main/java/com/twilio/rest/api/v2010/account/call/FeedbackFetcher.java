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

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class FeedbackFetcher extends Fetcher<Feedback> {
    private String pathCallSid;
    private String pathAccountSid;

    public FeedbackFetcher(final String pathCallSid){
        this.pathCallSid = pathCallSid;
    }
    public FeedbackFetcher(final String pathAccountSid, final String pathCallSid){
        this.pathAccountSid = pathAccountSid;
        this.pathCallSid = pathCallSid;
    }


    @Override
    public Feedback fetch(final TwilioRestClient client) {
        String path = "/2010-04-01/Accounts/{AccountSid}/Calls/{CallSid}/Feedback.json";

        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        path = path.replace("{"+"AccountSid"+"}", this.pathAccountSid.toString());
        path = path.replace("{"+"CallSid"+"}", this.pathCallSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("Feedback fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Feedback.fromJson(response.getStream(), client.getObjectMapper());
    }
}
