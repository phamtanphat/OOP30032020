package com.example.oop30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

//        Animal meo = new Animal();

//        Log.d("BBB",meo.name);
//        Button button = new Button(this);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                this.onClick();
//            }
//        });
//        reference
        // Tham chiếu : liên quan về kiểu dữ liệu object khi truyền thì truyền tham chiếu
        // Tham trị : liên quan về kiểu dữ liệu nguyên thủy khi truyền thì truyền tham trị
    }
//    public void showAge(Animal meo){
//        Toast.makeText(this, age + "", Toast.LENGTH_SHORT).show();
//    }
}
