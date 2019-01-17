package com.example.gustavogobetti.remembermyage;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mAgeTextView;
    private int age;
    private SharedPreferences mPreferences;
    public static final String AGE_KEY = "AGE_KEY";
    private final String sharedPrefFile = BuildConfig.APPLICATION_ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAgeTextView = findViewById(R.id.age_tv);
        mPreferences = getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
        //Retrieve the data
        age = mPreferences.getInt(AGE_KEY, 0);
        mAgeTextView.setText(Integer.toString(age));



    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = mPreferences.edit();
        editor.putInt(AGE_KEY,age);
        editor.clear();
        editor.apply();
    }

    public void makeMeYounger(View view) {
        age = Integer.parseInt(mAgeTextView.getText().toString());
        if (age > 0) {
            age--;
        }
        mAgeTextView.setText(Integer.toString(age));
    }

    public void makeMeOlder(View view) {
        age = Integer.parseInt(mAgeTextView.getText().toString());
        age++;
        mAgeTextView.setText(Integer.toString(age));
    }
}
