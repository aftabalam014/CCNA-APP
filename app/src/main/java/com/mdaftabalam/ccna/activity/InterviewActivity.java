package com.mdaftabalam.ccna.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.ExpandableListView;

import com.mdaftabalam.ccna.R;
import com.mdaftabalam.ccna.adapter.InterviewAdapter;
import com.mdaftabalam.ccna.utils.InterviewQA;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class InterviewActivity extends AppCompatActivity {

    List<String> groupList;
    List<String> childList;
    Map<String, List<String>> laptopCollection;
    ExpandableListView expListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        //Here initialize method for list view group and child
        createGroup();
        createChild();

        expListView = (ExpandableListView) findViewById(R.id.laptop_list);
        final InterviewAdapter mainAdapter = new InterviewAdapter(this, groupList, laptopCollection);
        expListView.setAdapter(mainAdapter);
        //setGroupIndicatorToRight();
    }

    private void createGroup() {
        // preparing group collection
        groupList = new ArrayList<String>();
        groupList.add(InterviewQA.question1);
        groupList.add(InterviewQA.question2);
        groupList.add(InterviewQA.question3);
        groupList.add(InterviewQA.question4);
        groupList.add(InterviewQA.question5);
        groupList.add(InterviewQA.question6);
        groupList.add(InterviewQA.question7);
        groupList.add(InterviewQA.question8);
        groupList.add(InterviewQA.question9);
        groupList.add(InterviewQA.question10);
        groupList.add(InterviewQA.question11);
        groupList.add(InterviewQA.question12);
        groupList.add(InterviewQA.question13);
        groupList.add(InterviewQA.question14);
        groupList.add(InterviewQA.question15);
        groupList.add(InterviewQA.question16);
        groupList.add(InterviewQA.question17);
        groupList.add(InterviewQA.question18);
        groupList.add(InterviewQA.question19);
        groupList.add(InterviewQA.question20);
        groupList.add(InterviewQA.question21);
        groupList.add(InterviewQA.question22);
        groupList.add(InterviewQA.question23);
        groupList.add(InterviewQA.question24);
        groupList.add(InterviewQA.question25);
        groupList.add(InterviewQA.question26);
        groupList.add(InterviewQA.question27);
        groupList.add(InterviewQA.question28);
        groupList.add(InterviewQA.question29);
        groupList.add(InterviewQA.question30);
        groupList.add(InterviewQA.question31);
        groupList.add(InterviewQA.question32);
        groupList.add(InterviewQA.question33);
        groupList.add(InterviewQA.question34);
        groupList.add(InterviewQA.question35);
        groupList.add(InterviewQA.question36);
        groupList.add(InterviewQA.question37);
        groupList.add(InterviewQA.question38);
        groupList.add(InterviewQA.question39);
        groupList.add(InterviewQA.question40);
        groupList.add(InterviewQA.question41);
        groupList.add(InterviewQA.question42);
        groupList.add(InterviewQA.question43);
        groupList.add(InterviewQA.question44);
        groupList.add(InterviewQA.question45);
        groupList.add(InterviewQA.question46);
        groupList.add(InterviewQA.question47);
        groupList.add(InterviewQA.question48);
        groupList.add(InterviewQA.question49);
        groupList.add(InterviewQA.question50);
        groupList.add(InterviewQA.question51);
    }

    private void createChild() {
        // preparing child collection
        String[] Desc1 = {InterviewQA.answer1};
        String[] Desc2 = {InterviewQA.answer2};
        String[] Desc3 = {InterviewQA.answer3};
        String[] Desc4 = {InterviewQA.answer4};
        String[] Desc5 = {InterviewQA.answer5};
        String[] Desc6 = {InterviewQA.answer6};
        String[] Desc7 = {InterviewQA.answer7};
        String[] Desc8 = {InterviewQA.answer8};
        String[] Desc9 = {InterviewQA.answer9};
        String[] Desc10 = {InterviewQA.answer10};
        String[] Desc11 = {InterviewQA.answer11};
        String[] Desc12 = {InterviewQA.answer12};
        String[] Desc13 = {InterviewQA.answer13};
        String[] Desc14 = {InterviewQA.answer14};
        String[] Desc15 = {InterviewQA.answer15};
        String[] Desc16 = {InterviewQA.answer16};
        String[] Desc17 = {InterviewQA.answer17};
        String[] Desc18 = {InterviewQA.answer18};
        String[] Desc19 = {InterviewQA.answer19};
        String[] Desc20 = {InterviewQA.answer20};
        String[] Desc21 = {InterviewQA.answer21};
        String[] Desc22 = {InterviewQA.answer22};
        String[] Desc23 = {InterviewQA.answer23};
        String[] Desc24 = {InterviewQA.answer24};
        String[] Desc25 = {InterviewQA.answer25};
        String[] Desc26 = {InterviewQA.answer26};
        String[] Desc27 = {InterviewQA.answer27};
        String[] Desc28 = {InterviewQA.answer28};
        String[] Desc29 = {InterviewQA.answer29};
        String[] Desc30 = {InterviewQA.answer30};
        String[] Desc31 = {InterviewQA.answer31};
        String[] Desc32 = {InterviewQA.answer32};
        String[] Desc33 = {InterviewQA.answer33};
        String[] Desc34 = {InterviewQA.answer34};
        String[] Desc35 = {InterviewQA.answer35};
        String[] Desc36 = {InterviewQA.answer36};
        String[] Desc37 = {InterviewQA.answer37};
        String[] Desc38 = {InterviewQA.answer38};
        String[] Desc39 = {InterviewQA.answer39};
        String[] Desc40 = {InterviewQA.answer40};
        String[] Desc41 = {InterviewQA.answer41};
        String[] Desc42 = {InterviewQA.answer42};
        String[] Desc43 = {InterviewQA.answer43};
        String[] Desc44 = {InterviewQA.answer44};
        String[] Desc45 = {InterviewQA.answer45};
        String[] Desc46 = {InterviewQA.answer46};
        String[] Desc47 = {InterviewQA.answer47};
        String[] Desc48 = {InterviewQA.answer48};
        String[] Desc49 = {InterviewQA.answer49};
        String[] Desc50 = {InterviewQA.answer50};
        String[] Desc51 = {InterviewQA.answer51};

        laptopCollection = new LinkedHashMap<String, List<String>>();

        for (String laptop : groupList) {
            if (laptop.equals(InterviewQA.question1)) {
                loadChild(InterviewQA.answer1);
            } else if (laptop.equals(InterviewQA.question2))
                loadChild(InterviewQA.answer2);
            else if (laptop.equals(InterviewQA.question3))
                loadChild(InterviewQA.answer3);
            else if (laptop.equals(InterviewQA.question4))
                loadChild(InterviewQA.answer4);
            else if (laptop.equals(InterviewQA.question5))
                loadChild(InterviewQA.answer5);
            else if (laptop.equals(InterviewQA.question6))
                loadChild(InterviewQA.answer6);
            else if (laptop.equals(InterviewQA.question7))
                loadChild(InterviewQA.answer7);
            else if (laptop.equals(InterviewQA.question8))
                loadChild(InterviewQA.answer8);
            else if (laptop.equals(InterviewQA.question9))
                loadChild(InterviewQA.answer9);
            else if (laptop.equals(InterviewQA.question10))
                loadChild(InterviewQA.answer10);
            else if (laptop.equals(InterviewQA.question11))
                loadChild(InterviewQA.answer11);
            else if (laptop.equals(InterviewQA.question12))
                loadChild(InterviewQA.answer12);
            else if (laptop.equals(InterviewQA.question13))
                loadChild(InterviewQA.answer13);
            else if (laptop.equals(InterviewQA.question14))
                loadChild(InterviewQA.answer14);
            else if (laptop.equals(InterviewQA.question15))
                loadChild(InterviewQA.answer15);
            else if (laptop.equals(InterviewQA.question16))
                loadChild(InterviewQA.answer16);
            else if (laptop.equals(InterviewQA.question17))
                loadChild(InterviewQA.answer17);
            else if (laptop.equals(InterviewQA.question18))
                loadChild(InterviewQA.answer18);
            else if (laptop.equals(InterviewQA.question19))
                loadChild(InterviewQA.answer19);
            else if (laptop.equals(InterviewQA.question20))
                loadChild(InterviewQA.answer20);
            else if (laptop.equals(InterviewQA.question21))
                loadChild(InterviewQA.answer21);
            else if (laptop.equals(InterviewQA.question22))
                loadChild(InterviewQA.answer22);
            else if (laptop.equals(InterviewQA.question23))
                loadChild(InterviewQA.answer23);
            else if (laptop.equals(InterviewQA.question24))
                loadChild(InterviewQA.answer24);
            else if (laptop.equals(InterviewQA.question25))
                loadChild(InterviewQA.answer25);
            else if (laptop.equals(InterviewQA.question26))
                loadChild(InterviewQA.answer26);
            else if (laptop.equals(InterviewQA.question27))
                loadChild(InterviewQA.answer27);
            else if (laptop.equals(InterviewQA.question28))
                loadChild(InterviewQA.answer28);
            else if (laptop.equals(InterviewQA.question29))
                loadChild(InterviewQA.answer29);
            else if (laptop.equals(InterviewQA.question30))
                loadChild(InterviewQA.answer30);
            else if (laptop.equals(InterviewQA.question31))
                loadChild(InterviewQA.answer31);
            else if (laptop.equals(InterviewQA.question32))
                loadChild(InterviewQA.answer32);
            else if (laptop.equals(InterviewQA.question33))
                loadChild(InterviewQA.answer33);
            else if (laptop.equals(InterviewQA.question34))
                loadChild(InterviewQA.answer34);
            else if (laptop.equals(InterviewQA.question35))
                loadChild(InterviewQA.answer35);
            else if (laptop.equals(InterviewQA.question36))
                loadChild(InterviewQA.answer36);
            else if (laptop.equals(InterviewQA.question37))
                loadChild(InterviewQA.answer37);
            else if (laptop.equals(InterviewQA.question38))
                loadChild(InterviewQA.answer38);
            else if (laptop.equals(InterviewQA.question39))
                loadChild(InterviewQA.answer39);
            else if (laptop.equals(InterviewQA.question40))
                loadChild(InterviewQA.answer40);
            else if (laptop.equals(InterviewQA.question41))
                loadChild(InterviewQA.answer41);
            else if (laptop.equals(InterviewQA.question42))
                loadChild(InterviewQA.answer42);
            else if (laptop.equals(InterviewQA.question43))
                loadChild(InterviewQA.answer43);
            else if (laptop.equals(InterviewQA.question44))
                loadChild(InterviewQA.answer44);
            else if (laptop.equals(InterviewQA.question45))
                loadChild(InterviewQA.answer45);
            else if (laptop.equals(InterviewQA.question46))
                loadChild(InterviewQA.answer46);
            else if (laptop.equals(InterviewQA.question47))
                loadChild(InterviewQA.answer47);
            else if (laptop.equals(InterviewQA.question48))
                loadChild(InterviewQA.answer48);
            else if (laptop.equals(InterviewQA.question49))
                loadChild(InterviewQA.answer49);
            else if (laptop.equals(InterviewQA.question50))
                loadChild(InterviewQA.answer50);
            else
                loadChild(InterviewQA.answer51);
            laptopCollection.put(laptop, childList);
        }
    }

    private void loadChild(String laptopModels) {
        childList = new ArrayList<String>();
        childList.add(laptopModels);
    }

    private void setGroupIndicatorToRight() {
        /* Get the screen width */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        expListView.setIndicatorBounds(width - getDipsFromPixel(35), width - getDipsFromPixel(5));
    }

    // Convert pixel to dip
    public int getDipsFromPixel(float pixels) {
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
    }
}