package com.example.gustavogobetti.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables for the score of each team
    private int mScore1;
    private int mScore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Finding using ID TextViews

        TextView mScoreText1 = (TextView) findViewById(R.id.score_1);
        TextView mScoreText2 = (TextView) findViewById(R.id.score_2);


    }

    public void decreaseScore(View view) {

        TextView mScoreText1 = (TextView) findViewById(R.id.score_1);
        TextView mScoreText2 = (TextView) findViewById(R.id.score_2);

        //Get the ID of the button that was clicked
        int viewID = view.getId();
        switch (viewID) {
            //Team 1
            case R.id.decreaseTeam1:
                //Decrement the score and update textview
                mScore1--;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            //Team 2
            case R.id.decreaseTeam2:
                //same as first case just change team
                mScore2--;
                mScoreText2.setText(String.valueOf(mScore2));

        }
    }

    public void increaseScore(View view) {
        TextView mScoreText1 = (TextView) findViewById(R.id.score_1);
        TextView mScoreText2 = (TextView) findViewById(R.id.score_2);

        int viewID = view.getId();
        switch (viewID) {
            //Team 1
            case R.id.increaseTeam1:
                //Decrement the score and update textview
                mScore1++;
                mScoreText1.setText(String.valueOf(mScore1));
                break;
            //Team 2
            case R.id.increaseTeam2:
                //same as first case just change team
                mScore2++;
                mScoreText2.setText(String.valueOf(mScore2));
        }
    }
}