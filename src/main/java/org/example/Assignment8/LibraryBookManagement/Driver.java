package org.example.Assignment8.LibraryBookManagement;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Add at least 5 books
        books.add(new Book(101, "The Hobbit", "J.R.R. Tolkien", 12.99));
        books.add(new Book(102, "1984", "George Orwell", 9.99));
        books.add(new Book(103, "Clean Code", "Robert C. Martin", 33.50));
        books.add(new Book(104, "A Brief History of Time", "Stephen Hawking", 15.75));
        books.add(new Book(105, "Effective Java", "Joshua Bloch", 45.00));

        System.out.println("Original list (insertion order):");
        printList(books);

        // Sort by title using Comparable (Book.compareTo)
        Collections.sort(books);
        System.out.println("\nSorted by title (Comparable):");
        printList(books);

        // Sort by price using PriceComparator (ascending)
        Collections.sort(books, new PriceComparator());
        System.out.println("\nSorted by price (ascending) (Comparator):");
        printList(books);

        // Sort by author using AuthorComparator (alphabetical)
        Collections.sort(books, new AuthorComparator());
        System.out.println("\nSorted by author (alphabetical) (Comparator):");
        printList(books);
    }

    private static void printList(List<Book> books) {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
