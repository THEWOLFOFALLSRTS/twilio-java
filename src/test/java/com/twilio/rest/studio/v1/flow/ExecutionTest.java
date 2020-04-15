/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.studio.v1.flow;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class ExecutionTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.STUDIO.toString(),
                                          "/v1/Flows/FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Executions");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Execution.reader("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"previous_page_url\": null,\"next_page_url\": null,\"url\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions?PageSize=50&Page=0\",\"page\": 0,\"first_page_url\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions?PageSize=50&Page=0\",\"page_size\": 50,\"key\": \"executions\"},\"executions\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Execution.reader("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.STUDIO.toString(),
                                          "/v1/Flows/FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Executions/FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Execution.fetcher("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"flow_sid\": \"FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"contact_sid\": \"FCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"contact_channel_address\": \"+14155555555\",\"status\": \"ended\",\"context\": {},\"date_created\": \"2017-11-06T12:00:00Z\",\"date_updated\": null,\"url\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"steps\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Steps\",\"execution_context\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Context\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Execution.fetcher("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testCreateRequest() {
                    new NonStrictExpectations() {{
                        Request request = new Request(HttpMethod.POST,
                                                      Domains.STUDIO.toString(),
                                                      "/v1/Flows/FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Executions");
                        request.addPostParam("To", serialize(new com.twilio.type.PhoneNumber("+15558675310")));
        request.addPostParam("From", serialize(new com.twilio.type.PhoneNumber("+15017122661")));
                        twilioRestClient.request(request);
                        times = 1;
                        result = new Response("", 500);
                        twilioRestClient.getAccountSid();
                        result = "AC123";
                    }};

        try {
            Execution.creator("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15558675310"), new com.twilio.type.PhoneNumber("+15017122661")).create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"flow_sid\": \"FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"context\": {},\"contact_sid\": \"FCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"contact_channel_address\": \"+18001234567\",\"status\": \"active\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"steps\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Steps\",\"execution_context\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Context\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Execution.creator("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15558675310"), new com.twilio.type.PhoneNumber("+15017122661")).create();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.STUDIO.toString(),
                                          "/v1/Flows/FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Executions/FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Execution.deleter("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Execution.deleter("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.STUDIO.toString(),
                                          "/v1/Flows/FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Executions/FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addPostParam("Status", serialize(Execution.Status.ACTIVE));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Execution.updater("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", Execution.Status.ACTIVE).update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"flow_sid\": \"FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"context\": {},\"contact_sid\": \"FCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"contact_channel_address\": \"+14155555555\",\"status\": \"ended\",\"date_created\": \"2017-11-06T12:00:00Z\",\"date_updated\": \"2017-11-06T12:00:00Z\",\"links\": {\"steps\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Steps\",\"execution_context\": \"https://studio.twilio.com/v1/Flows/FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Executions/FNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Context\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Execution.updater("FWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", Execution.Status.ACTIVE).update();
    }
}