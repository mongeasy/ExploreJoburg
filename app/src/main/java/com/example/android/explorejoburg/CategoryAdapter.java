package com.example.android.explorejoburg;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    // number of pages for categories
    private final static int PAGE_COUNT = 3;

    //
    private String[] tabTitles = new String[]{"History", "Food", "Fun"};


    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoryFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else {
            return new FunFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate page title based on the item's position
        return tabTitles[position];
    }
}
