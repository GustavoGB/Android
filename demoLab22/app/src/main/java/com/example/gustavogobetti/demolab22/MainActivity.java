package com.example.gustavogobetti.demolab22;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    String[] TAG = new TAG[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG[], "onStart");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(String.valueOf(TAG[]), "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(String.valueOf(TAG[]), "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(String.valueOf(TAG[]), "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(String.valueOf(TAG[]), "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(String.valueOf(TAG[]), "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(String.valueOf(TAG[]), "onDestroy");
    }
}
