package com.example.blueshelt;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.blueshelt.R;



public class EnterPhoneToVerify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_phone_to_verify);
    }

    public void goTo_verify(View view) {
        startActivity(new Intent(getApplication(),VerifyCode.class));
    }
}