
package com.yatra.fingoole.model.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingFlightHstryResponse {

    private Object policyNo;
    private Object statusCode;
    private Object statusMessage;
    private List<LstFlightHistory> lstFlightHistory = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(Object policyNo) {
        this.policyNo = policyNo;
    }

    public Object getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Object statusCode) {
        this.statusCode = statusCode;
    }

    public Object getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(Object statusMessage) {
        this.statusMessage = statusMessage;
    }

    public List<LstFlightHistory> getLstFlightHistory() {
        return lstFlightHistory;
    }

    public void setLstFlightHistory(List<LstFlightHistory> lstFlightHistory) {
        this.lstFlightHistory = lstFlightHistory;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
