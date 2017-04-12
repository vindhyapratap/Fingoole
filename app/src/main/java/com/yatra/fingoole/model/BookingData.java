package com.yatra.fingoole.model;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class BookingData {
    private String RefNO;
    private String Scheme;
    private String Channel;
    private String BookingDate;
    private String JourneyDate;
    private String FlightNumber;
    private String PNRNO;

    public String getRefNO() {
        return RefNO;
    }

    public void setRefNO(String refNO) {
        RefNO = refNO;
    }

    public String getScheme() {
        return Scheme;
    }

    public void setScheme(String scheme) {
        Scheme = scheme;
    }

    public String getChannel() {
        return Channel;
    }

    public void setChannel(String channel) {
        Channel = channel;
    }

    public String getBookingDate() {
        return BookingDate;
    }



    public void setBookingDate(String bookingDate) {
        BookingDate = bookingDate;
    }

    public String getJourneyDate() {
        return JourneyDate;
    }

    public void setJourneyDate(String journeyDate) {
        JourneyDate = journeyDate;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    public String getPNRNO() {
        return PNRNO;
    }

    public void setPNRNO(String PNRNO) {
        this.PNRNO = PNRNO;
    }
}
