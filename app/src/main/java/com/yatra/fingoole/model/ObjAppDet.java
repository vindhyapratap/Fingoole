package com.yatra.fingoole.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class ObjAppDet {

    public String getAppID() {
        return AppID;
    }

    public void setAppID(String appID) {
        AppID = appID;
    }

    public String getAppKey() {
        return AppKey;
    }

    public void setAppKey(String appKey) {
        AppKey = appKey;
    }

    public String getAppPwd() {
        return AppPwd;
    }

    public void setAppPwd(String appPwd) {
        AppPwd = appPwd;
    }

    @SerializedName("AppId")
    private String AppID;

    @SerializedName("AppKey")
    private String AppKey;

    @SerializedName("AppPwd")
    private String AppPwd;

    public String getChnID() {
        return ChnID;
    }

    public void setChnID(String chnID) {
        ChnID = chnID;
    }

    @SerializedName("ChnID")
    private String ChnID;

}
