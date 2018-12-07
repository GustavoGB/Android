package com.example.gustavogobetti.firstlabandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void toast(String message){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }

//
//    //RButton
//    Button Rbutton = findViewById(R.id.right_button);
//    //Lbutton
//    Button Lbutton = findViewById(R.id.left_button);
    //RandomIndex
    //public static final Random RANDOM = new Random();
    //Set the view as a ROOT


    //Create a Tuple with the value of the Hexadecimal of the color and the name of it.
    // 2 Strings instead of the Tuple
    //String[] arrayName   = {"Green","Blue","Red","Black","White","Orange", "Pink", "Purple", "Brown"};
    //String[] arrayColors = {"#00FF00","#0000FF","#FF0000","000000","#FF0000", "#FF4E00", "#FF00FF", "#800080", "#6A280B"};


    ////int [] arrayColors   = {Color.GREEN,Color.BLUE,Color.RED,Color.BLACK,Color.WHITE,Color.WHITE,Color.GRAY,Color.LTGRAY,Color.DKGRAY,Color.MAGENTA};

    //
    public int counter = 0;

    //RandomIndex
    int randomRight = (int) (Math.random()*10);
    int randomLeft  = (int) (Math.random()*10);

    //Arrays of name and the actual Colors
    String[] arrayName   = {"Green","Blue","Red","Black","White","Orange", "Pink", "Purple", "Brown"};
    String[] arrayColors = {"#00FF00","#0000FF","#FF0000","000000","#FF0000", "#FF4E00", "#FF00FF", "#800080", "#6A280B"};

    public void buttonClicked(View view) {
        //Buttons and layout
        Button Rbutton = findViewById(R.id.right_button);
        //Lbutton
        Button Lbutton = findViewById(R.id.left_button);
        //Color Name Display
        TextView mColorName = (TextView) findViewById(R.id.colorName);
        //Score Display
        TextView mScore     = (TextView) findViewById(R.id.score) ;


        //Rbutton.setBackgroundColor(Color.parseColor(arrayName[randomRight]));
        //Lbutton.setBackgroundColor(Color.parseColor(arrayColors[randomLeft]));

        if (arrayColors[randomRight].equals(arrayName)) {
            mColorName.setText(arrayColors[randomRight]);
            mScore.setText(Integer.toString(counter));
            Rbutton.setBackgroundColor(Color.parseColor(arrayColors[randomRight]));
            Lbutton.setBackgroundColor(Color.parseColor(arrayColors[randomLeft]));
            toast("Right!");
            counter++;
        }
        else{
            mColorName.setText(arrayColors[randomLeft]);
            Rbutton.setBackgroundColor(Color.parseColor(arrayColors[randomRight]));
            Lbutton.setBackgroundColor(Color.parseColor(arrayColors[randomLeft]));
            toast("Wrong");
        }
    }



}
