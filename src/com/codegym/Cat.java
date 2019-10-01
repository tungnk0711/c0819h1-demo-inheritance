package com.codegym;

public class Cat extends Animal{

    private Double age;

    public Cat(String name, String color, Double age){
        super(name, color);
        this.age = age;
    }
}
