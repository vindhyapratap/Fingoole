package com.yatra.fingoole.model.request;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.yatra.fingoole.interfaces.Request;
import com.yatra.fingoole.model.ObjAppDet;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class GetUser implements Request{
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

    public ObjAppDet getObjAppDet() {
        return objAppDet;
    }

    public void setObjAppDet(ObjAppDet objAppDet) {
        this.objAppDet = objAppDet;
    }

    @SerializedName("MobileNo")
    private String MobileNo;

    @SerializedName("DeviceId")
    private String DeviceId;

    @SerializedName("objAppDet")
    private ObjAppDet objAppDet;


    @Override
    public String getJsonString() {

        return new Gson().toJson(this);
    }
}
