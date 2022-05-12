/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class KhenThuongKyLuatDTO {
    private String MaKTKL;
    private String MaNV;
    private double SoTien;

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

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
    public Object[] getSelection() {
        ArrayList<Boolean> result = new ArrayList();
        result.add(this.MaNV != null);
        result.add(Double.isNaN(this.SoTien));

        Object[] result2 = result.toArray();
        return result2;
    }
    
}
