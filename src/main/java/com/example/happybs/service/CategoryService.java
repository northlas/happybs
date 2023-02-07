package com.example.happybs.service;

import com.example.happybs.model.Category;

import java.util.Collection;

public interface CategoryService {
    Category save(Category category);
    Category get(Long id);
    Collection<Category> findAll();
}
