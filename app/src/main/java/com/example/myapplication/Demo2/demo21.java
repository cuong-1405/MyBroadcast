package com.example.myapplication.Demo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

import com.example.myapplication.R;

public class demo21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo21);
        phanQuyen();
        Intent intent = new Intent(this, MyBroadcast1.class);
        sendBroadcast(intent);

    }

    private boolean phanQuyen() {
        if (Build.VERSION.SDK_INT > 23) {
            //kiểm tra xem đã phân quyền chưa--return true
            if (checkSelfPermission(Manifest.permission.READ_PHONE_STATE)
                    == PackageManager.PERMISSION_GRANTED
                    && checkSelfPermission(Manifest.permission.READ_PHONE_NUMBERS)
                    == PackageManager.PERMISSION_GRANTED) {
                return true;

            } else {
                ActivityCompat.requestPermissions(demo21.this, new String[]{Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.READ_PHONE_NUMBERS}, 1);
                return false;
            }
            //nếu chưa phân quyền-> xin người dùng phân quyền->return false
        } else
            return true;
    }
}