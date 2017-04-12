
package com.yatra.fingoole.model.response;

import java.util.HashMap;
import java.util.Map;

public class LstBookingDatum {

    private String refNo;
    private String scheme;
    private String channel;
    private String bookingDate;
    private String journeyDate;
    private String flightNumber;
    private String pNRNO;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPNRNO() {
        return pNRNO;
    }

    public void setPNRNO(String pNRNO) {
        this.pNRNO = pNRNO;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
