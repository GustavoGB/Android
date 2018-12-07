package com.example.gustavogobetti.receiver1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView mMainText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();
        Uri uri = intent.getData();

        if (uri != null) {
            String uri_string = uri.toString();
            mMainText.setText(uri_string);
        }
    }
}
