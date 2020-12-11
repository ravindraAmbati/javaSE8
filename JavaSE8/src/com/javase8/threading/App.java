package com.javase8.threading;

public class App {
    static long start = 0;
    static long end = 0;

    public static void main(String[] args) {
        start = System.currentTimeMillis();
        System.out.println("main method is running on " + Thread.currentThread().getName() + " thread");
        m1();
        m2(); // 3s
        m3();
        m4(); // 5s
        m5(); // 3+5s
        long end = System.currentTimeMillis();
        System.out.println("Program ends here -> Total time taken: " + (end - start));
    }

    private static void m1() {
        System.out.println("method m1 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

    private static void m2() {
        System.out.println("method m2 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

    private static void m3() {
        System.out.println("method m3 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

    private static void m4() {
        System.out.println("method m4 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

    private static void m5() {
        System.out.println("method m5 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

}
