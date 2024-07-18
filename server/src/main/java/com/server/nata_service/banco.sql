-- Inserindo áreas
INSERT INTO area (name)
VALUES ('Software Development'),
       ('Data Science'),
       ('Network Security'),
       ('Web Development'),
       ('Database Management'),
       ('Cloud Computing'),
       ('Machine Learning'),
       ('Mobile Development'),
       ('UI/UX Design'),
       ('DevOps');

-- Inserindo certificados
INSERT INTO certificate (name)
VALUES ('Cert1'),
       ('Cert2'),
       ('Cert3'),
       ('Cert4'),
       ('Cert5'),
       ('Cert6'),
       ('Cert7'),
       ('Cert8'),
       ('Cert9'),
       ('Cert10');

-- Inserindo formações
INSERT INTO formation (name)
VALUES ('Bachelor''s Degree'),
       ('Master''s Degree'),
       ('PhD'),
       ('Diploma');

-- Inserindo tecnologias
INSERT INTO technology (name)
VALUES ('Java'),
       ('Python'),
       ('Cybersecurity'),
       ('JavaScript'),
       ('SQL'),
       ('AWS'),
       ('TensorFlow'),
       ('Kotlin'),
       ('Figma'),
       ('Docker');

-- Inserindo habilidades
INSERT INTO skill (description, area_id, certificate_id, formation_id, technology_id)
VALUES ('Expert in software development', 1, 1, 1, 1),
       ('Skilled in data analysis', 2, 2, 2, 2),
       ('Experienced in network security', 3, 3, 1, 3),
       ('Proficient in web development', 4, 4, 1, 4),
       ('Specialist in database management', 5, 5, 1, 5),
       ('Cloud solutions expert', 6, 6, 2, 6),
       ('ML and AI professional', 7, 7, 3, 7),
       ('Expert in mobile app development', 8, 8, 1, 8),
       ('Creative in UI/UX design', 9, 9, 4, 9),
       ('DevOps specialist', 10, 10, 2, 10);

-- Inserindo clientes
INSERT INTO client (email, name, password)
VALUES ('john.doe@example.com', 'John Doe', 'password123'),
       ('jane.smith@example.com', 'Jane Smith', 'password456'),
       ('michael.brown@example.com', 'Michael Brown', 'password789'),
       ('emily.jones@example.com', 'Emily Jones', 'password101'),
       ('daniel.wilson@example.com', 'Daniel Wilson', 'password202'),
       ('sarah.davis@example.com', 'Sarah Davis', 'password303'),
       ('david.martin@example.com', 'David Martin', 'password404'),
       ('laura.miller@example.com', 'Laura Miller', 'password505'),
       ('kevin.moore@example.com', 'Kevin Moore', 'password606'),
       ('linda.taylor@example.com', 'Linda Taylor', 'password707');

-- Inserindo empregados
INSERT INTO employee (birthday, email, name, password, photo, skill_id)
VALUES ('1990-01-15', 'alice.lee@example.com', 'Alice Lee', 'password123', 'photo1.jpg', 1),
       ('1985-02-20', 'bob.kim@example.com', 'Bob Kim', 'password456', 'photo2.jpg', 2),
       ('1992-03-25', 'charlie.nguyen@example.com', 'Charlie Nguyen', 'password789', 'photo3.jpg', 3),
       ('1988-04-30', 'diana.park@example.com', 'Diana Park', 'password101', 'photo4.jpg', 4),
       ('1995-05-05', 'edward.chen@example.com', 'Edward Chen', 'password202', 'photo5.jpg', 5),
       ('1983-06-10', 'fiona.liu@example.com', 'Fiona Liu', 'password303', 'photo6.jpg', 6),
       ('1991-07-15', 'george.smith@example.com', 'George Smith', 'password404', 'photo7.jpg', 7),
       ('1987-08-20', 'hannah.johnson@example.com', 'Hannah Johnson', 'password505', 'photo8.jpg', 8),
       ('1993-09-25', 'ian.white@example.com', 'Ian White', 'password606', 'photo9.jpg', 9),
       ('1989-10-30', 'julia.williams@example.com', 'Julia Williams', 'password707', 'photo10.jpg', 10);

-- Inserindo trabalhos
INSERT INTO work (date_end, date_start, name, employee_id, client_id)
VALUES ('2023-08-01', '2023-07-01', 'Project Alpha', 1, 1),
       ('2023-09-01', '2023-08-01', 'Project Beta', 2, 2),
       ('2023-10-01', '2023-09-01', 'Project Gamma', 3, 3),
       ('2023-11-01', '2023-10-01', 'Project Delta', 4, 4),
       ('2023-12-01', '2023-11-01', 'Project Epsilon', 5, 5),
       ('2024-01-01', '2023-12-01', 'Project Zeta', 6, 6),
       ('2024-02-01', '2024-01-01', 'Project Eta', 7, 7),
       ('2024-03-01', '2024-02-01', 'Project Theta', 8, 8),
       ('2024-04-01', '2024-03-01', 'Project Iota', 9, 9),
       ('2024-05-01', '2024-04-01', 'Project Kappa', 10, 10);

-- Inserindo feedbacks
INSERT INTO feedback (date, text, client_id, employee_id)
VALUES ('2023-06-01', 'Great work!', 1, 1),
       ('2023-06-02', 'Very satisfied.', 2, 2),
       ('2023-06-03', 'Good job.', 3, 3),
       ('2023-06-04', 'Excellent service.', 4, 4),
       ('2023-06-05', 'Highly recommend.', 5, 5),
       ('2023-06-06', 'Satisfied with the work.', 6, 6),
       ('2023-06-07', 'Job well done.', 7, 7),
       ('2023-06-08', 'Outstanding performance.', 8, 8),
       ('2023-06-09', 'Great job!', 9, 9),
       ('2023-06-10', 'Professional work.', 10, 10);
