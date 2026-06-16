package com.northwind.northwind_api.service;

import com.northwind.northwind_api.model.Category;
import com.northwind.northwind_api.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Integer categoryId){
        return categoryRepository.findById(categoryId);
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    public boolean deleteCategory(Integer categoryId) {
        if(categoryRepository.existsById(categoryId)) {
            categoryRepository.deleteById(categoryId);
            return true;
        }
        return false;
    }
}
