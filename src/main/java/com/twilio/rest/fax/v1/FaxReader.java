/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.fax.v1;

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

import java.time.ZonedDateTime;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class FaxReader extends Reader<Fax> {
    private String from;
    private String to;
    private ZonedDateTime dateCreatedOnOrBefore;
    private ZonedDateTime dateCreatedAfter;

    /**
     * Retrieve only those faxes sent from this phone number, specified in <a
     * href="https://www.twilio.com/docs/glossary/what-e164">E.164</a> format..
     *
     * @param from Retrieve only those faxes sent from this phone number
     * @return this
     */
    public FaxReader setFrom(final String from) {
        this.from = from;
        return this;
    }

    /**
     * Retrieve only those faxes sent to this phone number, specified in <a
     * href="https://www.twilio.com/docs/glossary/what-e164">E.164</a> format..
     *
     * @param to Retrieve only those faxes sent to this phone number
     * @return this
     */
    public FaxReader setTo(final String to) {
        this.to = to;
        return this;
    }

    /**
     * Retrieve only those faxes with a `date_created` that is before or equal to
     * this value, specified in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     * 8601</a> format..
     *
     * @param dateCreatedOnOrBefore Retrieve only faxes created on or before this
     *                              date
     * @return this
     */
    public FaxReader setDateCreatedOnOrBefore(final ZonedDateTime dateCreatedOnOrBefore) {
        this.dateCreatedOnOrBefore = dateCreatedOnOrBefore;
        return this;
    }

    /**
     * Retrieve only those faxes with a `date_created` that is later than this
     * value, specified in <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO
     * 8601</a> format..
     *
     * @param dateCreatedAfter Retrieve only faxes created after this date
     * @return this
     */
    public FaxReader setDateCreatedAfter(final ZonedDateTime dateCreatedAfter) {
        this.dateCreatedAfter = dateCreatedAfter;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fax ResourceSet
     */
    @Override
    public ResourceSet<Fax> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fax ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Fax> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.FAX.toString(),
            "/v1/Faxes"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return Fax ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Fax> getPage(final String targetUrl, final TwilioRestClient client) {
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
    public Page<Fax> nextPage(final Page<Fax> page,
                              final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.FAX.toString())
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
    public Page<Fax> previousPage(final Page<Fax> page,
                                  final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.FAX.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Fax Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Fax> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Fax read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "faxes",
            response.getContent(),
            Fax.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (from != null) {
            request.addQueryParam("From", from);
        }

        if (to != null) {
            request.addQueryParam("To", to);
        }

        if (dateCreatedOnOrBefore != null) {
            request.addQueryParam("DateCreatedOnOrBefore", dateCreatedOnOrBefore.toInstant().toString());
        }

        if (dateCreatedAfter != null) {
            request.addQueryParam("DateCreatedAfter", dateCreatedAfter.toInstant().toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}