package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyServicel extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Log.d("onCreate","Hàm ONcreat được gọi");
        Toast.makeText(this,"Hàm Oncreate dyuocj gọi",Toast.LENGTH_SHORT).show();

        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("onStartCommand","Hàm onStartCommand được gọi");
        Toast.makeText(this,"Hàm onStartCommand được gọi",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("onDestroy","Hàm onDestroy được gọi");
        Toast.makeText(this,"Hàm onDestroy được gọi",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
