package com.myecotrip.myecotrip.profileUpdate;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseFragment;
import com.myecotrip.myecotrip.common.MyEcoTripUser;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;



public class OrderHistorryFragment extends BaseFragment {

    private Activity mActivity;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private MyEcoTripUser myEcoTripUser;
    private TextView tvNoItem;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_history, container, false);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvCommon);
        tvNoItem = (TextView) view.findViewById(R.id.tvNoOrder);
        myEcoTripUser = MyEcoTripUser.getInstance(getContext());
        getData();

        return view;
    }

    public void getData() {

        restClient.getOrderHistory(myEcoTripUser.getUserId(), new MyEcoTripCallBack<OrderHistoryRowData>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {
                Toast.makeText(getContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(OrderHistoryRowData subCategoryRowData) {

                if (subCategoryRowData.getConstant().size() == 0) {
                    tvNoItem.setVisibility(View.VISIBLE);
                } else {
                    OrderHistoryAdapter dashBoardAdapter = new OrderHistoryAdapter(subCategoryRowData.getConstant(), getActivity());
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    recyclerView.setAdapter(dashBoardAdapter);
                    recyclerView.setVisibility(View.VISIBLE);
                }
                progressBar.setVisibility(View.GONE);

            }
        });
    }
}
