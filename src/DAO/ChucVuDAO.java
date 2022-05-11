/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ChucVuDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChucVuDAO {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public ChucVuDAO() {
    }

    public ArrayList<ChucVuDTO> getPhongBan() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM ChucVu");
            ArrayList<ChucVuDTO> chucvuDAO = new ArrayList();

            rs = stmt.executeQuery();
            while(rs.next()) {
                chucvuDAO.add(new ChucVuDTO(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4)));
            }
            return chucvuDAO;
        }
        catch(SQLException e) {
            return null;
        }
        finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addPhongBan(ChucVuDTO chucvu) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO ChucVu (MaCV, TenCV, GhiChu) VALUES (?, ?, ?)");
            stmt.setString(1, chucvu.getMaCV());
            stmt.setString(2, chucvu.getTenCV());
            stmt.setString(3, chucvu.getGhiChu());
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
                    "DELETE FROM ChucVu WHERE MaCV = ?");
            stmt.setString(1, id);

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deletePhongBan(ChucVuDTO chucvu) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM PhongBan WHERE MaCV = ?");
            stmt.setString(1, chucvu.getMaCV());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateCategory(ChucVuDTO chucvu) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE ChucVu SET TenCV = ?, GhiChu = ? WHERE MaCV = ?");
            stmt.setString(1, chucvu.getTenCV());
            stmt.setString(2, chucvu.getGhiChu());
            stmt.setString(3, chucvu.getMaCV());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}