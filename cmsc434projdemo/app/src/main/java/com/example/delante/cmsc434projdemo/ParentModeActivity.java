package com.example.delante.cmsc434projdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ParentModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parentpage);

        final Button settingsButton =  (Button) findViewById(R.id.buttonSettings);
        final Button storeButton =  (Button) findViewById(R.id.buttonStore);
        final Button infoButton =  (Button) findViewById(R.id.buttonInfo);

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParentModeActivity.this, ParentSettingsActivity.class);
                startActivity(intent);
            }
        });

        /*storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParentModeActivity.this, ParentStoreActivity.class);
                startActivity(intent);
            }
        });*/

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParentModeActivity.this, ParentInfoActivity.class);
                startActivity(intent);
            }
        });


    }

}
