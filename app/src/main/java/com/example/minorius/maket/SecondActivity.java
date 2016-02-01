package com.example.minorius.maket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;


public class SecondActivity extends AppCompatActivity {

    CheckBox check_math;
    CheckBox check_geo;
    CheckBox check_lit;
    CheckBox check_phis;
    CheckBox check_astr;
    CheckBox check_chem;

    TextView txt_math;
    TextView txt_geo;
    TextView txt_lit;
    TextView txt_phis;
    TextView txt_astr;
    TextView txt_chem;

    ViewGroup up_layout_for_pict_2;

    LinearLayout footer_2;
    LinearLayout up_layout_for_pict_down_2;

    ImageView btn_play_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Toolbar tb = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(tb);

        check_math = (CheckBox) findViewById(R.id.check_math);
        check_geo = (CheckBox) findViewById(R.id.check_geo);
        check_lit = (CheckBox) findViewById(R.id.check_lit);
        check_phis = (CheckBox) findViewById(R.id.check_phis);
        check_astr = (CheckBox) findViewById(R.id.check_astr);
        check_chem = (CheckBox) findViewById(R.id.check_chem);

        txt_math = (TextView) findViewById(R.id.txt_math);
        txt_geo = (TextView) findViewById(R.id.txt_geo);
        txt_lit = (TextView) findViewById(R.id.txt_lit);
        txt_phis = (TextView) findViewById(R.id.txt_phis);
        txt_astr = (TextView) findViewById(R.id.txt_astr);
        txt_chem = (TextView) findViewById(R.id.txt_chem);

        footer_2 = (LinearLayout) findViewById(R.id.footer_2);
        btn_play_2 = (ImageView) findViewById(R.id.btn_play_2);

        up_layout_for_pict_2 = (ViewGroup) findViewById(R.id.up_layout_for_pict_2);
        up_layout_for_pict_down_2 = (LinearLayout) findViewById(R.id.up_layout_for_pict_down_2);

        DisplayMetrics dm = up_layout_for_pict_2.getResources().getDisplayMetrics();
        int w = dm.widthPixels;
        up_layout_for_pict_down_2.setScaleX(w);

        final ArrayList<TextView> al = new ArrayList<>();

        check_math.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check_math.isChecked() || check_geo.isChecked() || check_lit.isChecked() || check_phis.isChecked() || check_astr.isChecked() || check_chem.isChecked()){
                    footer_2.setVisibility(View.VISIBLE);

                }else {
                    footer_2.setVisibility(View.INVISIBLE);

                }
                if(check_math.isChecked()) {

                    al.add(txt_math);
                    int arr_size = al.size();
                    switch (arr_size){
                        case 1:
                            al.get(0).setAlpha((float) 1);
                            break;
                        case 2:
                            al.get(0).setAlpha((float) 0.5);
                            al.get(1).setAlpha((float) 1);
                            break;
                        case 3:
                            al.get(0).setAlpha((float) 0.4);
                            al.get(1).setAlpha((float) 0.5);
                            al.get(2).setAlpha((float) 1);

                            break;
                        case 4:
                            al.get(0).setAlpha((float) 0.3);
                            al.get(1).setAlpha((float) 0.4);
                            al.get(2).setAlpha((float) 0.5);
                            al.get(3).setAlpha((float) 1);

                            break;
                        case 5:
                            al.get(0).setAlpha((float) 0.2);
                            al.get(1).setAlpha((float) 0.3);
                            al.get(2).setAlpha((float) 0.4);
                            al.get(3).setAlpha((float) 0.5);
                            al.get(4).setAlpha((float) 1);
                            break;
                        case 6:
                            al.get(0).setAlpha((float) 0.1);
                            al.get(1).setAlpha((float) 0.2);
                            al.get(2).setAlpha((float) 0.3);
                            al.get(3).setAlpha((float) 0.4);
                            al.get(4).setAlpha((float) 0.5);
                            al.get(5).setAlpha((float) 1);
                            break;
                    }



                    txt_math.setVisibility(View.VISIBLE);
                    Random r = new Random();

                    int random_size = Integer.valueOf(r.nextInt(30) + 10);
                    txt_math.setTextSize(random_size);

                    DisplayMetrics d = up_layout_for_pict_2.getResources().getDisplayMetrics();
                    int w = d.widthPixels;

                    txt_math.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    int width_txt =  findViewById(R.id.txt_math).getMeasuredWidth();

                    int random_w = Integer.valueOf(r.nextInt(w-width_txt));

                    txt_math.setX(random_w);

                    txt_math.setY(Integer.valueOf(r.nextInt(170)));

                }else if(!check_math.isChecked()) {
                    al.remove(txt_math);
                    txt_math.setVisibility(View.GONE);
                }

                //Toast.makeText(getApplicationContext(), ""+ al.size(), Toast.LENGTH_SHORT).show();
            }
        });

        check_geo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check_math.isChecked() || check_geo.isChecked() || check_lit.isChecked() || check_phis.isChecked() || check_astr.isChecked() || check_chem.isChecked()){
                    footer_2.setVisibility(View.VISIBLE);
                }else {
                    footer_2.setVisibility(View.INVISIBLE);
                }

                if(check_geo.isChecked()){

                    al.add(txt_geo);
                    int arr_size = al.size();
                    switch (arr_size){
                        case 1:
                            al.get(0).setAlpha((float) 1);
                            break;
                        case 2:
                            al.get(0).setAlpha((float) 0.5);
                            al.get(1).setAlpha((float) 1);
                            break;
                        case 3:
                            al.get(0).setAlpha((float) 0.4);
                            al.get(1).setAlpha((float) 0.5);
                            al.get(2).setAlpha((float) 1);

                            break;
                        case 4:
                            al.get(0).setAlpha((float) 0.3);
                            al.get(1).setAlpha((float) 0.4);
                            al.get(2).setAlpha((float) 0.5);
                            al.get(3).setAlpha((float) 1);

                            break;
                        case 5:
                            al.get(0).setAlpha((float) 0.2);
                            al.get(1).setAlpha((float) 0.3);
                            al.get(2).setAlpha((float) 0.4);
                            al.get(3).setAlpha((float) 0.5);
                            al.get(4).setAlpha((float) 1);
                            break;
                        case 6:
                            al.get(0).setAlpha((float) 0.1);
                            al.get(1).setAlpha((float) 0.2);
                            al.get(2).setAlpha((float) 0.3);
                            al.get(3).setAlpha((float) 0.4);
                            al.get(4).setAlpha((float) 0.5);
                            al.get(5).setAlpha((float) 1);
                            break;
                    }
                    txt_geo.setVisibility(View.VISIBLE);
                    Random r = new Random();

                    int random_size = Integer.valueOf(r.nextInt(30) + 10);
                    txt_geo.setTextSize(random_size);

                    DisplayMetrics d = up_layout_for_pict_2.getResources().getDisplayMetrics();
                    int w = d.widthPixels;

                    txt_geo.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    int width_txt =  findViewById(R.id.txt_geo).getMeasuredWidth();

                    int random_w = Integer.valueOf(r.nextInt(w-width_txt));

                    txt_geo.setX(random_w);

                    txt_geo.setY(Integer.valueOf(r.nextInt(170)));
                }else if(!check_geo.isChecked()){
                    al.remove(txt_geo);
                    txt_geo.setVisibility(View.GONE);
                }
               // Toast.makeText(getApplicationContext(), ""+ al.size(), Toast.LENGTH_SHORT).show();
            }
        });

        check_lit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check_math.isChecked() || check_geo.isChecked() || check_lit.isChecked() || check_phis.isChecked() || check_astr.isChecked() || check_chem.isChecked()){
                    footer_2.setVisibility(View.VISIBLE);
                }else {
                    footer_2.setVisibility(View.INVISIBLE);
                }
                if(check_lit.isChecked()){

                    al.add(txt_lit);
                    int arr_size = al.size();
                    switch (arr_size){
                        case 1:
                            al.get(0).setAlpha((float) 1);
                            break;
                        case 2:
                            al.get(0).setAlpha((float) 0.5);
                            al.get(1).setAlpha((float) 1);
                            break;
                        case 3:
                            al.get(0).setAlpha((float) 0.4);
                            al.get(1).setAlpha((float) 0.5);
                            al.get(2).setAlpha((float) 1);

                            break;
                        case 4:
                            al.get(0).setAlpha((float) 0.3);
                            al.get(1).setAlpha((float) 0.4);
                            al.get(2).setAlpha((float) 0.5);
                            al.get(3).setAlpha((float) 1);

                            break;
                        case 5:
                            al.get(0).setAlpha((float) 0.2);
                            al.get(1).setAlpha((float) 0.3);
                            al.get(2).setAlpha((float) 0.4);
                            al.get(3).setAlpha((float) 0.5);
                            al.get(4).setAlpha((float) 1);
                            break;
                        case 6:
                            al.get(0).setAlpha((float) 0.1);
                            al.get(1).setAlpha((float) 0.2);
                            al.get(2).setAlpha((float) 0.3);
                            al.get(3).setAlpha((float) 0.4);
                            al.get(4).setAlpha((float) 0.5);
                            al.get(5).setAlpha((float) 1);
                            break;
                    }
                    txt_lit.setVisibility(View.VISIBLE);
                    Random r = new Random();

                    int random_size = Integer.valueOf(r.nextInt(30) + 10);
                    txt_lit.setTextSize(random_size);

                    DisplayMetrics d = up_layout_for_pict_2.getResources().getDisplayMetrics();
                    int w = d.widthPixels;

                    txt_lit.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    int width_txt =  findViewById(R.id.txt_lit).getMeasuredWidth();

                    int random_w = Integer.valueOf(r.nextInt(w-width_txt));

                    txt_lit.setX(random_w);

                    txt_lit.setY(Integer.valueOf(r.nextInt(170)));
                }else if(!check_lit.isChecked()){
                    al.remove(txt_lit);
                    txt_lit.setVisibility(View.GONE);
                }
                //Toast.makeText(getApplicationContext(), ""+ al.size(), Toast.LENGTH_SHORT).show();
            }
        });
        check_phis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (check_math.isChecked() || check_geo.isChecked() || check_lit.isChecked() || check_phis.isChecked() || check_astr.isChecked() || check_chem.isChecked()) {
                    footer_2.setVisibility(View.VISIBLE);
                } else {
                    footer_2.setVisibility(View.INVISIBLE);
                }
                if(check_phis.isChecked()){

                    al.add(txt_phis);
                    int arr_size = al.size();
                    switch (arr_size){
                        case 1:
                            al.get(0).setAlpha((float) 1);
                            break;
                        case 2:
                            al.get(0).setAlpha((float) 0.5);
                            al.get(1).setAlpha((float) 1);
                            break;
                        case 3:
                            al.get(0).setAlpha((float) 0.4);
                            al.get(1).setAlpha((float) 0.5);
                            al.get(2).setAlpha((float) 1);

                            break;
                        case 4:
                            al.get(0).setAlpha((float) 0.3);
                            al.get(1).setAlpha((float) 0.4);
                            al.get(2).setAlpha((float) 0.5);
                            al.get(3).setAlpha((float) 1);

                            break;
                        case 5:
                            al.get(0).setAlpha((float) 0.2);
                            al.get(1).setAlpha((float) 0.3);
                            al.get(2).setAlpha((float) 0.4);
                            al.get(3).setAlpha((float) 0.5);
                            al.get(4).setAlpha((float) 1);
                            break;
                        case 6:
                            al.get(0).setAlpha((float) 0.1);
                            al.get(1).setAlpha((float) 0.2);
                            al.get(2).setAlpha((float) 0.3);
                            al.get(3).setAlpha((float) 0.4);
                            al.get(4).setAlpha((float) 0.5);
                            al.get(5).setAlpha((float) 1);
                            break;
                    }
                    txt_phis.setVisibility(View.VISIBLE);
                    Random r = new Random();

                    int random_size = Integer.valueOf(r.nextInt(30) + 10);
                    txt_phis.setTextSize(random_size);

                    DisplayMetrics d = up_layout_for_pict_2.getResources().getDisplayMetrics();
                    int w = d.widthPixels;

                    txt_phis.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    int width_txt =  findViewById(R.id.txt_phis).getMeasuredWidth();

                    int random_w = Integer.valueOf(r.nextInt(w-width_txt));

                    txt_phis.setX(random_w);

                    txt_phis.setY(Integer.valueOf(r.nextInt(170)));
                }else if(!check_phis.isChecked()){
                    al.remove(txt_phis);
                    txt_phis.setVisibility(View.GONE);
                }
                //Toast.makeText(getApplicationContext(), ""+ al.size(), Toast.LENGTH_SHORT).show();
            }
        });
        check_astr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (check_math.isChecked() || check_geo.isChecked() || check_lit.isChecked() || check_phis.isChecked() || check_astr.isChecked() || check_chem.isChecked()) {
                    footer_2.setVisibility(View.VISIBLE);
                } else {
                    footer_2.setVisibility(View.INVISIBLE);
                }
                if (check_astr.isChecked()) {

                    al.add(txt_astr);
                    int arr_size = al.size();
                    switch (arr_size) {
                        case 1:
                            al.get(0).setAlpha((float) 1);
                            break;
                        case 2:
                            al.get(0).setAlpha((float) 0.5);
                            al.get(1).setAlpha((float) 1);
                            break;
                        case 3:
                            al.get(0).setAlpha((float) 0.4);
                            al.get(1).setAlpha((float) 0.5);
                            al.get(2).setAlpha((float) 1);

                            break;
                        case 4:
                            al.get(0).setAlpha((float) 0.3);
                            al.get(1).setAlpha((float) 0.4);
                            al.get(2).setAlpha((float) 0.5);
                            al.get(3).setAlpha((float) 1);

                            break;
                        case 5:
                            al.get(0).setAlpha((float) 0.2);
                            al.get(1).setAlpha((float) 0.3);
                            al.get(2).setAlpha((float) 0.4);
                            al.get(3).setAlpha((float) 0.5);
                            al.get(4).setAlpha((float) 1);
                            break;
                        case 6:
                            al.get(0).setAlpha((float) 0.1);
                            al.get(1).setAlpha((float) 0.2);
                            al.get(2).setAlpha((float) 0.3);
                            al.get(3).setAlpha((float) 0.4);
                            al.get(4).setAlpha((float) 0.5);
                            al.get(5).setAlpha((float) 1);
                            break;
                    }

                    txt_astr.setVisibility(View.VISIBLE);
                    Random r = new Random();

                    int random_size = Integer.valueOf(r.nextInt(30) + 10);
                    txt_astr.setTextSize(random_size);

                    DisplayMetrics d = up_layout_for_pict_2.getResources().getDisplayMetrics();
                    int w = d.widthPixels;

                    txt_astr.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    int width_txt =  findViewById(R.id.txt_astr).getMeasuredWidth();

                    int random_w = Integer.valueOf(r.nextInt(w-width_txt));

                    txt_astr.setX(random_w);

                    txt_astr.setY(Integer.valueOf(r.nextInt(170)));
                } else if (!check_astr.isChecked()) {
                    al.remove(txt_astr);
                    txt_astr.setVisibility(View.GONE);
                }
                //Toast.makeText(getApplicationContext(), ""+ al.size(), Toast.LENGTH_SHORT).show();
            }
        });
        check_chem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(check_math.isChecked() || check_geo.isChecked() || check_lit.isChecked() || check_phis.isChecked() || check_astr.isChecked() || check_chem.isChecked()){
                    footer_2.setVisibility(View.VISIBLE);
                }else {
                    footer_2.setVisibility(View.INVISIBLE);
                }
                if(check_chem.isChecked()){

                    al.add(txt_chem);
                    int arr_size = al.size();
                    switch (arr_size) {
                        case 1:
                            al.get(0).setAlpha((float) 1);
                            break;
                        case 2:
                            al.get(0).setAlpha((float) 0.5);
                            al.get(1).setAlpha((float) 1);
                            break;
                        case 3:
                            al.get(0).setAlpha((float) 0.4);
                            al.get(1).setAlpha((float) 0.5);
                            al.get(2).setAlpha((float) 1);

                            break;
                        case 4:
                            al.get(0).setAlpha((float) 0.3);
                            al.get(1).setAlpha((float) 0.4);
                            al.get(2).setAlpha((float) 0.5);
                            al.get(3).setAlpha((float) 1);

                            break;
                        case 5:
                            al.get(0).setAlpha((float) 0.2);
                            al.get(1).setAlpha((float) 0.3);
                            al.get(2).setAlpha((float) 0.4);
                            al.get(3).setAlpha((float) 0.5);
                            al.get(4).setAlpha((float) 1);
                            break;
                        case 6:
                            al.get(0).setAlpha((float) 0.1);
                            al.get(1).setAlpha((float) 0.2);
                            al.get(2).setAlpha((float) 0.3);
                            al.get(3).setAlpha((float) 0.4);
                            al.get(4).setAlpha((float) 0.5);
                            al.get(5).setAlpha((float) 1);
                            break;
                    }
                    txt_chem.setVisibility(View.VISIBLE);
                    Random r = new Random();

                    int random_size = Integer.valueOf(r.nextInt(30) + 10);
                    txt_chem.setTextSize(random_size);

                    DisplayMetrics d = up_layout_for_pict_2.getResources().getDisplayMetrics();
                    int w = d.widthPixels;

                    txt_chem.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    int width_txt =  findViewById(R.id.txt_chem).getMeasuredWidth();

                    int random_w = Integer.valueOf(r.nextInt(w-width_txt));

                    txt_chem.setX(random_w);

                    txt_chem.setY(Integer.valueOf(r.nextInt(170)));
                }else if(!check_chem.isChecked()){
                    al.remove(txt_chem);
                    txt_chem.setVisibility(View.GONE);
                }
                //Toast.makeText(getApplicationContext(), ""+ al.size(), Toast.LENGTH_SHORT).show();
            }
        });

        btn_play_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation a = new TranslateAnimation(0.0f, 0.0f, 0.0f, -300.0f);
                a.setDuration(1400);
                Animation b = new TranslateAnimation(0.0f, 0.0f, 0.0f, -300.0f);
                b.setDuration(1000);
                Animation c = new TranslateAnimation(0.0f, 0.0f, 0.0f, -300.0f);
                c.setDuration(800);
                Animation d = new TranslateAnimation(0.0f, 0.0f, 0.0f, -300.0f);
                d.setDuration(600);
                Animation e = new TranslateAnimation(0.0f, 0.0f, 0.0f, -300.0f);
                e.setDuration(500);
                Animation f = new TranslateAnimation(0.0f, 0.0f, 0.0f, -300.0f);
                f.setDuration(400);

                switch (al.size()) {
                    case 1:
                        al.get(0).startAnimation(a);
                        break;
                    case 2:
                        al.get(0).startAnimation(a);
                        al.get(1).startAnimation(b);
                        break;
                    case 3:
                        al.get(0).startAnimation(a);
                        al.get(1).startAnimation(b);
                        al.get(2).startAnimation(c);

                        break;
                    case 4:
                        al.get(0).startAnimation(a);
                        al.get(1).startAnimation(b);
                        al.get(2).startAnimation(c);
                        al.get(3).startAnimation(d);

                        break;
                    case 5:
                        al.get(0).startAnimation(a);
                        al.get(1).startAnimation(b);
                        al.get(2).startAnimation(c);
                        al.get(3).startAnimation(d);
                        al.get(4).startAnimation(e);
                        break;
                    case 6:
                        al.get(0).startAnimation(a);
                        al.get(1).startAnimation(b);
                        al.get(2).startAnimation(c);
                        al.get(3).startAnimation(d);
                        al.get(4).startAnimation(e);
                        al.get(5).startAnimation(f);
                        break;
                }

                //a.setFillAfter(true);

                check_math.setChecked(false);
                check_chem.setChecked(false);
                check_astr.setChecked(false);
                check_geo.setChecked(false);
                check_phis.setChecked(false);
                check_lit.setChecked(false);

                a.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent i = new Intent(getApplicationContext(), PlayActivity.class);
                        startActivity(i);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });

    }
}
