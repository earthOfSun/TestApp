package com.earthsun.testapp;

import android.app.Application;
import android.content.Context;

public class TestApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        getContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
