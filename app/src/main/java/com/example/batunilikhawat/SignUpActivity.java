package com.example.batunilikhawat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //this command is used to hidde the action bar.
        getSupportActionBar().hide();
    }
}