package com.javase8.exceptions;

public class GenericExceptionHandling {
    static int i = 100;
    static int j = 0;
    static String s = null;
    static String val = "A123";
    static int[] num = {1, 2, 3, 4};

    public static void main(String[] args) {
        m1();
        m2();
    }

    private static void m2() {
        System.out.println("m2()");
        System.out.println("### START ###");
        try {
            System.out.println(i / j);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        try {
            System.out.println(num[4]);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("### END ###");
    }

    private static void m1() {
        System.out.println("m1()");
        System.out.println("### START ###");
        try {
            System.out.println(i / j);
        } catch (RuntimeException e) {

        }
        try {
            System.out.println(s.length());
        } catch (RuntimeException e) {

        }
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (RuntimeException e) {

        }
        try {
            System.out.println(num[4]);
        } catch (RuntimeException e) {

        }
        System.out.println("### END ###");
    }
}
