package designPatterns.singleton.example;

public class App {
    public static void main(String[] args) {
        System.out.println("App");
        DBConnection object1 = DBConnection.getInstance();
        DBConnection object2 = DBConnection.getInstance();
        DBConnection object3 = DBConnection.getInstance();
        DBConnection object4 = DBConnection.getInstance();
        DBConnection object5 = DBConnection.getInstance();
        DBConnection object6 = DBConnection.getInstance();
        System.out.println(object5);
        System.out.println(object6);
        System.out.println(object1.equals(object2));
        System.out.println(object3 == object4);
    }
}
