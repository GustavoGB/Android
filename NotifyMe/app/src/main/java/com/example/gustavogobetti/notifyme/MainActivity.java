package com.example.gustavogobetti.notifyme;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mNotifyBtn;
    private static final String PRIMARY_CHANNEL_ID = "primary_notification_channel";
    private static final int NOTIFICATION_ID = 0;
    private NotificationManager mManager;


    private NotificationCompat.Builder getNotificationbuilder(){

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity
                (this, NOTIFICATION_ID,intent, PendingIntent.FLAG_UPDATE_CURRENT);


        NotificationCompat.Builder notifyBuilder = new NotificationCompat.Builder
                (this, PRIMARY_CHANNEL_ID);
        notifyBuilder.setContentTitle("TA FAZENDO MERDA HEIN")
                .setContentText("This is your notifcation text")
                .setSmallIcon(R.drawable.ic_stat_money)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true);

        return notifyBuilder;


    }

    public void createNotifcationChannel(){
        mManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            //create a NotificationChannel
            NotificationChannel channel = new NotificationChannel
                    (PRIMARY_CHANNEL_ID, "CICCC Notifcation",
                            NotificationManager.IMPORTANCE_HIGH
                    );
            channel.enableLights((true));
            channel.setLightColor(Color.RED);
            channel.enableVibration(true);
            channel.setDescription("Notification from CICCC");
            mManager.createNotificationChannel(channel);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNotifyBtn = findViewById(R.id.notifyME);
        mNotifyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //send a notification
                sendNotification();
            }
        });
        createNotifcationChannel();
    }

    public void sendNotification() {
        NotificationCompat.Builder notifyBuilder = getNotificationbuilder();
        mManager.notify(NOTIFICATION_ID, notifyBuilder.build());
    }
}
