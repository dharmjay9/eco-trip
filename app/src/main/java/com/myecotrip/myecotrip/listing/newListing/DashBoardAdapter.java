package com.myecotrip.myecotrip.listing.newListing;

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
import com.myecotrip.myecotrip.details.DetailsActivity;
import com.myecotrip.myecotrip.details.birdSanactury.BirdSanacturyDetailsActivity;
import com.myecotrip.myecotrip.details.ecoTrail.EcoTrailListingActivity;
import com.myecotrip.myecotrip.details.ecoTrail.EcotrailsDetailsActivity;
import com.myecotrip.myecotrip.details.jungleStay.JungleStayDetailsActivity;
import com.myecotrip.myecotrip.details.wildSafari.WildSafariDetailsActivity;
import com.myecotrip.myecotrip.home.fargmentHome.CategoryRowData;
import com.myecotrip.myecotrip.home.fargmentHome.FragmentHomeRowData;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by divum on 13/2/17.
 */

public class DashBoardAdapter extends RecyclerView.Adapter<DashBoardAdapter.DashBordViewHolder> {

    private Context mContext;
    private List<SubCategoryRowData.ContentBean> list;
    private String groupName;

    public DashBoardAdapter(Context mContext, List<SubCategoryRowData.ContentBean> list,String groupName) {
        this.mContext = mContext;
        this.list=list;
        this.groupName=groupName;
    }

    @Override
    public DashBordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home_screen, parent, false);
        return new DashBordViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DashBordViewHolder holder, int position) {

        SubCategoryRowData.ContentBean subCategoryRowData=list.get(position);
        String url=CommonUtils.getImageUrl(subCategoryRowData.getLogo());
        Picasso.with(mContext).load(url).placeholder(R.drawable.icon_placeholder).into(holder.ivSafari);
        holder.tvName.setText(subCategoryRowData.getName());
        holder.tvTrailCount.setText(subCategoryRowData.getTrailCount()+ " trails");

        holder.tvComingSoon.setVisibility(View.GONE);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DashBordViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private ImageView ivSafari;
        private TextView tvName,tvTrailCount;
        private TextView tvComingSoon;

        public DashBordViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            ivSafari = (ImageView) view.findViewById(R.id.ivSafari);
            tvName= (TextView) itemView.findViewById(R.id.tvName);
            tvTrailCount= (TextView) itemView.findViewById(R.id.tvTrailCount);
            tvComingSoon= (TextView) itemView.findViewById(R.id.tvComingSoon);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(getAdapterPosition());

                }
            });
        }

        private void startActivity(int position){
            SubCategoryRowData.ContentBean rowData = list.get(position);
            Intent intent=null;
            switch (groupName){
                case "Ecotrails":
                    intent=new Intent(mContext, EcoTrailListingActivity.class);
                    intent.putExtra(EcotrailsDetailsActivity.ECOTRAIL_ID,String.valueOf(rowData.getId()));
                    intent.putExtra(EcotrailsDetailsActivity.ECOTRAIL_NAME,rowData.getName());
                    break;
                case "Bird Sanctuary":
                    intent=new Intent(mContext, BirdSanacturyDetailsActivity.class);
                    intent.putExtra(BirdSanacturyDetailsActivity.BIRD_ID,String.valueOf(rowData.getId()));
                    break;
                case "Jungle Stay":
                    intent=new Intent(mContext, JungleStayDetailsActivity.class);
                    intent.putExtra(JungleStayDetailsActivity.JUNGLE_ID,rowData.getId());
                    break;
                case "Wildlife Safari":
                    intent=new Intent(mContext, WildSafariDetailsActivity.class);
                    intent.putExtra(WildSafariDetailsActivity.WILD_ID,String.valueOf(rowData.getId()));
                    break;
            }
            if(intent!=null)mContext.startActivity(intent);
        }
    }


}
