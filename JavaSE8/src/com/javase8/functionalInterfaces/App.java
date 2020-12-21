package com.javase8.functionalInterfaces;

import com.javase8.functionalInterfaces.impl.GenerateMailIdImpl1;
import com.javase8.functionalInterfaces.impl.GenerateMailIdImpl2;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

    public static final String JAVA_IN = "@java.in";

    public static void main(String[] args) {

        GenerateMailId impl1 = new GenerateMailIdImpl1();
        String email1 = impl1.generateMailId("ravindra");
        System.out.println(email1);

        GenerateMailId impl2 = new GenerateMailIdImpl2();
        String email2 = impl2.generateMailId("ravindra");
        System.out.println(email2);

        GenerateMailId impl3 = new GenerateMailId() {
            @Override
            public String generateMailId(String name) {
                return name + JAVA_IN;
            }
        };
        String email3 = impl3.generateMailId("ravindra");
        System.out.println(email3);

//        (parameters) -> {method definition};

        GenerateMailId impl4 = name -> name + JAVA_IN;
        String email4 = impl4.generateMailId("ravindra");
        System.out.println(email4);

        Consumer<String> printUpperCase = s -> {
            System.out.println(s.toUpperCase());
        };

        printUpperCase.accept("ravindra");

        Supplier<String> toLowerCase = () -> {
            String s = "SUPPLIER";
            return s.toLowerCase();
        };

        System.out.println(toLowerCase.get());

        Predicate<String> checkEmpty = s -> {
            return s.isEmpty();
        };

        System.out.println(checkEmpty.test(""));


        Predicate<String> checkEmpty2 = s -> s.isEmpty();
        System.out.println(checkEmpty2.test("something"));
    }
}
