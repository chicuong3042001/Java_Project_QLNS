/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.KhenThuongKyLuatDAO;
import DTO.KhenThuongKyLuatDTO;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class KhenThuongKyLuatBUS {
    KhenThuongKyLuatDAO khenthuongkyluatdao = new KhenThuongKyLuatDAO();
    
    public KhenThuongKyLuatBUS() {
    }
    
    public ArrayList<KhenThuongKyLuatDTO> getKhenThuongKyLuat() {
        return khenthuongkyluatdao.getKhenThuongKyLuat();
    }
    
    public boolean addKhenThuongKyLuat(KhenThuongKyLuatDTO khenthuongkyluat) {
        return khenthuongkyluatdao.addKhenThuongKyLuat(khenthuongkyluat);
    }
    
    public boolean deleteKhenThuongKyLuat(String id) {
        return khenthuongkyluatdao.deleteKhenThuongKyLuat(id);
    }
    
    public boolean deleteKhenThuongKyLuat(KhenThuongKyLuatDTO khenthuongkyluat) {
        return khenthuongkyluatdao.deleteKhenThuongKyLuat(khenthuongkyluat);
    }
    
    public boolean updateKhenThuongKyLuat(KhenThuongKyLuatDTO khenthuongkyluat) {
        return khenthuongkyluatdao.updateKhenThuongKyLuat(khenthuongkyluat, khenthuongkyluat.getSelection());
    }

}