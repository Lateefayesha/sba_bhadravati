package com.appynitty.sba_bhadravati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appynitty.swachbharatabhiyanlibrary.activity.SplashScreenActivity;
import com.appynitty.swachbharatabhiyanlibrary.utils.AUtils;

import quickutils.core.QuickUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuickUtils.prefs.save(AUtils.APP_ID, "1003");
        QuickUtils.prefs.save(AUtils.VERSION_CODE, BuildConfig.VERSION_CODE);

        startActivity(new Intent(MainActivity.this, SplashScreenActivity.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
