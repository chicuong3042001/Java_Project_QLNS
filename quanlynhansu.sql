CREATE TABLE `chucvu` (
  `MaCV` varchar(255) PRIMARY KEY,
  `MaNV` varchar(255),
  `TenCV` varchar(255),
  `GhiChu` varchar(255)
);

CREATE TABLE `dieuchinhluong` (
  `MaDCL` varchar(255),
  `MaNV` varchar(255),
  `HeSoLuongMoi` double,
  PRIMARY KEY (`MaDCL`, `MaNV`)
);

CREATE TABLE `khenthuongkyluat` (
  `MaKTKL` varchar(255),
  `MaNV` varchar(255),
  `SoTien` double,
  PRIMARY KEY (`MaKTKL`, `MaNV`)
);

CREATE TABLE `luong` (
  `MaLuong` varchar(255),
  `MaNV` varchar(255),
  `TienLuong` double,
  PRIMARY KEY (`MaLuong`, `MaNV`)
);

CREATE TABLE `nhanvien` (
  `MaNV` varchar(255) PRIMARY KEY,
  `HinhNV` varchar(255),
  `TenNV` varchar(255),
  `NgaySinh` date,
  `GioiTinh` varchar(255),
  `DiaChi` varchar(255),
  `SoCMND` varchar(255),
  `SoDienThoai` varchar(255),
  `Email` varchar(255)
);

CREATE TABLE `phongban` (
  `MaPB` varchar(255) PRIMARY KEY,
  `MaNV` varchar(255),
  `TenPB` varchar(255),
  `SoDienThoai` varchar(255)
);

CREATE TABLE `trinhdohv` (
  `MaTDHV` varchar(255) PRIMARY KEY,
  `MaNV` varchar(255),
  `TenTDHV` varchar(255)
);

CREATE TABLE `chitietluong` (
  `MaLuong` varchar(255) PRIMARY KEY,
  `LuongCB` double,
  `KhoanCongThem` double,
  `KhoanTru` double,
  `HeSoLuong` double
);

CREATE TABLE `chitietdcl` (
  `MaDCL` varchar(255) PRIMARY KEY,
  `NgayDieuChinh` date,
  `HeSoLuongMoi` double
);

CREATE TABLE `chitietktkl` (
  `MaKTKL` varchar(255) PRIMARY KEY,
  `SoTien` double,
  `NgayQuyetDinh` date,
  `LoaiQuyetDinh` varchar(255),
  `NoiDung` varchar(255)
);

ALTER TABLE `chitietktkl` ADD FOREIGN KEY (`MaKTKL`) REFERENCES `khenthuongkyluat` (`MaKTKL`);

ALTER TABLE `chitietdcl` ADD FOREIGN KEY (`MaDCL`) REFERENCES `dieuchinhluong` (`MaDCL`);

ALTER TABLE `chitietluong` ADD FOREIGN KEY (`MaLuong`) REFERENCES `luong` (`MaLuong`);

ALTER TABLE `luong` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

ALTER TABLE `chucvu` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

ALTER TABLE `phongban` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

ALTER TABLE `trinhdohv` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

ALTER TABLE `dieuchinhluong` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

ALTER TABLE `khenthuongkyluat` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);
