package com.example.happybs.controller;

import com.example.happybs.model.Book;
import com.example.happybs.model.Category;
import com.example.happybs.model.Response;
import com.example.happybs.service.BookService;
import com.example.happybs.service.CategoryService;
import com.example.happybs.service.implementation.BookServiceImpl;
import com.example.happybs.service.implementation.CategoryServiceImpl;
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
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;
    private final BookService bookService;

    @GetMapping
    public ResponseEntity<Response> getAllCategory() {
        Collection<Category> categories = categoryService.findAll();

        return ResponseEntity.ok(
            Response.builder()
                .timeStamp(now())
                .data(Map.of("categories", categories))
                .message("Categories retrieved")
                .status(OK)
                .statusCode(OK.value())
                .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getCategory(@PathVariable("id") Long id) {
        Category category = categoryService.get(id);

        return ResponseEntity.ok(
            Response.builder()
                    .timeStamp(now())
                    .data(Map.of("category", category))
                    .message("Category retrieved: %s".formatted(category.getCategory()))
                    .status(OK)
                    .statusCode(OK.value())
                    .build()
        );
    }

    @GetMapping("/{id}/book")
    public ResponseEntity<Response> getCategoryBook(@PathVariable("id") Long id) {
        Collection<Book> books = bookService.getCategoryBooks(id);

        return ResponseEntity.ok(
            Response.builder()
                .timeStamp(now())
                .data(Map.of("books", books))
                .message("Books for category %s retrieved".formatted(categoryService.get(id)))
                .status(OK)
                .statusCode(OK.value())
                .build()
        );
    }
}
