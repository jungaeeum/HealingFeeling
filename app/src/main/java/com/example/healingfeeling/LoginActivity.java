package com.example.healingfeeling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button login;
    private Button signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        login = (Button)findViewById(R.id.loginActivity_button_login);
        signin = (Button)findViewById(R.id.loginActivity_button_signin);




    }


}