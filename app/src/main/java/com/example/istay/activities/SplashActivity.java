package com.example.istay.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.istay.R;
import com.example.istay.usersession.UserSession;

public class SplashActivity extends Activity {

    private static int SPLASH_TIME_OUT = 4000;
    String textToShow;
    //to get user session data
    private UserSession prefManager;
    //private UserSession session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefManager = new UserSession(this);
        if (prefManager.isFirstTimeLaunch()) {
            textToShow = this.getString(R.string.welcome_message);
        }else{
            textToShow = this.getString(R.string.app_name);
        }

        prefManager.setFirstTimeLaunch(false);


        setContentView(R.layout.splash_screen);


        Typeface typeface = ResourcesCompat.getFont(this, R.font.blacklist);

        TextView appname= findViewById(R.id.appname);
        appname.setText(textToShow);
        appname.setTypeface(typeface);

        YoYo.with(Techniques.Bounce)
                .duration(7000)
                .playOn(findViewById(R.id.logo));

        YoYo.with(Techniques.FadeInUp)
                .duration(5000)
                .playOn(findViewById(R.id.appname));

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

