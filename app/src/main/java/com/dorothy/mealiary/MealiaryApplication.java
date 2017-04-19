package com.dorothy.mealiary;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;

import com.dorothy.mealiary.broadcastReceiver.ScreenReceiver;
import com.lantern.lantern.RYLA;

/**
 * Created by yky on 2017. 3. 29..
 */

public class MealiaryApplication extends Application {

    private BroadcastReceiver mReceiver = null;

    @Override
    public void onCreate() {
        super.onCreate();
        final IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        mReceiver = new ScreenReceiver();
        registerReceiver(mReceiver, filter);

        RYLA.getInstance().setContext(this).startResDump();
    }

}
