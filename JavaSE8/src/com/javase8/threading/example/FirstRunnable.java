package com.javase8.threading.example;

public class FirstRunnable implements Runnable {

    private static void m2() {
        long start = System.currentTimeMillis();
        System.out.println("method m2 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

    @Override
    public void run() {
        m2();
    }
}
