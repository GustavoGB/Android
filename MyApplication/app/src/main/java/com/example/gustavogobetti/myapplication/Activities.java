package com.example.gustavogobetti.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Activities extends AppCompatActivity {

    public static final String Extra_MESSAGE = "EXTRA_MESSAGE";
    public static final int TEXT_REQUEST_CODE = 1 ;

    private EditText mFirstEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        mFirstEditText = findViewById(R.id.first_et);

    }
    public void launchSecondActivity(View view) {
        Intent intent  = new Intent(createPackageContext(this), SecondActivity.class);
        String message = mFirstEditText.getText().toString();
        intent.putExtra(Extra_Message,message);


        //Starts a second activity!
        startActivityForResult(intent, TEXT_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == TEXT_REQUEST_CODE){
            if (resultCode == RESULT_OK){
                data.getStringExtra(SecondActivity.EXTRA_REPLY);
                mFirstEditText.setText(reply);
                Toast.makeText(context:this, reply, Toast.LENGTH_LONG).show();
            }
        }
    }
}
