package com.keyin.Sprint_Backend.repositories;

import com.keyin.Sprint_Backend.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
