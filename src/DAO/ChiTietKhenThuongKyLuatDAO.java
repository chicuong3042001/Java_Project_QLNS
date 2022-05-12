/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ChiTietKhenThuongKyLuatDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class ChiTietKhenThuongKyLuatDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public ChiTietKhenThuongKyLuatDAO() {
    }

    public ArrayList<ChiTietKhenThuongKyLuatDTO> getChiTietKhenThuongKyLuat() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM Chitietktkl");
            ArrayList<ChiTietKhenThuongKyLuatDTO> chitietkhenthuongkyluat = new ArrayList();
            rs = stmt.executeQuery();

            while (rs.next()) {
                chitietkhenthuongkyluat.add(new ChiTietKhenThuongKyLuatDTO(rs.getString(1), rs.getDouble(2), rs.getDate(3), rs.
                        getString(4), rs.getString(5)));
            }
            return chitietkhenthuongkyluat;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public boolean addChiTietKhenThuongKyLuat(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkiluat) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO Chitietktkl (MaKTKL, SoTien, NgayQuyetDinh, LoaiQuyetDinh, NoiDung) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, chitietkhenthuongkiluat.getMaKTKL());
            stmt.setDouble(2, chitietkhenthuongkiluat.getSoTien());
            stmt.setDate(3, chitietkhenthuongkiluat.getNgayQuyetDinh());
            stmt.setString(4, chitietkhenthuongkiluat.getLoaiQuyetDinh());
            stmt.setString(5, chitietkhenthuongkiluat.getNoiDung());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteChiTietKhenThuongKyLuat(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM Chitietktkl WHERE MaKTKL = ?");
            stmt.setString(1, id);

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteChiTietKhenThuongKyLuat(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkiluat) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM Chitietdcl WHERE MaKTKL = ?");
            stmt.setString(1, chitietkhenthuongkiluat.getMaKTKL());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean updateChiTietKhenThuongKyLuat(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkiluat, ArrayList<Boolean> selection) {
        try {
            String table = "";
            for (boolean select : selection) {
                if (select) {
                    switch (selection.indexOf(select) + 1) {
                        case 1 -> table += "SoTien = ? ";
                        case 2 -> table += "NgayQuyetDinh = ? ";
                        case 3 -> table += "LoaiQuyetDinh = ? ";
                        case 4 -> table += "NoiDung = ? ";
                    }
                }
            }

            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE Chitietdcl SET " + table + "WHERE MaKTKL = ?");
            
            int index = 1;
            for (boolean select : selection) {
                if (select) {
                    switch (selection.indexOf(select) + 1) {
                        case 1 -> stmt.setDouble(index++, chitietkhenthuongkiluat.getSoTien());
                        case 2 -> stmt.setDate(index++, chitietkhenthuongkiluat.getNgayQuyetDinh());
                        case 3 -> stmt.setString(index++, chitietkhenthuongkiluat.getLoaiQuyetDinh());
                        case 4 -> stmt.setString(index++, chitietkhenthuongkiluat.getNoiDung());
                    }
                }
            }
             
            stmt.setString(index, chitietkhenthuongkiluat.getMaKTKL());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
