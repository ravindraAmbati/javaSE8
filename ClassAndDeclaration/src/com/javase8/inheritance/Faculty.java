package com.javase8.inheritance;

public class Faculty extends Person {

    private String role;
    private String skills;

    public Faculty(long id, String firstName, String lastName, char gender, Address address, ContactInfo contactInfo, String role, String skills) {
        super(id, firstName, lastName, gender, address, contactInfo);
        this.role = role;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "role='" + role + '\'' +
                ", skills='" + skills + '\'' +
                "} " + super.toString();
    }
}
