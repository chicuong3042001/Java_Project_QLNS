/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chicu
 */
public class NhanVienDTO {
    public String MaNV;
    public String HinhNV;
    public String TenNV;
    public String NgaySinh;
    public String GioiTinh;
    public String DiaChi;
    public String SoCMND;
    public String SoDienThoai;
    public String Email;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String MaNV, String HinhNV, String TenNV, String NgaySinh, String GioiTinh, String DiaChi, String SoCMND, String SoDienThoai, String Email) {
        this.MaNV = MaNV;
        this.HinhNV = HinhNV;
        this.TenNV = TenNV;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SoCMND = SoCMND;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHinhNV() {
        return HinhNV;
    }

    public void setHinhNV(String HinhNV) {
        this.HinhNV = HinhNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
                
}
