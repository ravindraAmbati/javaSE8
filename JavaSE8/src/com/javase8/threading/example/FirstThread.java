package com.javase8.threading.example;

public class FirstThread extends Thread {

    private static void m4() {
        long start = System.currentTimeMillis();
        System.out.println("method m4 is running on " + Thread.currentThread().getName() + " thread");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + (end - start));
    }

    @Override
    public void run() {
        m4();
    }
}
