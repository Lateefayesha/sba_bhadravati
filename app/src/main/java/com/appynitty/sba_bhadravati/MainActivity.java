package com.appynitty.sba_bhadravati;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.appynitty.swachbharatabhiyanlibrary.activity.SplashScreenActivity;
import com.appynitty.swachbharatabhiyanlibrary.utils.AUtils;
import com.pixplicity.easyprefs.library.Prefs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Prefs.putString(AUtils.APP_ID, "1003");
        Prefs.putInt(AUtils.VERSION_CODE, BuildConfig.VERSION_CODE);

        startActivity(new Intent(MainActivity.this, SplashScreenActivity.class));

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
