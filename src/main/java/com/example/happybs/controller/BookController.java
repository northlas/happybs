package com.example.happybs.controller;

import com.example.happybs.model.Book;
import com.example.happybs.model.Response;
import com.example.happybs.service.BookService;
import com.example.happybs.service.implementation.BookServiceImpl;
import com.example.happybs.service.implementation.DetailServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    @GetMapping
    public ResponseEntity<Response> getAllBook() {
        Collection<Book> books = bookService.findAll();

        return ResponseEntity.ok(
            Response.builder()
                .timeStamp(now())
                .data(Map.of("books", books))
                .message("Books retrieved")
                .status(OK)
                .statusCode(OK.value())
                .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getBook(@PathVariable("id") Long id) {
        Book book = bookService.get(id);

        return ResponseEntity.ok(
            Response.builder()
                    .timeStamp(now())
                    .data(Map.of("book", book))
                    .message("Book retrieved: %s".formatted(book.getTitle()))
                    .status(OK)
                    .statusCode(OK.value())
                    .build()
        );
    }
}
