package com.example.delante.cmsc434projdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Hashtable;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Hashtable <String,String> userAccounts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userAccounts = new Hashtable<String,String>();
        userAccounts.put("Parent","password");
        username = (EditText) findViewById(R.id.usernameInput);
        password = (EditText) findViewById(R.id.passwordInput);

        final Button loginButton =  (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(userAccounts.containsKey(user) && userAccounts.get(user).equals(pass)){
                    Toast.makeText(getApplicationContext(),"Login Successful!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this,ProfileSelectAcivityReal.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login Failed.",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
