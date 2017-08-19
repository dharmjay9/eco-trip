package com.myecotrip.myecotrip.details.birdSanactury;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;

import java.util.ArrayList;
import java.util.List;
import static com.myecotrip.myecotrip.details.birdSanactury.BirdSanacturyResponse.ContentBean.ActivitiesBean;

/**
 * Created by Gopal kumar on 08-06-2017.
 */

public class SanacturyActivityAdapter extends RecyclerView.Adapter<SanacturyActivityAdapter.ActivityViewHolder> {

    private List<ActivitiesBean> list;
    private Context context;

    public SanacturyActivityAdapter(List<ActivitiesBean> list,Context context){
       this.list=list;
        this.context=context;
    }
    @Override
    public ActivityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sanactury_activities,parent,false);
        return new ActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ActivityViewHolder holder, int position) {

        ActivitiesBean activitiesBean=list.get(position);
        holder.tvTitle.setText(Html.fromHtml(activitiesBean.getActivity_name()));
        holder.tvSubTitle.setText(Html.fromHtml(activitiesBean.getActivity_description()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ActivityViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle,tvSubTitle;
        public ActivityViewHolder(View itemView) {
            super(itemView);
            tvTitle= (TextView) itemView.findViewById(R.id.tvTitle);
            tvSubTitle= (TextView) itemView.findViewById(R.id.tvSubTitle);
        }
    }
}
