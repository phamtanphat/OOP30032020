package com.example.oop30032020;

public class Animal {
    // Viết gì ở đây
    // 2 phần
    // Phần số 1 : Thuộc tính
    String name;
    int weight;

    // Phương thúc khởi tạo rỗng
    // Constructor
    public Animal(String name , int weight){
        this.name = name;
        this.weight = weight;
    }


    // Phần số 2 : Phương thức (Chức năng của class này hỗ trợ người dùng)
    public String info(){
        return "Tên con vật : " + name + "\n" + "Cân nặng : " + weight;
    }

}
