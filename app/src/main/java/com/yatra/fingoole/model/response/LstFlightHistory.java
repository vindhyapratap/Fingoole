
package com.yatra.fingoole.model.response;

import java.util.HashMap;
import java.util.Map;

public class LstFlightHistory {

    private Object cOINO;
    private Object pNRNO;
    private Object flightNo;
    private Object journeyDate;
    private Object journeyTime;
    private Object depCity;
    private Object cOIDate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getCOINO() {
        return cOINO;
    }

    public void setCOINO(Object cOINO) {
        this.cOINO = cOINO;
    }

    public Object getPNRNO() {
        return pNRNO;
    }

    public void setPNRNO(Object pNRNO) {
        this.pNRNO = pNRNO;
    }

    public Object getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(Object flightNo) {
        this.flightNo = flightNo;
    }

    public Object getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Object journeyDate) {
        this.journeyDate = journeyDate;
    }

    public Object getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(Object journeyTime) {
        this.journeyTime = journeyTime;
    }

    public Object getDepCity() {
        return depCity;
    }

    public void setDepCity(Object depCity) {
        this.depCity = depCity;
    }

    public Object getCOIDate() {
        return cOIDate;
    }

    public void setCOIDate(Object cOIDate) {
        this.cOIDate = cOIDate;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
