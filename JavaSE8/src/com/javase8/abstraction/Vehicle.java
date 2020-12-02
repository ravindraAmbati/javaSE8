package com.javase8.abstraction;

public interface Vehicle {

    // by default fields in interface are static and final
    String CONSTANT = "VEHICLE";

    void start();

    void move();

    void stop();

    void dimensions();
}
