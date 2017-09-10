package com.myecotrip.myecotrip.details.ecoTrail;

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
import com.squareup.picasso.Picasso;

import java.util.List;
import static com.myecotrip.myecotrip.details.ecoTrail.EcoDetailsResponse.ContentBean.TrailsBean;

/**
 * Created by Gopal kumar on 16-07-2017.
 */

public class EcoTrailDetailsAdapter extends RecyclerView.Adapter<EcoTrailDetailsAdapter.EcotrailViewHolder> {

    private List<TrailListingRowData.ContentBean> list;
    private Context context;
    private String campId;

    public EcoTrailDetailsAdapter(String campid, List<TrailListingRowData.ContentBean> list, Context context){
        this.list=list;
        this.context=context;
        this.campId=campid;
    }

    @Override
    public EcotrailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_trail_list,parent,false);
        return new EcotrailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EcotrailViewHolder holder, int position) {

        TrailListingRowData.ContentBean trailsBean=list.get(position);
        holder.tvTrail.setText(trailsBean.getName());
        holder.tvDistance.setText(trailsBean.getDistance()+" Km");
        holder.tvTrailTime.setText(trailsBean.getHours()+" H");
        holder.tvTrailType.setText(trailsBean.getType());
        holder.tvDetails.setText(trailsBean.getDescription());
        Picasso.with(context).load(CommonUtils.getImageUrl(trailsBean.getLogo())).placeholder(R.drawable.icon_placeholder).into(holder.ivTrail);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class EcotrailViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTrail,tvTrailType,tvTrailTime,tvDistance,tvDetails;
        private ImageView ivTrail;

        public EcotrailViewHolder(View itemView) {
            super(itemView);
            ivTrail= (ImageView) itemView.findViewById(R.id.ivTrail);
            tvTrail= (TextView) itemView.findViewById(R.id.tvTitle);
            tvDistance= (TextView) itemView.findViewById(R.id.tvDistance);
            tvTrailTime= (TextView) itemView.findViewById(R.id.tvTime);
            tvTrailType= (TextView) itemView.findViewById(R.id.tvTrailType);
            tvDetails= (TextView) itemView.findViewById(R.id.tvDetails);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(context,TrailDetailsActivity.class);
                    intent.putExtra("k",list.get(getAdapterPosition()));
                    intent.putExtra("k1",campId);
                    context.startActivity(intent);
                }
            });
        }
    }
}
