package com.mdaftabalam.ccna.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mdaftabalam.ccna.R;
import com.mdaftabalam.ccna.model.GuideModel;

import java.util.ArrayList;
import java.util.List;

public class GuideAdapter extends RecyclerView.Adapter<GuideAdapter.HolderView> {

    private List<GuideModel> guideList;
    private Context context;

    public GuideAdapter(List<GuideModel> guideList, Context context) {
        this.guideList = guideList;
        this.context = context;
    }

    @Override
    public HolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_guide, parent, false);
        return new HolderView(layout);
    }

    @Override
    public void onBindViewHolder(HolderView holder, final int position) {
        holder.v_question.setText(guideList.get(position).getQuestion());
        holder.v_answer.setText(guideList.get(position).getAnswer());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "click on" + guideList.get(position).getQuestion(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return guideList.size();
    }

    public void SearchView(List<GuideModel> itemList) {
        guideList = new ArrayList<>();
        guideList.addAll(itemList);
        notifyDataSetChanged();
    }

    class HolderView extends RecyclerView.ViewHolder {
        TextView v_question;
        TextView v_answer;

        HolderView(View itemView) {
            super(itemView);
            v_question = itemView.findViewById(R.id.question);
            v_answer = itemView.findViewById(R.id.answer);
        }
    }
}
