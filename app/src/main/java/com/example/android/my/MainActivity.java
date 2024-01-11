package com.example.android.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tablayout_id);
        TabItem tabItem1 = findViewById(R.id.chat_tab_id);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TabItem tabItem2 = findViewById(R.id.stat_tab_id);
        TabItem tabItem3 = findViewById(R.id.call_tab_id);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ViewPager viewPager = findViewById(R.id.page_id);

        pager_adapter pagerAdapter = new pager_adapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }
}