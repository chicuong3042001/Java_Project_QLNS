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
public class LuongDTO {
    private String MaLuong;
    private double TienLuong;

    public LuongDTO() {
    }

    public LuongDTO(String MaLuong, double TienLuong) {
        this.MaLuong = MaLuong;
        this.TienLuong = TienLuong;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }
    
    public Object[] getSelection() {
        ArrayList<Boolean> result = new ArrayList();
        result.add(Double.isNaN(this.TienLuong));

        Object[] result2 = result.toArray();
        return result2;
    }
    
}
