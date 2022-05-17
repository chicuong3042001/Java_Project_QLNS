/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DieuChinhLuongDAO;
import DTO.DieuChinhLuongDTO;
import Exception.DuplicatedException;
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
    
    public boolean addDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) throws DuplicatedException {
        ArrayList<DieuChinhLuongDTO> list = dieuchinhluongdao.getDieuChinhLuong();
        
        for(DieuChinhLuongDTO item : list) {
            if(item.getMaNV().equals(dieuchinhluong.getMaNV()) && item.getMaDCL().equals(dieuchinhluong.getMaDCL())) {
                throw new DuplicatedException("Mã điều chỉnh lương và mã nhân viên bị trùng ");
            }
        }
        return dieuchinhluongdao.addDieuChinhLuong(dieuchinhluong);
    }
    
    public boolean deleteDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        return dieuchinhluongdao.deleteDieuChinhLuong(dieuchinhluong);
    }
    
    public boolean updateDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        return dieuchinhluongdao.updateDieuChinhLuong(dieuchinhluong);
    }

}
