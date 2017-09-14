package com.myecotrip.myecotrip.aboutus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.myecotrip.myecotrip.R;
import com.squareup.picasso.Picasso;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AboutUsActivity extends AppCompatActivity {

    private RecyclerView rv_AboutUsContents;
    private List<AboutData> aboutContents;
    private AboutDataAdapter aboutDataAdapter;
    private ImageView iv_ChalangeStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        initView();
    }

    private void initView() {
        rv_AboutUsContents = (RecyclerView)findViewById(R.id.rv_about_contents);
        iv_ChalangeStatus = (ImageView)findViewById(R.id.iv_chalenge_status);
        String statusImage = "https://myecotrip.com/assets/img/ecotrails/abt_h_m_s.png";
        Picasso.with(this).load(statusImage).into(iv_ChalangeStatus);
        setRecyclerView();
    }

    private void setRecyclerView() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rv_AboutUsContents.setLayoutManager(mLayoutManager);
        setUpAboutList();
        aboutDataAdapter = new AboutDataAdapter(this,aboutContents);
        rv_AboutUsContents.setAdapter(aboutDataAdapter);
    }

    private void setUpAboutList() {
        aboutContents = new ArrayList<>();
        AboutData aboutData = new AboutData();
        aboutData.setTitle(getResources().getString(R.string.why));
        aboutData.setDescription(getResources().getString(R.string.desc));
        AboutData aboutData1 = new AboutData();
        aboutData1.setTitle("Trails");
        aboutData1.setDescription("A beginner? A hardened trailblazer or somewhere in between? Pick your trail.");
        aboutContents.add(aboutData);
        aboutContents.add(aboutData1);
    }
}
