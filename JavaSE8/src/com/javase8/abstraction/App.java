package com.javase8.abstraction;

public class App {

    public static void main(String[] args) {
        System.out.println("App");

//        Car car = new Car();
        Car car = new Hatchback();
        car.start();
        car.move();
        car.stop();
        System.out.println("car");
        System.out.println(car instanceof Car);
        System.out.println(car instanceof Vehicle);
//        System.out.println(car instanceof Bike);

        Bike bike = new Bike();
        bike.start();
        bike.move();
        bike.stop();
        System.out.println("bike");
//        System.out.println(bike instanceof Car);
        System.out.println(bike instanceof Vehicle);
        System.out.println(bike instanceof Bike);

//        Vehicle vehicle1 = new Car();
        Vehicle vehicle1 = new Sedan();
        vehicle1.start();
        vehicle1.move();
        vehicle1.stop();
        System.out.println("vehicle1");
        System.out.println(vehicle1 instanceof Car);
        System.out.println(vehicle1 instanceof Vehicle);
        System.out.println(vehicle1 instanceof Bike);

        Vehicle vehicle2 = new Bike();
        vehicle2.start();
        vehicle2.move();
        vehicle2.stop();
        System.out.println("vehicle2");
        System.out.println(vehicle2 instanceof Car);
        System.out.println(vehicle2 instanceof Vehicle);
        System.out.println(vehicle2 instanceof Bike);

        System.out.println("---SUV---");

        Vehicle suvVehicle = new SUV();
        suvVehicle.start();
        suvVehicle.move();
        suvVehicle.stop();
        System.out.println("suvVehicle");
        System.out.println(suvVehicle instanceof Car);
        System.out.println(suvVehicle instanceof Vehicle);
        System.out.println(suvVehicle instanceof SUV);

        Car suvCar = new SUV();
        suvCar.start();
        suvCar.move();
        suvCar.stop();
        System.out.println("suvCar");
        System.out.println(suvCar instanceof Car);
        System.out.println(suvCar instanceof Vehicle);
        System.out.println(suvCar instanceof SUV);

        SUV suv = new SUV();
        suv.start();
        suv.move();
        suv.stop();
        System.out.println("suv");
        System.out.println(suv instanceof Car);
        System.out.println(suv instanceof Vehicle);
        System.out.println(suv instanceof SUV);

        System.out.println("---COMPACT_SUV---");

        Vehicle compactSuvVehicle = new CompactSUV();
        compactSuvVehicle.start();
        compactSuvVehicle.move();
        compactSuvVehicle.stop();
        compactSuvVehicle.dimensions();
        System.out.println("compactSuvVehicle");
        System.out.println(compactSuvVehicle instanceof Vehicle);
        System.out.println(compactSuvVehicle instanceof Car);
        System.out.println(compactSuvVehicle instanceof SUV);
        System.out.println(compactSuvVehicle instanceof CompactSUV);

        Car compactSuvCar = new CompactSUV();
        compactSuvCar.start();
        compactSuvCar.move();
        compactSuvCar.stop();
        compactSuvCar.dimensions();
        System.out.println("compactSuvCar");
        System.out.println(compactSuvCar instanceof Vehicle);
        System.out.println(compactSuvCar instanceof Car);
        System.out.println(compactSuvCar instanceof SUV);
        System.out.println(compactSuvCar instanceof CompactSUV);

        SUV compactSUV_suv = new CompactSUV();
        compactSUV_suv.start();
        compactSUV_suv.move();
        compactSUV_suv.stop();
        compactSUV_suv.dimensions();
        System.out.println("compactSUV_suv");
        System.out.println(compactSUV_suv instanceof Vehicle);
        System.out.println(compactSUV_suv instanceof Car);
        System.out.println(compactSUV_suv instanceof SUV);
        System.out.println(compactSUV_suv instanceof CompactSUV);

        CompactSUV compactSUV = new CompactSUV();
        compactSUV.start();
        compactSUV.move();
        compactSUV.stop();
        compactSUV.dimensions();
        System.out.println("compactSUV");
        System.out.println(compactSUV instanceof Vehicle);
        System.out.println(compactSUV instanceof Car);
        System.out.println(compactSUV instanceof SUV);
        System.out.println(compactSUV instanceof CompactSUV);
    }

}
