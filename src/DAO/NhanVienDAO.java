/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhanVienDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class NhanVienDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public NhanVienDAO() {
    }

    public ArrayList<NhanVienDTO> getNhanVien() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM nhanvien");
            ArrayList<NhanVienDTO> nhanvien = new ArrayList();
            rs = stmt.executeQuery();

            while (rs.next()) {
                nhanvien.add(new NhanVienDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
            return nhanvien;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public boolean addNhanVien(NhanVienDTO nhanvien) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO nhanvien (MaNV, HinhNV, TenNV, NgaySinh, GioiTinh, DiaChi, SoCMND, SoDienThoai, Email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, nhanvien.getMaNV());
            stmt.setString(2, nhanvien.getHinhNV());
            stmt.setString(3, nhanvien.getTenNV());
            stmt.setString(4, nhanvien.getNgaySinh());
            stmt.setString(5, nhanvien.getGioiTinh());
            stmt.setString(6, nhanvien.getDiaChi());
            stmt.setString(7, nhanvien.getSoCMND());
            stmt.setString(8, nhanvien.getSoDienThoai());
            stmt.setString(9, nhanvien.getEmail());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteNhanVien(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM nhanvien WHERE MaNV = ?");
            stmt.setString(1, id);

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteNhanVien(NhanVienDTO nhanvien) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM nhanvien WHERE MaNV = ?");
            stmt.setString(1, nhanvien.getMaNV());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean updateNhanVien(NhanVienDTO nhanvien) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE nhanvien SET HinhNV = ?, TenNV = ?, NgaySinh = ?, GioiTinh = ?, DiaChi = ?, SoCMND = ?, SoDienThoai = ?, Email = ? WHERE MaNV = ?");
            stmt.setString(1, nhanvien.getHinhNV());
            stmt.setString(2, nhanvien.getTenNV());
            stmt.setString(3, nhanvien.getNgaySinh());
            stmt.setString(4, nhanvien.getGioiTinh());
            stmt.setString(5, nhanvien.getDiaChi());
            stmt.setString(6, nhanvien.getSoCMND());
            stmt.setString(7, nhanvien.getSoDienThoai());
            stmt.setString(8, nhanvien.getEmail());
            stmt.setString(9, nhanvien.getMaNV());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
