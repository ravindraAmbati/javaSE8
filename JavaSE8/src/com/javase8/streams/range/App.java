package com.javase8.streams.range;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        java7();

        java8();
    }

    private static void java7() {
        System.out.println("java7");
        int i = 1;
        int sum = 0;
        while (i < 1001) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

    private static void java8() {
        System.out.println("java8");
        System.out.println(IntStream.range(1, 1001).sum());
    }
}
