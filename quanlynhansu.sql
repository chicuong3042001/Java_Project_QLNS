CREATE TABLE `chucvu` (
  `MaCV` varchar(255) PRIMARY KEY,
  `TenCV` varchar(255),
  `GhiChu` varchar(255)
);

CREATE TABLE `khenthuongkyluat` (
  `MaKTKL` varchar(255),
  `MaNV` varchar(255),
  PRIMARY KEY (`MaKTKL`, `MaNV`)
);

CREATE TABLE `luong` (
  `MaLuong` varchar(255),
  `MaNV` varchar(255),
  PRIMARY KEY (`MaLuong`, `MaNV`)
);

CREATE TABLE `nhanvien` (
  `MaNV` varchar(255) PRIMARY KEY,
  `HinhNV` varchar(255),
  `TenNV` varchar(255),
  `NgaySinh` varchar(255),
  `GioiTinh` varchar(255),
  `DiaChi` varchar(255),
  `SoCMND` varchar(255),
  `SoDienThoai` varchar(255),
  `Email` varchar(255),
  `MaPB` varchar(255),
  `MaCV` varchar(255),
  `MaTDHV` varchar(255)
);

CREATE TABLE `phongban` (
  `MaPB` varchar(255) PRIMARY KEY,
  `TenPB` varchar(255),
  `SoDienThoai` varchar(255)
);

CREATE TABLE `trinhdohv` (
  `MaTDHV` varchar(255) PRIMARY KEY,
  `TenTDHV` varchar(255) UNIQUE
);

CREATE TABLE `chitietluong` (
  `MaLuong` varchar(255) PRIMARY KEY,
  `LuongCB` double,
  `HeSoLuong` double,
  `ThuongPhat` double,
  `TienLuong` double
);

CREATE TABLE `chitietktkl` (
  `MaKTKL` varchar(255) PRIMARY KEY,
  `SoTien` double,
  `NgayQuyetDinh` varchar(255),
  `LoaiQuyetDinh` varchar(255),
  `NoiDung` varchar(255)
);

ALTER TABLE `chitietktkl` ADD FOREIGN KEY (`MaKTKL`) REFERENCES `khenthuongkyluat` (`MaKTKL`);

ALTER TABLE `chitietluong` ADD FOREIGN KEY (`MaLuong`) REFERENCES `luong` (`MaLuong`);

ALTER TABLE `luong` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

ALTER TABLE `khenthuongkyluat` ADD FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`);

ALTER TABLE `nhanvien` ADD FOREIGN KEY (`MaCV`) REFERENCES `chucvu` (`MaCV`);

ALTER TABLE `nhanvien` ADD FOREIGN KEY (`MaPB`) REFERENCES `phongban` (`MaPB`);

ALTER TABLE `nhanvien` ADD FOREIGN KEY (`MaTDHV`) REFERENCES `trinhdohv` (`MaTDHV`);
