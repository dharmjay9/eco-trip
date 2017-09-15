package com.myecotrip.myecotrip.orderSummary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;

import java.util.List;


public class OrderSummaryAdapter extends RecyclerView.Adapter<OrderSummaryAdapter.OrderViewHolder> {

    private List<OrderSummaryData> list;
    private Context context;

    public OrderSummaryAdapter(Context context,List<OrderSummaryData> list){
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

        OrderSummaryData orderSummaryData=list.get(position);
        holder.tvTitle.setText(orderSummaryData.getTitle());
        holder.tvSubTitle.setText(orderSummaryData.getSubTitle());
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
