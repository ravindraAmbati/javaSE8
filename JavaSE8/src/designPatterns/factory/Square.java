package designPatterns.factory;

public class Square implements Shape {

    public static void draw() {
        System.out.println("Square");
    }


    public static void calcArea(double s) {
        System.out.println(s * s);
    }


    public static void calcPerimeter(double s) {
        System.out.println(4 * s);
    }


    public String getType() {
        return SQUARE;
    }
}
