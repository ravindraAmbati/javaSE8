package com.javase8.inheritance;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    protected long id;
    private String firstName;
    private String lastName;
    private char gender;
    private Address address;
    private ContactInfo contactInfo;
    private LocalDate dob;
    private int age;

    public Person(){

    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
        calAge();
    }

    /*final*/ void calAge() {
        System.out.println("calAge from Person");
        Period age = Period.between(this.getDob(),LocalDate.now());
        System.out.println("The Calculated Age is " + age.getYears() + " year(s) " + age.getMonths() + " month(s) " + age.getDays() + " day(s)");
    }


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
