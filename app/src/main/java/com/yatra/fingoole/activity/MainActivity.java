package com.yatra.fingoole.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.yatra.fingoole.R;
import com.yatra.fingoole.model.request.RegUserMisdFlgtHstry;
import com.yatra.fingoole.utils.FingooleUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                  /*  GetUser getUserRequest = new GetUser();
                    getUserRequest.setDeviceId("android123");
                    getUserRequest.setMobileNo("9910360189");
                    ObjAppDet objAppDet = new ObjAppDet();
                    objAppDet.setAppID("appid123");
                    objAppDet.setAppKey(FingooleUtils.API_KEY_FINGOOLE);
                    objAppDet.setAppPwd("12345");
                    objAppDet.setChnID("12");
                    getUserRequest.setObjAppDet(objAppDet);
                    FingooleUtils.getUser(MainActivity.this,getUserRequest);*/
                    RegUserMisdFlgtHstry regUserMisdFlgtHstry = new RegUserMisdFlgtHstry();
                    regUserMisdFlgtHstry.setDeviceId("1");
                    regUserMisdFlgtHstry.setMobileNo("9910360189");

                    FingooleUtils.registerUsrMsdFlgt(MainActivity.this,regUserMisdFlgtHstry);



                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            String string = data.getStringExtra("MESSAGE");
            String response  = data.getStringExtra("RESPONSE");

            Log.d("Result", string+"-"+response);
        }
    }
}
