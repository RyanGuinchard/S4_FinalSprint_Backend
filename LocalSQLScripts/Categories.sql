CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    game_id INT REFERENCES games(id),
    category_name VARCHAR(255) NOT NULL
);
