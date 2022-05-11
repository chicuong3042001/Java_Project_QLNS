/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ChiTietDieuChinhLuongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChiTietDieuChinhLuongDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public ChiTietDieuChinhLuongDAO() {
    }
    
    public ArrayList<ChiTietDieuChinhLuongDTO> getChiTietDieuChinhLuong() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM Chitietdcl");
            ArrayList<ChiTietDieuChinhLuongDTO> chitietdieuchinhluong = new ArrayList();
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                chitietdieuchinhluong.add(new ChiTietDieuChinhLuongDTO(rs.getString(1), rs.getDate(2), rs.getDouble(3)));
            }
            return chitietdieuchinhluong;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addChiTietDieuChinhLuong(ChiTietDieuChinhLuongDTO chitietdieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO Chitietdcl (MaDCL, NgayDieuChinh, HeSoLuongMoi) VALUES (?, ?, ?)");
            stmt.setString(1, chitietdieuchinhluong.getMaDCL());
            stmt.setDate(2, chitietdieuchinhluong.getNgayDieuChinh());
            stmt.setDouble(3, chitietdieuchinhluong.getHeSoLuongMoi());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteChiTietDieuChinhLuong(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM Chitietdcl WHERE MaDCL = ?");
            stmt.setString(1, id);
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteChiTietDieuChinhLuong(ChiTietDieuChinhLuongDTO chitietdieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM Chitietdcl WHERE MaCV = ?");
            stmt.setString(1, chitietdieuchinhluong.getMaDCL());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateChiTietDieuChinhLuong(ChiTietDieuChinhLuongDTO chitietdieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE Chitietdcl SET NgayDieuChinh = ?, HeSoLuongMoi = ? WHERE MaDCL = ?");
            stmt.setDate(1, chitietdieuchinhluong.getNgayDieuChinh());
            stmt.setDouble(2, chitietdieuchinhluong.getHeSoLuongMoi());
            stmt.setString(3, chitietdieuchinhluong.getMaDCL());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
