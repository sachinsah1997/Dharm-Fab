package com.example.sachin.dharm_fab;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash_screen);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);
//                  sleep(100);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent openMain = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(openMain);
                    finish();
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}