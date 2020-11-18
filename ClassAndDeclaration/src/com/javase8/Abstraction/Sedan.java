package com.javase8.Abstraction;

public class Sedan extends Car{

    Sedan(){
        System.out.println("Sedan_SUV object is created");
    }
    @Override
    public void dimensions() {
        System.out.println("Length is more than 4 mts");
    }
}
