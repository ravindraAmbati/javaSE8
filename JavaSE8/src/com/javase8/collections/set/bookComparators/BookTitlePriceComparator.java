package com.javase8.collections.set.bookComparators;

import com.javase8.collections.set.Book;

import java.util.Comparator;

public class BookTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int compareTitle = o1.getTitle().compareTo(o2.getTitle());
        if (0 == compareTitle) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
        return compareTitle;
    }
}
