package com.keyin.Sprint_Backend.repositories;

import com.keyin.Sprint_Backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
