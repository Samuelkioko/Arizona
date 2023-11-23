package com.example.arizonaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar progressBar; //progress bar (loading progress)
    private Timer timer; //for progress bar
    private int i=0; //initial state of progress bar
    float v=0; // for animation
    TextView kca,motto,powered;
    ImageView imageKca, imageHitech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        kca=findViewById(R.id.txtKca);
        motto=findViewById(R.id.txtMotto);
        powered=findViewById(R.id.txtPowered);

        imageKca=findViewById(R.id.imgKca);
        imageHitech=findViewById(R.id.imgHitechlogo);

        kca.setTranslationY(300);
        motto.setTranslationY(300);
        powered.setTranslationY(300);

        imageKca.setTranslationY(300);
        imageHitech.setTranslationY(300);

        kca.setAlpha(v);
        motto.setAlpha(v);
        powered.setAlpha(v);

        imageKca.setAlpha(v);
        imageHitech.setAlpha(v);

        kca.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        motto.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        powered.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();

        imageKca.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1400).start();
        imageHitech.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1600).start();

        //progress bar
        progressBar=findViewById(R.id.progressBar);
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (i<100){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                        }
                    });progressBar.setProgress(i);
                    i++;
                }else {
                    timer.cancel();
                    Intent intent=new Intent(SplashActivity.this,LoginActivity.class); //open a new activity if i<=100
                    startActivity(intent);
                    finish();
                }

            }
        },0,50);
    }
}