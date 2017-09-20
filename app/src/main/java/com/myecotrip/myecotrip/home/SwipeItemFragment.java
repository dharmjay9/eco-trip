package com.myecotrip.myecotrip.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.common.CommonUtils;
import com.myecotrip.myecotrip.listing.ListingActivity;
import com.squareup.picasso.Picasso;

/**
 * Created by Gopal kumar on 06-05-2017.
 */

public class SwipeItemFragment extends Fragment {

    private String mImageId;
    private String title;

    public static SwipeItemFragment getInstance(String imageId, String title) {
        Bundle bundle = new Bundle();
        bundle.putString("imageId", imageId);
        bundle.putString("title", title);
        SwipeItemFragment swipeItemFragment = new SwipeItemFragment();
        swipeItemFragment.setArguments(bundle);
        return swipeItemFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImageId = getArguments().getString("imageId");
            title = getArguments().getString("title");

        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_swipe, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.ivSwipe);
        TextView tvTitle = (TextView) view.findViewById(R.id.tvTitle);
        tvTitle.setVisibility(View.GONE);
        // tvTitle.setText(title);
        if (TextUtils.isEmpty(title))
            Picasso.with(getContext()).load(CommonUtils.getImageUrl(mImageId)).placeholder(R.drawable.icon_placeholder).into(imageView);

        else

        Picasso.with(getContext()).load(mImageId).placeholder(R.drawable.icon_placeholder).into(imageView);
        // imageView.setImageResource(mImageId);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // startActivity(new Intent(getActivity(),OrderHistoryActivity.class));

            }
        });
        return view;
    }
}
