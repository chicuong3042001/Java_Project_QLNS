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
    private String MaNV;

    public LuongDTO() {
    }

    public LuongDTO(String MaLuong, String MaNV) {
        this.MaLuong = MaLuong;
        this.MaNV = MaNV;
    }

    public String getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(String MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Object[] getSelection() {
        ArrayList<Boolean> result = new ArrayList();

        Object[] result2 = result.toArray();
        return result2;
    }

}
