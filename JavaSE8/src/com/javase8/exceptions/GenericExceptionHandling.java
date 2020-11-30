package com.javase8.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GenericExceptionHandling {
    static int i = 100;
    static int j = 0;
    static String s = null;
    static String val = "A123";
    static int[] num = {1, 2, 3, 4};

    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m5();
        m6();
        m7();

    }

    private static void m1() {
        System.out.println("m1()");
        System.out.println("### START ###");
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException has been caught");
//            e.printStackTrace();
        }
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException has been caught");
//            e.printStackTrace();
        }
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException has been caught");
//            e.printStackTrace();
        }
        try {
            System.out.println(num[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException has been caught");
//            e.printStackTrace();
        }
        System.out.println("### END ###");
    }

    private static void m2() {
        System.out.println("m2()");
        System.out.println("### START ###");
        try {
            System.out.println(i / j);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(s.length());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(num[4]);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("### END ###");
    }

    private static void m3() {
        System.out.println("m3()");
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

    private static void m4() {
        System.out.println("m4()");
        System.out.println("### START ###");
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(num[4]);
        System.out.println(Integer.parseInt(val) * 100);
        System.out.println(i / j);
        System.out.println("### END ###");
    }

    private static void m5() {
        System.out.println("m5()");
        System.out.println("### START ###");
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
            try {
                System.out.println(num[4]);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("### END ###");
    }

    private static void m6() {
        System.out.println("m6()");
        System.out.println("### START ###");
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(i / j);
        } finally {
            System.out.println("### Required Line ###");
        }
        System.out.println("### END ###");
    }

    private static void m7() {
        System.out.println("m7()");
        System.out.println("### START ###");
        try {
            System.out.println(Integer.parseInt(val) * 100);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(i / j);
        } finally {
            try {
                System.out.println(i / j);
            } catch (Exception e) {
                System.out.println("you hanle the exception even in finally block");
            }
            System.out.println("### Required Line ###");
        }
        System.out.println("### END ###");
    }
}
