/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ChiTietDieuChinhLuongDAO;
import DTO.ChiTietDieuChinhLuongDTO;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChiTietDieuChinhLuongBUS {
    ChiTietDieuChinhLuongDAO chitietdieuchinhluongdao = new ChiTietDieuChinhLuongDAO();
    
    public ChiTietDieuChinhLuongBUS() {
    }
    
    public ArrayList<ChiTietDieuChinhLuongDTO> getChiTietDieuChinhLuong() {
        return chitietdieuchinhluongdao.getChiTietDieuChinhLuong();
    }
    
    public boolean addChiTietDieuChinhLuong(ChiTietDieuChinhLuongDTO chitietdieuchinhluong) {
        return chitietdieuchinhluongdao.addChiTietDieuChinhLuong(chitietdieuchinhluong);
    }
    
    public boolean deleteChiTietDieuChinhLuong(String id) {
        return chitietdieuchinhluongdao.deleteChiTietDieuChinhLuong(id);
    }
    
    public boolean deleteChiTietDieuChinhLuong(ChiTietDieuChinhLuongDTO chitietdieuchinhluong) {
        return chitietdieuchinhluongdao.deleteChiTietDieuChinhLuong(chitietdieuchinhluong);
    }
    
    public boolean updateChiTietDieuChinhLuong(ChiTietDieuChinhLuongDTO chitietdieuchinhluong) {
        return chitietdieuchinhluongdao.updateChiTietDieuChinhLuong(chitietdieuchinhluong, chitietdieuchinhluong.getSelection());
    }

}
