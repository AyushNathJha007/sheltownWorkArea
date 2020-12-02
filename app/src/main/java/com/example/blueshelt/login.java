package com.example.blueshelt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goto_signUp(View view) {

        startActivity(new Intent(getApplication(),signup.class));
    }

    public void goto_verify(View view) {
        startActivity(new Intent(getApplication(),EnterPhoneToVerify.class));
    }
}