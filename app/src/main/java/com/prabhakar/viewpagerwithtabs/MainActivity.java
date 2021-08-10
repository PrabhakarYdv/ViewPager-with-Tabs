package com.prabhakar.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setViewPagerAdapter();
    }

    private void initViews() {
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);
    }

    private void setViewPagerAdapter() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager.setAdapter(pagerAdapter);
        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull  TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Names");
                        break;
                    case 1:
                        tab.setText("Places");
                        break;
                    case 2:
                        tab.setText("Tourism");
                }
            }
        }).attach();
    }
}