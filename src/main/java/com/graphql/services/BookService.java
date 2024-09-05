package com.graphql.services;

import java.util.List;

import com.graphql.entities.Book;

public interface BookService {

    //create
    Book create(Book book);

    //get all
    List<Book> getAll();

    //get single book
    Book get(int bookId);

}
