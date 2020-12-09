package designPatterns.factory;

public class Rectangle implements Shape {

    public static void draw() {
        System.out.println("Rectangle");
    }


    public static void calcArea(double l, double b) {
        System.out.println(l * b);
    }


    public static void calcPerimeter(double l, double b) {
        System.out.println(2 * (l + b));
    }


    public String getType() {
        return RECTANGLE;
    }
}
