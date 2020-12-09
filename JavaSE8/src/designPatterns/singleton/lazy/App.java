package designPatterns.singleton.lazy;

public class App {
    public static void main(String[] args) {
        System.out.println("App");
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        Singleton object3 = Singleton.getInstance();
        Singleton object4 = Singleton.getInstance();
        Singleton object5 = Singleton.getInstance();
        Singleton object6 = Singleton.getInstance();
        System.out.println(object5);
        System.out.println(object6);
        System.out.println(object1.equals(object2));
        System.out.println(object3 == object4);
    }
}
