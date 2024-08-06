package com.keyin.Sprint_Backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.keyin.Sprint_Backend.entities.User;
import com.keyin.Sprint_Backend.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        logger.info("Fetching all users");
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            logger.error("Error fetching users", e);
            throw e;
        }
    }
}
