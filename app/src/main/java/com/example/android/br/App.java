package com.example.android.br;

import android.app.Application;

public class App extends Application {

    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.d(TAG, "onCreate()");
    }
}
