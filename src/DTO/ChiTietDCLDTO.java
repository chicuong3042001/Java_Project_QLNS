/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author dohung
 */
public class ChiTietDCLDTO {
    private String MaDCL;
    private String MaNV;

    public ChiTietDCLDTO() {
    }

    public ChiTietDCLDTO(String MaDCL, String MaNV) {
        this.MaDCL = MaDCL;
        this.MaNV = MaNV;
    }

    public String getMaDCL() {
        return MaDCL;
    }

    public void setMaDCL(String MaDCL) {
        this.MaDCL = MaDCL;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
}
