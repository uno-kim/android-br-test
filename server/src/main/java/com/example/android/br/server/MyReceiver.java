package com.example.android.br.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    private static final String TAG = "MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Logger.d(TAG, "onReceived(), action = " + intent.getAction());

        if (intent.getAction().equals("com.example.android.brtest")) {
            Logger.d(TAG, "startActivity()1");
            Intent i = new Intent(context, MainActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
            Logger.d(TAG, "startActivity()2");
        }
    }
}
