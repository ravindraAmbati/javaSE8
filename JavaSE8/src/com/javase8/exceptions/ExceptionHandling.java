package com.javase8.exceptions;

public class ExceptionHandling {

    //try{
    // exception expected
    // }catch(ExceptionClass e){
    // handle Exception
    // }finally{
    // handle Exception
    // }

    public static void main(String[] args) {
        System.out.println("ExceptionHandling");
        m1();
        m2();
        m3();
        m4();
    }

    private static void m4() {
        System.out.println("m4");
        int i = 100;
        int j = 0;

        System.out.println("Line1");
        try {
            System.out.println(i / j);
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException has been caught in method m4()");
        }

        System.out.println("Line2");

    }

    private static void m3() {
        System.out.println("m3");
        String s = null;
        System.out.println("Line1");
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught in method m3()");
        }

        System.out.println("Line2");
    }

    private static void m2() {
        System.out.println("m2");
        String val = "A1234";
        System.out.println("Line1");
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException has been caught in method m2()");
        }

        System.out.println("Line2");
    }

    private static void m1() {
        System.out.println("m1");
        int num[] = {1, 2, 3, 4};
        System.out.println("Line1");
        try {
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException has been caught in method m1()");
        }
        System.out.println("Line2");
    }
}
