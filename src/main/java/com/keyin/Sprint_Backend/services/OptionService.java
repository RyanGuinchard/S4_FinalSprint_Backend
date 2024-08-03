package com.keyin.Sprint_Backend.services;

import com.keyin.Sprint_Backend.entities.Option;
import com.keyin.Sprint_Backend.repositories.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    @Autowired
    private OptionRepository optionRepository;

    public List<Option> getOptionsByCategoryId(Long categoryId) {
        return optionRepository.findByCategoryId(categoryId);
    }

    public Option saveOption(Option option) {
        return optionRepository.save(option);
    }

    public void deleteOption(Long id) {
        optionRepository.deleteById(id);
    }
}
