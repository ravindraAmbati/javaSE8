package com.javase8.abstraction;

public class Hatchback extends Car{

    Hatchback(){
        System.out.println("Hatchback object is created");
    }
    @Override
    public void dimensions() {
        System.out.println("Length is less than 4 mts");
    }
}
