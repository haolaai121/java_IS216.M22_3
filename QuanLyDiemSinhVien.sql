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
	MonPT varchar(5), --sửa thành môn phụ trách cho tường minh
	LopPT varchar(8), --sửa thành lớp phụ trách cho tường minh
	MaKhoa varchar(10)
)
ALTER TABLE GiaoVien ALTER COLUMN LopPT varchar(10);
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
---------------THÊM KHÓA NGOẠI---------------
--GIÁO VIÊN--
ALTER TABLE GiaoVien ADD CONSTRAINT FK_MHGV FOREIGN KEY (MonPT) REFERENCES MonHoc(MaMH);
ALTER TABLE GiaoVien ADD CONSTRAINT FK_MKGV FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa);
ALTER TABLE GiaoVien ADD CONSTRAINT FK_LOPGV FOREIGN KEY (LopPT) REFERENCES LOP(MaLop);
--Khoa--
ALTER TABLE KHoa ADD CONSTRAINT FK_GVKHOA FOREIGN KEY (TruongKhoa) REFERENCES GiaoVien(MaGV);
--Lop--
ALTER TABLE LOP ADD CONSTRAINT FK_KHOALOP FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa);
ALTER TABLE LOP ADD CONSTRAINT FK_CVHT FOREIGN KEY (CVHT) REFERENCES GiaoVien(MaGV);
--DIEMSO--
ALTER TABLE DiemSo ADD CONSTRAINT FK_DSSV FOREIGN KEY (MaSV) REFERENCES SinhVien(MaSV);
ALTER TABLE DiemSo ADD CONSTRAINT FK_DSMH FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH);
ALTER TABLE DiemSo ADD CONSTRAINT FK_DSGV FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV);
--SinhVien
ALTER TABLE SinhVien ADD CONSTRAINT FK_SVKHOA FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa);
ALTER TABLE SinhVien ADD CONSTRAINT FK_SVLOP FOREIGN KEY (MaLop) REFERENCES  LOP(MaLop);
--Nganh
ALTER TABLE Nganh ADD CONSTRAINT FK_NGANHKHOA FOREIGN KEY (MaKhoa) REFERENCES Khoa(MaKhoa);
