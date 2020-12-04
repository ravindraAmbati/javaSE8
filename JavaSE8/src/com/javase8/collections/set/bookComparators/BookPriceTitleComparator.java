package com.javase8.collections.set.bookComparators;

import com.javase8.collections.set.Book;

import java.util.Comparator;

public class BookPriceTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int comparePrice = Double.compare(o1.getPrice(), o2.getPrice());
        if (0 == comparePrice) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return comparePrice;
    }
}
