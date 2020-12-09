package designPatterns.singleton.example;

public class DBConnection {

    // make an instance at class level
    public static DBConnection instance;

    // restrict constructor for outside class to create new objects
    private DBConnection() {
        System.out.println("New db connection has been established");
    }

    // allow to create new objects only through only static method
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
