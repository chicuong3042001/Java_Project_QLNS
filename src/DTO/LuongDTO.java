/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chicu
 */
public class LuongDTO {
    public String MaLuong;
    public String MaNV;
    public String HeSoLuong;
    public double TienLuong;

    public LuongDTO() {
    }

    public LuongDTO(String MaLuong, String MaNV, String HeSoLuong, double TienLuong) {
        this.MaLuong = MaLuong;
        this.MaNV = MaNV;
        this.HeSoLuong = HeSoLuong;
        this.TienLuong = TienLuong;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(String HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }
    
}
