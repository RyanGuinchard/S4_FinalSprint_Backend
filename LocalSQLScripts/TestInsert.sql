-- Insert data into the games table
INSERT INTO games (title) VALUES ('Fallout 4');

-- Insert data into the categories table
INSERT INTO categories (game_id, category_name) VALUES
(1, 'Settlement'),
(1, 'Companion');

-- Insert data into the options table
INSERT INTO options (category_id, option_name) VALUES
(1, 'Abernathy Farm'),
(1, 'Boston Airport'),
(1, 'Bunker Hill'),
(2, 'Codsworth'),
(2, 'Dogmeat'),
(2, 'Piper Wright');