package com.example.wangnj.dragger2test.entity;

/**
 * Created by wang.nj on 2017/11/20.
 */

public class RetrofitManager {
    private OkHttpClient client;

    public RetrofitManager(OkHttpClient client) {
        this.client = client;
    }

    public OkHttpClient getClient() {
        return client;
    }
}
