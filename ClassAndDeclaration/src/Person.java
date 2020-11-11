public class Person {
// this is an example for default constructor
    private long id;
    private String firstName;
    private String lastName;
    private char gender;

    public Person() {
        System.out.println("Default Constructor");
        id = 999999999;
        firstName = "defaultFirstName";
        lastName = "defaultLastName";
        gender = 'z';
    }
    public static void main(String[] args) {
        System.out.println("Person");
        Person p1 = new Person();
        System.out.println("Before");
        System.out.println(p1.id);
        System.out.println(p1.firstName);
        System.out.println(p1.lastName);
        System.out.println(p1.gender);
        p1.id = 123456789;
        p1.firstName = "firstName";
        p1.lastName = "lastName";
        p1.gender = 'M';
        System.out.println("After");
        System.out.println(p1.id);
        System.out.println(p1.firstName);
        System.out.println(p1.lastName);
        System.out.println(p1.gender);

        Person p2 = new Person();
        System.out.println("Person object p2");
        System.out.println(p2.id);
        System.out.println(p2.firstName);
        System.out.println(p2.lastName);
        System.out.println(p2.gender);
    }

}
