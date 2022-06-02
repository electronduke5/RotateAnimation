package com.example.rotateanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation animation = AnimationUtils.loadAnimation(
                this,
                R.anim.rotate_center
        );

        Animation animation1 = AnimationUtils.loadAnimation(
                this, R.anim.enlarge
        );

        Animation animation2 = AnimationUtils.loadAnimation(
                this, R.anim.translate
        );

        findViewById(R.id.imageView).startAnimation(animation);
        findViewById(R.id.imageView2).startAnimation(animation1);
        findViewById(R.id.imageView3).startAnimation(animation2);
    }
}