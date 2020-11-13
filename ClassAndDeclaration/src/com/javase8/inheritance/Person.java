package com.javase8.inheritance;

public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private char gender;
    private Address address;
    private ContactInfo contactInfo;

    public Person(long id, String firstName, String lastName, char gender, Address address, ContactInfo contactInfo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
