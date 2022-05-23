/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author dohung
 */
public class DieuChinhLuongDTO {
    private String MaDCL;
    private double HeSoLuong;
    private Date NgaySuaDoi;

    public DieuChinhLuongDTO() {
    }

    public DieuChinhLuongDTO(String MaDCL, double HeSoLuong, Date NgaySuaDoi) {
        this.MaDCL = MaDCL;
        this.HeSoLuong = HeSoLuong;
        this.NgaySuaDoi = NgaySuaDoi;
    }

    public DieuChinhLuongDTO(String MaDCL, double HeSoLuong) {
        this.MaDCL = MaDCL;
        this.HeSoLuong = HeSoLuong;
    }

    public String getMaDCL() {
        return MaDCL;
    }

    public void setMaDCL(String MaDCL) {
        this.MaDCL = MaDCL;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(double HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public Date getNgaySuaDoi() {
        return NgaySuaDoi;
    }

    public void setNgaySuaDoi(Date NgaySuaDoi) {
        this.NgaySuaDoi = NgaySuaDoi;
    }
               
}
