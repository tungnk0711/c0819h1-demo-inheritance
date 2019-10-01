package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tiger tiger = new Tiger("Tiger","yellow");

        tiger.speak();
        String color = tiger.getColor();
        String name = tiger.getName();
        System.out.println(name);
        System.out.println(color);


        String mes = tiger.speak("Alo");
        System.out.println(mes);

        String obj = tiger.toString();
        System.out.println(obj);

        Animal animal1 = new Tiger("Tiger1","Grey");

        Tiger tiger1 = (Tiger) animal1;

        Cat cat = new Cat("a","y",1d);

        System.out.println(animal1 instanceof Tiger);

        Animal animal2 = new Cat("Cat","Yellow", 8d);

    }
}
