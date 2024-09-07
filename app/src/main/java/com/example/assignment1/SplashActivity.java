package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Delay for 3 seconds before moving to the Sender Form
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, SenderFormActivity.class);
            startActivity(intent);
            finish(); // Finish splash screen
        }, 3000); // 3 seconds
    }
}
