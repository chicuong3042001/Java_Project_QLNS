/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class NhanVienBUS {
    NhanVienDAO NhanViendao = new NhanVienDAO();
    
    public NhanVienBUS() {
    }
    
    public ArrayList<NhanVienDTO> getNhanVien() {
        return NhanViendao.getNhanVien();
    }
    
    public boolean addNhanVien(NhanVienDTO NhanVien) {
        return NhanViendao.addNhanVien(NhanVien);
    }
    
    public boolean deleteNhanVien(String id) {
        return NhanViendao.deleteNhanVien(id);
    }
    
    public boolean deleteNhanVien(NhanVienDTO NhanVien) {
        return NhanViendao.deleteNhanVien(NhanVien);
    }
    
    public boolean updateNhanVien(NhanVienDTO NhanVien) {
        return NhanViendao.updateNhanVien(NhanVien, NhanVien.getSelection());
    }

}
