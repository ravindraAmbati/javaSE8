package com.javase8.exceptions;

public class SingleExceptionHandling {

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
        System.out.println("m2");
        System.out.println("### START ###");

        try {
            System.out.println(i / j);
            System.out.println(s.length());
            System.out.println(Integer.parseInt(val) * 100);
            System.out.println(num[4]);
        } catch (ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("in a single catch");
            e.printStackTrace();
        }

        System.out.println("### END ###");
    }

    private static void m1() {
        System.out.println("m1");
        System.out.println("### START ###");
        try {
            System.out.println(i / j);
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException has been caught");
        }
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught");
        }
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException has been caught");
        }
        try {
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException has been caught");
        }
        System.out.println("### END ###");
    }


}
