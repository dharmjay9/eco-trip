package com.myecotrip.myecotrip.listing.newListing;

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
import android.widget.Toast;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.base.BaseFragment;
import com.myecotrip.myecotrip.network.ErrorCodes;
import com.myecotrip.myecotrip.network.MyEcoTripCallBack;


/**
 * Created by divum on 13/2/17.
 */

public class ListingFragment extends BaseFragment {

    private Activity mActivity;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dash_board, container, false);
        progressBar= (ProgressBar) view.findViewById(R.id.progressBar);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvCommon);
        return view;
    }

    public void getData(String id, final String type) {

        SubCategoryRequest subCategoryRequest = new SubCategoryRequest();
        subCategoryRequest.setCategory_id(id);
        restClient.getSubCategory(subCategoryRequest, new MyEcoTripCallBack<SubCategoryRowData>() {
            @Override
            public void onFailure(String s, ErrorCodes errorCodes) {
                Toast.makeText(getContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSuccess(SubCategoryRowData subCategoryRowData) {
                DashBoardAdapter dashBoardAdapter = new DashBoardAdapter(getActivity(), subCategoryRowData.getContent(),type);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                recyclerView.setAdapter(dashBoardAdapter);
                progressBar.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);
            }
        });
    }
}
