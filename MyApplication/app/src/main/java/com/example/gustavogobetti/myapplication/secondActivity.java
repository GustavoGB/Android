package com.example.gustavogobetti.myapplication;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mSecondEditText = findViewById(R.id.second_et);

        Intent intent = getIntent();
        String message = ((Intent) intent).getStringExtra(MainActivity.EXTRA_MESSAGE);
        mSecondEditText.setText(message);
    }

    public void returReaply(View view){

        String reply = mSecondEditText.getText().toString();

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);

        setResult(RESULT_OK,replyIntent);

        finish();
    }
}
