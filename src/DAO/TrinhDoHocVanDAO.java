/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TrinhDoHocVanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class TrinhDoHocVanDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public TrinhDoHocVanDAO() {
    }
    
    public ArrayList<TrinhDoHocVanDTO> getPhongBan() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM trinhdohocvan");
            ArrayList<TrinhDoHocVanDTO> trinhdohocvan = new ArrayList();
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                trinhdohocvan.add(new TrinhDoHocVanDTO(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return trinhdohocvan;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addPhongBan(TrinhDoHocVanDTO trinhdohocvan) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO trinhdohocvan (MaTDHV, MaNV, TenTDHV) VALUES (?, ?, ?)");
            stmt.setString(1, trinhdohocvan.getMaTDHV());
            stmt.setString(2, trinhdohocvan.getMaNV());
            stmt.setString(3, trinhdohocvan.getTenTDHV());
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
                    "DELETE FROM trinhdohocvan WHERE MaTDHV = ?");
            stmt.setString(1, id);
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deletePhongBan(TrinhDoHocVanDTO trinhdohocvan) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM trinhdohocvan WHERE MaTDHV = ?");
            stmt.setString(1, trinhdohocvan.getMaTDHV());
            
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateCategory(TrinhDoHocVanDTO trinhdohocvan) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE trinhdohocvan SET MaNV = ?, HeSoLuongMoi = ? WHERE MaTDHV = ?");
            stmt.setString(1, trinhdohocvan.getMaNV());
            stmt.setString(2, trinhdohocvan.getTenTDHV());
            stmt.setString(3, trinhdohocvan.getMaTDHV());
            stmt.executeUpdate();
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
