package com.mdaftabalam.ccna.fragment;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mdaftabalam.ccna.BuildConfig;
import com.mdaftabalam.ccna.R;
import com.mdaftabalam.ccna.activity.FeedbackActivity;

import java.util.Objects;

public class MoreFragment extends Fragment {

    TextView txtFeedback, txtRate, txtShareApp;
    String PlayLink = "http://play.google.com/store/apps/details?id=";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        txtFeedback = view.findViewById(R.id.txt_feedback);
        txtRate = view.findViewById(R.id.txt_rate);
        txtShareApp = view.findViewById(R.id.txt_share);
        txtFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent as = new Intent(getActivity(), FeedbackActivity.class);
                startActivity(as);
            }
        });
        txtRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("market://details?id=" + Objects.requireNonNull(getActivity()).getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                // After pressing back button, to taken back to our application, we need to add following flags to intent.
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(PlayLink + getActivity().getPackageName())));
                }
            }
        });
        txtShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "CCNA GUIDE");
                String shareMessage = "\nLet me recommend you this awesome application of CCNA\n";
                shareMessage = shareMessage + "\n" + PlayLink + BuildConfig.APPLICATION_ID + "\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "Choose any one"));
            }
        });
        return view;
    }
}