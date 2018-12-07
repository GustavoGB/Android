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
    private int counter = 0;
    private String[] arrayName   = {"Green", "Blue", "Red", "Black", "White", "Orange", "Pink", "Purple", "Brown"};
    private String[] arrayColors = {"#00FF00", "#0000FF", "#FF0000", "#000000", "#FFFFFF", "#FF4E00", "#FF00FF", "#800080", "#6A280B"};
    private Button leftBtn;
    private Button rightBtn;
    private TextView mColorName;
    private TextView mScore;
    private int rightColor;
    private int leftColor;
    private int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftBtn = findViewById(R.id.left_button);
        rightBtn = findViewById(R.id.right_button);
        mColorName = findViewById(R.id.colorName);
        mScore     = findViewById(R.id.score) ;
    }

    private void toast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void makeNewQuestion() {
        rightColor = (int) (Math.random() * arrayColors.length);
        leftColor  = (int) (Math.random() * arrayColors.length);
        while (leftColor == rightColor) {
            leftColor  = (int) (Math.random() * arrayColors.length);
        }
        int[] choices = {rightColor, leftColor};
        answer = choices[(int) (Math.random() * 2)];
        mColorName.setText(arrayName[answer]);
        rightBtn.setBackgroundColor(Color.parseColor(arrayColors[rightColor]));
        leftBtn.setBackgroundColor(Color.parseColor(arrayColors[leftColor]));
    }

    public void buttonClicked(View view) {
        if (view.getId() == R.id.right_button) {
            if (answer == rightColor) {
                toast("Right!");
                counter++;
                mScore.setText("Score : " + counter);
            } else {
                toast("Wrong");
            }
        } else {
            if (answer == leftColor) {
                toast("Right!");
                counter++;
                mScore.setText("Score : " + counter);
            } else {
                toast("Wrong");
            }
        }
        makeNewQuestion();
    }

}
