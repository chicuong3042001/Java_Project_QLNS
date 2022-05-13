/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class DieuChinhLuongDTO {

    private String MaDCL;
    private String MaNV;
    private double HeSoLuongMoi;

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

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Object[] getSelection() {
        ArrayList<Boolean> result = new ArrayList();
        result.add(Double.isNaN(this.HeSoLuongMoi));

        Object[] result2 = result.toArray();
        return result2;
    }
}
