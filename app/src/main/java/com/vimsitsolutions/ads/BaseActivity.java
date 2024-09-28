package com.vimsitsolutions.ads;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


import com.newAds2021.adsmodels.AdsPrefernce;
import com.newAds2021.adsmodels.ConstantAds;
import com.newAds2021.adutils.BaseAdsClass;

public class BaseActivity extends BaseAdsClass {
    AdsPrefernce adsPrefernce;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConstantAds.setAdsURL("1QU26d5OsAf-F-wg6gon89T0psGIHThxLDCJvGZFyTmM");

        adsPrefernce = new AdsPrefernce(this);

    }

}
