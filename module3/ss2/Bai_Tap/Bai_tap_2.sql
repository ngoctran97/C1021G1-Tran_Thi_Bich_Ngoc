drop database Bai_Tap_2;
create database Bai_Tap_2;
use Bai_Tap_2;

create table Customer(
cID int primary key auto_increment,
cName varchar(50),
cAge int
);

create table `Order`(
oID int primary key auto_increment,
cID int,
oName varchar(50),
oTotalPrice int,
foreign key(cID) references Customer(cID)
);

create table Product (
pID int auto_increment,
pName varchar(50),
pPrice int,
primary key(pID)
);

create table OrderDetail(
oID int,
pID int,
odQTY varchar(30),
primary key(oID,pID),
foreign key(oID) references `Order` (oID),
foreign key(pID) references Product (pID)
);
