package com.example.coronaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.coronaapp.R;

public class MainActivity extends AppCompatActivity {

    private static int spash=2000;

    Animation topAnimation,bottomAnimation;
    ImageView img;
    TextView head,caption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        img=(ImageView)findViewById(R.id.imageview);
        head=(TextView)findViewById(R.id.head);
        caption=(TextView)findViewById(R.id.caption);

        img.setAnimation(topAnimation);
        head.setAnimation(bottomAnimation);
        caption.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(MainActivity.this,homeActivity.class);
                startActivity(i);
                finish();
            }
        },spash);
    }
}
