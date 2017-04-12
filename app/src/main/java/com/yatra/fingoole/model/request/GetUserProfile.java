package com.yatra.fingoole.model.request;

import com.google.gson.Gson;
import com.yatra.fingoole.interfaces.Request;
import com.yatra.fingoole.model.ObjAppDet;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class GetUserProfile implements Request{

    private String USERID;
    private ObjAppDet objAppDet;

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public ObjAppDet getObjAppDet() {
        return objAppDet;
    }

    public void setObjAppDet(ObjAppDet objAppDet) {
        this.objAppDet = objAppDet;
    }

    @Override
    public String getJsonString() {
        return new Gson().toJson(this);
    }
}
