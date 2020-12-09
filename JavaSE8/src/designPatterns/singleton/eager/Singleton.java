package designPatterns.singleton.eager;

public class Singleton {

    // make an instance at class level
    public static Singleton instance = new Singleton();

    // restrict constructor for outside class to create new objects
    private Singleton() {
        System.out.println("New instance has been created");
    }

    // allow to create new objects only through only static method
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
