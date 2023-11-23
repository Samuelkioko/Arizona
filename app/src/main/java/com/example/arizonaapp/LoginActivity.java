package com.example.arizonaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    FloatingActionButton fb,google,twitter;

    float v =0;

    ImageView imageView, logo;
    TextView kcaUniversity, continueWith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        fb = findViewById(R.id.fab_facebook);
        google =findViewById(R.id.fab_google);
        twitter =findViewById(R.id.fab_twitter);
        imageView = findViewById(R.id.imageView);
        logo = findViewById(R.id.img_kcaLogo);
        kcaUniversity = findViewById(R.id.txt_kca);
        continueWith = findViewById(R.id.txt_continue);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.addTab(tabLayout.newTab().setText("Sign Up"));


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final LoginAdapter adapter = new LoginAdapter(getSupportFragmentManager(), this, tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        fb.setTranslationY(300);
        google.setTranslationY(300);
        twitter.setTranslationY(300);
        tabLayout.setTranslationY(300);
        imageView.setTranslationY(300);
        logo.setTranslationY(300);
        kcaUniversity.setTranslationY(300);
        continueWith.setTranslationY(300);

        fb.setAlpha(v);
        google.setAlpha(v);
        twitter.setAlpha(v);
        tabLayout.setAlpha(v);
        imageView.setAlpha(v);
        logo.setAlpha(v);
        kcaUniversity.setAlpha(v);
        continueWith.setAlpha(v);

        fb.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        twitter.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(1000).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        imageView.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(200).start();
        logo.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        kcaUniversity.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        continueWith.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(750).start();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}