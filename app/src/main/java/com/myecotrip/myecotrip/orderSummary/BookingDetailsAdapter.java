/*
package com.myecotrip.myecotrip.orderSummary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.booking.rowData.CheckVaibilityResponse;

import java.util.List;

*/
/**
 * Created by Gopal kumar on 27-07-2017.
 *//*


public class BookingDetailsAdapter extends RecyclerView.Adapter<BookingDetailsAdapter.OrderViewHolder> {

    private List<CheckVaibilityResponse.ContentBean.BillDetailsBean> list;
    private Context context;

    public BookingDetailsAdapter(Context context, List<CheckVaibilityResponse.ContentBean.BillDetailsBean> list){
        this.list=list;
        this.context=context;
    }
    @Override
    public OrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_order_summary, parent, false);
        return new OrderViewHolder(view);

    }

    @Override
    public void onBindViewHolder(OrderViewHolder holder, int position) {
        CheckVaibilityResponse.ContentBean.BillDetailsBean orderSummaryData=list.get(position);
        holder.tvTitle.setText(orderSummaryData.getName());
        holder.tvSubTitle.setText(context.getString(R.string.rsa_url)+" "+orderSummaryData.getValue());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class OrderViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle,tvSubTitle;
        public OrderViewHolder(View itemView) {
            super(itemView);
            tvTitle= (TextView) itemView.findViewById(R.id.tvTitle);
            tvSubTitle= (TextView) itemView.findViewById(R.id.tvSubTitle);
        }
    }
}
*/
