package com.android.kmrunal.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        //first from name of the image file get the resource id

        ImageView img = (ImageView) findViewById(R.id.android_cookie_image_view);
        img.setImageResource(R.drawable.after_cookie);
        // TODO: Find a reference to the TextView in the layout. Change the text.

        TextView full = (TextView) findViewById(R.id.status_text_view);
        full.setText("I'm so Full");
    }
}
