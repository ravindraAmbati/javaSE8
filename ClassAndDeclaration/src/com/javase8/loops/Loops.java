package com.javase8.loops;

public class Loops {

    // WHILE
    // DO-WHILE
    // FOR
    // FOR-EACH
    public static void main(String[] args) {
        System.out.println("Loops");
        method0(0);
        method1(0);
        method2(0);
        method3(0);
        method4(8);
        method4(100);
        method5(8);
        method5(100);
        method6();
    }

    static void method0(int i) {
        System.out.println("method0");
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i = +1; // i = 1; where 1 is a positive signed value
        System.out.println(i);
        i += 1; // i = i+1;
        System.out.println(i);
        i++; // i = i+1; or i += 1;
        System.out.println(i);
        i += 10;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        i++;
        i++;
        i++;
        i++;
        System.out.println(i);
    }

    static void method1(int i) {
        System.out.println("method0");
        System.out.println(i);
        i = i - 1;
        System.out.println(i);
        i = -1; // i = 1; where 1 is a negative signed value
        System.out.println(i);
        i -= 1; // i = i-1;
        System.out.println(i);
        i--; // i = i-1; or i -= 1;
        System.out.println(i);
        i -= 10;
        System.out.println(i);
        i--;
        System.out.println(i);
        i--;
        i--;
        i--;
        i--;
        i--;
        System.out.println(i);
    }

    static void method2(int i) {
        System.out.println("method2");
        System.out.println(i);
        System.out.println(++i); // increased and printed
        System.out.println(i++); // printed and increased
        System.out.println(i);
    }

    static void method3(int i) {
        System.out.println("method3");
        System.out.println(i);
        System.out.println(--i); // decreased and printed
        System.out.println(i--); // printed and decreased
        System.out.println(i);
    }


    static void method4(int i) {
        System.out.println("method4");
        while (i < 11) {
            // until is true
            i = i + 1;
            System.out.println(i);
        }
    }

    static void method5(int i) {
        System.out.println("method5");
        do {
            // first time and until is true
            i = i + 1;
            System.out.println(i);
        } while (i < 11);
    }

    static void method6() {
        System.out.println("method6");
        // init; check or condition; increment or decrement
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 1000; i >= 0; i--) {
            System.out.print(i+", ");
        }
    }
}
