package com.javase8.classAndObject;

public class Person {
    // this is an example for default constructor and parameterized constructor
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
        System.out.println("Name:   " + this.getClass().getName());
        System.out.println("CanonicalName:  " + this.getClass().getCanonicalName());
        System.out.println("SimpleName: " + this.getClass().getSimpleName());
    }

    public Person(long id) {
        this.id = id;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(long id, String firstName, String lastName, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public static void main(String[] args) {
        System.out.println("com.javase8.classAndObject.Person");
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
        System.out.println("com.javase8.classAndObject.Person object p2");
        System.out.println(p2.id);
        System.out.println(p2.firstName);
        System.out.println(p2.lastName);
        System.out.println(p2.gender);

        Person p3 = new Person(963258741);
        System.out.println("com.javase8.classAndObject.Person object p3");
        System.out.println(p3.id);
        System.out.println(p3.firstName);
        System.out.println(p3.lastName);
        System.out.println(p3.gender);

        Person p4 = new Person("Java", "SE8");
        System.out.println("com.javase8.classAndObject.Person object p4");
        System.out.println(p4.id);
        System.out.println(p4.firstName);
        System.out.println(p4.lastName);
        System.out.println(p4.gender);

        Person p5 = new Person(25986314, "firstPerson", "secondPerson", 'M');
        System.out.println("com.javase8.classAndObject.Person object p5");
        System.out.println(p5.id);
        System.out.println(p5.firstName);
        System.out.println(p5.lastName);
        System.out.println(p5.gender);

        Person p6 = new Person();
        System.out.println("P6 is a class field of type com.javase8.classAndObject.Person");
        System.out.println(p6);
        System.out.println(p6.toString());
        System.out.println(p6.id);
        System.out.println(p6.firstName);
        System.out.println(p6.lastName);
        System.out.println(p6.gender);
    }

    @Override
    public String toString() {
        return "com.javase8.classAndObject.Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
