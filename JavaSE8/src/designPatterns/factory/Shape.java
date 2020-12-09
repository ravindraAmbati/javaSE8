package designPatterns.factory;

public interface Shape {

    // by default
    // public static final
    String RECTANGLE = "R";
    String SQUARE = "S";

    String getType();

}
