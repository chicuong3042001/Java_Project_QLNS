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
public class ChiTietDieuChinhLuongDTO {
    public String MaDCL;
    public Date NgayDieuChinh;
    public double HeSoLuongMoi;

    public ChiTietDieuChinhLuongDTO() {
    }

    public ChiTietDieuChinhLuongDTO(String MaDCL, Date NgayDieuChinh, double HeSoLuongMoi) {
        this.MaDCL = MaDCL;
        this.NgayDieuChinh = NgayDieuChinh;
        this.HeSoLuongMoi = HeSoLuongMoi;
    }

    public String getMaDCL() {
        return MaDCL;
    }

    public void setMaDCL(String MaDCL) {
        this.MaDCL = MaDCL;
    }

    public Date getNgayDieuChinh() {
        return NgayDieuChinh;
    }

    public void setNgayDieuChinh(Date NgayDieuChinh) {
        this.NgayDieuChinh = NgayDieuChinh;
    }

    public double getHeSoLuongMoi() {
        return HeSoLuongMoi;
    }

    public void setHeSoLuongMoi(double HeSoLuongMoi) {
        this.HeSoLuongMoi = HeSoLuongMoi;
    }
    
}
