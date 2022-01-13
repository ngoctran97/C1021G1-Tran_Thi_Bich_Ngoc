drop database quan_ly_sinh_vien;
create database quan_ly_sinh_vien;


use quan_ly_sinh_vien;

create table class(
id_class int,
name_class varchar(70),
primary key(id_class)
);
select * from class;
insert into class values(1, "ngoc"),(2,"khoa");

CREATE TABLE teacher(
id int primary key auto_increment, 
`name` varchar(20),
age int ,
country varchar(200)
);

insert into teacher (`name`,age, country)
value ("ngoc",18,"hue"),("xiu",20,"da nang");
SELECT * FROM teacher; 