package com.example.blueshelt;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.blueshelt.Tabs.PersonalFragment;
import com.example.blueshelt.Tabs.tab_access_adapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class loan_details extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private tab_access_adapter Tabaccessadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_details);


        tabLayout=findViewById(R.id.details_tab);
        viewPager=findViewById(R.id.details_viewpager);
        Tabaccessadapter = new tab_access_adapter(getSupportFragmentManager());
        viewPager.setAdapter(Tabaccessadapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}
