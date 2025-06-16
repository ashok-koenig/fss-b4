SELECT i.*, c.course_name, c.course_credit
	FROM instructors i
    JOIN course_assignments ca ON i.instructor_id=ca.instructor_id
    JOIN courses c ON ca.course_id = c.course_id;