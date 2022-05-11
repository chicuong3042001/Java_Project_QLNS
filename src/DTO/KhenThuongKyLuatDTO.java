/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chicu
 */
public class KhenThuongKyLuatDTO {
    public String MaKTKL;
    public String MaNV;
    public double SoTien;

    public KhenThuongKyLuatDTO() {
    }

    public KhenThuongKyLuatDTO(String MaKTKL, String MaNV, double SoTien) {
        this.MaKTKL = MaKTKL;
        this.MaNV = MaNV;
        this.SoTien = SoTien;
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
    
    
}
