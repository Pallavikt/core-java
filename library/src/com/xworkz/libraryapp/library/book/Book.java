package com.xworkz.libraryapp.library.book;

import com.xworkz.libraryapp.library.Library;

public class Book extends Library {

    @Override
    public void openLibrary() {
        System.out.println("Book Opening Library");
    }

    @Override
    public void addBook() {
        System.out.println("Book Added");
    }

    @Override
    public void issueBook() {
        System.out.println("Book Issued");
    }

    @Override
    public void returnBook() {
        System.out.println("Book Returned");
    }

    @Override
    public void searchBook() {
        System.out.println("Book Searched");
    }

    @Override
    public void renewBook() {
        System.out.println("Book Renewed");
    }

    @Override
    public void checkAvailability() {
        System.out.println("Book Availability Checked");
    }

    @Override
    public void maintainRecords() {
        System.out.println("Book Records Maintained");
    }

    @Override
    public void closeLibrary() {
        System.out.println("Book Closing Library");
    }
}