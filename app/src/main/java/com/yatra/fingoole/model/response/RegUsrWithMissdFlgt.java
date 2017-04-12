
package com.yatra.fingoole.model.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegUsrWithMissdFlgt {

    private Integer mobileNo;
    private Object deviceId;
    private String userName;
    private Object userDisplayName;
    private String userEmail;
    private Integer userType;
    private ObjAppDet objAppDet;
    private List<LstBookingDatum> lstBookingData = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Object getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Object getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(Object userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public ObjAppDet getObjAppDet() {
        return objAppDet;
    }

    public void setObjAppDet(ObjAppDet objAppDet) {
        this.objAppDet = objAppDet;
    }

    public List<LstBookingDatum> getLstBookingData() {
        return lstBookingData;
    }

    public void setLstBookingData(List<LstBookingDatum> lstBookingData) {
        this.lstBookingData = lstBookingData;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
