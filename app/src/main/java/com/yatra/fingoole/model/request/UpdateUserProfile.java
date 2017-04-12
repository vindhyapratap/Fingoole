package com.yatra.fingoole.model.request;

import com.google.gson.Gson;
import com.yatra.fingoole.interfaces.Request;
import com.yatra.fingoole.model.ObjAppDet;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class UpdateUserProfile implements Request{
    private String LogTime;
    private String USERID;
    private String UserDisplayName;
    private String UserEmail;
    private String MobileNo;
    private String Gender;
    private String Address;
    private String State;
    private String City;
    private String Pincode;
    private String DOB;
    private ObjAppDet objAppDet;

    @Override
    public String getJsonString() {
        return new Gson().toJson(this);
    }
}
