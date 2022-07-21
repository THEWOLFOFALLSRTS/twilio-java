/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.taskrouter.v1.workspace.worker;

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

import java.util.List;



/*
    * Twilio - Taskrouter
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ReservationUpdater extends Updater<Reservation>{
    private String workspaceSid;
    private String workerSid;
    private String sid;
    private String ifMatch;
    private Reservation.Status reservationStatus;
    private String workerActivitySid;
    private String instruction;
    private String dequeuePostWorkActivitySid;
    private String dequeueFrom;
    private String dequeueRecord;
    private Integer dequeueTimeout;
    private String dequeueTo;
    private URI dequeueStatusCallbackUrl;
    private String callFrom;
    private String callRecord;
    private Integer callTimeout;
    private String callTo;
    private URI callUrl;
    private URI callStatusCallbackUrl;
    private Boolean callAccept;
    private String redirectCallSid;
    private Boolean redirectAccept;
    private URI redirectUrl;
    private String to;
    private String from;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private List<Reservation.CallStatus> statusCallbackEvent;
    private Integer timeout;
    private Boolean record;
    private Boolean muted;
    private String beep;
    private Boolean startConferenceOnEnter;
    private Boolean endConferenceOnExit;
    private URI waitUrl;
    private HttpMethod waitMethod;
    private Boolean earlyMedia;
    private Integer maxParticipants;
    private URI conferenceStatusCallback;
    private HttpMethod conferenceStatusCallbackMethod;
    private List<Reservation.ConferenceEvent> conferenceStatusCallbackEvent;
    private String conferenceRecord;
    private String conferenceTrim;
    private String recordingChannels;
    private URI recordingStatusCallback;
    private HttpMethod recordingStatusCallbackMethod;
    private URI conferenceRecordingStatusCallback;
    private HttpMethod conferenceRecordingStatusCallbackMethod;
    private String region;
    private String sipAuthUsername;
    private String sipAuthPassword;
    private List<String> dequeueStatusCallbackEvent;
    private String postWorkActivitySid;
    private Boolean endConferenceOnCustomerExit;
    private Boolean beepOnCustomerEntrance;

    public ReservationUpdater(final String workspaceSid, final String workerSid, final String sid){
        this.workspaceSid = workspaceSid;
        this.workerSid = workerSid;
        this.sid = sid;
    }

    public ReservationUpdater setIfMatch(final String ifMatch){
        this.ifMatch = ifMatch;
        return this;
    }
    public ReservationUpdater setReservationStatus(final Reservation.Status reservationStatus){
        this.reservationStatus = reservationStatus;
        return this;
    }
    public ReservationUpdater setWorkerActivitySid(final String workerActivitySid){
        this.workerActivitySid = workerActivitySid;
        return this;
    }
    public ReservationUpdater setInstruction(final String instruction){
        this.instruction = instruction;
        return this;
    }
    public ReservationUpdater setDequeuePostWorkActivitySid(final String dequeuePostWorkActivitySid){
        this.dequeuePostWorkActivitySid = dequeuePostWorkActivitySid;
        return this;
    }
    public ReservationUpdater setDequeueFrom(final String dequeueFrom){
        this.dequeueFrom = dequeueFrom;
        return this;
    }
    public ReservationUpdater setDequeueRecord(final String dequeueRecord){
        this.dequeueRecord = dequeueRecord;
        return this;
    }
    public ReservationUpdater setDequeueTimeout(final Integer dequeueTimeout){
        this.dequeueTimeout = dequeueTimeout;
        return this;
    }
    public ReservationUpdater setDequeueTo(final String dequeueTo){
        this.dequeueTo = dequeueTo;
        return this;
    }
    public ReservationUpdater setDequeueStatusCallbackUrl(final URI dequeueStatusCallbackUrl){
        this.dequeueStatusCallbackUrl = dequeueStatusCallbackUrl;
        return this;
    }

    public ReservationUpdater setDequeueStatusCallbackUrl(final String dequeueStatusCallbackUrl){
    this.dequeueStatusCallbackUrl = Promoter.uriFromString(dequeueStatusCallbackUrl);
    return this;
    }
    public ReservationUpdater setCallFrom(final String callFrom){
        this.callFrom = callFrom;
        return this;
    }
    public ReservationUpdater setCallRecord(final String callRecord){
        this.callRecord = callRecord;
        return this;
    }
    public ReservationUpdater setCallTimeout(final Integer callTimeout){
        this.callTimeout = callTimeout;
        return this;
    }
    public ReservationUpdater setCallTo(final String callTo){
        this.callTo = callTo;
        return this;
    }
    public ReservationUpdater setCallUrl(final URI callUrl){
        this.callUrl = callUrl;
        return this;
    }

    public ReservationUpdater setCallUrl(final String callUrl){
    this.callUrl = Promoter.uriFromString(callUrl);
    return this;
    }
    public ReservationUpdater setCallStatusCallbackUrl(final URI callStatusCallbackUrl){
        this.callStatusCallbackUrl = callStatusCallbackUrl;
        return this;
    }

    public ReservationUpdater setCallStatusCallbackUrl(final String callStatusCallbackUrl){
    this.callStatusCallbackUrl = Promoter.uriFromString(callStatusCallbackUrl);
    return this;
    }
    public ReservationUpdater setCallAccept(final Boolean callAccept){
        this.callAccept = callAccept;
        return this;
    }
    public ReservationUpdater setRedirectCallSid(final String redirectCallSid){
        this.redirectCallSid = redirectCallSid;
        return this;
    }
    public ReservationUpdater setRedirectAccept(final Boolean redirectAccept){
        this.redirectAccept = redirectAccept;
        return this;
    }
    public ReservationUpdater setRedirectUrl(final URI redirectUrl){
        this.redirectUrl = redirectUrl;
        return this;
    }

    public ReservationUpdater setRedirectUrl(final String redirectUrl){
    this.redirectUrl = Promoter.uriFromString(redirectUrl);
    return this;
    }
    public ReservationUpdater setTo(final String to){
        this.to = to;
        return this;
    }
    public ReservationUpdater setFrom(final String from){
        this.from = from;
        return this;
    }
    public ReservationUpdater setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public ReservationUpdater setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }
    public ReservationUpdater setStatusCallbackMethod(final HttpMethod statusCallbackMethod){
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }
    public ReservationUpdater setStatusCallbackEvent(final List<Reservation.CallStatus> statusCallbackEvent){
        this.statusCallbackEvent = statusCallbackEvent;
        return this;
    }
    public ReservationUpdater setTimeout(final Integer timeout){
        this.timeout = timeout;
        return this;
    }
    public ReservationUpdater setRecord(final Boolean record){
        this.record = record;
        return this;
    }
    public ReservationUpdater setMuted(final Boolean muted){
        this.muted = muted;
        return this;
    }
    public ReservationUpdater setBeep(final String beep){
        this.beep = beep;
        return this;
    }
    public ReservationUpdater setStartConferenceOnEnter(final Boolean startConferenceOnEnter){
        this.startConferenceOnEnter = startConferenceOnEnter;
        return this;
    }
    public ReservationUpdater setEndConferenceOnExit(final Boolean endConferenceOnExit){
        this.endConferenceOnExit = endConferenceOnExit;
        return this;
    }
    public ReservationUpdater setWaitUrl(final URI waitUrl){
        this.waitUrl = waitUrl;
        return this;
    }

    public ReservationUpdater setWaitUrl(final String waitUrl){
    this.waitUrl = Promoter.uriFromString(waitUrl);
    return this;
    }
    public ReservationUpdater setWaitMethod(final HttpMethod waitMethod){
        this.waitMethod = waitMethod;
        return this;
    }
    public ReservationUpdater setEarlyMedia(final Boolean earlyMedia){
        this.earlyMedia = earlyMedia;
        return this;
    }
    public ReservationUpdater setMaxParticipants(final Integer maxParticipants){
        this.maxParticipants = maxParticipants;
        return this;
    }
    public ReservationUpdater setConferenceStatusCallback(final URI conferenceStatusCallback){
        this.conferenceStatusCallback = conferenceStatusCallback;
        return this;
    }

    public ReservationUpdater setConferenceStatusCallback(final String conferenceStatusCallback){
    this.conferenceStatusCallback = Promoter.uriFromString(conferenceStatusCallback);
    return this;
    }
    public ReservationUpdater setConferenceStatusCallbackMethod(final HttpMethod conferenceStatusCallbackMethod){
        this.conferenceStatusCallbackMethod = conferenceStatusCallbackMethod;
        return this;
    }
    public ReservationUpdater setConferenceStatusCallbackEvent(final List<Reservation.ConferenceEvent> conferenceStatusCallbackEvent){
        this.conferenceStatusCallbackEvent = conferenceStatusCallbackEvent;
        return this;
    }
    public ReservationUpdater setConferenceRecord(final String conferenceRecord){
        this.conferenceRecord = conferenceRecord;
        return this;
    }
    public ReservationUpdater setConferenceTrim(final String conferenceTrim){
        this.conferenceTrim = conferenceTrim;
        return this;
    }
    public ReservationUpdater setRecordingChannels(final String recordingChannels){
        this.recordingChannels = recordingChannels;
        return this;
    }
    public ReservationUpdater setRecordingStatusCallback(final URI recordingStatusCallback){
        this.recordingStatusCallback = recordingStatusCallback;
        return this;
    }

    public ReservationUpdater setRecordingStatusCallback(final String recordingStatusCallback){
    this.recordingStatusCallback = Promoter.uriFromString(recordingStatusCallback);
    return this;
    }
    public ReservationUpdater setRecordingStatusCallbackMethod(final HttpMethod recordingStatusCallbackMethod){
        this.recordingStatusCallbackMethod = recordingStatusCallbackMethod;
        return this;
    }
    public ReservationUpdater setConferenceRecordingStatusCallback(final URI conferenceRecordingStatusCallback){
        this.conferenceRecordingStatusCallback = conferenceRecordingStatusCallback;
        return this;
    }

    public ReservationUpdater setConferenceRecordingStatusCallback(final String conferenceRecordingStatusCallback){
    this.conferenceRecordingStatusCallback = Promoter.uriFromString(conferenceRecordingStatusCallback);
    return this;
    }
    public ReservationUpdater setConferenceRecordingStatusCallbackMethod(final HttpMethod conferenceRecordingStatusCallbackMethod){
        this.conferenceRecordingStatusCallbackMethod = conferenceRecordingStatusCallbackMethod;
        return this;
    }
    public ReservationUpdater setRegion(final String region){
        this.region = region;
        return this;
    }
    public ReservationUpdater setSipAuthUsername(final String sipAuthUsername){
        this.sipAuthUsername = sipAuthUsername;
        return this;
    }
    public ReservationUpdater setSipAuthPassword(final String sipAuthPassword){
        this.sipAuthPassword = sipAuthPassword;
        return this;
    }
    public ReservationUpdater setDequeueStatusCallbackEvent(final List<String> dequeueStatusCallbackEvent){
        this.dequeueStatusCallbackEvent = dequeueStatusCallbackEvent;
        return this;
    }
    public ReservationUpdater setPostWorkActivitySid(final String postWorkActivitySid){
        this.postWorkActivitySid = postWorkActivitySid;
        return this;
    }
    public ReservationUpdater setEndConferenceOnCustomerExit(final Boolean endConferenceOnCustomerExit){
        this.endConferenceOnCustomerExit = endConferenceOnCustomerExit;
        return this;
    }
    public ReservationUpdater setBeepOnCustomerEntrance(final Boolean beepOnCustomerEntrance){
        this.beepOnCustomerEntrance = beepOnCustomerEntrance;
        return this;
    }

    @Override
    public Reservation update(final TwilioRestClient client){
        String path = "/v1/Workspaces/{WorkspaceSid}/Workers/{WorkerSid}/Reservations/{Sid}";

        path = path.replace("{"+"WorkspaceSid"+"}", this.workspaceSid.toString());
        path = path.replace("{"+"WorkerSid"+"}", this.workerSid.toString());
        path = path.replace("{"+"Sid"+"}", this.sid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            path
        );
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Reservation update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Reservation.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (reservationStatus != null) {
            request.addPostParam("ReservationStatus", reservationStatus.toString());
    
        }
        if (workerActivitySid != null) {
            request.addPostParam("WorkerActivitySid", workerActivitySid);
    
        }
        if (instruction != null) {
            request.addPostParam("Instruction", instruction);
    
        }
        if (dequeuePostWorkActivitySid != null) {
            request.addPostParam("DequeuePostWorkActivitySid", dequeuePostWorkActivitySid);
    
        }
        if (dequeueFrom != null) {
            request.addPostParam("DequeueFrom", dequeueFrom);
    
        }
        if (dequeueRecord != null) {
            request.addPostParam("DequeueRecord", dequeueRecord);
    
        }
        if (dequeueTimeout != null) {
            request.addPostParam("DequeueTimeout", dequeueTimeout.toString());
    
        }
        if (dequeueTo != null) {
            request.addPostParam("DequeueTo", dequeueTo);
    
        }
        if (dequeueStatusCallbackUrl != null) {
            request.addPostParam("DequeueStatusCallbackUrl", dequeueStatusCallbackUrl.toString());
    
        }
        if (callFrom != null) {
            request.addPostParam("CallFrom", callFrom);
    
        }
        if (callRecord != null) {
            request.addPostParam("CallRecord", callRecord);
    
        }
        if (callTimeout != null) {
            request.addPostParam("CallTimeout", callTimeout.toString());
    
        }
        if (callTo != null) {
            request.addPostParam("CallTo", callTo);
    
        }
        if (callUrl != null) {
            request.addPostParam("CallUrl", callUrl.toString());
    
        }
        if (callStatusCallbackUrl != null) {
            request.addPostParam("CallStatusCallbackUrl", callStatusCallbackUrl.toString());
    
        }
        if (callAccept != null) {
            request.addPostParam("CallAccept", callAccept.toString());
    
        }
        if (redirectCallSid != null) {
            request.addPostParam("RedirectCallSid", redirectCallSid);
    
        }
        if (redirectAccept != null) {
            request.addPostParam("RedirectAccept", redirectAccept.toString());
    
        }
        if (redirectUrl != null) {
            request.addPostParam("RedirectUrl", redirectUrl.toString());
    
        }
        if (to != null) {
            request.addPostParam("To", to);
    
        }
        if (from != null) {
            request.addPostParam("From", from);
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
    
        }
        if (statusCallbackEvent != null) {
            for (Reservation.CallStatus prop : statusCallbackEvent) {
                request.addPostParam("StatusCallbackEvent", prop.toString());
            }
    
        }
        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
    
        }
        if (record != null) {
            request.addPostParam("Record", record.toString());
    
        }
        if (muted != null) {
            request.addPostParam("Muted", muted.toString());
    
        }
        if (beep != null) {
            request.addPostParam("Beep", beep);
    
        }
        if (startConferenceOnEnter != null) {
            request.addPostParam("StartConferenceOnEnter", startConferenceOnEnter.toString());
    
        }
        if (endConferenceOnExit != null) {
            request.addPostParam("EndConferenceOnExit", endConferenceOnExit.toString());
    
        }
        if (waitUrl != null) {
            request.addPostParam("WaitUrl", waitUrl.toString());
    
        }
        if (waitMethod != null) {
            request.addPostParam("WaitMethod", waitMethod.toString());
    
        }
        if (earlyMedia != null) {
            request.addPostParam("EarlyMedia", earlyMedia.toString());
    
        }
        if (maxParticipants != null) {
            request.addPostParam("MaxParticipants", maxParticipants.toString());
    
        }
        if (conferenceStatusCallback != null) {
            request.addPostParam("ConferenceStatusCallback", conferenceStatusCallback.toString());
    
        }
        if (conferenceStatusCallbackMethod != null) {
            request.addPostParam("ConferenceStatusCallbackMethod", conferenceStatusCallbackMethod.toString());
    
        }
        if (conferenceStatusCallbackEvent != null) {
            for (Reservation.ConferenceEvent prop : conferenceStatusCallbackEvent) {
                request.addPostParam("ConferenceStatusCallbackEvent", prop.toString());
            }
    
        }
        if (conferenceRecord != null) {
            request.addPostParam("ConferenceRecord", conferenceRecord);
    
        }
        if (conferenceTrim != null) {
            request.addPostParam("ConferenceTrim", conferenceTrim);
    
        }
        if (recordingChannels != null) {
            request.addPostParam("RecordingChannels", recordingChannels);
    
        }
        if (recordingStatusCallback != null) {
            request.addPostParam("RecordingStatusCallback", recordingStatusCallback.toString());
    
        }
        if (recordingStatusCallbackMethod != null) {
            request.addPostParam("RecordingStatusCallbackMethod", recordingStatusCallbackMethod.toString());
    
        }
        if (conferenceRecordingStatusCallback != null) {
            request.addPostParam("ConferenceRecordingStatusCallback", conferenceRecordingStatusCallback.toString());
    
        }
        if (conferenceRecordingStatusCallbackMethod != null) {
            request.addPostParam("ConferenceRecordingStatusCallbackMethod", conferenceRecordingStatusCallbackMethod.toString());
    
        }
        if (region != null) {
            request.addPostParam("Region", region);
    
        }
        if (sipAuthUsername != null) {
            request.addPostParam("SipAuthUsername", sipAuthUsername);
    
        }
        if (sipAuthPassword != null) {
            request.addPostParam("SipAuthPassword", sipAuthPassword);
    
        }
        if (dequeueStatusCallbackEvent != null) {
            for (String prop : dequeueStatusCallbackEvent) {
                request.addPostParam("DequeueStatusCallbackEvent", prop);
            }
    
        }
        if (postWorkActivitySid != null) {
            request.addPostParam("PostWorkActivitySid", postWorkActivitySid);
    
        }
        if (endConferenceOnCustomerExit != null) {
            request.addPostParam("EndConferenceOnCustomerExit", endConferenceOnCustomerExit.toString());
    
        }
        if (beepOnCustomerEntrance != null) {
            request.addPostParam("BeepOnCustomerEntrance", beepOnCustomerEntrance.toString());
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (ifMatch != null) {
            request.addHeaderParam("If-Match", ifMatch);

        }
    }
}
