package com.example.smothviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BannerView bannerView;
    private BannerViewpagerAdapter pagerAdapter;
    private RelativeLayout rlBanner;
    private int[] pics = new int[]{R.mipmap.banner1,R.mipmap.banner2,R.mipmap.banner3,R.mipmap.banner4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        rlBanner = (RelativeLayout) findViewById(R.id.rl_banner);
        pagerAdapter = new BannerViewpagerAdapter(getApplicationContext(),pics);
        bannerView = new BannerView(getApplicationContext(),pics,pagerAdapter,R.layout.customviewpager);
        rlBanner.addView(bannerView.getBannerView());
    }
}
