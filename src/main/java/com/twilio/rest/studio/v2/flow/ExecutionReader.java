/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.studio.v2.flow;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ExecutionReader extends Reader<Execution> {
    private final String pathFlowSid;
    private DateTime dateCreatedFrom;
    private DateTime dateCreatedTo;

    /**
     * Construct a new ExecutionReader.
     *
     * @param pathFlowSid The SID of the Flow
     */
    public ExecutionReader(final String pathFlowSid) {
        this.pathFlowSid = pathFlowSid;
    }

    /**
     * Only show Execution resources starting on or after this [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time, given as
     * `YYYY-MM-DDThh:mm:ss-hh:mm`..
     *
     * @param dateCreatedFrom Only show Executions that started on or after this
     *                        ISO 8601 date-time
     * @return this
     */
    public ExecutionReader setDateCreatedFrom(final DateTime dateCreatedFrom) {
        this.dateCreatedFrom = dateCreatedFrom;
        return this;
    }

    /**
     * Only show Execution resources starting before this [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time, given as
     * `YYYY-MM-DDThh:mm:ss-hh:mm`..
     *
     * @param dateCreatedTo Only show Executions that started before this ISO 8601
     *                      date-time
     * @return this
     */
    public ExecutionReader setDateCreatedTo(final DateTime dateCreatedTo) {
        this.dateCreatedTo = dateCreatedTo;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Execution ResourceSet
     */
    @Override
    public ResourceSet<Execution> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Execution ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Execution> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.STUDIO.toString(),
            "/v2/Flows/" + this.pathFlowSid + "/Executions",
            client.getRegion()
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return Execution ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Execution> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<Execution> nextPage(final Page<Execution> page,
                                    final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(
                Domains.STUDIO.toString(),
                client.getRegion()
            )
        );
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the previous page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Previous Page
     */
    @Override
    public Page<Execution> previousPage(final Page<Execution> page,
                                        final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(
                Domains.STUDIO.toString(),
                client.getRegion()
            )
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Execution Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Execution> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Execution read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return Page.fromJson(
            "executions",
            response.getContent(),
            Execution.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (dateCreatedFrom != null) {
            request.addQueryParam("DateCreatedFrom", dateCreatedFrom.toString());
        }

        if (dateCreatedTo != null) {
            request.addQueryParam("DateCreatedTo", dateCreatedTo.toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}