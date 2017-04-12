
package com.yatra.fingoole.model.response;

import java.util.HashMap;
import java.util.Map;

public class GetUserResponse {

    private Integer userID;
    private Integer walletID;
    private Double walletBalance;
    private Object displayName;
    private Object lastLogin;
    private Integer merchantWalletNO;
    private Object merchantName;
    private Object usertype;
    private Integer channelID;
    private Integer aPIFunctionID;
    private Object data;
    private Object statusCode;
    private Object statusMessage;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getWalletID() {
        return walletID;
    }

    public void setWalletID(Integer walletID) {
        this.walletID = walletID;
    }

    public Double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(Double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public Object getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Object displayName) {
        this.displayName = displayName;
    }

    public Object getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Object lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getMerchantWalletNO() {
        return merchantWalletNO;
    }

    public void setMerchantWalletNO(Integer merchantWalletNO) {
        this.merchantWalletNO = merchantWalletNO;
    }

    public Object getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(Object merchantName) {
        this.merchantName = merchantName;
    }

    public Object getUsertype() {
        return usertype;
    }

    public void setUsertype(Object usertype) {
        this.usertype = usertype;
    }

    public Integer getChannelID() {
        return channelID;
    }

    public void setChannelID(Integer channelID) {
        this.channelID = channelID;
    }

    public Integer getAPIFunctionID() {
        return aPIFunctionID;
    }

    public void setAPIFunctionID(Integer aPIFunctionID) {
        this.aPIFunctionID = aPIFunctionID;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
