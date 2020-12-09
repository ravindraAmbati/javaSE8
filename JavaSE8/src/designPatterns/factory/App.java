package designPatterns.factory;

public class App {
    public static void main(String[] args) {

        System.out.println("App");

        Shape rectangle = new Rectangle();
        Shape square = new Square();

        ShapeFactory.measure(rectangle);
        ShapeFactory.measure(square);
    }
}
