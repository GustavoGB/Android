package com.example.gustavogobetti.firstlabandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

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

    //Create a Tuple with the value of the Hexadecimal of the color and the name of it.



    String[] arrayName   = {"Green","Blue","Red","Black","White","Gray", "LightGray", "DarkGray", "Magenta"};
    int [] arrayColors   = {Color.GREEN,Color.BLUE,Color.RED,Color.BLACK,Color.WHITE,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.MAGENTA};
    //String[] arrayColors = {"#00FF00","#0000FF","#FF0000","000000","#FF0000", "#FF4E00", "#FF00FF", "#800080", "#6A280B"};


    public static int getRandom( int [] arrayColors) {
        int randomColor = new Random().nextInt(arrayColors.length);
        return arrayColors[randomColor];
    }


    public void buttonClicked(View view) {
        if (view.getId() == R.id.left_button){
            //Button rightBtn = (arrayColors);
            toast("Left!");
        }
        else{
            toast("Right!");
        }
    }

}
