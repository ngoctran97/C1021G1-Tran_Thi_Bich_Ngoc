
use Bai_Tap_2;

insert into Customer(cName,cAge)
value 
('Minh Quan',10),
('Ngoc Oanh',20),
('Hong Ha',50);
select * from Bai_Tap_2.Customer; 

insert into `Order`(cID,oDate,oTotalPrice)
value 
(1,'2006/03/21',Null),
(2,'2006/03/23',Null),
(1,'2006/03/16',Null);
select * from `Order`;

insert into Product(pName,pPrice)
value 
('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);
select * from Product;

insert into OrderDetail(oID,pID,odQTY)
value 
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
select * from Bai_Tap_2.OrderDetail;

