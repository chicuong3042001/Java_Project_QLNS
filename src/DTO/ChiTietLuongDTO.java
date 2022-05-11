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
    public String MaLuong;
    public double LuongCB;
    public double KhoanCongThem;
    public double KhoanTru;

    public ChiTietLuongDTO() {
    }

    public ChiTietLuongDTO(String MaLuong, double LuongCB, double KhoanCongThem, double KhoanTru) {
        this.MaLuong = MaLuong;
        this.LuongCB = LuongCB;
        this.KhoanCongThem = KhoanCongThem;
        this.KhoanTru = KhoanTru;
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
    
}
