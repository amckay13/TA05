package com.example.delante.cmsc434projdemo;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class StoryPickerPageActivity extends AppCompatActivity {

    static int mode=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storypickerpage);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        final Button story1 = (Button) findViewById(R.id.book1);
        final Button story2 = (Button) findViewById(R.id.book2);

        RadioGroup radiogroup = (RadioGroup)findViewById(R.id.radio_group);
        radiogroup.check(R.id.radio_solo);
        //final Button remoteStory1 = (Button) findViewById(R.id.animalStoryRemoteMode);

        // final Button buttonSolo = (Button) findViewById(R.id.parentButton);

        story1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mode == 1 || mode == 2) {
                    Intent intent = new Intent(StoryPickerPageActivity.this, StoryPageActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(StoryPickerPageActivity.this,StoryPageRemoteActivity.class);
                    startActivity(intent);
                }
            }
        });

        story2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StoryPickerPageActivity.this,Story2PageActivity.class);
                startActivity(intent);
            }
        });



       /* remoteStory1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });*/

    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_solo:
                if (checked)
                    mode = 1;
                    break;
            case R.id.radio_side:
                if (checked)
                    // Ninjas rule
                    mode = 2;
                    break;
            case R.id.radio_remote:
                    mode = 3;
                    break;
        }
    }

}
