package com.example.happybs.service.implementation;

import com.example.happybs.exception.ApiRequestException;
import com.example.happybs.model.Book;
import com.example.happybs.repo.BookRepository;
import com.example.happybs.service.BookService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
    @Override
    public Book get(Long id) {
        log.info("Fetching book with id: {}", id);
        return bookRepository.findById(id).orElseThrow(() -> {
            return new ApiRequestException("Book not found");
        });
    }
    @Override
    public Collection<Book> findAll() {
        log.info("Fetching all book");
        return bookRepository.findAll();
    }
    @Override
    public Collection<Book> getCategoryBooks(Long id) {
        log.info("Fetching book of category id: {}", id);
        return bookRepository.findByCategoryId(id);
    }
}
