package com.deilsky.simple.ronetworksimple.base;

import android.app.Application;
import android.content.Context;

import com.deilsky.network.Contract;
import com.deilsky.network.RoContract;

/**
 * Created by 帷幕 on 2017/10/9.
 */
public class App extends Application {
    private static App instance;
    public Context appContext;
    private static final String TAG = "App";


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appContext = this;

        Contract contract = Contract.create().
                service("http://xxx.xxx.xxx.xxx:xxxx/api/").sources("http://xxx.xxx.xxx.xxx:xxxx/").print(true);
        RoContract.create(contract);


    }


}

