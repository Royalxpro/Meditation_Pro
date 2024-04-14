package com.busyduniadevs.meditation.starterfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.busyduniadevs.meditation.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it=new Intent(SplashScreen.this,WelcomeFirst.class);
                startActivity(it);
                finish();
            }
        },3000);
    }

}