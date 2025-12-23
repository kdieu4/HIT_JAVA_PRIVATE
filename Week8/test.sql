CREATE DATABASE inventory_db;
USE inventory_db;

DROP DATABASE inventory_db;

-- Bảng danh mục (Ví dụ: Điện tử, Thời trang...)
CREATE TABLE category (
    id	CHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

-- Bảng sản phẩm, có khóa ngoại trỏ về category
CREATE TABLE product (
    id	CHAR(10) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DOUBLE NOT NULL,
    category_id CHAR(10),
    FOREIGN KEY (category_id) REFERENCES category(id)
);

-- Data mẫu
INSERT INTO category (name) VALUES ('Laptop'), ('Mobile');

SELECT * FROM category
SELECT * FROM product
