
import DAO.ChucVuDAO;
import DTO.ChucVuDTO;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dohung
 */
public class Test {

    public static void main(String[] arg) {
        ChucVuDAO chucvudao = new ChucVuDAO();
        ChucVuDTO chucvudto = new ChucVuDTO("001", "0001", "Giam doc", "");
        chucvudao.addChucVu(chucvudto);

        ChucVuDTO updatedto = new ChucVuDTO();
        updatedto.setMaCV("001");
        updatedto.setMaNV("0002");
        updatedto.setGhiChu("LienHu2");
        updatedto.setTenCV("GiamDoc2");
        
        boolean updateChucVu = chucvudao.updateChucVu(updatedto,updatedto.getSelection());

        ArrayList<ChucVuDTO> chucvu = chucvudao.getChucVu();
        
        for (ChucVuDTO a : chucvu) {
            System.out.println(a.getMaCV() + "\t" + a.getTenCV()+ "\t" + a.getGhiChu());
        }
    }
}
