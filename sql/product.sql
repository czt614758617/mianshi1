-- 创建 Product 表
CREATE TABLE Product (
                         id INT
                         name VARCHAR(100) NOT NULL,
                         description TEXT,
                         price DECIMAL(10, 2) NOT NULL
);

-- 插入示例数据到 Product 表
INSERT INTO Product (name, description, price)
VALUES
    ('Laptop', 'High performance laptop with SSD', 1200.00),
    ('Smartphone', 'Latest smartphone model with AI features', 800.00),
    ('Headphones', 'Noise-cancelling headphones for immersive audio', 150.00);
