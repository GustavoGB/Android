package com.ngamolsky.android.materialme;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.materialme.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

        // Extracting the title
        sportsTitle.setText(getIntent().getStringExtra("Title"));

        //Using the Glide to load the image
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0)).
                into(sportsImage);
    }
}
