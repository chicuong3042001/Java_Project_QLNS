/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DieuChinhLuongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class DieuChinhLuongDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public DieuChinhLuongDAO() {
    }
    
    public ArrayList<DieuChinhLuongDTO> getDieuChinhLuong() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM dieuchinhluong");
            ArrayList<DieuChinhLuongDTO> dieuchinhluong = new ArrayList();
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                dieuchinhluong.add(new DieuChinhLuongDTO(rs.getString(1), rs.getString(2), rs.getDouble(3)));
            }
            return dieuchinhluong;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO dieuchinhluong (MaDCL, MaNV, HeSoLuongMoi) VALUES (?, ?, ?)");
            stmt.setString(1, dieuchinhluong.getMaDCL());
            stmt.setString(2, dieuchinhluong.getMaNV());
            stmt.setDouble(3, dieuchinhluong.getHeSoLuongMoi());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteDieuChinhLuong(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM dieuchinhluong WHERE MaDCL = ?");
            stmt.setString(1, id);
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM dieuchinhluong WHERE MaDCL = ?");
            stmt.setString(1, dieuchinhluong.getMaDCL());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE hesoluong SET MaNV = ?, HeSoLuongMoi = ? WHERE MaDCL = ?");
            stmt.setString(1, dieuchinhluong.getMaNV());
            stmt.setDouble(2, dieuchinhluong.getHeSoLuongMoi());
            stmt.setString(3, dieuchinhluong.getMaDCL());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
