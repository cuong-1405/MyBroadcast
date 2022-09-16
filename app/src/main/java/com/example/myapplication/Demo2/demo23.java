package com.example.myapplication.Demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

import com.example.myapplication.R;

public class demo23 extends AppCompatActivity {

    EditText txt23;
    Button button23;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo23);
        context=this;
        button23= findViewById(R.id.btn23);
        txt23= findViewById(R.id.txt23);

        button23.setOnClickListener(v -> {
            Intent intent= new Intent(context,MyBroadcast3.class);
            String duLieu=txt23.getText().toString();
            intent.putExtra("br",duLieu);
            sendBroadcast(intent);
        });
    }
}