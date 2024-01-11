package com.example.android.my;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pager_adapter extends FragmentPagerAdapter
{
    private int num_tabs;
    public pager_adapter(@NonNull FragmentManager fm, int num_tabs)
    {
        super(fm);
        this.num_tabs = num_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0: return new ChatFragment();
            case 1: return new StatFragment();
            case 2: return new CallFragment();
            default: return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;

        if(position == 0)
            title = "CHAT";
        else if(position == 1)
            title = "STATUS";
        else if(position == 2)
            title = "CALL";
        return title;
    }

    @Override
    public int getCount() {
        return num_tabs;
    }
}
