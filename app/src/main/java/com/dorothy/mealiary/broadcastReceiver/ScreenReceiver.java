package com.dorothy.mealiary.broadcastReceiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;

import com.dorothy.mealiary.Activity.MailboxActivity;
import com.dorothy.mealiary.R;
import com.dorothy.mealiary.service.MailboxService;

/**
 * Created by yky on 2017. 3. 29..
 */

public class ScreenReceiver extends BroadcastReceiver {
    public static boolean wasScreenOn = true;
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)) {
            // do whatever you need to do here
            wasScreenOn = false;
        } else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)) {
            // and do whatever you need to do here
            wasScreenOn = true;
        }
    }
}
