/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.LuongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class LuongDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public LuongDAO() {
    }
    
    public ArrayList<LuongDTO> getPhongBan() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM luong");
            ArrayList<LuongDTO> luong = new ArrayList();
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                luong.add(new LuongDTO(rs.getString(1), rs.getString(2), rs.getDouble(3)));
            }
            return luong;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addPhongBan(LuongDTO luong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO luong (MaLuong, MaNV, TienLuong) VALUES (?, ?, ?)");
            stmt.setString(1, luong.getMaLuong());
            stmt.setString(2, luong.getMaNV());
            stmt.setDouble(3, luong.getTienLuong());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deletePhongBan(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM luong WHERE MaLuong = ?");
            stmt.setString(1, id);
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deletePhongBan(LuongDTO luong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM luong WHERE MaLuong = ?");
            stmt.setString(1, luong.getMaLuong());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateCategory(LuongDTO luong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE luong SET MaNV = ?, HeSoLuongMoi = ? WHERE MaLuong = ?");
            stmt.setString(1, luong.getMaNV());
            stmt.setDouble(2, luong.getTienLuong());
            stmt.setString(3, luong.getMaLuong());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
