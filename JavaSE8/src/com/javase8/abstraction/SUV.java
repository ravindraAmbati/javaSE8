package com.javase8.abstraction;

public class SUV extends Car {

    SUV(){
        System.out.println("SUV object is created");
    }

    @Override
    public void dimensions() {
        System.out.println("Length is more than 4 mts");
    }
}
