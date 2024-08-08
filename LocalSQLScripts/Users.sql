CREATE TABLE users (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    enabled BOOLEAN NOT NULL
);

INSERT INTO users (username, password, enabled) VALUES
('Justin', '$2a$10$MjobFGYDPGdQCc21MtqhEew3JOqTGB5.w4PTPWkOWDBIbp8HO3vya', true),
('Ryan', '$2a$10$AibuVY1GXkLWG8.I2UqiTOkGxq1gEfckuR0GKHHNv7WODTHyxGOWO', true),
('Chris', '$2a$10$gzjAHu0QUETHFUgWBtL.dOl7OwBzmwKKIuqJQrxCsb5fN4IaKpkKO', true);