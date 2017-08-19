package com.myecotrip.myecotrip.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.common.CommonUtils;
import com.myecotrip.myecotrip.common.IDummy;
import com.myecotrip.myecotrip.home.fargmentHome.CategoryRowData;
import com.myecotrip.myecotrip.home.fargmentHome.FragmentHomeRowData;
import com.myecotrip.myecotrip.listing.ListingActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by divum on 13/2/17.
 */

public class HomeGridAdapter extends RecyclerView.Adapter<HomeGridAdapter.DashBordViewHolder> {

    private Context mContext;
    private List<CategoryRowData.ContentBean.CategoriesBean> list;


    public HomeGridAdapter(Context mContext, List<CategoryRowData.ContentBean.CategoriesBean> list) {
        this.mContext = mContext;
        this.list=list;
    }

    @Override
    public DashBordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home_grid, parent, false);
        return new DashBordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DashBordViewHolder holder, int position) {

        CategoryRowData.ContentBean.CategoriesBean  categoriesBean=list.get(position);
        holder.tvTitle.setText(list.get(position).getCategory_name());
       Picasso.with(mContext).load(CommonUtils.getImageUrl(categoriesBean.getImage_url())).placeholder(R.drawable.icon_placeholder).into(holder.ivSafari);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DashBordViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private ImageView ivSafari;
        private TextView tvTitle;

        public DashBordViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            ivSafari = (ImageView) view.findViewById(R.id.ivGrid);
            tvTitle= (TextView) view.findViewById(R.id.tvTitle);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(mContext,ListingActivity.class);
                    intent.putExtra(ListingActivity.K1,String.valueOf(list.get(getAdapterPosition()).getCategory_id()));
                    intent.putExtra(ListingActivity.PARAM_TYPE,String.valueOf(list.get(getAdapterPosition()).getCategory_name()));
                    mContext.startActivity(intent);
                }
            });
        }
    }

}
