SELECT * FROM caseStudy.loai_khach;
-- yêu cầu 4
select hop_dong.ma_khach_hang, count(hop_dong.ma_khach_hang) as solan 
from hop_dong  
inner join khach_hang on khach_hang.ma_khach_hang  = hop_dong.ma_khach_hang 
inner join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach 
where loai_khach.ten_loai_khach = 'Diamond'
group by hop_dong.ma_khach_hang
order by  solan;

(select ma_khach_hang,ho_ten from khach_hang where ma_loai_khach in
(select ma_loai_khach from loai_khach where ten_loai_khach = 'Diamond'));