CREATE TABLE authorities (
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_authorities_users FOREIGN KEY(username) REFERENCES users(username)
);

INSERT INTO authorities (username, authority) VALUES
('Justin', 'ROLE_ADMIN'),
('Ryan', 'ROLE_ADMIN'),
('Chris', 'ROLE_ADMIN');