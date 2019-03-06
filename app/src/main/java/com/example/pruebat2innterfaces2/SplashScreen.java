package com.example.pruebat2innterfaces2;


import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class SplashScreen extends AppCompatActivity implements Animation.AnimationListener {

    TextView tv_titulo_splash;
    ImageView iv_rocket_splash, iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getSupportActionBar().hide();

        tv_titulo_splash = (TextView) findViewById(R.id.tv_titulo_splash);
        iv_rocket_splash = (ImageView) findViewById(R.id.iv_rocket);
        iv_back = (ImageView) findViewById(R.id.iv_back);

        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()
                     .centerCrop()
                )
                .into(iv_back);



        Typeface myFont = getResources().getFont(R.font.bromello);
        tv_titulo_splash.setTypeface(myFont);

        Animation escalar = AnimationUtils.loadAnimation(this, R.anim.scale);
        Animation caida = AnimationUtils.loadAnimation(this, R.anim.caida);
        tv_titulo_splash.startAnimation(escalar);
        iv_rocket_splash.startAnimation(caida);

        escalar.setAnimationListener(this);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(getApplicationContext(), LogIn.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}


