/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chicu
 */
public class ChiTietLuongDTO {
    private String MaLuong;
    private double LuongCB;
    private double KhoanCongThem;
    private double KhoanTru;
    private double HeSoLuong;

    public ChiTietLuongDTO() {
    }

    public ChiTietLuongDTO(String MaLuong, double LuongCB, double KhoanCongThem, double KhoanTru,double HeSoLuong) {
        this.MaLuong = MaLuong;
        this.LuongCB = LuongCB;
        this.KhoanCongThem = KhoanCongThem;
        this.KhoanTru = KhoanTru;
        this.HeSoLuong = HeSoLuong;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public double getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(double LuongCB) {
        this.LuongCB = LuongCB;
    }

    public double getKhoanCongThem() {
        return KhoanCongThem;
    }

    public void setKhoanCongThem(double KhoanCongThem) {
        this.KhoanCongThem = KhoanCongThem;
    }

    public double getKhoanTru() {
        return KhoanTru;
    }

    public void setKhoanTru(double KhoanTru) {
        this.KhoanTru = KhoanTru;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(double HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }
    
}
