package com.example.android.br;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d(TAG, "onCreate()");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Logger.d(TAG, "onClick()");
                Intent intent = new Intent("com.example.android.brtest");
                intent.setPackage("com.example.android.br.server");
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        Logger.d(TAG, "onDestroy()");
        super.onDestroy();
    }
}
