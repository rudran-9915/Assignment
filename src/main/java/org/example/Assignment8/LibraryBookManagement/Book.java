package org.example.Assignment8.LibraryBookManagement;

public class Book implements Comparable<Book> {
    private final int bookId;
    private final String title;
    private final String author;
    private final double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return String.format("Book{id=%d, title='%s', author='%s', price=%.2f}",
                bookId, title, author, price);
    }
}

