drop database demo;
create database demo;

use  demo;

create table products(
id int primary key auto_increment,
product_code int,
product_name varchar(50),
product_price double,
product_amount int,
product_description varchar(50),
product_status varchar(50)
);
-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
insert into products(product_code,product_name,product_price,product_amount,product_description,product_status) 
value 
(101,'NIKE', 200.0, 10, 'WHITE', 'NEW'),
(102,'ADDIDAS' ,250.0, 15, 'BLACK','NEW'),
(103,'PUMA',200.0, 13,'GREEN','NEW');
select * from products;

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create unique index product_code on products(product_code);

create index product_name_price on products(product_name,product_price);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
Explain select * from products where product_name = "ADIDAS";

-- So sánh câu truy vấn trước và sau khi tạo index
drop index product_name_price on products;
 
-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
CREATE VIEW product_view AS
    SELECT 
        products.product_code,
        product_name,
        product_price,
        product_amount,
        product_description,
        product_status
    FROM
        products;

SELECT *FROM product_view;

 -- Tiến hành sửa đổi view
 CREATE OR REPLACE VIEW product_view AS
    SELECT 
        product_code, 
        product_name, 
        product_price,
        product_status
    FROM
        products;
-- Tiến hành xoá view
-- drop view product_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
DELIMITER //
create procedure find_all_products()
begin
select * from products;
end //
DELIMITER //
call find_all_products();


-- Tạo store procedure thêm một sản phẩm mới
DELIMITER //
create procedure sp_themproducts(
id int,
product_code int,
product_name varchar(50),
product_price double,
product_amount int,
product_description varchar(50),
product_status varchar(50))
BEGIN
INSERT INTO products
VALUES
( id,product_code, product_name, product_price, product_amount, product_description, product_status);
END //
DELIMITER //
CALL sp_themproducts(8,117,"AIL",300.0,15,'GREEN','NEW');

-- Tạo store procedure sửa thông tin sản phẩm theo id
DELIMITER //
create procedure edit_product (
id int ,
product_code int,
product_name varchar(50),
product_price int,
product_amount int,
product_description varchar(50),
product_status varchar(50))
begin
update products
set
product_code = product_code,
product_name = product_name,
product_price = product_price,
product_amount = product_amount,
product_description = product_description,
product_status = product_status
WHERE products.id = id;
END; //
DELIMITER ;
CALL edit_product(6,101,'NIKE', 200.0, 10, 'WHITE', 'NEW');

-- Tạo store procedure xoá sản phẩm theo id
-- DELIMITER //
-- CREATE PROCEDURE delete_product (id INT)
-- BEGIN 
-- DELETE 
-- FROM products
-- WHERE products.id=id;
-- END; //
-- DELIMITER ;
-- CALL delete_product(4);
