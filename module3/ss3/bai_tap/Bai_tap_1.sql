USE QuanLySinhVien;

select student.* from Student where Student.StudentName like "h%";

select class.* from Class where Class.StartDate like "%12%";

select * from `subject` where credit between 3 and 5;

SELECT * FROM student;
SET SQL_safe_updates = 0;
UPDATE student
SET student.ClassId = 2
WHERE student.StudentName = 'Hung';
SET SQL_safe_updates = 1;

SELECT student.StudentName, subject.SubName, mark.Mark 
FROM student student
JOIN mark mark on student.StudentId = mark.StudentId
JOIN subject subject on mark.SubId = subject.SubId
ORDER BY mark DESC ,StudentName ASC;