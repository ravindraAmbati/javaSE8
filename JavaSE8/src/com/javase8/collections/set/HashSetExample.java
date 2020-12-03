package com.javase8.collections.set;

// no order and no duplicates

import com.javase8.collections.set.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample {

    public static void main(String[] args) {
        setOfIntegers();
        setOfStrings();
        setOfBooks();
    }

    private static void setOfBooks() {
        System.out.println("listOfBooks");
        HashSet<Book> hashSet = new HashSet<>();
        System.out.println(hashSet.isEmpty()); // true
        Book book1 = new Book("title", "author", "publisher", 100, 10.23d, "123456");
        Book book2 = new Book("title1", "author", "publisher", 200, 120.23d, "12345");
        Book book3 = new Book("title4", "author", "publisher", 1040, 110.23d, "12346");
        Book book4 = new Book("title6", "author", "publisher4", 1040, 190.23d, "12356");
        Book book5 = new Book("title78", "author", "publisher", 1000, 180.23d, "12456");
        Book book6 = new Book("title5", "author", "publisher3", 16600, 107.23d, "123456");
        Book book7 = new Book("title", "author", "publisher2", 10, 1.23d, "123456");
        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);
        hashSet.add(book4);
        hashSet.add(book5);
        System.out.println(hashSet.contains(book2)); // true
        System.out.println(hashSet.contains(book7)); // false
        System.out.println(hashSet.isEmpty()); // false
        System.out.println(hashSet.size()); // 5
        hashSet.add(book6);
        System.out.println(hashSet.size()); // 6
        System.out.println(hashSet.remove(book3)); // true
        System.out.println(hashSet.remove(book7)); // false
        System.out.println(hashSet);
        System.out.println("end");
        // indexing
        hashSet.add(book3); // add index-3
        System.out.println(hashSet.remove(5)); // book6
        hashSet.add(book7);
        hashSet.add(book7);
        hashSet.add(book7);
        hashSet.add(book7);
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());
    }

    private static void setOfStrings() {
        System.out.println("setOfStrings");
        HashSet<String> hashSet = new HashSet<>();
        System.out.println(hashSet.isEmpty()); // true
        hashSet.add("AA");
        hashSet.add("XYZ");
        hashSet.add("LK");
        hashSet.add("99");
        hashSet.add("yubhj");
        hashSet.add(";lkj");
        hashSet.add("rrr234");
        System.out.println(hashSet.contains("aa")); // false
        System.out.println(hashSet.contains("Lk")); // false
        System.out.println(hashSet.contains("AA")); // true
        System.out.println(hashSet.isEmpty()); // false
        System.out.println(hashSet.size()); // 7
        hashSet.add("Java");
        System.out.println(hashSet.size()); // 8
        System.out.println(hashSet.remove("99")); // true
        System.out.println(hashSet);


        hashSet.add("fourthPosition"); // add
        System.out.println(hashSet.remove(5)); // ;lkj
        hashSet.add("sameString");
        hashSet.add("sameString");
        hashSet.add("sameString");
        hashSet.add("sameString");
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());
    }

    private static void setOfIntegers() {
        System.out.println("setOfIntegers");
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.isEmpty()); // true
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(100);
        hashSet.add(99);
        hashSet.add(103);
        hashSet.add(9999);
        hashSet.add(256);
        System.out.println(hashSet.contains(103)); // true
        System.out.println(hashSet.contains(2)); // false
        System.out.println(hashSet.isEmpty()); // false
        System.out.println(hashSet.size()); // 7
        hashSet.add(4);
        System.out.println(hashSet.size()); // 8
        System.out.println(hashSet.remove(new Integer(103))); // true
        System.out.println(hashSet);
        hashSet.add(103); // add 103
        System.out.println(hashSet.remove(5)); // false
        hashSet.add(150);
        hashSet.add(150);
        hashSet.add(150);
        hashSet.add(150);
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.size());

    }
}
