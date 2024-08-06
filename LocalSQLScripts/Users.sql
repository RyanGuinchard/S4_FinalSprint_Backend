CREATE TABLE users (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    enabled BOOLEAN NOT NULL
);

INSERT INTO users (username, password, enabled) VALUES
('Justin', '$2b$12$rAqXA3EdZbLj5v0VExlBWe/xDdR8DpoaBzz/b6I9JgZ6k9wlWCSca', true),
('Ryan', '$2b$12$IXv3mZ/E3kPnCV8IqgW9fehuWX5Y8u4eMJqVz2MfhlRgrXX5ZCgPy', true),
('Chris', '$2b$12$3gMAm1bA6f4tC2JkwZy1yOjsgsS7b4hQ6J6UX7qBBzjsa5Lr5GZQG', true);