package com.example.yf.yanfeng190218.model;

import com.example.yf.yanfeng190218.network.OkHttp;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class Model implements IModel{
    @Override
    public void GetData(String url, Callback callback) {
        OkHttp.Get(url, new okhttp3.Callback() {
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
