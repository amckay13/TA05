package com.example.delante.cmsc434projdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileSelectAcivityReal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_screen);

        final Button childButton1 = (Button) findViewById(R.id.childButton1);
        final Button childButton2 = (Button) findViewById(R.id.childButton2);
        final Button parentButton = (Button) findViewById(R.id.parentButton);

        childButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(ProfileSelectAcivityReal.this,ChildPlayModeActivity.class);
                    startActivity(intent);
                }
        });

        childButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileSelectAcivityReal.this,ChildPlayModeActivity.class);
                startActivity(intent);
            }
        });

        parentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileSelectAcivityReal.this, ParentModeActivity.class);
                startActivity(intent);
            }
        });
    }

}
