/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Report;

/**
 *
 * @author dohung
 */
public class QueryStorage {

    String ThemLuong = "INSERT INTO `chitietluong`(`MaLuong`, `MaNV`, `ThuongPhat`, `HeSoLuong`, `NgayLapBang`) "
            + "VALUES ('?,?,"
            + "(SELECT SUM(khenthuongkyluat.SoTien) "
            + "FROM nhanvien JOIN chitietktkl JOIN khenthuongkyluat ON nhanvien.MaNV = chitietktkl.MaNV AND chitietktkl.MaKTKL = khenthuongkyluat.MaKTKL "
            + "WHERE nhanvien.MaNV = ? AND YEAR(khenthuongkyluat.NgayQuyetDinh) = YEAR(CURRENT_DATE) AND MONTH(khenthuongkyluat.NgayQuyetDinh) = MONTH(CURRENT_DATE)),"
            + "?,CURRENT_DATE);";

    //setString(1,getMaLuong)
    //setString(2,getMaNV)
    //setString(3,getMaNV)
    //setString(4,getHeSoLuong)
    
    String getBangLuong = "SELECT nhanvien.MaNV, nhanvien.TenNV,chitietluong.NgayLapBang,luong.LuongCB,chitietluong.HeSoLuong, chitietluong.ThuongPhat, chitietluong.HeSoLuong * luong.LuongCB + chitietluong.ThuongPhat as 'Tiền lương' "
            + "FROM NhanVien JOIN chitietluong JOIN luong ON nhanvien.MaNV = chitietluong.MaNV AND chitietluong.MaLuong = luong.MaLuong "
            + "WHERE (MaNV = ?) | 1;";
    //BangLuongDTO(String ManV, String tenNV, Date NgayLap, Double LuongCB, Double HSluong,Double ThuongPhat, Double TienLuong )
    
    String updateThongTinKyLuatSauKhiCoBangLuong = "";
}
