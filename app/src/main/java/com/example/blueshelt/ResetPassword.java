package com.example.blueshelt;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ResetPassword extends Activity {


    public void revertTo_login(View view) {
        startActivity(new Intent(getApplication(),login.class));
    }
}
