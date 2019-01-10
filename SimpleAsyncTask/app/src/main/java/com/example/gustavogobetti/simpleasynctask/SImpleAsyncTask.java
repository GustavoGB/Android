package com.example.gustavogobetti.simpleasynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SImpleAsyncTask extends AsyncTask <Void,Void, String> {

    private WeakReference<TextView> mTextView;

    //Constructor of mTextView
    SImpleAsyncTask(TextView tv){
        mTextView = new WeakReference<>(tv);
    }

    @Override
    protected String doInBackground(Void... voids) {

        //Generating Random integer
        Random mRandom = new Random();
        int mAnyNumber = mRandom.nextInt(11);
        //Make the task lasts until we rotate the phone
        int mResult = mAnyNumber * 200;

        //Sleep a little
        try{
            Thread.sleep(mResult);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        return "Awake at last after sleeping for "+mResult+"milliseconds!";
    }

    protected void onPostExecute(String result){
        mTextView.get().setText(result);
    }
}
