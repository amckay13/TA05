package com.example.delante.cmsc434projdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ChildPlayModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.childpage);

        final Button buttonRemote = (Button) findViewById(R.id.childButton1);
        final Button buttonSide = (Button) findViewById(R.id.childButton2);
        final Button buttonSolo = (Button) findViewById(R.id.parentButton);

        buttonRemote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChildPlayModeActivity.this,StoryPageActivity.class);
                startActivity(intent);
            }
        });

        buttonSolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChildPlayModeActivity.this,StoryPageActivity.class);
                startActivity(intent);
            }
        });

        buttonSide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChildPlayModeActivity.this, StoryPageActivity.class);
                startActivity(intent);
            }
        });
    }

}
