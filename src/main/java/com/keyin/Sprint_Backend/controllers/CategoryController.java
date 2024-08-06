package com.keyin.Sprint_Backend.controllers;

import com.keyin.Sprint_Backend.entities.Category;
import com.keyin.Sprint_Backend.entities.Game;
import com.keyin.Sprint_Backend.services.CategoryService;
import com.keyin.Sprint_Backend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games/{gameId}/categories")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Category> getCategoriesByGameId(@PathVariable Long gameId) {
        return categoryService.getCategoriesByGameId(gameId);
    }

    @PostMapping
    public Category createCategory(@PathVariable Long gameId, @RequestBody Category category) {
        // Fetch the Game entity using the gameId
        Game game = gameService.getGameById(gameId);
        if (game == null) {
            throw new RuntimeException("Game not found");
        }

        // Set the game reference in the Category
        category.setGame(game);

        // Save and return the Category
        return categoryService.saveCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
}
