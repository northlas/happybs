package com.example.happybs.repo;

import com.example.happybs.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookRepository extends JpaRepository<Book, Long> {
    Collection<Book> findByCategoryId(Long id);
}
