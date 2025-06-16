SELECT 
		c.customer_name,
        c.customer_email,
        o.order_date,
        p.product_name,
        p.product_price,
        od.quantity,
        (p.product_price * od.quantity) AS total_cost
	FROM customers c
    JOIN orders o ON c.customer_id=o.customer_id
    JOIN order_details od ON od.order_id=o.order_id
    JOIN products p ON p.product_id=od.product_id;