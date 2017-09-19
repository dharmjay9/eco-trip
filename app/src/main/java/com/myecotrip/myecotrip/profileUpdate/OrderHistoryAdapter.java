package com.myecotrip.myecotrip.profileUpdate;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.common.CommonUtils;

import java.util.List;

/**
 * Created by Gopal kumar on 30-05-2017.
 */

public class OrderHistoryAdapter extends RecyclerView.Adapter<OrderHistoryAdapter.ListingViewHolder> {

    private List<OrderHistoryRowData.ConstantBean> list;
    private Context context;

    public OrderHistoryAdapter(List<OrderHistoryRowData.ConstantBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ListingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_history, parent, false);
        return new ListingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListingViewHolder holder, int position) {

        OrderHistoryRowData.ConstantBean constantBean = list.get(position);
        holder.tvBookingId.setText("Booking ID : "+constantBean.getDisplay_id());
        holder.tvStatus.setText(constantBean.getBooking_status());
        holder.tvBookingDate.setText("Booking Date : "+constantBean.getDate_of_booking().split(" ")[0]);
        holder.tvAmountPaid.setText("Total Amount : "+context.getString(R.string.rupes) + constantBean.getAmountWithTax());
        holder.tvCheckInDate.setText("Check In : "+CommonUtils.getDateInFormate(constantBean.getCheckIn()));

        holder.tvBookingPlace.setText("Place: "+constantBean.getTrailName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListingViewHolder extends RecyclerView.ViewHolder {
        private TextView tvBookingId, tvStatus, tvCheckInDate, tvBookingDate, tvAmountPaid,tvBookingPlace;

        public ListingViewHolder(View itemView) {
            super(itemView);
            tvAmountPaid = (TextView) itemView.findViewById(R.id.tvAmountPaid);
            tvStatus = (TextView) itemView.findViewById(R.id.tvStatus);
            tvCheckInDate = (TextView) itemView.findViewById(R.id.tvCheckInDate);
            tvBookingDate = (TextView) itemView.findViewById(R.id.tvBookingDate);
            tvBookingId = (TextView) itemView.findViewById(R.id.tvBookingId);
            tvBookingPlace= (TextView) itemView.findViewById(R.id.tvBookingPlace);
        }

    }

}
