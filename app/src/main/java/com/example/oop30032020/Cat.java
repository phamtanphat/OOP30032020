package com.example.oop30032020;

public class Cat extends Animal{
    public Cat( String name , int weight){
        super( name, weight);
    }

    @Override
    public String info() {
        return "Meo : " + super.getName() + "\n" + "Cân nặng : " + super.getWeight();
    }
}
