package com.example.delante.cmsc434projdemo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ParentStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_store_page);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this)
                .load("http://vignette4.wikia.nocookie.net/mrmen/images/5/52/Small.gif/revision/latest?cb=20100731114437")
                .into(imageView);
    }
}
