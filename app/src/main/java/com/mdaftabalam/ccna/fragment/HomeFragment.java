package com.mdaftabalam.ccna.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.mdaftabalam.ccna.R;
import com.mdaftabalam.ccna.activity.FeedbackActivity;
import com.mdaftabalam.ccna.activity.GuideActivity;
import com.mdaftabalam.ccna.activity.InterviewActivity;
import com.mdaftabalam.ccna.activity.SyllabusActivity;

public class HomeFragment extends Fragment {

    LinearLayout sl, gl, ql, fl;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        sl= view.findViewById(R.id.syllabus);
        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent as=new Intent(getActivity(),SyllabusActivity.class);
                startActivity(as);
            }
        });
        gl= view.findViewById(R.id.guide);
        gl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sa=new Intent(getActivity(), GuideActivity.class);
                startActivity(sa);
            }
        });
        ql= view.findViewById(R.id.question);
        ql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ds=new Intent(getActivity(), InterviewActivity.class);
                startActivity(ds);
            }
        });
        fl= view.findViewById(R.id.feedback);
        fl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sd=new Intent(getActivity(), FeedbackActivity.class);
                startActivity(sd);
            }
        });
        return view;
    }
}