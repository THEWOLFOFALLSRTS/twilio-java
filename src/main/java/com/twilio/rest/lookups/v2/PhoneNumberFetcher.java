/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Lookups
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.lookups.v2;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Lookups
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class PhoneNumberFetcher extends Fetcher<PhoneNumber> {
    private String phoneNumber;
    private String fields;
    private String countryCode;

    public PhoneNumberFetcher(final String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumberFetcher setFields(final String fields){
    this.fields = fields;
    return this;
    }
    public PhoneNumberFetcher setCountryCode(final String countryCode){
    this.countryCode = countryCode;
    return this;
    }

    @Override
    public PhoneNumber fetch(final TwilioRestClient client) {
        String path = "/v2/PhoneNumbers/{PhoneNumber}";

        path = path.replace("{"+"PhoneNumber"+"}", this.phoneNumber.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.LOOKUPS.toString(),
            path
        );
        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("PhoneNumber fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return PhoneNumber.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addQueryParams(final Request request) {
        if (fields != null) {
    
            request.addQueryParam("Fields", fields);
        }
        if (countryCode != null) {
    
            request.addQueryParam("CountryCode", countryCode);
        }
    }
}

