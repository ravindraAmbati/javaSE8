package com.javase8.programs;

public class Fibonacci {
    // 0 1
    // 0+1 = 1
    // 0 1 1
    // 1+1 = 2
    // 0 1 1 2
    // 1+2 = 3
    // 0 1 1 2 3
    // 2+3 =5
    // 0 1 1 2 3 5
    // 3+5=8
    // 0 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {

        printFirstTenFibonacciSeriesFrom(0, 1);
        printFibonacciSeriesFrom(0, 1, 15);
        printFirstTenFibonacciSeriesFrom(5, 8);
    }

    private static void printFirstTenFibonacciSeriesFrom(int first, int second) {
        printFibonacciSeriesFrom(first, second, 10);
    }

    private static void printFibonacciSeriesFrom(int first, int second, int limit) {
        System.out.print(first + ", ");
        System.out.print(second + ", ");
        for (int i = 0; i <= limit; i++) {
            int temp = second;
            second = first + second;
            first = temp;
            System.out.print(first + second + ", ");
        }
        System.out.println();
    }
}
