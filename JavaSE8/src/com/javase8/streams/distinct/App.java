package com.javase8.streams.distinct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7, 7, 6, 5, 4, 3, 8, 9, 10);

        java7(numbers);

        java8(numbers);
    }

    private static void java8(List<Integer> numbers) {
        System.out.println("Java 8");
        List<Integer> numbers_NoDuplicates_Java8 = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers_NoDuplicates_Java8);
    }

    private static void java7(List<Integer> numbers) {
        List<Integer> numbers_NoDuplicates = new ArrayList<Integer>(10);
        System.out.println("Java 7");
        for (Integer i : numbers) {
            if (!numbers_NoDuplicates.contains(i)) {
                numbers_NoDuplicates.add(i);
            }
        }
        System.out.println(numbers_NoDuplicates);
    }
}
