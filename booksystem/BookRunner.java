package com.xworkz.booksystem;

import com.xworkz.booksystem.book.Book;

public class BookRunner {

    public static void main(String[] args) {

        Book book = new Book();
        book.bookId = 1;
        book.bookName = "The Alchemist";
        book.price = 399;
        book.author = "Paulo Coelho";
        book.publisher = "HarperCollins";

        // Calls overridden toString() and prints object state
        System.out.println(book);



        Book book1 = new Book();
        book1.bookId = 1;
        book1.bookName = "The Alchemist";
        book1.price = 399;
        book1.author = "Paulo Coelho";
        book1.publisher = "HarperCollins";
        // Calls overridden toString() and prints object state
        System.out.println(book1);

        // Calls overridden hashCode()
        int bookHash = book.hashCode();
        System.out.println("HashCode number of book: " + bookHash);


        // Calls overridden hashCode() for book1
        int bookHash1 = book1.hashCode();
        System.out.println("HashCode number of book1: " + bookHash1);


        // Object object = new Book(); ----- Upcasting
        // Calls overridden equals() and compares object state
        boolean isEqual = book.equals(book1);

        System.out.println(
                "Values in book and book1 are same: " + isEqual
        );


        // equals() compares values/state here, not reference identity
    }
}