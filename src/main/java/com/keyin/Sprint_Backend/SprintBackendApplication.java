package com.keyin.Sprint_Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.keyin.Sprint_Backend.repositories")
public class SprintBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBackendApplication.class, args);
	}
}
