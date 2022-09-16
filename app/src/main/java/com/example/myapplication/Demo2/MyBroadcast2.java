package com.example.myapplication.Demo2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //Nhận dữ liệu từ intent
        String msg=intent.getExtras().getString("br");
        //Phát thông điệp
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
