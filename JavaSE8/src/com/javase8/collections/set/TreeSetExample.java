package com.javase8.collections.set;

import com.javase8.collections.set.bookComparators.BookPriceComparator;
import com.javase8.collections.set.bookComparators.BookPriceTitleComparator;
import com.javase8.collections.set.bookComparators.BookTitleComparator;
import com.javase8.collections.set.bookComparators.BookTitlePriceComparator;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        setOfIntegers();
        setOfStrings();
        setOfBooks();
        setOfBooks_sortedPrice();
        setOfBooks_sortedTitle();
        setOfBooks_sortedPrice_Title();
        setOfBooks_sortedTitle_Price();

    }

    private static void setOfBooks_sortedTitle_Price() {
        //BookTitle_PriceComparator
        System.out.println("BookTitle_PriceComparator");
        BookTitlePriceComparator bookTitlePriceComparator = new BookTitlePriceComparator();
        TreeSet<Book> treeSetBookTitle = new TreeSet<>(bookTitlePriceComparator);
        Book M = new Book("M", "M_102", "publisher", 100, 102d, "123456");
        Book O = new Book("M", "M_101", "publisher", 200, 101d, "12345");
        Book B = new Book("B", "author", "publisher", 1040, 100d, "12346");
        treeSetBookTitle.add(M);
        treeSetBookTitle.add(O);
        treeSetBookTitle.add(B);

        System.out.println("###START-Iterator###");
        Iterator<Book> iterator = treeSetBookTitle.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("###END-Iterator###");

        System.out.println(treeSetBookTitle);
    }

    private static void setOfBooks_sortedPrice_Title() {
        //BookPrice_TitleComparator
        System.out.println("BookPrice_TitleComparator");
        BookPriceTitleComparator bookPriceTitleComparator = new BookPriceTitleComparator();
        TreeSet<Book> treeSetBookTitle = new TreeSet<>(bookPriceTitleComparator);
        Book M = new Book("M", "author", "publisher", 100, 100d, "123456");
        Book O = new Book("O", "author", "publisher", 200, 1200.23d, "12345");
        Book B = new Book("B", "author", "publisher", 1040, 100d, "12346");
        treeSetBookTitle.add(M);
        treeSetBookTitle.add(O);
        treeSetBookTitle.add(B);
        System.out.println(treeSetBookTitle);
    }

    private static void setOfBooks_sortedTitle() {
        //BookTitleComparator
        System.out.println("BookTitleComparator");
        BookTitleComparator bookTitleComparator = new BookTitleComparator();
        TreeSet<Book> treeSetBookTitle = new TreeSet<>(bookTitleComparator);
        Book M = new Book("M", "author", "publisher", 100, 10.23d, "123456");
        Book O = new Book("O", "author", "publisher", 200, 1200.23d, "12345");
        Book B = new Book("B", "author", "publisher", 1040, 120.23d, "12346");
        treeSetBookTitle.add(M);
        treeSetBookTitle.add(O);
        treeSetBookTitle.add(B);
        System.out.println(treeSetBookTitle);
    }

    private static void setOfBooks_sortedPrice() {

        //BookPriceComparator
        System.out.println("BookPriceComparator");
        BookPriceComparator bookPriceComparator = new BookPriceComparator();
        TreeSet<Book> treeSetBookPrice = new TreeSet<>(bookPriceComparator);
        Book A = new Book("A", "author", "publisher", 100, 10.23d, "123456");
        Book C = new Book("C", "author", "publisher", 200, 1200.23d, "12345");
        Book Z = new Book("Z", "author", "publisher", 1040, 120.23d, "12346");
        treeSetBookPrice.add(A);
        treeSetBookPrice.add(C);
        treeSetBookPrice.add(Z);
        System.out.println(treeSetBookPrice);
    }

    private static void setOfBooks() {
        System.out.println("setOfBooks");
        TreeSet<Book> treeSet = new TreeSet<>();
        System.out.println(treeSet.isEmpty()); // true
        Book book1 = new Book("A", "author", "publisher", 100, 10.23d, "123456");
        Book book2 = new Book("C", "author", "publisher", 200, 120.23d, "12345");
        Book book3 = new Book("Z", "author", "publisher", 1040, 120.23d, "12346");
        Book book4 = new Book("E", "author", "publisher4", 1040, 190.23d, "12356");
        Book book5 = new Book("Y", "author", "publisher", 1000, 180.23d, "12456");
        Book book6 = new Book("D", "author", "publisher3", 16600, 107.23d, "123456");
        Book book7 = new Book("B", "author", "publisher2", 100, 1.23d, "123456");
        treeSet.add(book1);
        treeSet.add(book2);
        treeSet.add(book3);
        treeSet.add(book4);
        treeSet.add(book5);
        System.out.println(treeSet.contains(book2)); // true
        System.out.println(treeSet.contains(book7)); // false
        System.out.println(treeSet.isEmpty()); // false
        System.out.println(treeSet.size()); // 5
        treeSet.add(book6);
        System.out.println(treeSet.size()); // 6
        System.out.println(treeSet.remove(book7)); // false
        System.out.println(treeSet);
        System.out.println("end");
        // indexing
        treeSet.add(book3); // add index-3
        System.out.println(treeSet.remove(book7)); // book6
        treeSet.add(book7);
        treeSet.add(book7);
        treeSet.add(book7);
        treeSet.add(book7);
        System.out.println(treeSet);
        System.out.println(treeSet.comparator());
        treeSet.clear();
        System.out.println(treeSet);
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());
    }

    private static void setOfStrings() {
        System.out.println("setOfStrings");
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println(treeSet.isEmpty()); // true
        treeSet.add("AA");
        treeSet.add("a");
        treeSet.add("XYZ");
        treeSet.add("b");
        treeSet.add("LK");
        treeSet.add("c");
        treeSet.add("99");
        treeSet.add("d");
        treeSet.add("yubhj");
        treeSet.add("e");
        treeSet.add(";lkj");
        treeSet.add("f");
        treeSet.add("rrr234");
        treeSet.add("z");
        System.out.println(treeSet.contains("aa")); // false
        System.out.println(treeSet.contains("Lk")); // false
        System.out.println(treeSet.contains("AA")); // true
        System.out.println(treeSet.isEmpty()); // false
        System.out.println(treeSet.size()); // 7
        treeSet.add("Java");
        System.out.println(treeSet.size()); // 8
        System.out.println(treeSet.remove("99")); // true
        System.out.println(treeSet);
        treeSet.add("fourthPosition"); // add
        System.out.println(treeSet.remove("notInTheSet")); // ;lkj
        treeSet.add("sameString");
        treeSet.add("sameString");
        treeSet.add("sameString");
        treeSet.add("sameString");
        System.out.println(treeSet);
        System.out.println("descendingSet: " + treeSet.descendingSet());
        System.out.println("headSet: " + treeSet.headSet("d"));
        System.out.println("tailSet: " + treeSet.tailSet("d"));
        System.out.println("first: " + treeSet.first());
        System.out.println("last: " + treeSet.last());
        System.out.println("pollFirst: " + treeSet.pollFirst());
        System.out.println("pollLast: " + treeSet.pollLast());
        System.out.println("ceiling: " + treeSet.ceiling("d"));
        System.out.println("floor: " + treeSet.floor("d"));
        System.out.println("higher: " + treeSet.higher("d"));
        System.out.println("lower: " + treeSet.lower("d"));
        treeSet.clear();
        System.out.println(treeSet);
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());
    }

    private static void setOfIntegers() {
        System.out.println("setOfIntegers");
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet.isEmpty()); // true
        treeSet.add(0);
        treeSet.add(8);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(100);
        treeSet.add(99);
        treeSet.add(103);
        treeSet.add(9999);
        treeSet.add(256);
        System.out.println(treeSet.contains(103)); // true
        System.out.println(treeSet.contains(2)); // false
        System.out.println(treeSet.isEmpty()); // false
        System.out.println(treeSet.size()); // 7
        treeSet.add(4);
        System.out.println(treeSet.size()); // 8
        System.out.println(treeSet.remove(new Integer(103))); // true
        System.out.println(treeSet);
        treeSet.add(103); // add 103
        System.out.println(treeSet.remove(5)); // false
        treeSet.add(150);
        treeSet.add(150);
        treeSet.add(150);
        treeSet.add(150);
        System.out.println(treeSet);
        System.out.println("descendingSet: " + treeSet.descendingSet());
        System.out.println("headSet: " + treeSet.headSet(8));
        System.out.println("tailSet: " + treeSet.tailSet(8));
        System.out.println("first: " + treeSet.first());
        System.out.println("last: " + treeSet.last());
        System.out.println("pollFirst: " + treeSet.pollFirst());
        System.out.println("pollLast: " + treeSet.pollLast());
        System.out.println("ceiling: " + treeSet.ceiling(8));
        System.out.println("floor: " + treeSet.floor(8));
        System.out.println("higher: " + treeSet.higher(8));
        System.out.println("lower: " + treeSet.lower(8));
        treeSet.clear();
        System.out.println(treeSet);
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.size());

    }
}
