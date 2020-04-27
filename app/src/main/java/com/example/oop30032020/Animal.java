package com.example.oop30032020;

public class Animal {
    // Viết gì ở đây
    // 2 phần
    // Phần số 1 : Thuộc tính
    private String name;
    private int weight;
    static String category = "Animal";

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String info(){
        return "Tên con vật : " + name + "\n" + "Cân nặng : " + weight;
    }

    // Phim generate code : alt + insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
