package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btnStart,btnStop;
    Intent intent,intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        btnStart= findViewById(R.id.btnStart);
        btnStop= findViewById(R.id.btnStop);

        intent=new Intent(this,MyServicel.class);
        intent2=new Intent(this,MyServicel2.class);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startService(intent);
                String txtMa=txt1.getText().toString();
                String txtTen=txt2.getText().toString();
                // truyen du lieu vào intent
                intent2.putExtra("masv",txtMa);
                intent2.putExtra("tensv",txtTen);
                startService(intent2);

            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent2);
            }
        });
    }
}