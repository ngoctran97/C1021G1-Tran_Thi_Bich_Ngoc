use QuanLySinhVien;
select * from `Subject`
where credit = (select max(credit) from `Subject`);

-- select SubId,SubName, Credit, max(Credit) from `Subject` group by SubId; 
SELECT `subject`.*, mark.Mark FROM `subject`
INNER JOIN Mark on `subject`.SubID = Mark.SubID ORDER BY Mark DESC LIMIT 1;

SELECT Student.*, AVG(Mark)
FROM Student join Mark on Student.StudentId = Mark.StudentId
GROUP BY Student.StudentId;
 
