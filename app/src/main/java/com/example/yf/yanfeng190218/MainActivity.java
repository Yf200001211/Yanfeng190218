package com.example.yf.yanfeng190218;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.yf.yanfeng190218.adapter.MyAdapter;
import com.example.yf.yanfeng190218.bean.Bean;
import com.example.yf.yanfeng190218.fragment.FragmentOne;
import com.example.yf.yanfeng190218.fragment.FragmentTwo;
import com.google.gson.Gson;
import com.hjm.bottomtabbar.BottomTabBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private BottomTabBar fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = findViewById(R.id.fragment);
        fragment.init(getSupportFragmentManager())
                .setChangeColor(Color.RED,Color.YELLOW)
                .setTabPadding(4,6,10)
                .setImgSize(50,50)
                .addTabItem("首页",R.drawable.ic_launcher_background,FragmentOne.class)
                .addTabItem("我的",R.drawable.ic_launcher_background,FragmentTwo.class)
                .isShowDivider(false);
    }



}
