package com.example.oop30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // object và class
//        Business : kinh doanh
//                +Địa điểm kinh doanh
//                +Dịch vụ
//                +Cách quảng cáo mô hin
//        Customer : khách
//                +Thông tin cá nhân
//                +Quyền lợi khách hàng
//                +Cộng đồng khách hàng

        Animal meo = new Animal();
    }
}
