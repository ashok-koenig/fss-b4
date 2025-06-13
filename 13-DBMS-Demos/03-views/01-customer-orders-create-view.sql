CREATE VIEW customer_orders AS
SELECT 	
    c.customer_name,
    c.customer_email,
    o.*
    FROM orders o, customers c
    WHERE o.customer_id = c.customer_id;