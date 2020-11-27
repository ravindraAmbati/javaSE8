package com.javase8.exceptions;

public class SingleExceptionHandling {

    static int i = 100;
    static int j = 0;
    static String s = null;
    static String val = "A123";
    static int[] num = {1, 2, 3, 4};

    public static void main(String[] args) {
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
