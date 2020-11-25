package com.javase8.programs;

public class NumberNature {

    public static void main(String[] args) {
        System.out.println("NumberNature");

        System.out.println(isEven(3));
        System.out.println(isEven(302));
        System.out.println(isOdd(3));
        System.out.println(isOdd(302));
        System.out.println(isPrime(153));
        System.out.println(isPrime(999));
        System.out.println(isPrime(1234567));
        System.out.println(isPrime(997));
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (isEven(n)) {
            return false;
        }
        for (int i = 3; i <= n / 2; i++) {
            if (n % i == 0) {
                //System.out.println("given " + n + " is divisible by " + i); // doc
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int n) {
        return (n % 2) != 0;
    }

    public static boolean isEven(int n) {
        return (n % 2) == 0;
    }
}
