/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DieuChinhLuongDAO;
import DTO.DieuChinhLuongDTO;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class DieuChinhLuongBUS {
    DieuChinhLuongDAO dieuchinhluongdao = new DieuChinhLuongDAO();
    
    public DieuChinhLuongBUS() {
    }
    
    public ArrayList<DieuChinhLuongDTO> getDieuChinhLuong() {
        return dieuchinhluongdao.getDieuChinhLuong();
    }
    
    public boolean addDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        return dieuchinhluongdao.addDieuChinhLuong(dieuchinhluong);
    }
    
    public boolean deleteDieuChinhLuong(String id) {
        return dieuchinhluongdao.deleteDieuChinhLuong(id);
    }
    
    public boolean deleteDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        return dieuchinhluongdao.deleteDieuChinhLuong(dieuchinhluong);
    }
    
    public boolean updateDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        return dieuchinhluongdao.updateDieuChinhLuong(dieuchinhluong, dieuchinhluong.getSelection());
    }

}
