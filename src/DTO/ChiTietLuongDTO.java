/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author chicu
 */
public class ChiTietLuongDTO {
    private String MaLuong;
    private double LuongCB;
    private double ThuongPhat;
    private double HeSoLuong;
    private Date NgayLapBang;

    public ChiTietLuongDTO() {
    }

    public ChiTietLuongDTO(String MaLuong, double ThuongPhat, double HeSoLuong) {
        this.MaLuong = MaLuong;
        this.ThuongPhat = ThuongPhat;
        this.HeSoLuong = HeSoLuong;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public double getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(double HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public double getThuongPhat() {
        return ThuongPhat;
    }

    public void setThuongPHat(double ThuongPhat) {
        this.ThuongPhat = ThuongPhat;
    }

    public double getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(double LuongCB) {
        this.LuongCB = LuongCB;
    }

    public Date getNgayLapBang() {
        return NgayLapBang;
    }

    public void setNgayLapBang(Date NgayLapBang) {
        this.NgayLapBang = NgayLapBang;
    }
    
    public Object[] getSelection() {
        ArrayList<Boolean> result = new ArrayList();
        result.add(Double.isNaN(this.ThuongPhat));
        result.add(Double.isNaN(this.HeSoLuong));
        result.add(this.NgayLapBang != null);

        Object[] result2 = result.toArray();
        return result2;
    }
}
