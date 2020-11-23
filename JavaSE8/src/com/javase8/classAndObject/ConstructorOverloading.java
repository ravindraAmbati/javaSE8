package com.javase8.classAndObject;

public class ConstructorOverloading {

    public ConstructorOverloading(boolean b, String s) {
        System.out.println("two Parameterized com.javase8.classAndObject.ConstructorOverloading()  " + b + " || " + s);
    }

    public ConstructorOverloading(String s, boolean b) {
        System.out.println("two Parameterized com.javase8.classAndObject.ConstructorOverloading()  " + s + " || " + b);
    }

    public static void main(String[] args) {
        System.out.println("com.javase8.classAndObject.ConstructorOverloading");
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading("this is for Obj2");
        ConstructorOverloading obj3 = new ConstructorOverloading(0, 235);
        ConstructorOverloading obj4 = new ConstructorOverloading(false, "235");
        ConstructorOverloading obj5 = new ConstructorOverloading("235", false);
    }

    ConstructorOverloading() {
        System.out.println("Default com.javase8.classAndObject.ConstructorOverloading()");
    }

    ConstructorOverloading(String str) {
        System.out.println("Parameterized com.javase8.classAndObject.ConstructorOverloading()  " + str);
    }

    ConstructorOverloading(int i1, int i2) {
        System.out.println("two Parameterized com.javase8.classAndObject.ConstructorOverloading()  " + i1 + " || " + i2);
    }
}
