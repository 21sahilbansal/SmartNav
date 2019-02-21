package com.example.sahil.smartnav;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleteRecceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
            Intent pushIntent = new Intent(context,com.example.sahil.smartnav.LocationService.class);
            if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O){
              context.startForegroundService(pushIntent);
            }
            else{
             context.startService(pushIntent);

            }

        }




    }
}
