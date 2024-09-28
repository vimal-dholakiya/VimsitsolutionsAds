package com.vimsitsolutions.ads;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;



import java.util.concurrent.Callable;

public class MainActivity extends BaseActivity {


    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);


        withDelay(3000, new Callable<Void>() {
            @Override
            public Void call() throws Exception {

                return null;

            }
        });

    }
    public void Inter1(View view) {
        showInterstitialAd(this, new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Toast.makeText(MainActivity.this, "Inter1Dismissed", Toast.LENGTH_SHORT).show();
                return null;
            }
        });
    }





    public void showBanner(View view) {
        showBannerAd();
    }

    public void showNative(View view) {
        showNativeAd(true);
    }
    public void showNative1(View view) {
        showNativeAd(false);
    }










}