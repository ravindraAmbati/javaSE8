package com.javase8.collections.list;

import java.util.LinkedList;

// indexing and allow duplicates
public class LinkedListExample {
    // ArrayList - DataStructure - Array
    // best - insert | remove
    // worst - read | update
    public static void main(String[] args) {
        listOfInteger();
        listOfString();
        listOfBooks();
    }

    private static void listOfBooks() {
        System.out.println("listOfBooks");
        LinkedList<Book> linkedList = new LinkedList<>();
        System.out.println(linkedList.isEmpty()); // true
        Book book1 = new Book("title", "author", "publisher", 100, 10.23d, "123456");
        Book book2 = new Book("title1", "author", "publisher", 200, 120.23d, "12345");
        Book book3 = new Book("title4", "author", "publisher", 1040, 110.23d, "12346");
        Book book4 = new Book("title6", "author", "publisher4", 1040, 190.23d, "12356");
        Book book5 = new Book("title78", "author", "publisher", 1000, 180.23d, "12456");
        Book book6 = new Book("title5", "author", "publisher3", 16600, 107.23d, "123456");
        Book book7 = new Book("title", "author", "publisher2", 10, 1.23d, "123456");
        linkedList.add(book1);
        linkedList.add(book2);
        linkedList.add(book3);
        linkedList.add(book4);
        linkedList.add(book5);
        System.out.println(linkedList.contains(book2)); // true
        System.out.println(linkedList.contains(book7)); // false
        System.out.println(linkedList.isEmpty()); // false
        System.out.println(linkedList.size()); // 5
        linkedList.add(book6);
        System.out.println(linkedList.size()); // 6
        System.out.println(linkedList.remove(book3)); // true
        System.out.println(linkedList.remove(book7)); // false
        System.out.println(linkedList);
        System.out.println("end");
        // indexing
        linkedList.add(2, book3); // add index-3
        System.out.println(linkedList.remove(5)); // book6
        System.out.println(linkedList.get(2)); // book3
        System.out.println(linkedList.get(4)); // book5
        System.out.println(linkedList.get(linkedList.size() - 1)); // book6
        System.out.println(linkedList.indexOf(book4)); // 3
        System.out.println(linkedList.indexOf(book7)); // -1
        linkedList.add(book7);
        System.out.println(linkedList.indexOf(book7)); // 5
        linkedList.add(book7);
        linkedList.add(book7);
        linkedList.add(book7);
        System.out.println(linkedList.indexOf(book7)); // 5
        System.out.println(linkedList);
        System.out.println(linkedList.lastIndexOf(book7)); // last position of the value sameString
        linkedList.clear();
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());
    }

    private static void listOfString() {
        System.out.println("listOfString");
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList.isEmpty()); // true
        linkedList.add("AA"); // index-0
        linkedList.add("XYZ"); // index-1
        linkedList.add("LK"); // index-2
        linkedList.add("99"); // index-3
        linkedList.add("yubhj"); // index-4
        linkedList.add(";lkj"); // index-5
        linkedList.add("rrr234"); // index-6
        System.out.println(linkedList.contains("aa")); // false
        System.out.println(linkedList.contains("Lk")); // false
        System.out.println(linkedList.contains("AA")); // true
        System.out.println(linkedList.isEmpty()); // false
        System.out.println(linkedList.size()); // 7
        linkedList.add("Java"); // index-7
        System.out.println(linkedList.size()); // 8
        System.out.println(linkedList.remove("99")); // true
        System.out.println(linkedList);

        // indexing
        linkedList.add(4, "fourthPosition"); // add index-4
        System.out.println(linkedList.remove(5)); // ;lkj
        System.out.println(linkedList.get(2)); // LK
        System.out.println(linkedList.get(4)); // fourthPosition
        System.out.println(linkedList.get(linkedList.size() - 1)); // Last element = Java
        System.out.println(linkedList.indexOf("Java")); // 6
        System.out.println(linkedList.indexOf("notInaList")); // -1
        linkedList.add("sameString");
        linkedList.add("sameString");
        linkedList.add("sameString");
        linkedList.add("sameString");
        System.out.println(linkedList);
        System.out.println(linkedList.lastIndexOf("sameString")); // last position of the value sameString
        linkedList.clear();
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());

    }

    private static void listOfInteger() {
        System.out.println("listOfInteger");
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println(linkedList.isEmpty()); // true
        linkedList.add(0); // index-0
        linkedList.add(1); // index-1
        linkedList.add(100); // index-2
        linkedList.add(99); // index-3
        linkedList.add(103); // index-4
        linkedList.add(9999); // index-5
        linkedList.add(256); // index-6
        System.out.println(linkedList.contains(103)); // true
        System.out.println(linkedList.contains(2)); // false
        System.out.println(linkedList.isEmpty()); // false
        System.out.println(linkedList.size()); // 7
        linkedList.add(4); // index-7
        System.out.println(linkedList.size()); // 8
        System.out.println(linkedList.remove(new Integer(103))); // true
        System.out.println(linkedList);

        // indexing
        linkedList.add(4, 103); // add 103 at index-4
        System.out.println(linkedList.remove(5)); // 9999
        System.out.println(linkedList.get(2)); // 100
        System.out.println(linkedList.get(4)); // 103
        System.out.println(linkedList.get(linkedList.size() - 1)); // Last element = 4
        System.out.println(linkedList.indexOf(99)); // 3
        System.out.println(linkedList.indexOf(9999)); // -1
        linkedList.add(150);
        linkedList.add(150);
        linkedList.add(150);
        linkedList.add(150);
        System.out.println(linkedList);
        System.out.println(linkedList.lastIndexOf(150)); // last position of the value 150
        linkedList.clear();
        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());

    }

}
