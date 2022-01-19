
use caseStudy;


-- 2. Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là
-- một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
SELECT 
    *
FROM
    nhan_vien
WHERE
    (ho_ten LIKE 'h%' OR ho_ten LIKE 'k%'
        OR ho_ten LIKE 't%')and (char_length(ho_ten)<15);

-- 3. Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
-- có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT 
    *
FROM
    khach_hang
WHERE
    (YEAR(CURRENT_TIMESTAMP) - YEAR(ngay_sinh)) BETWEEN 18 AND 50
        AND (dia_chi LIKE '%Đà Nẵng'
        OR dia_chi LIKE '%Quảng Trị');


-- 4. Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu
-- lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
-- khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là
-- “Diamond”.

SELECT 
    khach_hang.ma_khach_hang,
    khach_hang.ho_ten,
    COUNT(*) so_lan_dat_phong
FROM
    khach_hang
        JOIN
    hop_dong ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        JOIN
    loai_khach ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
WHERE
    loai_khach.ten_loai_khach = 'Diamond'
GROUP BY khach_hang.ma_khach_hang
ORDER BY so_lan_dat_phong ASC;



-- 5. Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong,
-- ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với
-- tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng *
-- Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
-- hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những
-- khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select
     khach_hang.ma_khach_hang,
     khach_hang.ho_ten,
     loai_khach.ten_loai_khach,
     hop_dong.ma_hop_dong,
     dich_vu.ten_dich_vu,
	 hop_dong.ngay_lam_hop_dong,
     hop_dong.ngay_ket_thuc,

    --   CASE
-- WHEN khach_hang.ma_khach_hang NOT IN
--     (SELECT khach_hang.ma_khach_hang FROM
--      khach_hang INNER JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
--      )
--      THEN 0
--      WHEN hop_dong_chi_tiet.so_luong IS NULL THEN dich_vu.chi_phi_thue
--     ELSE sum(dich_vu.chi_phi_thue+(hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia))
--      END
--      AS “tong_tien”
   
     IF(hop_dong_chi_tiet.so_luong IS NULL,
         dich_vu.chi_phi_thue,
         SUM(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia)) AS 'Tong_tien'
FROM
    khach_hang
        LEFT JOIN
    loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
   LEFT JOIN
     hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
         LEFT JOIN
     dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
         LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
        LEFT JOIN
     dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
 GROUP BY hop_dong.ma_khach_hang;





-- 6. Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue,
-- ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng
-- thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).


 SELECT 
    dv.ma_dich_vu,
    dv.ten_dich_vu,
    dv.dien_tich,
    dv.chi_phi_thue,
    ldv.ten_loai_dich_vu
FROM
    dich_vu AS dv
        JOIN
    loai_dich_vu AS ldv ON dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
        JOIN
    hop_dong AS hd ON dv.ma_dich_vu = hd.ma_dich_vu
WHERE
    dv.ma_dich_vu NOT IN (SELECT 
            dv.ma_dich_vu
        FROM
            dich_vu AS dv
                JOIN
            loai_dich_vu AS ldv ON dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
                JOIN
            hop_dong AS hd ON dv.ma_dich_vu = hd.ma_dich_vu
        WHERE
            YEAR(hd.ngay_lam_hop_dong) = 2021
                AND QUARTER(hd.ngay_lam_hop_dong) = 1
                AND dv.ma_dich_vu IN (SELECT 
                    dv.ma_dich_vu
                FROM
                    dich_vu AS dv
                        JOIN
                    loai_dich_vu AS ldv ON dv.ma_loai_dich_vu = ldv.ma_loai_dich_vu
                        JOIN
                    hop_dong AS hd ON dv.ma_dich_vu = hd.ma_dich_vu
                WHERE
                    YEAR(hd.ngay_lam_hop_dong) = 2020
                        OR YEAR(hd.ngay_lam_hop_dong) = 2021
                        OR QUARTER(hd.ngay_lam_hop_dong) IN (2 , 3, 4)))
GROUP BY dv.ma_dich_vu
;


-- 7. Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich,
-- so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại
-- dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng
-- chưa từng được khách hàng đặt phòng trong năm 2021.
SELECT 
    dich_vu.ma_dich_vu,
    dich_vu.ten_dich_vu,
    dich_vu.dien_tich,
    dich_vu.so_nguoi_toi_da,
    dich_vu.chi_phi_thue,
    loai_dich_vu.ten_loai_dich_vu
FROM
    dich_vu
        JOIN
    loai_dich_vu ON loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
        JOIN
    hop_dong ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
WHERE
    dich_vu.ma_dich_vu  IN (SELECT 
            hop_dong.ma_dich_vu
        FROM
            hop_dong
        WHERE
            YEAR(hop_dong.ngay_lam_hop_dong) = 2020)
GROUP BY dich_vu.ma_dich_vu;


-- 8. Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu
-- ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.

-- cach 1
select DISTINCT khach_hang.ho_ten from khach_hang;
 
-- cach 2
select khach_hang.ho_ten from khach_hang 
union 
select khach_hang.ho_ten from khach_hang;

-- cach 3
SELECT
     ho_ten
FROM
    khach_hang
GROUP BY ho_ten;


-- 9. Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi
-- tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt
-- phòng.
SELECT 
    MONTH(ngay_lam_hop_dong) thang,
    COUNT(MONTH(ngay_lam_hop_dong)) so_luong_khach_hang
FROM
    hop_dong
WHERE
    YEAR(ngay_lam_hop_dong) = 2021
GROUP BY MONTH(ngay_lam_hop_dong)
ORDER BY MONTH(ngay_lam_hop_dong);


-- 10. Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu
-- dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong,
-- ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc,
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở
-- dich_vu_di_kem).

SELECT 
    hop_dong.ma_hop_dong,
    hop_dong.ngay_lam_hop_dong,
    hop_dong.ngay_ket_thuc,
    hop_dong.tien_dat_coc,
    SUM(IFNULL(so_luong, 0)) AS so_luong_dich_vu_di_kem
FROM
    hop_dong
        LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
GROUP BY hop_dong.ma_hop_dong;


-- 11. Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách
-- hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc
-- “Quảng Ngãi”.

SELECT 
    dich_vu_di_kem.ma_dich_vu_di_kem,
    dich_vu_di_kem.ten_dich_vu_di_kem
FROM
    dich_vu_di_kem
        JOIN
    hop_dong_chi_tiet ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
        JOIN
    hop_dong ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
        JOIN
    khach_hang ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        JOIN
    loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
WHERE
    (loai_khach.ten_loai_khach = 'Diamond')
        AND (khach_hang.dia_chi LIKE '%Vinh'
        OR khach_hang.dia_chi LIKE '%Quảng Ngãi');

-- 12. Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách
-- hàng), so_dien_thoai (khách hàng), ten_dich_vu,
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong 
-- dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được
-- khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

SELECT 
    hop_dong.ma_hop_dong,
    nhan_vien.ho_ten,
    khach_hang.ho_ten,
    khach_hang.so_dien_thoai,
    dich_vu.ma_dich_vu,
    dich_vu.ten_dich_vu,
    SUM(IFNULL(so_luong, 0)) AS so_luong_dich_vu_di_kem,
    hop_dong.tien_dat_coc
FROM
    khach_hang
        JOIN
    hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
        JOIN
    nhan_vien ON hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
        JOIN
    dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
        LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
         LEFT JOIN
     dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
	WHERE
	(dich_vu.ten_dich_vu IN (
    SELECT dich_vu.ten_dich_vu FROM dich_vu 
    INNER JOIN hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
    WHERE ((month(hop_dong.ngay_lam_hop_dong) IN (10,11,12)) and year(hop_dong.ngay_lam_hop_dong) = 2020) ))
    and  
	(dich_vu.ten_dich_vu NOT IN (
    SELECT dich_vu.ten_dich_vu FROM dich_vu
    INNER JOIN hop_dong ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
    WHERE ((month(hop_dong.ngay_lam_hop_dong) IN (1,2,3,4,5,6)) and year(hop_dong.ngay_lam_hop_dong) = 2021)))
    GROUP BY hop_dong.ma_hop_dong;



-- SELECT 
--     hd.ma_hop_dong,
--     nv.ho_ten,
--     kh.ho_ten,
--     kh.so_dien_thoai,
--     dv.ten_dich_vu,
--     SUM(IFNULL(hdct.so_luong, 0)) AS so_luong_dich_vu_di_kem,
--     hd.tien_dat_coc
-- FROM
--     hop_dong AS hd
--         JOIN
--     nhan_vien nv ON hd.ma_nhan_vien = nv.ma_nhan_vien
--         JOIN
--     khach_hang kh ON kh.ma_khach_hang = hd.ma_khach_hang
--         JOIN
--     dich_vu dv ON hd.ma_dich_vu = dv.ma_dich_vu
--         LEFT JOIN
--     hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
-- WHERE    
--     hd.ma_hop_dong IN (SELECT 
--             ma_hop_dong
--         FROM
--             hop_dong
--         WHERE
--             (MONTH(ngay_lam_hop_dong) BETWEEN 10 AND 12)
--                 AND YEAR(ngay_lam_hop_dong) = 2020)
--           AND hd.ma_hop_dong NOT IN (SELECT 
--              ma_hop_dong
--          FROM
--              hop_dong
--          WHERE
--              (MONTH(ngay_lam_hop_dong) BETWEEN 1 AND 6)
--                 AND YEAR(ngay_lam_hop_dong) = 2021)
--                 
-- GROUP BY ma_hop_dong;
              

 

-- 13. Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các
-- Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử
-- dụng nhiều như nhau).

SELECT 
    dich_vu_di_kem.ma_dich_vu_di_kem,
    dich_vu_di_kem.ten_dich_vu_di_kem,
    SUM(hop_dong_chi_tiet.so_luong) AS so_luong_dich_vu_di_kem
FROM
    dich_vu_di_kem
        JOIN
    hop_dong_chi_tiet ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
    
   --  group by ma_dich_vu_di_kem
--     HAVING SUM(so_luong) >= 
-- (SELECT MAX(so_luong)
--     FROM
--         hop_dong_chi_tiet);
GROUP BY hop_dong_chi_tiet.ma_dich_vu_di_kem
HAVING so_luong_dich_vu_di_kem >= ALL (SELECT 
        so_luong
    FROM
        hop_dong_chi_tiet);

-- 14. Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một
-- lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong,
-- ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính
-- dựa trên việc count các ma_dich_vu_di_kem).

SELECT 
    hop_dong.ma_hop_dong,
    loai_dich_vu.ten_loai_dich_vu,
    dich_vu_di_kem.ten_dich_vu_di_kem,
    COUNT(dich_vu_di_kem.ma_dich_vu_di_kem) AS so_lan_su_dung
FROM
    hop_dong
        INNER JOIN
    dich_vu ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
        INNER JOIN
    loai_dich_vu ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
        INNER JOIN
    hop_dong_chi_tiet ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
        INNER JOIN
    dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
GROUP BY ten_dich_vu_di_kem
HAVING COUNT(dich_vu_di_kem.ma_dich_vu_di_kem) = 1;

-- 15. Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten,
-- ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được
-- tối đa 3 hợp đồng từ năm 2020 đến 2021.
SELECT 
    nhan_vien.ma_nhan_vien,
    nhan_vien.ho_ten,
    trinh_do.ten_trinh_do,
    bo_phan.ten_bo_phan,
    nhan_vien.so_dien_thoai,
    nhan_vien.dia_chi
FROM
    nhan_vien
        INNER JOIN
    trinh_do ON nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
        INNER JOIN
    bo_phan ON nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
    INNER JOIN
    hop_dong on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
WHERE
    YEAR(hop_dong.ngay_lam_hop_dong) BETWEEN 2020 AND 2021
GROUP BY hop_dong.ma_nhan_vien
HAVING COUNT(hop_dong.ma_nhan_vien) <= 3
ORDER BY ma_nhan_vien;

-- 16. Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019
-- đến năm 2021.

SELECT 
    nhan_vien.ma_nhan_vien,
    nhan_vien.ho_ten
FROM
    nhan_vien;
SET SQL_SAFE_UPDATES = 0;

delete 
from nhan_vien
where nhan_vien.ma_nhan_vien not in ( select distinct ma_nhan_vien from hop_dong
where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021);

SET SQL_SAFE_UPDATES = 1;

-- 17. Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum
-- lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với
-- Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.

UPDATE khach_hang
SET ma_loai_khach = 1
WHERE ma_loai_khach!=1 AND ma_khach_hang IN (SELECT tmp.ma_khach_hang FROM(SELECT khach_hang.ma_khach_hang
FROM khach_hang 
JOIN hop_dong  ON hop_dong.ma_khach_hang=khach_hang.ma_khach_hang
JOIN dich_vu  ON dich_vu.ma_dich_vu=hop_dong.ma_dich_vu
JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong=hop_dong_chi_tiet.ma_hop_dong
JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
GROUP BY khach_hang.ma_khach_hang
HAVING (SUM(ifnull(dich_vu.chi_phi_thue,0) + ifnull(dich_vu_di_kem.gia,0)* ifnull(hop_dong_chi_tiet.so_luong,0))>=10000000))AS tmp);

select khach_hang.ma_khach_hang ,
khach_hang.ho_ten,
khach_hang.ma_loai_khach = 1 AS loai_dich_vu
from khach_hang;

-- 18. Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc
-- giữa các bảng).

SET FOREIGN_KEY_CHECKS=0;
DELETE 
FROM khach_hang
WHERE ma_khach_hang IN (SELECT ma_khach_hang 
FROM hop_dong
WHERE 
year(ngay_lam_hop_dong) <2021);
SET FOREIGN_KEY_CHECKS=1;

SELECT khach_hang.ma_khach_hang,
khach_hang.ho_ten
FROM khach_hang;

-- 19. Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong
-- năm 2020 lên gấp đôi.

CREATE TEMPORARY TABLE bang_tam2
SELECT dich_vu_di_kem.ma_dich_vu_di_kem,dich_vu_di_kem.ten_dich_vu_di_kem FROM dich_vu_di_kem
JOIN hop_dong_chi_tiet
ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
JOIN hop_dong
ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
WHERE hop_dong_chi_tiet.so_luong > 10 
AND 
year(hop_dong.ngay_lam_hop_dong) = 2020;

SELECT * FROM bang_tam2;

UPDATE dich_vu_di_kem
SET dich_vu_di_kem.gia = dich_vu_di_kem.gia*2
WHERE dich_vu_di_kem.ma_dich_vu_di_kem IN (SELECT bang_tam2.ma_dich_vu_di_kem FROM bang_tam2);

DROP TABLE bang_tam2;


-- 20. Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ
-- thống, thông tin hiển thị bao gồm id (ma_nhan_vien, ma_khach_hang),
-- ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

SELECT ma_nhan_vien AS'#ID' ,ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi , "1" AS `TABLE`
FROM nhan_vien
union all
select ma_khach_hang AS'#ID',ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi, "2" AS `TABLE`
from khach_hang;