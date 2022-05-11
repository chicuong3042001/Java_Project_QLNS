/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author chicu
 */
public class TrinhDoHocVanDTO {
    public String MaTDHV;
    public String MaNV;
    public String TenTDHV;

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
    
    
}
