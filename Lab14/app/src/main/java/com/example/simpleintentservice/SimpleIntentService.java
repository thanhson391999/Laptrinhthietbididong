package com.example.simpleintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.os.SystemClock;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class SimpleIntentService extends IntentService {
    public static final String ACTION_1 = "MY_ACTION_1";

    public SimpleIntentService() {
        super("SimpleIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction(SimpleIntentService.ACTION_1);
        for (int i = 0; i <= 100; i++) {
            broadcastIntent.putExtra("percel", i);
            sendBroadcast(broadcastIntent);
            SystemClock.sleep(100);
        }
    }
}

