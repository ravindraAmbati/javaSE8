package com.javase8.programs;

import static com.javase8.programs.NumberNature.isPrime;

public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("FirstNPrimeNumbers");
        firstNPrimes(100);
        firstNPrimes(1000);
        primesBetween(200, 300);
        primesBetween(990, 1000);
    }

    private static void primesBetween(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static void firstNPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
