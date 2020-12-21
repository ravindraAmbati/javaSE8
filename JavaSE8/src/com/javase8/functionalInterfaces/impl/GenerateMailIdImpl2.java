package com.javase8.functionalInterfaces.impl;

import com.javase8.functionalInterfaces.GenerateMailId;

public class GenerateMailIdImpl2 implements GenerateMailId {

    String DOMAIN = "@company.com";

    @Override
    public String generateMailId(String name) {
        return name + DOMAIN;
    }
}
