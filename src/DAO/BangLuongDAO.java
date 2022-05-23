/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.BangLuongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chicu
 */
public class BangLuongDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public BangLuongDAO() {
    }

    public ArrayList<BangLuongDTO> getBangLuong() {
        try {
            conn = DBConnection.getConnection();
            String sql
                    = "SELECT nhanvien.MaNV,chitietluong.MaLuong, nhanvien.TenNV,chitietluong.NgayLapBang,luong.LuongCB,chitietluong.HeSoLuong, chitietluong.ThuongPhat, chitietluong.                            HeSoLuong * luong.LuongCB + chitietluong.ThuongPhat as 'TienLuong', chitietluong.NgaySuaDoi "
                    + "FROM NhanVien JOIN chitietluong JOIN luong ON nhanvien.MaNV = chitietluong.MaNV AND chitietluong.MaLuong = luong.MaLuong ";

            stmt = conn.prepareStatement(sql);
            ArrayList<BangLuongDTO> bangluong = new ArrayList();
            rs = stmt.executeQuery();

            while (rs.next()) {
                bangluong.add(new BangLuongDTO(
                        rs.getString("MaNV"),
                        rs.getString("MaLuong"),
                        rs.getString("TenNV"),
                        rs.getDate("NgayLapBang"),
                        rs.getDouble("LuongCB"),
                        rs.getDouble("HeSoLuong"),
                        rs.getDouble("ThuongPhat"),
                        rs.getDouble("TienLuong"),
                        rs.getDate("NgaySuaDoi")
                ));
            }
            return bangluong;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public boolean addBangLuong(BangLuongDTO bangluong) {
        try {
            conn = DBConnection.getConnection();
            String sql
                    = "INSERT INTO `chitietluong`(`MaLuong`, `MaNV`, `ThuongPhat`, `HeSoLuong`, `NgayLapBang`, `NgaySuaDoi`) "
                    + "VALUES ('?,?,"
                    + "(SELECT SUM(khenthuongkyluat.SoTien) "
                    + "FROM chitietktkl JOIN khenthuongkyluat ONchitietktkl.MaKTKL = khenthuongkyluat.MaKTKL "
                    + "WHERE chitietktkl.MaNV = ? AND YEAR(khenthuongkyluat.NgayQuyetDinh) = YEAR(CURRENT_DATE) AND MONTH(khenthuongkyluat.NgayQuyetDinh) = MONTH(CURRENT_DATE)),"
                    + "(SELECT hesoluong.HeSoLuong "
                    + "FROM hesoluong JOIN nhanvien ON hesoluong.MaHSL = nhanvien.MaHSL AND nhanvien.MaNV = ?)"
                    + ",CURRENT_DATE, CURRENT_DATE);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, bangluong.getMaLuong());
            stmt.setString(2, bangluong.getMaNV());
            stmt.setString(3, bangluong.getMaNV());
            stmt.setString(4, bangluong.getMaNV());
           
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public void addBangLuongInAllNhanVien() {
        try {
            ArrayList<String> MaNV = getAllMaNV();
            for(String item : MaNV) {
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BangLuongDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    private ArrayList<String> getAllMaNV() throws SQLException {
        ArrayList<String> MaNV = new ArrayList();

        stmt = conn.prepareStatement("SELECT MaNV FROM Nhanvien");
        rs = stmt.executeQuery();
        while (rs.next()) {
            MaNV.add(rs.getString("MaNV"));
        }

        return MaNV;
    }
}
