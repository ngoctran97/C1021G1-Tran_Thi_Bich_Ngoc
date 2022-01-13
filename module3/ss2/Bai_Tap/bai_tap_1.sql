create database VatLieuXayDan;
use VatLieuXayDan;

create table PhieuXuat(
SoPX int auto_increment,
NgayXuat datetime not null,
primary key(SoPX)
);

create table ChiTietPhieuXuat(
DGXuat int,
SLXuat int,
SoPX int,
MaVTU int,
primary key(DGXuat,SLXuat,SoPX,MaVTU),
foreign key(SoPX) references PhieuXuat(SoPX),
foreign key(MaVTU) references VatTu(MaVTU)
);

create table VatTu(
MaVTU int auto_increment,
TenVTU varchar(30),
primary key(MaVTU)
);

create table ChiTietPhieuNhap(
DGNhap int,
SLNhap int,
MaVTU int,
SoPN int,
primary key(DGNhap,SLNhap,MaVTU,SoPN),
foreign key(MaVTU) references VatTu(MaVTU),
foreign key(SoPN) references PhieuNhap(SoPN)
);

create table PhieuNhap(
SoPN int auto_increment,
NgayNhap datetime not null,
primary key(SoPN)
);

create table ChiTietDonHang(
MaVTU int,
SoDH int,
primary key(MaVTU,SoDH),
foreign key(MaVTU) references VatTu(MaVTU),
foreign key(SoDH) references DonDH(SoDH)
);

create table DonDH(
SoDH int auto_increment,
NgayDH datetime not null,
MaNCC int,
primary key(SoDH),
foreign key(MaNCC) references NhaCC(MaNCC)
);

create table NhaCC(
MaNCC int auto_increment,
TenNCC varchar(30),
diaChi varchar(30),
primary key(MaNCC)
);

create table SoDienThoai(
MaSDT int auto_increment,
sdt varchar(50),
MaNCC int,
primary key(MaSDT),
foreign key(MaNCC) references NhaCC(MaNCC)
);
