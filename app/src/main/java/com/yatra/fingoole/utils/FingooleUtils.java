package com.yatra.fingoole.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.fingoole.fingoolesdk.Register;
import com.yatra.fingoole.interfaces.Request;
import com.yatra.fingoole.model.request.GetBkngFlgtHstry;
import com.yatra.fingoole.model.request.GetMissedFlightHstry;
import com.yatra.fingoole.model.request.GetUser;
import com.yatra.fingoole.model.request.GetUserProfile;
import com.yatra.fingoole.model.request.RegUserMisdFlgtHstry;

/**
 * Created by vipul.kumar on 10-04-2017.
 */

public class FingooleUtils {
    public static final String API_KEY_FINGOOLE = "WWF0cmF8MDAxfGNvbS5hbmRyb2lkLnlhdHJh";

    public static final String RREQUEST_CODE_GET_USER = "7001";
    public static final String REQUEST_CODE_REGISTER_USER = "7002";
    public static final String REQUEST_CODE_GET_BOOKED_FLIGHT_HISTORY = "7003";
    public static final String REQUEST_CODE_GET_MISSED_FLIGHT_HISTORY = "7004";
    public static final String REQUEST_CODE_GET_USER_PROFILE = "7005";

    public static final int ERROR_CODE_GET_ACCESS_TOKEN = -1;
    public static final int ERROR_CODE_GET_REFRESH_TOKEN = -2;
    public static final int ERROR_CODE_SESSION_EXPIRED = -3;
    public static final int ERROR_CODE_TOKEN_FAILED = -4;
    public static final int ERROR_CODE_ACQFIID_HANDSHAKE_FAILED = -6;
    public static final int EEROR_CODE_SERVER_DOWN = -7;


    public static void getUser(Context context, @NonNull GetUser getUserRequest){
        sendRequest(context,RREQUEST_CODE_GET_USER,getUserRequest);
    }

    public static void getBookingFlightHistory(Context context,@NonNull GetBkngFlgtHstry request){
        sendRequest(context,REQUEST_CODE_GET_BOOKED_FLIGHT_HISTORY,request);
    }

    public static void getMissedFlightHistory(Context context,@NonNull GetMissedFlightHstry request){
        sendRequest(context, REQUEST_CODE_GET_MISSED_FLIGHT_HISTORY, request);

    }

    public static void registerUsrMsdFlgt(Context context,@NonNull RegUserMisdFlgtHstry requeset){
        sendRequest(context,REQUEST_CODE_REGISTER_USER,requeset);
    }

    public static void getUserProfile(Context context,@NonNull GetUserProfile request){
        sendRequest(context,REQUEST_CODE_GET_USER_PROFILE,request);
    }

    public static void sendRequest(Context context, String requestCode, Request request){
        try{
            Intent intent = new Intent(context, Register.class);
            String str = request.getJsonString();
            intent.putExtra("json", str);
            intent.putExtra("REQCODE", requestCode);
            ((Activity)context).startActivityForResult(intent, 0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }






}
