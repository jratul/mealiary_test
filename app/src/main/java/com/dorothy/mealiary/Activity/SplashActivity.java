package com.dorothy.mealiary.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dorothy.mealiary.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        boolean hasLogin = pref.getBoolean("hasLogin", false);
        String hasLoginStr = hasLogin==true ? "true" : "false";
        Log.d("hasLogin", hasLoginStr);

        if(hasLogin) {
            runMainActivity();
        } else {
            runLoginActivity();
        }
    }

    private void runLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    private void runMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
