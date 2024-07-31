package com.keyin.Sprint_Backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keyin.Sprint_Backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
