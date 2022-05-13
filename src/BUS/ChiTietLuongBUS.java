/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ChiTietLuongDAO;
import DTO.ChiTietLuongDTO;
import Exception.DuplicatedException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChiTietLuongBUS {
    ChiTietLuongDAO chitietluongdao = new ChiTietLuongDAO();
    
    public ChiTietLuongBUS() {
    }
    
    public ArrayList<ChiTietLuongDTO> getChiTietLuong() {
        return chitietluongdao.getChiTietLuong();
    }
    
    public boolean addChiTietLuong(ChiTietLuongDTO chitietluong) throws DuplicatedException {
        ArrayList<ChiTietLuongDTO> list = chitietluongdao.getChiTietLuong();
        
        for(ChiTietLuongDTO item : list) {
            if(item.getMaLuong().equals(chitietluong.getMaLuong())) {
                throw new DuplicatedException("Mã lương bị trùng ");
            }
        }
        return chitietluongdao.addChiTietLuong(chitietluong);
    }
    
    public boolean deleteChiTietLuong(String id) {
        return chitietluongdao.deleteChiTietLuong(id);
    }
    
    public boolean deleteChiTietLuong(ChiTietLuongDTO chitietluong) {
        return chitietluongdao.deleteChiTietLuong(chitietluong);
    }
    
    public boolean updateChiTietLuong(ChiTietLuongDTO chitietluong) {
        return chitietluongdao.updateChiTietLuong(chitietluong);
    }

}
