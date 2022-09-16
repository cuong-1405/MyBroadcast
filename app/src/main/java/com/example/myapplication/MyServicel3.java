package com.example.myapplication;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

public class MyServicel3 extends IntentService {

    public MyServicel3() {
        super("MyServicel3");
    }

    int count =0;

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        char c1= intent.getCharExtra("char",'0');
        String check=intent.getStringExtra("check");
        count=demKyTu(check,c1);
    }

    private int demKyTu(String str, char c) {
        int dem=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                dem++;

            }
        }
        return dem++;
    }
}
