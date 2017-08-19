package com.myecotrip.myecotrip.listing;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myecotrip.myecotrip.R;

/**
 * Created by Gopal kumar on 30-05-2017.
 */

public class ListingAdapter extends RecyclerView.Adapter<ListingAdapter.ListingViewHolder>{
    @Override
    public ListingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_listing,parent,false);
        return new ListingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class ListingViewHolder extends RecyclerView.ViewHolder {
        public ListingViewHolder(View itemView) {
            super(itemView);
        }
    }
}
