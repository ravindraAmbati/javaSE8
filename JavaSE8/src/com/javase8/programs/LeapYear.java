package com.javase8.programs;

public class LeapYear {

    // leap year divisible by 4
    // a year which is exactly divisible by 100 is not a leap year always
    // leap year divisible by 400
    public static void main(String[] args) {

        System.out.println("LeapYear");
        System.out.println(isALeapYear(1));
        System.out.println(isALeapYear(4));
        System.out.println(isALeapYear(40));
        System.out.println(isALeapYear(39));
        System.out.println(isALeapYear(99));
        System.out.println(isALeapYear(100));
        System.out.println(isALeapYear(1000));
        System.out.println(isALeapYear(1004));
        System.out.println(isALeapYear(1700));
        System.out.println(isALeapYear(1800));
        System.out.println(isALeapYear(1900));
        System.out.println(isALeapYear(1600));
        System.out.println(isALeapYear(2000));
        System.out.println(isALeapYear(2004));
        System.out.println(isALeapYear(2008));
        System.out.println(isALeapYear(2009));

    }

    private static boolean isALeapYear(int y) {
        System.out.print(y + ":   ");
        if (y % 100 == 0) {
            if (y % 400 == 0) {
                return true;
            }
        } else if (y % 4 == 0) {
            return true;
        }
        return false;
    }
}
