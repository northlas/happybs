package com.example.happybs.service.implementation;

import com.example.happybs.exception.ApiRequestException;
import com.example.happybs.model.Category;
import com.example.happybs.repo.CategoryRepository;
import com.example.happybs.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public Category save(Category category) {
        log.info("Saving new category: {}", category.getCategory());
        return categoryRepository.save(category);
    }
    @Override
    public Category get(Long id) {
        log.info("Fetching category with id: {}", id);
        return categoryRepository.findById(id).orElseThrow(() -> {
            return new ApiRequestException("Category not found");
        });
    }
    @Override
    public Collection<Category> findAll() {
        log.info("Fetching all category");
        return categoryRepository.findAll();
    }
}
