package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SharedMemory;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
           Button saveData = findViewById(R.id.save_bt);
            saveData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SharedPreferences.Editor editor = getSharedPreferences("data",MODE_PRIVATE).edit();
                    editor.putString("name","张三");
                    editor.putInt("age",28);
                    editor.putBoolean("married",false);
                    editor.apply();
                }
            });
        }
    }
