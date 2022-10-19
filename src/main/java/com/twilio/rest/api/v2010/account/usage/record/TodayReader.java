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

package com.twilio.rest.api.v2010.account.usage.record;

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
import java.time.LocalDate;
import com.twilio.converter.DateConverter;



public class TodayReader extends Reader<Today> {
    private String pathAccountSid;
    private Today.Category category;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean includeSubaccounts;
    private Integer pageSize;

    public TodayReader(){
    }
    public TodayReader(final String pathAccountSid){
        this.pathAccountSid = pathAccountSid;
    }

    public TodayReader setCategory(final Today.Category category){
        this.category = category;
        return this;
    }
    public TodayReader setStartDate(final LocalDate startDate){
        this.startDate = startDate;
        return this;
    }
    public TodayReader setEndDate(final LocalDate endDate){
        this.endDate = endDate;
        return this;
    }
    public TodayReader setIncludeSubaccounts(final Boolean includeSubaccounts){
        this.includeSubaccounts = includeSubaccounts;
        return this;
    }
    public TodayReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Today> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Today> firstPage(final TwilioRestClient client) {
        String path = "/2010-04-01/Accounts/{AccountSid}/Usage/Records/Today.json";
        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        path = path.replace("{"+"AccountSid"+"}", this.pathAccountSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Today> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Today read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "usage_records",
            response.getContent(),
            Today.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Today> previousPage(final Page<Today> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<Today> nextPage(final Page<Today> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Today> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (category != null) {
    
            request.addQueryParam("Category", category.toString());
        }
        if (startDate != null) {
            request.addQueryParam("StartDate", DateConverter.dateStringFromLocalDate(startDate));
        }

        if (endDate != null) {
            request.addQueryParam("EndDate", DateConverter.dateStringFromLocalDate(endDate));
        }

        if (includeSubaccounts != null) {
    
            request.addQueryParam("IncludeSubaccounts", includeSubaccounts.toString());
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}
