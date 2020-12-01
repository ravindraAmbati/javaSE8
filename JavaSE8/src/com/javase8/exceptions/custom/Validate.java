package com.javase8.exceptions.custom;

public interface Validate {

    void validate() throws InvalidNameException, InvalidAgeException;

    void clear();
}
