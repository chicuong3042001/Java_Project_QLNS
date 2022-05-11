/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ChiTietLuongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChiTietLuongDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public ChiTietLuongDAO() {
    }
    
    public ArrayList<ChiTietLuongDTO> getChiTietLuong() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM Chitietluong");
            ArrayList<ChiTietLuongDTO> chitietluong = new ArrayList();
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                chitietluong.add(new ChiTietLuongDTO(rs.getString(1), rs.getDouble(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5)));
            }
            return chitietluong;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addChiTietLuong(ChiTietLuongDTO chitietluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO Chitietluong (MaLuong, LuongCB, KhoanCongThem, KhoanTru, HeSoLuong) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, chitietluong.getMaLuong());
            stmt.setDouble(2, chitietluong.getLuongCB());
            stmt.setDouble(3, chitietluong.getKhoanCongThem());
            stmt.setDouble(4, chitietluong.getKhoanTru());
            stmt.setDouble(5, chitietluong.getHeSoLuong());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteChiTietLuong(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM Chitietluong WHERE MaLuong = ?");
            stmt.setString(1, id);
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteChiTietLuong(ChiTietLuongDTO chitietluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM Chitietdcl WHERE MaLuong = ?");
            stmt.setString(1, chitietluong.getMaLuong());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateChiTietLuong(ChiTietLuongDTO chitietluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE Chitietluong SET LuongCB = ?, KhoanCongThem = ?, KhoanTru = ?, HeSoLuong = ? WHERE MaLuong = ?");
            stmt.setDouble(1, chitietluong.getLuongCB());
            stmt.setDouble(2, chitietluong.getKhoanCongThem());
            stmt.setDouble(3, chitietluong.getKhoanTru());
            stmt.setDouble(4, chitietluong.getHeSoLuong());
            stmt.setString(5, chitietluong.getMaLuong());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
