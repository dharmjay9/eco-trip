package com.myecotrip.myecotrip.details;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gopal kumar on 08-06-2017.
 */

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder> {

    private List<String> list;

    public ActivityAdapter(Context context){
        list=new ArrayList<>();
        list.add("Wildlife safari");
        list.add("Trekking");
        list.add("Birding");
        list.add("Rafting");
    }
    @Override
    public ActivityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_activities,parent,false);
        return new ActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ActivityViewHolder holder, int position) {
        holder.tvActivity.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ActivityViewHolder extends RecyclerView.ViewHolder {
        TextView tvActivity;
        public ActivityViewHolder(View itemView) {
            super(itemView);
            tvActivity= (TextView) itemView.findViewById(R.id.tvActivity);
        }
    }
}
