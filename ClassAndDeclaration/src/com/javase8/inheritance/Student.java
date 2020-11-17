package com.javase8.inheritance;

import java.time.LocalDate;
import java.time.Period;

public class Student extends Person {

    private int grade;
    private float gpa;

    public Student(long id, String firstName, String lastName, char gender, Address address, ContactInfo contactInfo, int grade, float gpa) {
        super(id, firstName, lastName, gender, address, contactInfo);
        this.grade = grade;
        this.gpa = gpa;
    }

    @Override
    void calAge() {
        System.out.println("calAge from Student");
        Period age = Period.between(this.getDob(), LocalDate.now());
        System.out.println("The Calculated Age is " + age.getYears() + " year(s) " + age.getMonths() + " month(s) ");
        this.id = 123;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", gpa=" + gpa +
                "} " + super.toString();
    }
}
