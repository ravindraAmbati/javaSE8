package com.javase8.programs;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(1634));
    }

    private static boolean isArmstrong(int n) {
        int temp = n;
        int temp2 = n;
        int calcVal = 0;
        int r = 0;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            calcVal = calcVal + (int) Math.pow(r, count);
        }
        return temp2 == calcVal;
    }
}
