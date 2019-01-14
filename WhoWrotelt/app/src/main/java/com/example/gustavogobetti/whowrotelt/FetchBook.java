package com.example.gustavogobetti.whowrotelt;

import android.os.AsyncTask;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.ref.WeakReference;

public class FetchBook extends AsyncTask<String, Void, String> {

    private WeakReference<TextView> mTittleText;
    private WeakReference<TextView> mAuthorText;

    //Class Constructor

    FetchBook(TextView tittleText, TextView authorText){
        this.mTittleText = new WeakReference<>(tittleText);
        this.mAuthorText = new WeakReference<>(authorText);
    }


    @Override
    protected String doInBackground(String... strings) {
        return NetworkUtils.getBookInfo(strings[0]);
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
