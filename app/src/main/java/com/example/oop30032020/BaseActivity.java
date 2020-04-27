package com.example.oop30032020;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    protected abstract int layout();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout());
        initView();
        mapView();
        setListenerView();
    }
    protected abstract void initView();
    protected abstract void mapView();
    protected abstract void setListenerView();
}
