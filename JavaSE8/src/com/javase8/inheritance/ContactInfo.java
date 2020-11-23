package com.javase8.inheritance;

public class ContactInfo {

    private long mobile;
    private String email;

    public ContactInfo(long mobile, String email) {
        this.mobile = mobile;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}
