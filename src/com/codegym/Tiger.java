package com.codegym;

public class Tiger extends Animal {

    public Tiger(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("toi co the noi rat to.");
    }

    public String speak(String str) {
        return str;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + " Color:" + getColor();
    }

}
