package com.example.gustavogobetti.lab22;

import android.content.Intent;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText mMessageEditText;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();


    public static final String EXTRA_MESSAGE =
            "com.example.android.lab21.extra.MESSAGE";
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log the start of the onCreate() method.
        Log.d(LOG_TAG, "-----");
        Log.d(LOG_TAG, "onCreate");

        // Initialize all the view variables
        mMessageEditText = findViewById(R.id.editText_main);
        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView   = findViewById(R.id.text_message_reply);


        // Restore the state.
        // See onSaveInstanceState() for what gets saved.
        if (savedInstanceState != null) {
            boolean isVisible =
                    savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {

                mReplyHeadTextView.setVisibility(View.VISIBLE);
                mReplyTextView.setText(savedInstanceState.getString("reply_text"));
                mReplyTextView.setVisibility(View.VISIBLE);

            }
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (mReplyHeadTextView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text", mReplyTextView.getText().toString());
        }
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
