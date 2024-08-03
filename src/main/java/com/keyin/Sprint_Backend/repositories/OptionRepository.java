package com.keyin.Sprint_Backend.repositories;

import com.keyin.Sprint_Backend.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long> {
    List<Option> findByCategoryId(Long categoryId);
}
