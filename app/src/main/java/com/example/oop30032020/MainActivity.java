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

//        Animal meo = new Animal("Con mèo", 2);
//        meo.setName("");
//        Log.d("BBBB",meo.getName());
//        Cat meo1 = new Cat("Meo 1",2);
//        Log.d("BBB",meo1.info() + "");
        //Overload : Nạp chồng phương thức
//            + Vị trí : 2 phương thức nằm cùng trên class
//            + Thường gặp khi người ta muốn viết cho hàm có thể xử lý nhìu chức năng
        //Overide : Ghi đè phương thức
//            + Vị trí : 2 phương thức này nằm ở 2 class khác nha
//            + Thường gặp khi lớp con kế thừa và tự viết lại thân hàm từ phương thức của lớp cha
    }
    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void showToast(int resId){
        Toast.makeText(this, (resId) + "", Toast.LENGTH_SHORT).show();
    }

}
