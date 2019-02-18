package com.example.yf.yanfeng190218.presenter;

import com.example.yf.yanfeng190218.MainActivity;
import com.example.yf.yanfeng190218.api.Api;
import com.example.yf.yanfeng190218.fragment.FragmentOne;
import com.example.yf.yanfeng190218.model.IModel;
import com.example.yf.yanfeng190218.model.Model;

public class Presenter implements IPresenter {
    FragmentOne fragmentOne;
    private final Model model;

    public Presenter(FragmentOne fragmentOne) {
        this.fragmentOne = fragmentOne;
        model = new Model();
    }
    @Override
    public void DataPre() {
        model.GetData(Api.Show, new IModel.Callback() {
            @Override
            public void Success(String data) {
                fragmentOne.getdata(data);
            }

            @Override
            public void Lose() {

            }
        });
    }


}
