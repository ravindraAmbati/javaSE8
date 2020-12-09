package designPatterns.factory;

import static designPatterns.factory.Shape.RECTANGLE;
import static designPatterns.factory.Shape.SQUARE;

public class ShapeFactory {

    static void measure(Shape shape) {
        drawShape(shape);
    }

    private static void drawShape(Shape shape) {
        if (RECTANGLE.equals(shape.getType())) {
            Rectangle.draw();
            Rectangle.calcArea(3, 4);
            Rectangle.calcPerimeter(3, 4);
        }
        if (SQUARE.equals(shape.getType())) {
            Square.draw();
            Square.calcArea(5);
            Square.calcPerimeter(5);
        }
    }
}
