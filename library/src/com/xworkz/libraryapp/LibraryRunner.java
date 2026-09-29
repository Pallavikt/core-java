package com.xworkz.libraryapp;

import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.library.book.Book;

public class LibraryRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Library library = new Library();

        library.openLibrary();
        library.addBook();
        library.issueBook();
        library.returnBook();
        library.searchBook();


        Library library1 = new Book();

        library1.openLibrary();
        library1.addBook();
        library1.issueBook();
        library1.returnBook();
        library1.searchBook();


        Book book = new Book();

        book.openLibrary();
        book.addBook();
        book.issueBook();
        book.returnBook();
        book.searchBook();

        System.out.println("Main Ended");
    }
}