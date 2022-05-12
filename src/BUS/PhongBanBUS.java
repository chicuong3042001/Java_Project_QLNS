/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhongBanDAO;
import DTO.PhongBanDTO;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class PhongBanBUS {
    PhongBanDAO phongbandao = new PhongBanDAO();
    
    public PhongBanBUS() {
    }
    
    public ArrayList<PhongBanDTO> getPhongBan() {
        return phongbandao.getPhongBan();
    }
    
    public boolean addPhongBan(PhongBanDTO phongban) {
        return phongbandao.addPhongBan(phongban);
    }
    
    public boolean deletePhongBan(String id) {
        return phongbandao.deletePhongBan(id);
    }
    
    public boolean deletePhongBan(PhongBanDTO phongban) {
        return phongbandao.deletePhongBan(phongban);
    }
    
    public boolean updatePhongBan(PhongBanDTO phongban) {
        return phongbandao.updatePhongBan(phongban, phongban.getSelection());
    }
}
