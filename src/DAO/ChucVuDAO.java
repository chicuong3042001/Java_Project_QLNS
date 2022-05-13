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

    public ArrayList<ChucVuDTO> getChucVu() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM ChucVu");
            ArrayList<ChucVuDTO> chucvuDAO = new ArrayList();

            rs = stmt.executeQuery();
            while (rs.next()) {
                chucvuDAO.add(new ChucVuDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
            return chucvuDAO;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public boolean addChucVu(ChucVuDTO chucvu) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO ChucVu (MaCV, MaNV, TenCV, GhiChu) VALUES (?, ?, ?, ?)");
            stmt.setString(1, chucvu.getMaCV());
            stmt.setString(2, chucvu.getMaNV());
            stmt.setString(3, chucvu.getTenCV());
            stmt.setString(4, chucvu.getGhiChu());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteChucVu(String id) {
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

    public boolean deleteChucVu(ChucVuDTO chucvu) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM ChucVu WHERE MaCV = ?");
            stmt.setString(1, chucvu.getMaCV());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean updateChucVu(ChucVuDTO chucvu) {
        try {
            Object[] selection = chucvu.getSelection();
            String table = "";

            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            table += "TenCV = ? ,";
                        case 2 ->
                            table += "GhiChu = ? ,";
                    }
                }
            }
            table = table.substring(0, table.length() - 1);

            String sql = "UPDATE ChucVu SET " + table + "WHERE MaCV = ? AND MaNV = ?";

            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(sql);

            int index = 1;
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            stmt.setString(index++, chucvu.getTenCV());
                        case 2 ->
                            stmt.setString(index++, chucvu.getGhiChu());
                    }
                }
            }

            stmt.setString(index++, chucvu.getMaCV());
            stmt.setString(index++, chucvu.getMaNV());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
