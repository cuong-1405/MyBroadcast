package com.example.myapplication.Demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class demo22 extends AppCompatActivity {

    Button button1;
    EditText ed1;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo22);
        context=this;

        button1= findViewById(R.id.btn1);
        ed1= findViewById(R.id.txt1);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(context,MyBroadcast2.class);
            // lấy dữ liệu người dùng nhập
            String duLieu=ed1.getText().toString();
            //Đưa dữ liệu bào intent
            intent.putExtra("br",duLieu);
            sendBroadcast(intent);
        });

    }
}