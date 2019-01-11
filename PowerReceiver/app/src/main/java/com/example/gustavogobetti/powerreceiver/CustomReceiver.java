package com.example.gustavogobetti.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    private static final String ACTION_CUSTOM_BROADCAST =
            BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {

       String intentAction = intent.getAction();
       if(intentAction != null){
           String message = "Unkown intent action";
           switch (intentAction){
               case Intent.ACTION_POWER_CONNECTED:
                    message = "Power Connect!";
                    break;

               case Intent.ACTION_POWER_DISCONNECTED:
                    message = "Power Disconnect!";
                    break;

               case ACTION_CUSTOM_BROADCAST:
                    message = "Custom Broadcast received";
                    break;
           }
           Toast.makeText(context, message, Toast.LENGTH_LONG).show();
       }
    }
}
