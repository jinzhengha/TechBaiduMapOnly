package com.ecar.ecarbaidumaponly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.baidu.mapapi.model.LatLng;
import com.ecar.baidumaplib.maputil.MapUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng pt1 = new LatLng(22.573328, 113.874083);
                LatLng pt2 = new LatLng(22.578232, 113.875233);

                //吊起百度导航的方法
                MapUtil.openNavigation(pt1,pt2,"广东省深圳市宝安区宝源路","深圳市宝安区西乡街道永丰综合楼",MainActivity.this);
            }
        });
    }
}