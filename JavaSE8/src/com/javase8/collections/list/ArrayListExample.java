package com.javase8.collections.list;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        listOfInteger();
        listOfString();
        listOfBooks();
    }

    private static void listOfBooks() {
        System.out.println("listOfBooks");
        ArrayList<Book> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty()); // true
        Book book1 = new Book("title", "author", "publisher", 100, 10.23d, "123456");
        Book book2 = new Book("title1", "author", "publisher", 200, 120.23d, "12345");
        Book book3 = new Book("title4", "author", "publisher", 1040, 110.23d, "12346");
        Book book4 = new Book("title6", "author", "publisher4", 1040, 190.23d, "12356");
        Book book5 = new Book("title78", "author", "publisher", 1000, 180.23d, "12456");
        Book book6 = new Book("title5", "author", "publisher3", 16600, 107.23d, "123456");
        Book book7 = new Book("title", "author", "publisher2", 10, 1.23d, "123456");
        arrayList.add(book1);
        arrayList.add(book2);
        arrayList.add(book3);
        arrayList.add(book4);
        arrayList.add(book5);
        System.out.println(arrayList.contains(book2)); // true
        System.out.println(arrayList.contains(book7)); // false
        System.out.println(arrayList.isEmpty()); // false
        System.out.println(arrayList.size()); // 5
        arrayList.add(book6);
        System.out.println(arrayList.size()); // 6
        System.out.println(arrayList.remove(book3)); // true
        System.out.println(arrayList.remove(book7)); // false
        System.out.println(arrayList);
        System.out.println("end");
        // indexing
        arrayList.add(2, book3); // add index-3
        System.out.println(arrayList.remove(5)); // book6
        System.out.println(arrayList.get(2)); // book3
        System.out.println(arrayList.get(4)); // book5
        System.out.println(arrayList.get(arrayList.size() - 1)); // book6
        System.out.println(arrayList.indexOf(book4)); // 3
        System.out.println(arrayList.indexOf(book7)); // -1
        arrayList.add(book7);
        System.out.println(arrayList.indexOf(book7)); // 5
        arrayList.add(book7);
        arrayList.add(book7);
        arrayList.add(book7);
        System.out.println(arrayList.indexOf(book7)); // 5
        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf(book7)); // last position of the value sameString
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());
    }

    private static void listOfString() {
        System.out.println("listOfString");
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty()); // true
        arrayList.add("AA"); // index-0
        arrayList.add("XYZ"); // index-1
        arrayList.add("LK"); // index-2
        arrayList.add("99"); // index-3
        arrayList.add("yubhj"); // index-4
        arrayList.add(";lkj"); // index-5
        arrayList.add("rrr234"); // index-6
        System.out.println(arrayList.contains("aa")); // false
        System.out.println(arrayList.contains("Lk")); // false
        System.out.println(arrayList.contains("AA")); // true
        System.out.println(arrayList.isEmpty()); // false
        System.out.println(arrayList.size()); // 7
        arrayList.add("Java"); // index-7
        System.out.println(arrayList.size()); // 8
        System.out.println(arrayList.remove("99")); // true
        System.out.println(arrayList);

        // indexing
        arrayList.add(4, "fourthPosition"); // add index-4
        System.out.println(arrayList.remove(5)); // ;lkj
        System.out.println(arrayList.get(2)); // LK
        System.out.println(arrayList.get(4)); // fourthPosition
        System.out.println(arrayList.get(arrayList.size() - 1)); // Last element = Java
        System.out.println(arrayList.indexOf("Java")); // 6
        System.out.println(arrayList.indexOf("notInaList")); // -1
        arrayList.add("sameString");
        arrayList.add("sameString");
        arrayList.add("sameString");
        arrayList.add("sameString");
        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf("sameString")); // last position of the value sameString
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());

    }

    private static void listOfInteger() {
        System.out.println("listOfInteger");
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty()); // true
        arrayList.add(0); // index-0
        arrayList.add(1); // index-1
        arrayList.add(100); // index-2
        arrayList.add(99); // index-3
        arrayList.add(103); // index-4
        arrayList.add(9999); // index-5
        arrayList.add(256); // index-6
        System.out.println(arrayList.contains(103)); // true
        System.out.println(arrayList.contains(2)); // false
        System.out.println(arrayList.isEmpty()); // false
        System.out.println(arrayList.size()); // 7
        arrayList.add(4); // index-7
        System.out.println(arrayList.size()); // 8
        System.out.println(arrayList.remove(new Integer(103))); // true
        System.out.println(arrayList);

        // indexing
        arrayList.add(4, 103); // add 103 at index-4
        System.out.println(arrayList.remove(5)); // 9999
        System.out.println(arrayList.get(2)); // 100
        System.out.println(arrayList.get(4)); // 103
        System.out.println(arrayList.get(arrayList.size() - 1)); // Last element = 4
        System.out.println(arrayList.indexOf(99)); // 3
        System.out.println(arrayList.indexOf(9999)); // -1
        arrayList.add(150);
        arrayList.add(150);
        arrayList.add(150);
        arrayList.add(150);
        System.out.println(arrayList);
        System.out.println(arrayList.lastIndexOf(150)); // last position of the value 150
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.size());

    }
}
