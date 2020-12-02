package com.javase8.abstraction;

public class Bike implements Vehicle{
    // IS-A: Bike IS-A Vehicle

    Bike(){
        System.out.println("Bike object is created");
        System.out.println(CONSTANT);
    }
    @Override
    public void start() {
        System.out.println("Bike is started");
    }

    @Override
    public void move() {
        System.out.println("Bike is moving");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopped");
    }

    @Override
    public void dimensions() {
        System.out.println("Not Supported");
    }
}
