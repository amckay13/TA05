package com.example.delante.cmsc434projdemo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class ParentStoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_store_page);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.jackbean));
        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.littlered));
        imageView3.setImageDrawable(getResources().getDrawable(R.drawable.littlepigs));
    }

    public void buyBeanstalk(View view) {
        Toast.makeText(this, "You have bought 'Jack and the Beanstalk'", Toast.LENGTH_SHORT).show();
    }

    public void buyLittleRed(View view) {
        Toast.makeText(this, "You have bought 'Little Red Riding Hood'", Toast.LENGTH_SHORT).show();
    }

    public void buyThreeBears(View view) {
        Toast.makeText(this, "You have bought 'You have bought 'The Three Little Bears'", Toast.LENGTH_SHORT).show();
    }
}
