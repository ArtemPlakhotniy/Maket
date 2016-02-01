package com.example.minorius.maket;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.transitionseverywhere.Scene;
import com.transitionseverywhere.Transition;
import com.transitionseverywhere.TransitionInflater;
import com.transitionseverywhere.TransitionManager;

import android.view.ViewGroup;

import android.widget.ImageView;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    ViewGroup ll;
    LinearLayout ll_down;
    LinearLayout footer;

    ImageView left;
    ImageView right;

    Scene scene_1;
    Scene scene_2;
    Scene scene_3;

    ImageView btn_play;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tb = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(tb);

        btn_play = (ImageView) findViewById(R.id.btn_play);

        ll = (ViewGroup) findViewById(R.id.up_layout_for_pict);
        ll_down = (LinearLayout) findViewById(R.id.up_layout_for_pict_down);
        footer = (LinearLayout) findViewById(R.id.footer);

        DisplayMetrics d = ll.getResources().getDisplayMetrics();
        int w = d.widthPixels;
        ll_down.setScaleX(w);

        left = (ImageView) findViewById(R.id.left_btn);
        right = (ImageView) findViewById(R.id.right_btn);

        scene_1 = Scene.getSceneForLayout(ll, R.layout.scene_1, getApplicationContext());
        scene_2 = Scene.getSceneForLayout(ll, R.layout.scene_2, getApplicationContext());
        scene_3 = Scene.getSceneForLayout(ll, R.layout.scene_3, getApplicationContext());

        Transition mFadeTransition = TransitionInflater.from(getApplicationContext()).inflateTransition(R.transition.effect_1);


        final Transition finalMFadeTransition = mFadeTransition;

        left.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        footer.setVisibility(View.VISIBLE);
                        right.setBackgroundResource(R.color.white);
                        left.setBackgroundResource(R.color.grey);
                        TransitionManager.go(scene_2, finalMFadeTransition);

                    }
                });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        footer.setVisibility(View.VISIBLE);
                        left.setBackgroundResource(R.color.white);
                        right.setBackgroundResource(R.color.grey);
                        TransitionManager.go(scene_3, finalMFadeTransition);


            }
        });

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(i);
            }
        });

    }

}