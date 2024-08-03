package com.keyin.Sprint_Backend.controllers;

import com.keyin.Sprint_Backend.entities.Option;
import com.keyin.Sprint_Backend.services.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories/{categoryId}/options")
public class OptionController {

    @Autowired
    private OptionService optionService;

    @GetMapping
    public List<Option> getOptionsByCategoryId(@PathVariable Long categoryId) {
        return optionService.getOptionsByCategoryId(categoryId);
    }

    @PostMapping
    public Option createOption(@RequestBody Option option) {
        return optionService.saveOption(option);
    }

    @DeleteMapping("/{id}")
    public void deleteOption(@PathVariable Long id) {
        optionService.deleteOption(id);
    }
}
