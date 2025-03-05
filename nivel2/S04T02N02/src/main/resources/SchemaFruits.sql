CREATE DATABASE IF NOT EXISTS fruits
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE fruits;

CREATE TABLE IF NOT EXISTS fruit (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    quantity_kilos INT NOT NULL CHECK (quantity_kilos >= 0)
);

INSERT INTO fruit (name, quantity_kilos) VALUES 
('Manzana', 10),
('Banana', 20),
('Pera', 15);