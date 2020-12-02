package com.javase8.abstraction;

public class CompactSUV extends SUV{

//    Vehicle
//            Car
//                 SUV
//                    CompactSUV


    CompactSUV(){
        System.out.println("CompactSUV object is created");
        System.out.println(CONSTANT);
    }

    @Override
    public void dimensions() {
        System.out.println("The length of this CompactSUV is less than 4 mts");
    }

    @Override
    public void start() {
        System.out.println("CompactSUV is started");
    }

    @Override
    public void move() {
        System.out.println("CompactSUV is moving");
    }

    @Override
    public void stop() {
        System.out.println("CompactSUV is stopped");
    }
}
