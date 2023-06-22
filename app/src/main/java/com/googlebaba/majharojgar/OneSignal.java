package com.googlebaba.majharojgar;

import android.app.Application;

public class OneSignal extends Application {

    // Replace the below with your own ONESIGNAL_APP_ID
    private static final String ONESIGNAL_APP_ID = "e386953f-373c-47b9-9f5e-1d3250d3a132";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        com.onesignal.OneSignal.setLogLevel(com.onesignal.OneSignal.LOG_LEVEL.VERBOSE, com.onesignal.OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        com.onesignal.OneSignal.initWithContext(this);
        com.onesignal.OneSignal.setAppId(ONESIGNAL_APP_ID);

        // promptForPushNotifications will show the native Android notification permission prompt.
        // We recommend removing the following code and instead using an In-App Message to prompt for notification permission (See step 7)
        com.onesignal.OneSignal.promptForPushNotifications();
    }
}
