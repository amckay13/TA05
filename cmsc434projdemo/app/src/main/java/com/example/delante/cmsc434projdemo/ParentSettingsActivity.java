package com.example.delante.cmsc434projdemo;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ParentSettingsActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_settings_page);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        RadioGroup radiogroup = (RadioGroup)findViewById(R.id.rgroup);
        if (StoryPageActivity.loc2 == StoryPageActivity.rus)
            radiogroup.check(R.id.russian);
        else if (StoryPageActivity.loc2 == StoryPageActivity.spa)
            radiogroup.check(R.id.spanish);
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

