package com.example.wangnj.dragger2test.module;

import com.example.wangnj.dragger2test.entity.OkHttpClient;
import com.example.wangnj.dragger2test.entity.RetrofitManager;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wang.nj on 2017/11/20.
 */

@Module
public class HttpActivityModule {
    private int cacheSize;

    public HttpActivityModule(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    @Provides@Named("none_cache")
    OkHttpClient privodeOkHttpClient(){
        return new OkHttpClient();
    }
    @Provides@Named("cached")
    OkHttpClient provideOkHttpClient1(){
        OkHttpClient client = new OkHttpClient();
        client.setCacheSize(cacheSize);
        return client;
    }
    @Provides
    RetrofitManager provideRetrofitManager(@Named("none_cache") OkHttpClient client){
        return  new RetrofitManager(client);
    }
}
