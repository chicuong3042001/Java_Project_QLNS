/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ChiTietKhenThuongKyLuatDAO;
import DTO.ChiTietKhenThuongKyLuatDTO;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChiTietKhenThuongKyLuatBUS {
    ChiTietKhenThuongKyLuatDAO chitietkhenthuongkyluatdao = new ChiTietKhenThuongKyLuatDAO();
    
    public ChiTietKhenThuongKyLuatBUS() {
    }
    
    public ArrayList<ChiTietKhenThuongKyLuatDTO> getChiTietKhenThuongKyLuat() {
        return chitietkhenthuongkyluatdao.getChiTietKhenThuongKyLuat();
    }
    
    public boolean addChiTietKhenThuongKyLuat(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkyluat) {
        return chitietkhenthuongkyluatdao.addChiTietKhenThuongKyLuat(chitietkhenthuongkyluat);
    }
    
    public boolean deleteChiTietKhenThuongKyLuat(String id) {
        return chitietkhenthuongkyluatdao.deleteChiTietKhenThuongKyLuat(id);
    }
    
    public boolean deleteChiTietKhenThuongKyLuat(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkyluat) {
        return chitietkhenthuongkyluatdao.deleteChiTietKhenThuongKyLuat(chitietkhenthuongkyluat);
    }
    
    public boolean updateChiTietKhenThuongKyLuat(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkyluat) {
        return chitietkhenthuongkyluatdao.updateChiTietKhenThuongKyLuat(chitietkhenthuongkyluat, chitietkhenthuongkyluat.getSelection());
    }

}
