package com.example.myapplication.Demo2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyBroadcast1 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //Gọi service xử lý cuộc gọi
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        //Tạo đối tượng
        MyPhoneState myPhoneState = new MyPhoneState(context);
        //Gọi phương thức lắng nghe
        telephonyManager.listen(myPhoneState, PhoneStateListener.LISTEN_CALL_STATE);
        //
    }
    // Định nghĩa lớp lắng nghe cuộc gọi đến

    public class MyPhoneState extends PhoneStateListener {
        Context context;

        public MyPhoneState(Context context) {
            this.context = context;
        }

        // hàm lắng gnghe
        @Override
        public void onCallStateChanged(int state, String phoneNumber) {
            // có cuộc gọi đến
            if (state == 1) {
                Toast.makeText(context, "Có cuộc gọi đến", Toast.LENGTH_SHORT).show();
            }
            super.onCallStateChanged(state, phoneNumber);
        }
    }
}
