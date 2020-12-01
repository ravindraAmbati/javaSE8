package com.javase8.exceptions.custom;

public class App {
    public static void main(String[] args) throws InvalidNameException, InvalidAgeException {
        System.out.println("App");
        Person person1 = new Person("name", 25, "9630258741");
        System.out.println(person1);

        Person person2 = new Person("person2person2person2person2person2person2person2person2person2", 25, "9630258741");
        System.out.println(person2);

        Person person3 = new Person("name", 0, "9630258741");
        System.out.println(person3);

        Person person4 = new Person("name", 130, "9630258741");
        System.out.println(person4);

        Person person5 = new Person("name", 30, "96302587412314567890");
        System.out.println(person5);

        Person person6 = new Person("name", 30, "89465");
        System.out.println(person6);

        Person person7 = new Person("name", 30, "CA96302587410");
        System.out.println(person7);
    }
}
