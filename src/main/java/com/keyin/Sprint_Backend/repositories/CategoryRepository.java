package com.keyin.Sprint_Backend.repositories;

import com.keyin.Sprint_Backend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByGameId(Long gameId);
}
