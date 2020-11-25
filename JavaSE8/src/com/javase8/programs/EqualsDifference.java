package com.javase8.programs;

public class EqualsDifference {

    public static void main(String[] args) {
        StringPool1();
        StringPool2();
    }

    private static void StringPool2() {
        // a -> 100
        // b -> a -> 100 => b->100
        System.out.println("StringPool2");
        String s1 = "java";
        String s2 = "java";
        String s3 = s2;
        System.out.println(s1.equals(s2)); // value equals
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        System.out.println(s1 == s2); // reference equals
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        String s4 = new String("java");
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }

    private static void StringPool1() {
        System.out.println("StringPool1");
        // String pool
        String s1 = "java";
        // s1 -> java
        String s2 = new String("java");
        // s2 is not a new object until s1 and s2 have same values; because s1 is already having "java"
        System.out.println(s1.equals(s2));
        String s3 = "java";
        // s3 -> s1 same String pool logic until values are same
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        // there is only one object for all s1, s2 and s3
        s1 = "Java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
        // how many Objects will be created here - 2 objects
        // s1 - 1
        // s2 and s3 -> still same object - 1
    }
}
