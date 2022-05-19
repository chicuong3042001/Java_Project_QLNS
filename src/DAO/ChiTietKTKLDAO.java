/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ChiTietKTKLDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChiTietKTKLDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public ChiTietKTKLDAO() {
    }

    public ArrayList<ChiTietKTKLDTO> getChiTietKTKL() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM khenthuongkyluat");
            ArrayList<ChiTietKTKLDTO> khenthuongkyluat = new ArrayList();
            rs = stmt.executeQuery();

            while (rs.next()) {
                khenthuongkyluat.add(new ChiTietKTKLDTO(rs.getString(1), rs.getString(2)));
            }
            return khenthuongkyluat;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public boolean addChiTietKTKL(ChiTietKTKLDTO khenthuongkyluat) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO khenthuongkyluat (MaKTKL, MaNV) VALUES (?, ?)");
            stmt.setString(1, khenthuongkyluat.getMaKTKL());
            stmt.setString(2, khenthuongkyluat.getMaNV());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteChiTietKTKL(ChiTietKTKLDTO khenthuongkyluat) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM khenthuongkyluat WHERE MaKTKL = ? AND MaNV");
            stmt.setString(1, khenthuongkyluat.getMaKTKL());
            stmt.setString(2, khenthuongkyluat.getMaNV());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean updateChiTietKTKL(ChiTietKTKLDTO khenthuongkyluat) {
        try {
            Object[] selection = khenthuongkyluat.getSelection();
            
            String table = "";
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            table += "SoTien = ? ,";
                    }
                }
            }
            table = table.substring(0, table.length() - 1);

            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE khenthuongkyluat SET " + table + "WHERE MaKTKL = ? AND MaNV = ?");

            int index = 1;
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                    }
                }
            }

            stmt.setString(index++, khenthuongkyluat.getMaKTKL());
            stmt.setString(index++, khenthuongkyluat.getMaNV());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
