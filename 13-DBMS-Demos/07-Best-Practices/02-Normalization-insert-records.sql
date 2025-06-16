INSERT INTO students(student_id, student_name, student_email) VALUES
	(1, 'Johnson', 'johnson@email.com'),
    (2, 'Smith', 'smith@email.com'),
    (3, 'Bob', 'bob@email.com');
    
INSERT INTO courses(course_id, course_name, course_credit) VALUES
	(101, 'Database Systems', 5),
    (102, 'Spring Boot', 4),
    (103, 'Angular', 5);
    
INSERT INTO instructors(instructor_id, instructor_name, instructor_phone) VALUES
	(201, 'Dr. Miller', '0987654321'),
    (202, 'Dr. Peter','0675558787');
    
INSERT INTO enrollments(enrollment_id, student_id, course_id, enrollment_date) VALUES
	(301, 1, 101, '2025-06-07'),
    (302, 2, 102, '2025-06-15');
    
INSERT INTO course_assignments(assignment_id, instructor_id, course_id) VALUES
	(401, 201, 102),
    (402, 202, 101);