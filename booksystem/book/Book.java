package com.xworkz.booksystem.book;

import java.util.Objects;

public class Book {

    public int bookId;
    public String bookName;
    public int price;
    public String author;
    public String publisher;

    @Override
    public int hashCode() {

        return Objects.hash(bookId, bookName, price, author, publisher);

    }

    @Override
    public String toString(){

        return "Book-(bookId = "+this.bookId+" , bookName = "+this.bookName+" , " +
                "price = "+this.price+",author = "+this.author+", publisher = "+this.publisher+")";
    }


    // Object object = new Book(); -- Upcasting
    @Override
    public boolean equals(Object object){

        Book book = (Book)object;// Downcasting to compare states/values of book
        if(this.bookId == book.bookId &&
                this.bookName.equals(book.bookName) &&
                this.price == book.price &&
                this.author.equals(book.author) &&
                this.publisher.equals(book.publisher))

            return true;

        return false;
    }
}
