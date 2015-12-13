package com.jcai;

import java.util.Date;

/**
 * Created by jcai on 1/29/15.
 */
public class Book {
    String Title;
    String Author_FirstName;
    String Author_LastName;
    String ISBN;
    String Publish_date;
    boolean Borrowed;

    Book (String title, String author_FirstName, String author_LastName, String isbn,  String publish_date) {
        Title = title;
        Author_FirstName = author_FirstName;
        Author_LastName = author_LastName;
        ISBN = isbn;
        Publish_date = publish_date;
        Borrowed = false;
    }

    public String get_title () {
        return Title;
    }

    public String get_author() {
        return Author_FirstName + Author_LastName;
    }

    public String get_isbn () {
        return ISBN;
    }

    public String DateOfPublishing () {
        return Publish_date;
    }

    public void borrow_book() {
        Borrowed = true;
    }

    public void return_book() {
        Borrowed = false;
    }

}
