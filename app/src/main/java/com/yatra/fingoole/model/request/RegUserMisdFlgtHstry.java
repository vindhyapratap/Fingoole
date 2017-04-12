package com.yatra.fingoole.model.request;

import com.google.gson.Gson;
import com.yatra.fingoole.interfaces.Request;
import com.yatra.fingoole.model.BookingData;

import java.util.List;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class RegUserMisdFlgtHstry implements Request{

    private String MobileNo;
    private String DeviceId;
    private String UserName;
    private String UserDisplayName;
    private String UserEmail;
    private String UserType;
    private com.yatra.fingoole.model.ObjAppDet ObjAppDet;
    private List<BookingData> IsBookingData;

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserDisplayName() {
        return UserDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        UserDisplayName = userDisplayName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public com.yatra.fingoole.model.ObjAppDet getObjAppDet() {
        return ObjAppDet;
    }

    public void setObjAppDet(com.yatra.fingoole.model.ObjAppDet objAppDet) {
        ObjAppDet = objAppDet;
    }

    public List<BookingData> getIsBookingData() {
        return IsBookingData;
    }

    public void setIsBookingData(List<BookingData> isBookingData) {
        IsBookingData = isBookingData;
    }

    @Override
    public String getJsonString() {
        return new Gson().toJson(this);
    }
}
