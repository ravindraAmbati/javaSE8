package com.javase8.functionalInterfaces.impl;

import com.javase8.functionalInterfaces.GenerateMailId;

public class GenerateMailIdImpl1 implements GenerateMailId {

    String DOMAIN = "@example.com";

    @Override
    public String generateMailId(String name) {
        return name + DOMAIN;
    }
}
