package com.example.gustavogobetti.lab22;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {


    private static final String LOG_TAG = secondActivity.class.getSimpleName();

    public static final String EXTRA_REPLY = "com.example.gustavogobetti.lab22.extra.REPLY";


    //EditText for the Reply

    private EditText mReply;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Initialize view variables

        mReply = findViewById(R.id.editText_main);

        //Get intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Put that message into the text_message TextView.

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void returnReply (View view){
        // Reply message
        String reply = mReply.getText().toString();

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        Log.d(LOG_TAG,"End SecondActivity");
        finish();
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
