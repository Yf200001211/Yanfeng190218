package com.example.yf.yanfeng190218.model;

import javax.security.auth.callback.Callback;

public interface IModel {
    void GetData(String url, Callback callback);
    interface Callback{
        void Success(String data);
        void Lose();
    }
}
