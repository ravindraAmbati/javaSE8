package com.javase8.inheritance;

import java.time.LocalDate;
import java.time.Period;

public class Faculty extends Person {

    private String role;
    private String skills;

    public Faculty(long id, String firstName, String lastName, char gender, Address address, ContactInfo contactInfo, String role, String skills) {
        super(id, firstName, lastName, gender, address, contactInfo);
        this.role = role;
        this.skills = skills;
    }

    @Override
    void calAge() {
        System.out.println("calAge from Faculty");
        Period age = Period.between(this.getDob(), LocalDate.now());
        System.out.println("The Calculated Age is " + age.getYears() + " year(s) ");
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "role='" + role + '\'' +
                ", skills='" + skills + '\'' +
                "} " + super.toString();
    }
}
