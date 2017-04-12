
package com.yatra.fingoole.model.response;

import java.util.HashMap;
import java.util.Map;

public class ObjAppDet {

    private String appID;
    private String chnID;
    private String appKey;
    private String appPwd;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getChnID() {
        return chnID;
    }

    public void setChnID(String chnID) {
        this.chnID = chnID;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppPwd() {
        return appPwd;
    }

    public void setAppPwd(String appPwd) {
        this.appPwd = appPwd;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
