package com.javase8.inheritance;

public class Student extends Person {

    private int grade;
    private float gpa;

    public Student(long id, String firstName, String lastName, char gender, Address address, ContactInfo contactInfo, int grade, float gpa) {
        super(id, firstName, lastName, gender, address, contactInfo);
        this.grade = grade;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", gpa=" + gpa +
                "} " + super.toString();
    }
}
