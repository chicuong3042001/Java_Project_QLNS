/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author chicu
 */
public class ChiTietKhenThuongKyLuatDTO {
    public String MaKTKL;
    public double SoTien;
    public Date NgayQuyetDinh;
    public String LoaiQuyetDinh;
    public String NoiDung;

    public ChiTietKhenThuongKyLuatDTO() {
    }

    public ChiTietKhenThuongKyLuatDTO(String MaKTKL, double SoTien, Date NgayQuyetDinh, String LoaiQuyetDinh, String NoiDung) {
        this.MaKTKL = MaKTKL;
        this.SoTien = SoTien;
        this.NgayQuyetDinh = NgayQuyetDinh;
        this.LoaiQuyetDinh = LoaiQuyetDinh;
        this.NoiDung = NoiDung;
    }

    public String getMaKTKL() {
        return MaKTKL;
    }

    public void setMaKTKL(String MaKTKL) {
        this.MaKTKL = MaKTKL;
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double SoTien) {
        this.SoTien = SoTien;
    }

    public Date getNgayQuyetDinh() {
        return NgayQuyetDinh;
    }

    public void setNgayQuyetDinh(Date NgayQuyetDinh) {
        this.NgayQuyetDinh = NgayQuyetDinh;
    }

    public String getLoaiQuyetDinh() {
        return LoaiQuyetDinh;
    }

    public void setLoaiQuyetDinh(String LoaiQuyetDinh) {
        this.LoaiQuyetDinh = LoaiQuyetDinh;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }
    
}
