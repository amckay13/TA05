package com.example.delante.cmsc434projdemo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class ParentSettingsActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_settings_page);
    }

        public void onRadioButtonClicked(View view) {
            // Is the view now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which checkbox was clicked
            switch(view.getId()) {
                case R.id.russian:
                    if (checked) {
                        Story2PageActivity.setLoc2("r");
                        StoryPageActivity.setLoc2("r");
                    }
                    break;
                case R.id.spanish:
                    if (checked) {
                        Story2PageActivity.setLoc2("s");
                        StoryPageActivity.setLoc2("s");
                    }
                    break;
            }
        }
    }

