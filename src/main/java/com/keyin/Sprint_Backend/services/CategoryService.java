package com.keyin.Sprint_Backend.services;

import com.keyin.Sprint_Backend.entities.Category;
import com.keyin.Sprint_Backend.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategoriesByGameId(Long gameId) {
        return categoryRepository.findByGameId(gameId);
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
