﻿Create DataBase QLSanpham
use QLSanpham
Create Table LoaiSP
(
Maloai char(2) primary key,
Tenloai nvarchar(20)
)
Insert into LoaiSP values('BK',N'Bánh kẹo')
Insert into LoaiSP values('GK',N'Giải khát')
Insert into LoaiSP values('MP',N'Mỹ phẩm')
----Tạo tabl Sanpham
Create Table Sanpham
(
MaSP char(4) primary key,
TenSP nvarchar(20),
Dongia bigint,
Maloai char(2) foreign key references LoaiSP(Maloai)
)
Insert into Sanpham values('SP01',N'Bánh mì',10000,'BK')
Insert into Sanpham values('SP02',N'Bánh bao',15000,'BK')
Insert into Sanpham values('SP03',N'Coca cola',12000,'GK')
Insert into Sanpham values('SP04',N'Pepsi',11000,'GK')
Insert into Sanpham values('SP05',N'Kem chống nắng',85000,'MP')
