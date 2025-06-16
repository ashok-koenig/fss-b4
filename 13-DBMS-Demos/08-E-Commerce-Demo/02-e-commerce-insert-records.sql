INSERT INTO customers(customer_name, customer_email, customer_phone) VALUES
	('John', 'john@email.com', '089089787'),
    ('Smith', 'smith@email.com', '078787787'),
    ('Peter', 'peter@email.com', '0566787887');
    
INSERT INTO products(product_name, product_price, product_stock) VALUES
	('iPhone 16', 89898, 10),
    ('HP Laptop', 66887, 5),
    ('Dell Laptop', 88683, 10);
    
INSERT INTO orders(customer_id) VALUES
	(1),
    (2);
    
INSERT INTO order_details(order_id, product_id, quantity) VALUES
	(1, 1, 2),
    (1, 2, 3),
    (2, 1, 5),
    (2, 3, 1);