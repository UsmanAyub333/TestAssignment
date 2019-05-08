package com.example.abc.test;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FullScreenImage extends AppCompatActivity {

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        image = (ImageView) findViewById(R.id.full_screen_image);


        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("url");
                Glide.with(image.getContext()).load(newString).into(image);
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("url");
        }


    }
}
