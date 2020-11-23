package com.javase8.programs;

public class Measurement {

    public static final double PI = 3.14d;
    public static final double HALF = 0.5;

    public static void main(String[] args) {
        System.out.println("Measurement");
        System.out.println(calcAreaOfSquare(5.0d));
        System.out.println(calcAreaOfRectangle(3d, 2d));
        System.out.println(calcAreaOfTriangle(5d, 12d));
        System.out.println(calcAreaOfCircle(3d));
        System.out.println(calcPerimeterOfSquare(5d));
        System.out.println(calcPerimeterOfRectangle(3d, 2d));
        System.out.println(calcPerimeterOfTriangle(5d, 12d, 10d));
        System.out.println(calcPerimeterOfCircle(3d));
    }

    private static double calcPerimeterOfCircle(double r) {
        return 2 * PI * r;
    }

    private static double calcPerimeterOfTriangle(double s1, double s2, double s3) {
        return s1 + s2 + s3;
    }

    private static double calcPerimeterOfRectangle(double l, double b) {
        return 2 * (l + b);
    }

    private static double calcPerimeterOfSquare(double s) {
        return 4 * s;
    }

    private static double calcAreaOfCircle(double r) {
        return Math.pow(r, 2) * PI;
    }

    private static double calcAreaOfTriangle(double b, double h) {
        return (b * h) * HALF;
    }

    private static double calcAreaOfRectangle(double l, double b) {
        return l * b;
    }

    private static double calcAreaOfSquare(double s) {
        return s * s;
    }
}
