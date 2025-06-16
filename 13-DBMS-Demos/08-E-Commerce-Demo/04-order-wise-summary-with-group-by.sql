SELECT 
		o.order_id,
        o.order_date,
        c.customer_name,
        sum(p.product_price * od.quantity) AS order_amount
	FROM customers c
    JOIN orders o ON c.customer_id=o.customer_id
    JOIN order_details od ON o.order_id=od.order_id
    JOIN products p ON od.product_id=p.product_id
    GROUP BY o.order_id, order_date, c.customer_name