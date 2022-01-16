SELECT * FROM caseStudy.khach_hang;

select * from caseStudy.khach_hang 
where (year(current_timestamp) - year(ngay_sinh) ) between 18 and 50
and (dia_chi like "%Đà Nẵng" or dia_chi like "%Quảng Trị");