package com.example.happybs.service;

import com.example.happybs.model.Book;

import java.util.Collection;

public interface BookService {
    Book save(Book book);
    Book get(Long id);
    Collection<Book> findAll();
    Collection<Book> getCategoryBooks(Long id);
}
