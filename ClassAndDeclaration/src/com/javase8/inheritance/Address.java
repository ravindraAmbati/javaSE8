package com.javase8.inheritance;

public class Address {

    private String firstLine;
    private String city;
    private long zipCode;

    public Address(String firstLine, String city, long zipCode) {
        this.firstLine = firstLine;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "firstLine='" + firstLine + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
