package com.example.myapplication.Demo2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcast3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String khuyenMai=intent.getExtras().getString("br");
        String kq=kiemTraKhuyenMai(khuyenMai);
        Toast.makeText(context,kq,Toast.LENGTH_SHORT).show();

    }
    private String kiemTraKhuyenMai(String str){
        String km="";
        if(str.substring(0,3).equals("MEM")){
            if(str.equals("MEM12")){
                km="Khuyến mại 10%";
            }else if(str.equals("MEM15")){
                km="Khuyến mại 20%";
            }
            else{
                km="Khuyến mại từ 10-20%";
            }
        } if(str.substring(0,3).equals("VIP")){
            if(str.equals("VIP12")){
                km="Khuyến mại 30%";
            }else if(str.equals("VIP15")){
                km="Khuyến mại 50%";
            }
            else{
                km="Khuyến mại từ 30-50%";
            }
        }
        else{
            km="Không khuyến mại";
        }
        return km;
    }
}
