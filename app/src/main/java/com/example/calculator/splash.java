package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        try {


       //     getSupportActionBar().hide();

            TextView textview = findViewById(R.id.txt);
            textview.setAlpha(0f);

            textview.animate()
                    .alpha(1f)
                    .translationY(textview.getHeight())
                    .setStartDelay(1000)
                    .setDuration(1200);


            Thread thread = new Thread() {

                public void run() {

                    try {
                        sleep(4000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                        Intent intent = new Intent(splash.this, MainActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                        startActivity(intent);
                        finish();
                    }
                }
            };
            thread.start();
        }                            // Main TRY End

        catch(Exception e){
            Intent intent = new Intent(splash.this, MainActivity.class);
            startActivity(intent);
        }
    }
}