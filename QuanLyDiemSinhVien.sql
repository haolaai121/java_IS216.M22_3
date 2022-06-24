CREATE DATABASE QLYDIEMHS
GO
USE QLYDIEMHS
GO
----- TẠO BẢNG -----
CREATE TABLE MonHoc
(
	MaMH varchar(5) PRIMARY KEY,
	TenMH varchar(30),
	SoTC tinyint
)
CREATE TABLE GiaoVien 
(
	MaGV varchar(5) PRIMARY KEY,
	TenGV varchar(30),
	MonPT varchar(30),
	LopPT varchar(8), 
	MaKhoa varchar(10)
)
CREATE TABLE Khoa
(
	MaKhoa varchar(10) PRIMARY KEY,
	TenKhoa varchar(30),
	TruongKhoa varchar(5)
)
CREATE TABLE SinhVien 
(
	MaSV varchar(8) PRIMARY KEY,
	TenSV varchar(30),
	MaKhoa varchar(10),
	MaLop varchar(10),
	MaNganh varchar(10),
	NgaySinh smalldatetime,
	GioiTinh char(3),
	SoDT varchar(12),
	DiaChi varchar(40),
	Anh varchar(255)
)
ALTER TABLE SinhVien ALTER COLUMN NgaySinh varchar(15);
CREATE TABLE DiemSo
(
	MaSV varchar(8),
	MaMH varchar(5),
	MaGV varchar(5),
	DiemQT float,
	DiemTH float,
	DiemGK float, 
	DiemCK float,
	DiemTB float,
	HocKy tinyint
	CONSTRAINT PK_DIEMSO PRIMARY KEY(MaSV,MaMH)
)
CREATE TABLE Nganh
(
	MaNganh varchar(10) PRIMARY KEY,
	TenNganh varchar(30),
	MaKhoa varchar(10)
)
CREATE TABLE LOP 
(
	MaLop varchar(10) PRIMARY KEY,
	MaKhoa varchar(10),
	CVHT varchar(5),
	NienKhoa varchar(10)
)
CREATE TABLE TKBMH 
(
	MaMH varchar(5),
	TenMH varchar(30),
	NgayHoc varchar(15), --chỉ điền ngày của tuần, ví dụ "thứ 2"
	MaGV varchar(5)
	PRIMARY KEY(MaMH,TenMH,NgayHoc)
)

CREATE TABLE CTLOPDAY
(
	MaGV varchar(5) , 
	MaMH varchar(5) 
)
--CTLOPDAY
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV01','MH01');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV01','MH02');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV01','MH03');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV01','MH04');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV01','MH05');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV02','MH01');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV02','MH02');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV02','MH03');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV02','MH05');
INSERT INTO CTLOPDAY (MaGV,MaMH) VALUES ('GV02','MH07');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV04','MH06');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV04','MH07');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV04','MH08');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV04','MH09');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV04','MH10');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV05','MH05');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV05','MH06');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV05','MH07');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV05','MH08');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV05','MH09');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV06','MH02');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV06','MH03');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV06','MH04');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV06','MH05');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV06','MH06');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV07','MH07');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV07','MH08');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV07','MH09');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV07','MH10');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV07','MH11');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV07','MH01');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV07','MH02');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV08','MH03');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV08','MH04');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV08','MH05');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV09','MH06');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV09','MH07');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV09','MH08');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV09','MH09');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV09','MH10');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV10','MH01');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV10','MH02');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV11','MH02');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV11','MH03');
INSERT INTO CTLOPDAY (MaGV, MaMH) VALUES ('GV10','MH03');
--MÔN HỌC
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH01','Môn Học 01','1');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH02','Môn Học 02','3');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH03','Môn Học 03','3');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH04','Môn Học 04','1');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH05','Môn Học 05','4');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH06','Môn Học 06','3');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH07','Môn Học 07','4');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH08','Môn Học 08','1');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH09','Môn Học 09','2');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH10','Môn Học 10','3');
INSERT INTO MonHoc (MaMH,TenMH,SoTC) VALUES ('MH11','Môn Học 11','4');
--Giáo Viên
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV01','Giáo Viên 1','MH01','LH04','KH02');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV02','Giáo Viên 2','MH01','LH04','KH01');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV03','Giáo Viên 3','MH01','LH03','KH02');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV04','Giáo Viên 4','MH01','LH03','KH01');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV05','Giáo Viên 5','MH04','LH04','KH02');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV06','Giáo Viên 6','MH01','LH01','KH03');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV07','Giáo Viên 7','MH04','LH02','KH04');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV08','Giáo Viên 8','MH03','LH03','KH01');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV09','Giáo Viên 9','MH02','LH01','KH01');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV10','Giáo Viên 10','MH03','LH03','KH03');
INSERT INTO GiaoVien (MaGV,TenGV,MonPT,LopPT,MaKhoa) VALUES ('GV11','Giáo Viên 11','MH01','LH01','KH03');
--Khoa
INSERT INTO Khoa (MaKhoa,TenKhoa,TruongKhoa) VALUES ('KH01','Khoa 1','GV04');
INSERT INTO Khoa (MaKhoa,TenKhoa,TruongKhoa) VALUES ('KH02','Khoa 2','GV01');
INSERT INTO Khoa (MaKhoa,TenKhoa,TruongKhoa) VALUES ('KH03','Khoa 3','GV02');
INSERT INTO Khoa (MaKhoa,TenKhoa,TruongKhoa) VALUES ('KH04','Khoa 4','GV03');
--SinhVien
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV01','Sinh Viên 1','KH03','LH02','NH01','24/01/2002','Nữ','0381661689','Nha','ảnh 1');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV02','Sinh Viên 2','KH02','LH04','NH03','31/12/2002','Nam','0150548968','Nha','ảnh 2');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV03','Sinh Viên 3','KH03','LH02','NH01','04/12/2002','Nam','0260871399','Nha','ảnh 3');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV04','Sinh Viên 4','KH01','LH04','NH02','16/01/2003','Nữ','0885292935','Nha','ảnh 4');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV05','Sinh Viên 5','KH03','LH01','NH01','07/02/2004','Nữ','0584229555','Nha','ảnh 5');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV06','Sinh Viên 6','KH03','LH02','NH01','14/03/2003','Nữ','0734380667','Nha','ảnh 6');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV07','Sinh Viên 7','KH04','LH04','NH01','20/05/2003','Nam','0125587250','Nha','ảnh 7');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV08','Sinh Viên 8','KH02','LH02','NH04','11/04/2002','Nữ','0380943066','Nha','ảnh 8');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV09','Sinh Viên 9','KH03','LH01','NH04','27/12/2004','Nữ','0837319189','Nha','ảnh 9');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV10','Sinh Viên 10','KH01','LH03','NH01','14/08/2003','Nữ','0899546516','Nha','ảnh 10');
INSERT INTO SinhVien (MaSV,TenSv,MaKhoa,MaLop,MaNganh,NgaySinh,GioiTinh,SoDT,DiaChi,Anh) VALUES ('SV11','Sinh Viên 11','KH04','LH04','NH02','20/05/2003','Nam','0125056643','Nha','ảnh 11');
--Điểm Số
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV01','MH01','GV01','9.2','6.2','7.9','9.9','8.31','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV07','MH08','GV05','8.9','5.0','1.1','5.1','5.04','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV01','MH02','GV02','3.4','6.0','2.0','9.7','5.28','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV010','MH06','GV07','8.7','9.8','8.3','4.3','7.77','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV07','MH09','GV07','3.1','2.8','7.9','8.2','5.51','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV05','MH08','GV011','9.7','6.5','8.0','0.5','6.16','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV03','MH07','GV04','5.7','6.2','0.6','8.6','5.28','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV011','MH01','GV07','7.6','9.2','1.6','1.1','4.89','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV010','MH04','GV05','5.5','9.5','3.2','3.2','5.35','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV01','MH011','GV09','0.5','0.7','2.3','7.5','2.76','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV09','MH08','GV010','3.4','5.0','5.4','4.1','4.49','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV010','MH02','GV05','5.2','8.5','7.7','6.2','6.90','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV02','MH02','GV07','4.5','8.9','4.8','6.8','6.24','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV07','MH01','GV06','4.1','6.9','6.1','1.6','4.67','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV011','MH04','GV011','4.1','7.7','1.1','9.9','5.70','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV04','MH03','GV06','1.3','5.1','4.3','5.9','4.14','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV011','MH05','GV06','10.0','6.9','3.3','8.1','7.08','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV09','MH07','GV09','4.5','7.7','4.2','5.9','5.59','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV011','MH08','GV02','1.8','2.5','9.7','2.7','4.19','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV03','MH09','GV07','3.5','0.7','9.8','7.4','5.36','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV04','MH01','GV06','7.6','7.1','1.5','8.6','6.22','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV07','MH03','GV05','8.9','2.2','5.8','0.2','4.28','2');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV03','MH01','GV06','1.5','9.0','6.1','4.8','5.34','1');
INSERT INTO DiemSo (MaSV,MaMH,MaGV,DiemQT,DiemTH,DiemGK,DiemCK,DiemTB,HocKy) VALUES ('SV01','MH09','GV09','0.2','7.8','3.6','3.6','3.81','1');
--Ngành
INSERT INTO Nganh (MaNganh,TenNganh,MaKhoa) VALUES ('NH01','Ngành 1','KH01');
INSERT INTO Nganh (MaNganh,TenNganh,MaKhoa) VALUES ('NH02','Ngành 2','KH03');
INSERT INTO Nganh (MaNganh,TenNganh,MaKhoa) VALUES ('NH03','Ngành 3','KH02');
INSERT INTO Nganh (MaNganh,TenNganh,MaKhoa) VALUES ('NH04','Ngành 4','KH04');
--Lớp Học
DELETE FROM LOP;
INSERT INTO LOP (MaLop,MaKhoa,CVHT,NienKhoa) VALUES ('LH01','KH01','GV01','NK1');
INSERT INTO LOP (MaLop,MaKhoa,CVHT,NienKhoa) VALUES ('LH02','KH02','GV09','NK2');
INSERT INTO LOP (MaLop,MaKhoa,CVHT,NienKhoa) VALUES ('LH03','KH03','GV07','NK1');
INSERT INTO LOP (MaLop,MaKhoa,CVHT,NienKhoa) VALUES ('LH04','KH04','GV04','NK1');
INSERT INTO LOP (MaLop,MaKhoa,CVHT,NienKhoa) VALUES ('LH05','KH01','GV05','NK1');
INSERT INTO LOP (MaLop,MaKhoa,CVHT,NienKhoa) VALUES ('LH06','KH03','GV03','NK2');
--TKBMH
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH08','Môn Học 08','Thứ 2','GV03');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH02','Môn Học 02','Thứ 2','GV01');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH02','Môn Học 02','Thứ 5','GV03');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH010','Môn Học 10','Thứ 6','GV011');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH01','Môn Học 01','Thứ 2','GV03');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH011','Môn Học 11','Thứ 7','GV08');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH05','Môn Học 05','Thứ 4','GV011');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH09','Môn Học 09','Thứ 7','GV06');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH09','Môn Học 09','Thứ 6','GV03');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH06','Môn Học 06','Thứ 4','GV06');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH06','Môn Học 06','Thứ 4','GV01');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH08','Môn Học 08','Thứ 2','GV07');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH02','Môn Học 02','Thứ 3','GV07');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH07','Môn Học 07','Thứ 3','GV08');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH08','Môn Học 08','Thứ 4','GV011');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH02','Môn Học 02','Thứ 3','GV09');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH03','Môn Học 03','Thứ 5','GV06');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH02','Môn Học 02','Thứ 7','GV09');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH05','Môn Học 05','Thứ 3','GV010');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH05','Môn Học 05','Thứ 7','GV05');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH05','Môn Học 05','Thứ 3','GV07');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH03','Môn Học 03','Thứ 7','GV09');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH06','Môn Học 06','Thứ 3','GV08');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH09','Môn Học 09','Thứ 3','GV09');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH09','Môn Học 09','Thứ 5','GV01');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH04','Môn Học 04','Thứ 2','GV011');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH011','Môn Học 11','Thứ 5','GV04');
INSERT INTO TKBMH (MaMH,TenMH,NgayHoc,MaGV) VALUES ('MH01','Môn Học 01','Thứ 3','GV03');
--Tài khoản
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV01','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV02','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV03','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV04','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV05','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV06','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV07','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV08','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV09','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV10','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('SV11','123','sv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV01','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV02','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV03','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV04','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV05','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV06','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV07','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV08','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV09','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV10','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('GV11','123','gv');
INSERT INTO ACCOUNT (TaiKhoan,MatKhau,VaiTro) VALUES ('BGH01','123','bgh');
