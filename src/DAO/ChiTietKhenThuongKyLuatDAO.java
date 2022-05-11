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

    public ArrayList<ChiTietKhenThuongKyLuatDTO> getPhongBan() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM Chitietktkl");
            ArrayList<ChiTietKhenThuongKyLuatDTO> chitietkhenthuongkyluat = new ArrayList();
            rs = stmt.executeQuery();

            while (rs.next()) {
                chitietkhenthuongkyluat.add(new ChiTietKhenThuongKyLuatDTO(rs.getString(1), rs.getDouble(2), rs.getDate(3), rs.getString(4), rs.getString(5)));
            }
            return chitietkhenthuongkyluat;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public boolean addPhongBan(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkiluat) {
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

    public boolean deletePhongBan(String id) {
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

    public boolean deletePhongBan(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkiluat) {
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

    public boolean updateCategory(ChiTietKhenThuongKyLuatDTO chitietkhenthuongkiluat) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE Chitietdcl SET SoTien = ?, NgayQuyetDinh = ?, LoaiQuyetDinh = ?, NoiDung = ? WHERE MaKTKL = ?");
            stmt.setDouble(1, chitietkhenthuongkiluat.getSoTien());
            stmt.setDate(2, chitietkhenthuongkiluat.getNgayQuyetDinh());
            stmt.setString(3, chitietkhenthuongkiluat.getLoaiQuyetDinh());
            stmt.setString(4, chitietkhenthuongkiluat.getNoiDung());
            stmt.setString(5, chitietkhenthuongkiluat.getMaKTKL());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
