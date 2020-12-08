package com.javase8.collections.map;

import java.util.HashMap;

import static com.javase8.programs.ReverseANumberAndAString.reverseANumber;

public class HashMapExample {
    // HashMap -> key-value pair
    // HashMap does main two operations for Create(map.put(key,value)) and Read(map.get(key)) - hashcode is calculated for everyKey and stores according hashcode
    public static void main(String[] args) {
        System.out.println("HashMapExample");
        mapOfInteger_String();
        mapOfBooks();
    }

    private static void mapOfBooks() {
        System.out.println("mapOfBooks");
        Book A = new Book("A", "author1", "publisher7", 100, 10.23d, "123");
        Book B = new Book("B", "author2", "publisher6", 200, 1200.23d, "456");
        Book C = new Book("C", "author3", "publisher5", 1040, 17810.23d, "789");
        Book D = new Book("D", "author4", "publisher4", 1040, 190.23d, "147");
        Book E = new Book("E", "author5", "publisher3", 1000, 1803.23d, "258");
        Book F = new Book("F", "author6", "publisher2", 16600, 17.23d, "369");
        Book G = new Book("G", "author7", "publisher1", 10, 1.23d, "1234567890");
        // key - ISIN || value - book
        HashMap<String, Book> map = new HashMap<>();
        map.put(A.getIsin(), A);
        map.put(B.getIsin(), B);
        map.put(C.getIsin(), C);
        map.put(D.getIsin(), D);
        map.put(E.getIsin(), E);
        map.put(F.getIsin(), F);
        map.put(G.getIsin(), G);
        System.out.println(map);
        System.out.println("The Book of ISIN 147: " + map.get("147"));
        System.out.println("The Book price of ISIN 369: " + map.get("369").getPrice());
        System.out.println("The Book author of ISIN 123: " + map.get("123").getAuthor());
        System.out.println("The Book publisher of ISIN 789: " + map.get("789").getPublisher());
        System.out.println("The Book total pages of ISIN 456: " + map.get("456").getNoOfPages());
        System.out.println("The Book title of ISIN 258: " + map.get("258").getTitle());
    }

    private static void mapOfInteger_String() {
        System.out.println("mapOfIntegers");
        HashMap<Integer, String> map = new HashMap<>();
        // 1-ONE
        // 2-TWO
        // 3-THREE
        map.put(0, "ZERO");
        map.put(1, "ONE");
        map.put(2, "TWO");
        map.put(3, "THREE");
        map.put(4, "FOUR");
        map.put(5, "FIVE");
        map.put(6, "SIX");
        map.put(7, "SEVEN");
        map.put(8, "EIGHT");
        map.put(9, "NINE");
        System.out.println(map);
        int n = 123456;
        n = (int) reverseANumber(n);
        while (n > 0) {
            int temp = n % 10;
            System.out.print(map.get(temp) + " ");
            n = n / 10;
        }
        System.out.println();
    }

}
