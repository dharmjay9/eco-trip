package com.myecotrip.myecotrip.aboutus;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;

import java.util.List;

/**
 * Created by akash on 10/9/17.
 */

public class AboutDataAdapter extends RecyclerView.Adapter<AboutDataAdapter.AboutViewHolder> {

    private List<AboutData> aboutDataList;
    private Context mContext;

    public AboutDataAdapter(Context mContext, List<AboutData> aboutDataList) {
        this.aboutDataList = aboutDataList;
        this.mContext = mContext;
    }

    @Override
    public AboutViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_data_about_us, parent, false);
        return new AboutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AboutViewHolder holder, int position) {
        AboutData aboutData = aboutDataList.get(position);
        holder.tv_AboutTitle.setText(aboutData.getTitle());
        holder.tv_AboiutDescription.setText(aboutData.getDescription());
    }

    @Override
    public int getItemCount() {
        return aboutDataList== null ? 0 : aboutDataList.size();
    }

    public class AboutViewHolder extends RecyclerView.ViewHolder{
        TextView tv_AboutTitle, tv_AboiutDescription;
        public AboutViewHolder(View itemView) {
            super(itemView);
            tv_AboutTitle = (TextView) itemView.findViewById(R.id.tv_about_title);
            tv_AboiutDescription = (TextView) itemView.findViewById(R.id.tv_about_desc);
        }
    }
}
