package com.example.gustavogobetti.firstlabandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void toast(String message){
        Toast.makeText(this, "Left!", Toast.LENGTH_SHORT).show();
    }


    //Declaring the buttons
    //Rbutton = (Button) findViewById(R.id.right_button);
    //
    //Button Lbutton = findViewById(R.id.left_button);
    //Method for buttonClicked--
    //1step


    public void buttonClicked(View view) {

        if (view.getId() == R.id.left_button){
            toast("Left!");
        }
        else{
            toast("Right!");
        }
    }

}
