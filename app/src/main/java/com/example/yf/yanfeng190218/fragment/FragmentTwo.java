package com.example.yf.yanfeng190218.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yf.yanfeng190218.MainActivity;
import com.example.yf.yanfeng190218.R;
import com.example.yf.yanfeng190218.adapter.MyAdapter;
import com.example.yf.yanfeng190218.bean.Bean;
import com.google.gson.Gson;

import static android.view.View.inflate;

public class FragmentTwo extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.two, container, false);
        return view;
    }
}
