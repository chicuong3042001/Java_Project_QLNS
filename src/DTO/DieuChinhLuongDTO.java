/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chicu
 */
public class DieuChinhLuongDTO {
    public String MaDCL;
    public String MaNV;
    public double HeSoLuongMoi;

    public DieuChinhLuongDTO() {
    }

    public DieuChinhLuongDTO(String MaDCL, String MaNV, double HeSoLuongMoi) {
        this.MaDCL = MaDCL;
        this.MaNV = MaNV;
        this.HeSoLuongMoi = HeSoLuongMoi;
    }

    public String getMaDCL() {
        return MaDCL;
    }

    public void setMaDCL(String MaDCL) {
        this.MaDCL = MaDCL;
    }

    public double getHeSoLuongMoi() {
        return HeSoLuongMoi;
    }

    public void setHeSoLuongMoi(double HeSoLuongMoi) {
        this.HeSoLuongMoi = HeSoLuongMoi;
    }
    
    
}
