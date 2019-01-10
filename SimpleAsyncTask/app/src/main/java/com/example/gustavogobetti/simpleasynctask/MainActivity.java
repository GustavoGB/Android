package com.example.gustavogobetti.simpleasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // The TextView where we will show results
    private TextView mTextView;

    //Key for saving the state of the TextView
    private static final String TEXT_STATE = "currentText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.textView1);

        //Restore TextView if there is a savedInstanceState
        if(savedInstanceState != null){
            mTextView.setText(savedInstanceState.getString(TEXT_STATE));
        }

    }


    public void startTask(View view) {
        //Put the message in the TextView
        mTextView.setText(R.string.napping);
        //Start the Async
        new SImpleAsyncTask(mTextView).execute();
    }


    protected void onSaveInstancesState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save the state of the TextView
        outState.putString(TEXT_STATE, mTextView.getText().toString());

    }
}
