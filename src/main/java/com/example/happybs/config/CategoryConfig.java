package com.example.happybs.config;

import com.example.happybs.model.Category;
import com.example.happybs.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CategoryConfig {
    private final CategoryService categoryService;
    public void categorySeeder() {
            categoryService.save(new Category(null,"Computers"));
            categoryService.save(new Category(null,"Fiction"));
            categoryService.save(new Category(null,"Business"));
            categoryService.save(new Category(null,"Religion"));
            categoryService.save(new Category(null,"Science"));
            categoryService.save(new Category(null,"Music"));
    }
}
