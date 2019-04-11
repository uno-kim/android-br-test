package com.example.android.br.server;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d(TAG, "onCreate()");
    }

    @Override
    protected void onDestroy() {
        Logger.d(TAG, "onDestroy()");
        super.onDestroy();
    }
}
