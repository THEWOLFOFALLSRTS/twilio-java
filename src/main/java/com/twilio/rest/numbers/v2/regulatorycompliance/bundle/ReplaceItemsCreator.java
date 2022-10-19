/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Numbers
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.numbers.v2.regulatorycompliance.bundle;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class ReplaceItemsCreator extends Creator<ReplaceItems>{
    private String pathBundleSid;
    private String fromBundleSid;

    public ReplaceItemsCreator(final String pathBundleSid, final String fromBundleSid) {
        this.pathBundleSid = pathBundleSid;
        this.fromBundleSid = fromBundleSid;
    }

    public ReplaceItemsCreator setFromBundleSid(final String fromBundleSid){
        this.fromBundleSid = fromBundleSid;
        return this;
    }

    @Override
    public ReplaceItems create(final TwilioRestClient client){
        String path = "/v2/RegulatoryCompliance/Bundles/{BundleSid}/ReplaceItems";

        path = path.replace("{"+"BundleSid"+"}", this.pathBundleSid.toString());
        path = path.replace("{"+"FromBundleSid"+"}", this.fromBundleSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.NUMBERS.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("ReplaceItems creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ReplaceItems.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (fromBundleSid != null) {
            request.addPostParam("FromBundleSid", fromBundleSid);
    
        }
    }
}
