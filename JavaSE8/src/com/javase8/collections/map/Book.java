package com.javase8.collections.map;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private String publisher;
    private int noOfPages;
    private double price;
    private String isin;

    public Book(String title, String author, String publisher, int noOfPages, double price, String isin) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.noOfPages = noOfPages;
        this.price = price;
        this.isin = isin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", noOfPages=" + noOfPages +
                ", price=" + price +
                ", isin='" + isin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return noOfPages == book.noOfPages &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(isin, book.isin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher, noOfPages, price, isin);
    }


    @Override
    public int compareTo(Book anotherBook) {
        return Integer.compare(this.noOfPages, anotherBook.noOfPages);
    }
}
