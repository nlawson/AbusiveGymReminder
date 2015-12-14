package com.pipit.agc.agc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Eric on 12/12/2015.
 */
public class IntroductionActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction_layout);
        selectFrag();
    }

    public void selectFrag() {
        Fragment fr;
        fr = new IntroFragOpeningMessage();

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_page, fr);
        fragmentTransaction.commit();
    }
}
