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

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;



public class ItemAssignmentReader extends Reader<ItemAssignment> {
    private String pathBundleSid;
    private Integer pageSize;

    public ItemAssignmentReader(final String pathBundleSid){
        this.pathBundleSid = pathBundleSid;
    }

    public ItemAssignmentReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<ItemAssignment> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<ItemAssignment> firstPage(final TwilioRestClient client) {
        String path = "/v2/RegulatoryCompliance/Bundles/{BundleSid}/ItemAssignments";
        path = path.replace("{"+"BundleSid"+"}", this.pathBundleSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.NUMBERS.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<ItemAssignment> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("ItemAssignment read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "results",
            response.getContent(),
            ItemAssignment.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<ItemAssignment> previousPage(final Page<ItemAssignment> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.NUMBERS.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<ItemAssignment> nextPage(final Page<ItemAssignment> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.NUMBERS.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<ItemAssignment> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}
