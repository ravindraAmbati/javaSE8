package com.javase8.programs;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
        System.out.println("SumOfFirstNNaturalNumbers");
        System.out.println(sum1(10));
        System.out.println(sum2(10));
        System.out.println(sum3(10));
        System.out.println(sum1(100000000));
        System.out.println(sum2(100000000));
        System.out.println(sum3(100000000));
    }

    private static long sum3(long n) {
        long startTime = System.currentTimeMillis();
        long temp = 0;
        temp = (n * (n + 1)) / 2;
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");
        return temp;
    }

    private static long sum1(long n) {
        long startTime = System.currentTimeMillis();
        long temp = 0;
        for (long i = 1; i <= n; i++) {
            temp = temp + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");
        return temp;
    }

    private static long sum2(long n) {
        long startTime = System.currentTimeMillis();
        long temp = 0;
        for (long i = n; i >= 1; i--) {
            temp = temp + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + " ms");
        return temp;
    }

}
