package com.javase8.threading.example;

public class ThreadApp {

    static long start = 0;

    public static void main(String[] args) {
        start = System.currentTimeMillis();
        System.out.println("main method is running on " + Thread.currentThread().getName() + " thread");

        // for m1
        Runnable m1Runnable = new Runnable() {
            @Override
            public void run() {
                m1();
            }
        };
        Thread m1Thread = new Thread(m1Runnable, "m1Thread");
        m1Thread.start();
        // for m1

        // for m2
        FirstRunnable firstRunnable = new FirstRunnable();
        Thread secondThread = new Thread(firstRunnable);
        secondThread.start();
        // for m2


        m3();


        // for m4 - recommend approach to create a thread
        FirstThread firstThread = new FirstThread();
        firstThread.start();
        // for m4


        Thread m5Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                m5();
            }
        }, "m5Thread");
        m5Thread.start();


        long end = System.currentTimeMillis();
        System.out.println("Program ends here -> Total time taken: " + (end - start));
    }


    private static void m1() {
        System.out.println("method m1 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

    private static void m3() {
        System.out.println("method m3 is running on " + Thread.currentThread().getName() + " thread");
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
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }
}
