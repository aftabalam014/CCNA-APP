package com.mdaftabalam.ccna.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.mdaftabalam.ccna.R;

import java.util.List;
import java.util.Map;

public class InterviewAdapter extends BaseExpandableListAdapter {

    private Activity context;
    private Map<String, List<String>> laptopCollections;
    private List<String> laptops;

    public InterviewAdapter(Activity context, List<String> laptops, Map<String, List<String>> laptopCollections) {
        this.context = context;
        this.laptopCollections = laptopCollections;
        this.laptops = laptops;
    }

    //Here bind child view
    public Object getChild(int groupPosition, int childPosition) {
        return laptopCollections.get(laptops.get(groupPosition)).get(childPosition);
    }

    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String laptop = (String) getChild(groupPosition, childPosition);
        LayoutInflater inflater = context.getLayoutInflater();
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.question_child, null);
        }
        TextView item = convertView.findViewById(R.id.text_child);
        item.setText(laptop);
        return convertView;
    }

    public int getChildrenCount(int groupPosition) {
        return laptopCollections.get(laptops.get(groupPosition)).size();
    }

    //Here bind group view
    public Object getGroup(int groupPosition) {
        return laptops.get(groupPosition);
    }

    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String laptopName = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.question_group, null);
        }
        TextView item = convertView.findViewById(R.id.laptop);
        item.setTypeface(null, Typeface.BOLD);
        item.setText(laptopName);
        return convertView;
    }

    public int getGroupCount() {
        return laptops.size();
    }//

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}