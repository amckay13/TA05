package com.example.delante.cmsc434projdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class StoryPickerPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storypickerpage);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        final Button story1 = (Button) findViewById(R.id.book1);
        final Button story2 = (Button) findViewById(R.id.book2);
        final Button remoteStory1 = (Button) findViewById(R.id.animalStoryRemoteMode);

        // final Button buttonSolo = (Button) findViewById(R.id.parentButton);

        story1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StoryPickerPageActivity.this,StoryPageActivity.class);
                startActivity(intent);
            }
        });

        story2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StoryPickerPageActivity.this,Story2PageActivity.class);
                startActivity(intent);
            }
        });

        remoteStory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StoryPickerPageActivity.this,StoryPageRemoteActivity.class);
                startActivity(intent);
            }
        });

    }

}
