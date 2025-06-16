SELECT s.*, 
		e.enrollment_date, 
        c.course_name, 
        c.course_credit,
        i.instructor_name,
        i.instructor_phone
	FROM students s
    JOIN enrollments e ON s.student_id = e.student_id
    JOIN courses c ON e.course_id=c.course_id
    JOIN course_assignments ca ON ca.course_id=c.course_id
    JOIN instructors i ON i.instructor_id=ca.instructor_id;