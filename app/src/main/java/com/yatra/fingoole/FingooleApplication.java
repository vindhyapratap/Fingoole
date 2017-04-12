package com.yatra.fingoole;

import android.app.Application;

import com.fingoole.fingoolesdk.InitializeSdk;
import com.yatra.fingoole.utils.FingooleUtils;

/**
 * Created by vipul.kumar on 11-04-2017.
 */

public class FingooleApplication extends Application{


    private static FingooleApplication application;

    public static FingooleApplication getInstance(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if(application == null){
            application = (FingooleApplication)getApplicationContext();
        }
        initFingooleSDK();

    }

    private void initFingooleSDK(){
        InitializeSdk initializeSdk = new InitializeSdk();
        initializeSdk.verification(this, FingooleUtils.API_KEY_FINGOOLE);
    }
}
