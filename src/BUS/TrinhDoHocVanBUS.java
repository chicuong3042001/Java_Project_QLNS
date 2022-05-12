/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.TrinhDoHocVanDAO;
import DTO.TrinhDoHocVanDTO;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class TrinhDoHocVanBUS {
    TrinhDoHocVanDAO TrinhDoHocVandao = new TrinhDoHocVanDAO();
    
    public TrinhDoHocVanBUS() {
    }
    
    public ArrayList<TrinhDoHocVanDTO> getTrinhDoHocVan() {
        return TrinhDoHocVandao.getTrinhDoHocVan();
    }
    
    public boolean addTrinhDoHocVan(TrinhDoHocVanDTO TrinhDoHocVan) {
        return TrinhDoHocVandao.addTrinhDoHocVan(TrinhDoHocVan);
    }
    
    public boolean deleteTrinhDoHocVan(String id) {
        return TrinhDoHocVandao.deleteTrinhDoHocVan(id);
    }
    
    public boolean deleteTrinhDoHocVan(TrinhDoHocVanDTO TrinhDoHocVan) {
        return TrinhDoHocVandao.deleteTrinhDoHocVan(TrinhDoHocVan);
    }
    
    public boolean updateTrinhDoHocVan(TrinhDoHocVanDTO TrinhDoHocVan) {
        return TrinhDoHocVandao.updateTrinhDoHocVan(TrinhDoHocVan, TrinhDoHocVan.getSelection());
    }

}
