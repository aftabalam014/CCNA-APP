package com.mdaftabalam.ccna.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.mdaftabalam.ccna.R;
import com.mdaftabalam.ccna.fragment.AboutFragment;
import com.mdaftabalam.ccna.fragment.HomeFragment;
import com.mdaftabalam.ccna.fragment.MoreFragment;
import com.mdaftabalam.ccna.fragment.QuizFragment;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    FrameLayout frameLayout;
    TabLayout tabLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.desktop_icon);

        // Get the reference of FrameLayout and TabLayout
        frameLayout = findViewById(R.id.FrameLayout);
        tabLayout = findViewById(R.id.TabLayout);

        // Create a new Tab named "First"
        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("Home"); // set the Text for the first Tab
        firstTab.setIcon(R.drawable.nav_home); // set an icon for the
        tabLayout.addTab(firstTab); // add  the tab at in the TabLayout

        // Create a new Tab named "Second"
        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setText("Quiz"); // set the Text for the second Tab
        secondTab.setIcon(R.drawable.nav_quiz); // set an icon for the second tab
        tabLayout.addTab(secondTab); // add  the tab  in the TabLayout

        // Create a new Tab named "Third"
        TabLayout.Tab thirdTab = tabLayout.newTab();
        thirdTab.setText("About"); // set the Text for the first Tab
        thirdTab.setIcon(R.drawable.nav_about); // set an icon for the first tab
        tabLayout.addTab(thirdTab); // add  the tab at in the TabLayout

        // Create a new Tab named "Four"
        TabLayout.Tab fourTab = tabLayout.newTab();
        fourTab.setText("More"); // set the Text for the second Tab
        fourTab.setIcon(R.drawable.nav_more); // set an icon for the second tab
        tabLayout.addTab(fourTab); // add  the tab  in the TabLayout

        //replace default fragment
        replaceFragment(new HomeFragment());

        // perform setOnTabSelectedListener event on TabLayout
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    replaceFragment(new HomeFragment());
                } else if (tab.getPosition() == 1) {
                    replaceFragment(new QuizFragment());
                } else if (tab.getPosition() == 2) {
                    replaceFragment(new AboutFragment());
                } else {
                    replaceFragment(new MoreFragment());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.FrameLayout, fragment);
        transaction.commit();
    }
}
