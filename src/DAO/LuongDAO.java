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

    public ArrayList<LuongDTO> getLuong() {
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

    public boolean addLuong(LuongDTO luong) {
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

    public boolean deleteLuong(String id) {
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

    public boolean deleteLuong(LuongDTO luong) {
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

    public boolean updateLuong(LuongDTO luong, Object[] selection) {
        try {
            String table = "";
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            table += "MaNV = ? ";
                        case 2 ->
                            table += "HeSoLuongMoi = ? ";
                    }
                }
            }
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE luong SET " + table + "WHERE MaLuong = ?");

            int index = 1;
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            stmt.setString(index++, luong.getMaNV());
                        case 2 ->
                            stmt.setDouble(index++, luong.getTienLuong());
                    }
                }
            }

            stmt.setString(index, luong.getMaLuong());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
