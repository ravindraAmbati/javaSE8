package com.javase8.programs;

public class Factorial {
    // 2! = 2*1 = 2
    // 3! = 3*2*1 = 6
    // 4! = 4*3*2*1 = 24
    // 5! = 5*4*3*2*1 = 120
    public static void main(String[] args) {
        System.out.println("Factorial");
        System.out.println(calcFactorial1(2));
        System.out.println(calcFactorial1(3));
        System.out.println(calcFactorial1(4));
        System.out.println(calcFactorial1(5));

        System.out.println(calcFactorial2(2));
        System.out.println(calcFactorial2(3));
        System.out.println(calcFactorial2(4));
        System.out.println(calcFactorial2(5));

        System.out.println(calcFactorial3(2));
        System.out.println(calcFactorial3(3));
        System.out.println(calcFactorial3(4));
        System.out.println(calcFactorial3(5));
    }

    private static int calcFactorial3(int n) {
        if (n > 1) {
            return n * calcFactorial3(n - 1);
        }
        return 1;
    }

    private static int calcFactorial1(int n) {
        int r = 1;
        while (n > 1) {
            r = r * n;
            n = n - 1;
        }
        return r;
    }

    private static int calcFactorial2(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r = r * i;
        }
        return r;
    }


}
