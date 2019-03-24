insert into student(id, first_name, second_name)
values
  (1 , 'Jack'     ,  'Mongomery'),
  (2 , 'Alfred'   ,  'Hichkok'),
  (3 , 'Annet'    ,  'Rose'),
  (4 , 'Ingrid'   ,  'Faust'),
  (5 , 'Mike'     ,  'Smith'),
  (6 , 'Andrew'   ,  'Mallou'),
  (7 , 'Jackline' ,  'Stroun');

insert into groups (id, `name`)
values
  (1, 'FEI-11'),
  (2, 'FEI-12'),
  (3, 'FEI-21'),
  (4, 'FEI-22');

insert into groups_students(group_model_id, students_id)
values
  (1, 1),
  (1, 2),
  (2, 3),
  (2, 4),
  (3, 5),
  (3, 6),
  (4, 7);

insert into teacher(id, first_name, second_name, middle_name, department)
values
  (1, 'first', 'teacher', 'mid', 'FIRST'),
  (2, 'second', 'teacher', 'mid', 'SECOND');

insert into `time`(id, start_time, end_time)
values
  (1, '08:30:00', '09:50:00'),
  (2, '10:10:00', '11:30:00'),
  (3, '11:50:00', '13:10:00'),
  (4, '13:30:00', '14:50:00'),
  (5, '15:05:00', '16:25:00'),
  (6, '16:40:00', '18:00:00');

insert into subject(id, `name`, semester)
values
  (1, 'Math', 0),
  (2, 'Physics', 0),
  (3, 'OOP', 1),
  (4, 'Discrete mathematics', 1);

insert into schedule(id, subject_id, teacher_id, time_id, group_id, `day`)
values
  (1, 1, 1, 2, 1, 0),
  (9, 2, 2, 3, 1, 0),
  (10, 3, 1, 4, 1, 0),
  (11, 4, 2, 5, 1, 0),
  (2, 1, 1, 2, 2, 0),
  (3, 1, 2, 2, 3, 3),
  (4, 1, 2, 3, 4, 3),
  (5, 2, 1, 1, 2, 1),
  (6, 2, 1, 4, 1, 1),
  (7, 2, 2, 2, 4, 2),
  (8, 2, 2, 3, 3, 2);
