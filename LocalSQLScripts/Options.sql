CREATE TABLE options (
    id SERIAL PRIMARY KEY,
    category_id INT REFERENCES categories(id),
    option_name VARCHAR(255) NOT NULL
);