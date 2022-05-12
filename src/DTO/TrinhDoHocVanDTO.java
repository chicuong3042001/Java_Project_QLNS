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
public class TrinhDoHocVanDTO {
    private String MaTDHV;
    private String MaNV;
    private String TenTDHV;

    public TrinhDoHocVanDTO() {
    }

    public TrinhDoHocVanDTO(String MaTDHV, String MaNV, String TenTDHV) {
        this.MaTDHV = MaTDHV;
        this.MaNV = MaNV;
        this.TenTDHV = TenTDHV;
    }

    public String getMaTDHV() {
        return MaTDHV;
    }

    public void setMaTDHV(String MaTDHV) {
        this.MaTDHV = MaTDHV;
    }

    public String getTenTDHV() {
        return TenTDHV;
    }

    public void setTenTDHV(String TenTDHV) {
        this.TenTDHV = TenTDHV;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    
    public ArrayList<Boolean> getSelection() {
        ArrayList<Boolean> result = new ArrayList();
        result.add(this.MaNV != null);
        result.add(this.TenTDHV != null);

        return result;
    }
}
