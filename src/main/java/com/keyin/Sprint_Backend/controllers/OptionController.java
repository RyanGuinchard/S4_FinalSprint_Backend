package com.keyin.Sprint_Backend.controllers;

import com.keyin.Sprint_Backend.entities.Category;
import com.keyin.Sprint_Backend.entities.Option;
import com.keyin.Sprint_Backend.services.CategoryService;
import com.keyin.Sprint_Backend.services.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories/{categoryId}/options")
@CrossOrigin(origins = "*")
public class OptionController {

    @Autowired
    private OptionService optionService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Option> getOptionsByCategoryId(@PathVariable Long categoryId) {
        return optionService.getOptionsByCategoryId(categoryId);
    }

    @PostMapping
    public Option createOption(@PathVariable Long categoryId, @RequestBody Option option) {
        Category category = categoryService.getCategoryById(categoryId);
        option.setCategory(category);
        return optionService.saveOption(option);
    }

    @PutMapping("/{id}")
    public Option updateOption(@PathVariable Long id, @RequestBody Option option) {
        Option existingOption = optionService.getOptionById(id);
        existingOption.setOptionName(option.getOptionName());
        return optionService.saveOption(existingOption);
    }

    @DeleteMapping("/{id}")
    public void deleteOption(@PathVariable Long id) {
        optionService.deleteOption(id);
    }
}
