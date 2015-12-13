package com.jcai;

import com.sun.jndi.cosnaming.IiopUrl;

/**
 * Created by jcai on 1/29/15.
 */
public class Library {

    String LibraryName;
    String[] ServingSuburb;
    Book[] books;
    static int NumberofBooks;

    Library(){
        int i;
        books = new Book[10];
        NumberofBooks = 0;
        ServingSuburb = new String[2];
        ServingSuburb[0] = "Campbell";
        ServingSuburb[1] = "Santa Clara";
    }

    public void add_book(String title, String author_firstname, String author_lastname, String isbn, String date) {
        books[NumberofBooks] = new Book(title, author_firstname, author_lastname, isbn, date);
        NumberofBooks++;
    }

    public void lend_book(Book b) {
        b.Borrowed = true;
    }

    public void return_book(Book b) {
        b.Borrowed = false;
    }

    public static int getLibraryInvtNo(){
        return NumberofBooks;
    }

    public static void main(String[] args) {
        // write your code here
    }
}
