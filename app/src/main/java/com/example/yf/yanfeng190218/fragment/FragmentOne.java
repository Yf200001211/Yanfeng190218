package com.example.yf.yanfeng190218.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yf.yanfeng190218.MainActivity;
import com.example.yf.yanfeng190218.R;
import com.example.yf.yanfeng190218.adapter.MyAdapter;
import com.example.yf.yanfeng190218.bean.Bean;
import com.example.yf.yanfeng190218.presenter.Presenter;
import com.google.gson.Gson;

import java.util.List;

import static android.view.View.inflate;

public class FragmentOne extends Fragment {

    private View view;
    private RecyclerView recycl;
    private Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.one, container, false);
        recycl = view.findViewById(R.id.recycl);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        recycl.setLayoutManager(linearLayoutManager);
        presenter = new Presenter(this);
        presenter.DataPre();
        return view;
    }
    public void getdata(String data) {

        Gson gson = new Gson();
        Bean json = gson.fromJson(data, Bean.class);
        List<Bean.DataBeanX.ExtrasBean.SliderBean> list = json.getData().getExtras().getSlider();
        MyAdapter myAdapter = new MyAdapter(getActivity(),list);
        recycl.setAdapter(myAdapter);
    }
}
