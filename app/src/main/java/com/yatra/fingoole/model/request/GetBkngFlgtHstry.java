package com.yatra.fingoole.model.request;

import com.google.gson.Gson;
import com.yatra.fingoole.interfaces.Request;
import com.yatra.fingoole.model.ObjAppDet;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class GetBkngFlgtHstry implements Request{

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public ObjAppDet getObjAppDet() {
        return objAppDet;
    }

    public void setObjAppDet(ObjAppDet objAppDet) {
        this.objAppDet = objAppDet;
    }

    private String UserId;
    private ObjAppDet objAppDet;

    @Override
    public String getJsonString() {

        return new Gson().toJson(this);
    }
}
