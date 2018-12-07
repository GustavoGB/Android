package com.example.gustavogobetti.lab22;

import android.content.Intent;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText mMessageEditText;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();


    public static final String EXTRA_MESSAGE =
            "com.example.android.lab21.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_main);

        Log.d(LOG_TAG, "-----");
        Log.d(LOG_TAG, "onCreate");


    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, secondActivity.class);

        String message = mMessageEditText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);


    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }


}
