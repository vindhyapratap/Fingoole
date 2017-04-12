
package com.yatra.fingoole.model.response;

import java.util.HashMap;
import java.util.Map;

public class UserProfileResponse {

    private Object statusCode;
    private Object statusMessage;
    private Integer uSERID;
    private Object userDisplayName;
    private Object userEmail;
    private Object mobileNo;
    private Integer gender;
    private Object address;
    private Object state;
    private Object city;
    private Integer pincode;
    private Object dOB;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Integer getUSERID() {
        return uSERID;
    }

    public void setUSERID(Integer uSERID) {
        this.uSERID = uSERID;
    }

    public Object getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(Object userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public Object getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(Object userEmail) {
        this.userEmail = userEmail;
    }

    public Object getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Object mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public Object getDOB() {
        return dOB;
    }

    public void setDOB(Object dOB) {
        this.dOB = dOB;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
