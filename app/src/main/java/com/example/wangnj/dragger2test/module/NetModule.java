package com.example.wangnj.dragger2test.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wang.nj on 2017/11/20.
 */

@Module
public class NetModule {
    String url;

    public NetModule(String url){
        this.url = url;
    }

    @Provides
    @Singleton
    SharedPreferences provideSharedPrefernces(Application application){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @Singleton
    Cache provideCache(Application application){
        int cacheSize = 10*1024*1024;
        Cache cache = new Cache(application.getCacheDir(),cacheSize);
        return cache;
    }

    @Provides
    @Singleton
    Gson provideGson(){
        GsonBuilder builder = new GsonBuilder();
        builder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return builder.create();
    }

    @Provides @Named("cache")
    @Singleton
    OkHttpClient provideOkHttpClient(Cache cache){
        OkHttpClient client = new OkHttpClient.Builder().
                cache(cache).
                build();
        return client;
    }

    @Provides @Named("NOCache")
    @Singleton
    OkHttpClient provideOkHttpClient1(){
        OkHttpClient client = new OkHttpClient.Builder().build();
        return client;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(Gson gson,@Named("cache") OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(url)
                .client(client)
                .build();
        return retrofit;
    }
}
