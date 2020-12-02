package com.javase8.abstraction;

public abstract class Car implements Vehicle{
// IS-A: Car IS-A Vehicle

    Car(){
        System.out.println("Car object is created");
    }
    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("car is stopped");
    }

}
