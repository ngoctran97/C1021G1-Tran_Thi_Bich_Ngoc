use Bai_Tap_2;

select oID,oDate,oTotalPrice from `order`;

select customer.cName, GROUP_CONCAT(product.pName) AS "list products" 
from customer
inner join `order` on customer.cID = `order`.cID
inner join orderDetail on `order`.oID= orderDetail.oID
inner join product on product.pID = orderDetail.pID
GROUP BY customer.cName;

SELECT * FROM customer
WHERE customer.cName NOT IN (
SELECT customer.cName
 FROM customer 
 inner join `order` on customer.cID = `order`.cID
);

SELECT orderDetail.oID,`order`.oDate,SUM(orderDetail.odQTY * product.pPrice ) AS "total price"
 FROM customer INNER JOIN `order` on customer.cID = `order`.cID 
 INNER JOIN orderDetail on orderDetail.oID = `order`.oID 
 INNER JOIN product on product.pID = orderDetail.pID 
 GROUP BY orderDetail.oID;