package com.myecotrip.myecotrip.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.listing.ListingActivity;

/**
 * Created by Gopal kumar on 06-05-2017.
 */

public class HomeChildAdapter extends RecyclerView.Adapter<HomeChildAdapter.HomeViewHolder> {
    @Override
    public HomeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home_child, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder {
        public HomeViewHolder(final View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context=itemView.getContext();
                    context.startActivity(new Intent(context, ListingActivity.class));
                }
            });

        }
    }
}
