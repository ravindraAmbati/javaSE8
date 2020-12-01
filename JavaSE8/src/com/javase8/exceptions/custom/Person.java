package com.javase8.exceptions.custom;

public class Person implements Validate {

    private String name;
    private int age;
    private String mobile;

    public Person(String name, int age, String mobile) throws InvalidNameException, InvalidAgeException {

        this.name = name;
        this.age = age;
        this.mobile = mobile;
        validate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    @Override
    public void validate() throws InvalidNameException, InvalidAgeException {

        if (this.name.length() > 30) {
            throw new InvalidNameException("Custom Exception");
        }
        if (this.age < 3 || this.age > 99) {
            throw new InvalidAgeException("Custom Exception");
        }
        if (this.mobile.length() < 8 || this.mobile.length() > 15) {
            throw new InvalidMobileException("Custom Exception");
        }
        Long.parseLong(this.mobile);
    }

    @Override
    public void clear() {
        this.name = null;
        this.age = 0;
        this.mobile = null;
    }
}
