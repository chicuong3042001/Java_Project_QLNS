/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.KhenThuongKyLuatDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class KhenThuongKyLuatDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public KhenThuongKyLuatDAO() {
    }

    public ArrayList<KhenThuongKyLuatDTO> getKhenThuongKyLuat() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM khenthuongkyluat");
            ArrayList<KhenThuongKyLuatDTO> khenthuongkyluat = new ArrayList();
            rs = stmt.executeQuery();

            while (rs.next()) {
                khenthuongkyluat.add(new KhenThuongKyLuatDTO(rs.getString(1), rs.getString(2), rs.getDouble(3)));
            }
            return khenthuongkyluat;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public boolean addKhenThuongKyLuat(KhenThuongKyLuatDTO khenthuongkyluat) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO khenthuongkyluat (MaKTKL, MaNV, SoTien) VALUES (?, ?, ?)");
            stmt.setString(1, khenthuongkyluat.getMaKTKL());
            stmt.setString(2, khenthuongkyluat.getMaNV());
            stmt.setDouble(3, khenthuongkyluat.getSoTien());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteKhenThuongKyLuat(KhenThuongKyLuatDTO khenthuongkyluat) {
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

    public boolean updateKhenThuongKyLuat(KhenThuongKyLuatDTO khenthuongkyluat) {
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
                        case 1 ->
                            stmt.setDouble(index++, khenthuongkyluat.getSoTien());
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
