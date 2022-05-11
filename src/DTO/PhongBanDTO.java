/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chicu
 */
public class PhongBanDTO {
    public String MaPB;
    public String MaNV;
    public String TenPB;
    public String SoDienThoai;

    public PhongBanDTO() {
    }

    public PhongBanDTO(String MaPB, String MaNV, String TenPB, String SoDienThoai) {
        this.MaPB = MaPB;
        this.MaNV = MaNV;
        this.TenPB = TenPB;
        this.SoDienThoai = SoDienThoai;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }
    
    
}
