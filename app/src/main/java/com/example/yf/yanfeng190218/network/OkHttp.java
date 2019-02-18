package com.example.yf.yanfeng190218.network;

import java.io.IOException;
import java.time.Instant;

import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;

import static okhttp3.internal.Internal.instance;


public abstract class OkHttp extends Internal {

    private static FormBody build;

//    private Interceptor getAppInterceptor() {
//    public Response interceptor(Chain chain){
//        chain.request
//        }
//    }
    public static OkHttp getInstance(){
        if (instance==null)
        {
            synchronized (OkHttp.class){
                if (null==instance){
//                    instance = new OkHttp();
                }
            }
        }
        return (OkHttp) instance;
    }


    public static void Get(String url, okhttp3.Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).method("GET", null).build();
        okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                response.body().string();
            }
        });
    }
    public static void Post(String url,String name,String pwd, okhttp3.Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();
        build = new FormBody.Builder().add("name",name).add("pwd",pwd).build();
        Request request = new Request.Builder().url(url).post(build).method("GET", null).build();
        okHttpClient.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                response.body().string();
            }
        });
    }
}
