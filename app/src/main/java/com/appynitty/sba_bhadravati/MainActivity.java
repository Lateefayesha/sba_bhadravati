package com.appynitty.sba_bhadravati;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.appynitty.swachbharatabhiyanlibrary.activity.SplashScreenActivity;
import com.appynitty.swachbharatabhiyanlibrary.pojos.LanguagePojo;
import com.appynitty.swachbharatabhiyanlibrary.utils.AUtils;
import com.pixplicity.easyprefs.library.Prefs;
import com.riaylibrary.utils.LocaleHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected void attachBaseContext(Context base) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            super.attachBaseContext(LocaleHelper.onAttach(base, AUtils.LanguageConstants.MARATHI));
        } else {
            super.attachBaseContext(base);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Prefs.putString(AUtils.APP_ID, "1003");
        Prefs.putInt(AUtils.VERSION_CODE, BuildConfig.VERSION_CODE);

        initLanguageList();

        startActivity(new Intent(MainActivity.this, SplashScreenActivity.class));

    }

    private void initLanguageList() {

        ArrayList<LanguagePojo> languagePojos = new ArrayList<>();

        LanguagePojo eng = new LanguagePojo();
        eng.setLanguage(AUtils.LanguageNameConstants.ENGLISH);
        eng.setLanguageId(AUtils.LanguageIDConstants.ENGLISH);
        languagePojos.add(eng);

        LanguagePojo mar = new LanguagePojo();
        mar.setLanguageId(AUtils.LanguageIDConstants.MARATHI);
        mar.setLanguage(AUtils.LanguageNameConstants.MARATHI);
        languagePojos.add(mar);

        AUtils.setLanguagePojoList(languagePojos);

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
