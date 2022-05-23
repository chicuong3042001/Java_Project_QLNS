/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.ChiTietDCLDAO;
import DTO.ChiTietDCLDTO;
import Exception.DuplicatedException;
import java.util.ArrayList;

/**
 *
 * @author dohung
 */
public class ChiTietDCLBUS {
    ChiTietDCLDAO chitietdcldao = new ChiTietDCLDAO();

    public ChiTietDCLBUS() {
    }

    public ArrayList<ChiTietDCLDTO> getChiTietDCL() {
        return chitietdcldao.getChiTietDCL();
    }
    
    public boolean addChiTietDCL(ChiTietDCLDTO chitietdcl) throws DuplicatedException {
        ArrayList<ChiTietDCLDTO> list = chitietdcldao.getChiTietDCL();
        
        for(ChiTietDCLDTO item : list) {
            if(item.getMaNV().equals(chitietdcl.getMaNV()) && item.getMaDCL().equals(chitietdcl.getMaDCL())) {
                throw new DuplicatedException("Mã điều chỉnh lương và mã nhân viên bị trùng ");
            }
        }
        return chitietdcldao.addChiTietDCL(chitietdcl);
    }
    
    public boolean deleteChiTietDCL(ChiTietDCLDTO chitietdcl) {
        return chitietdcldao.deleteChiTietDCL(chitietdcl);
    }
    
    public boolean updateChiTietDCL(ChiTietDCLDTO chitietdcl) {
        return chitietdcldao.updateChiTietDCL(chitietdcl);
    }
}
