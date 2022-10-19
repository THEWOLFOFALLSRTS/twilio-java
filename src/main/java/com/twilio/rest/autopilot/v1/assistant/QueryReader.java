/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Autopilot
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.autopilot.v1.assistant;

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



public class QueryReader extends Reader<Query> {
    private String pathAssistantSid;
    private String language;
    private String modelBuild;
    private String status;
    private String dialogueSid;
    private Integer pageSize;

    public QueryReader(final String pathAssistantSid){
        this.pathAssistantSid = pathAssistantSid;
    }

    public QueryReader setLanguage(final String language){
        this.language = language;
        return this;
    }
    public QueryReader setModelBuild(final String modelBuild){
        this.modelBuild = modelBuild;
        return this;
    }
    public QueryReader setStatus(final String status){
        this.status = status;
        return this;
    }
    public QueryReader setDialogueSid(final String dialogueSid){
        this.dialogueSid = dialogueSid;
        return this;
    }
    public QueryReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Query> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Query> firstPage(final TwilioRestClient client) {
        String path = "/v1/Assistants/{AssistantSid}/Queries";
        path = path.replace("{"+"AssistantSid"+"}", this.pathAssistantSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.AUTOPILOT.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Query> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Query read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "queries",
            response.getContent(),
            Query.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Query> previousPage(final Page<Query> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.AUTOPILOT.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<Query> nextPage(final Page<Query> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.AUTOPILOT.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Query> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (language != null) {
    
            request.addQueryParam("Language", language);
        }
        if (modelBuild != null) {
    
            request.addQueryParam("ModelBuild", modelBuild);
        }
        if (status != null) {
    
            request.addQueryParam("Status", status);
        }
        if (dialogueSid != null) {
    
            request.addQueryParam("DialogueSid", dialogueSid);
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}
