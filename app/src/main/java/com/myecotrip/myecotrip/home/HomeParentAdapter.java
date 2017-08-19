package com.myecotrip.myecotrip.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;

/**
 * Created by Gopal kumar on 06-05-2017.
 */

public class HomeParentAdapter extends RecyclerView.Adapter<HomeParentAdapter.HomeViewHolder> {
    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home_parent, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
        holder.rvChild.setAdapter(new HomeChildAdapter());
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {
        private TextView tvChild;
        private RecyclerView rvChild;
        public HomeViewHolder(View itemView) {
            super(itemView);
            tvChild= (TextView) itemView.findViewById(R.id.tvTitle);
            rvChild= (RecyclerView) itemView.findViewById(R.id.rvHomeChild);
        }
    }
}
