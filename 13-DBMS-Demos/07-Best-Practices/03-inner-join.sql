SELECT s.*, e.enrollment_date, c.course_name, c.course_credit
	FROM students s
    JOIN enrollments e ON s.student_id = e.student_id
    JOIN courses c ON e.course_id=c.course_id;