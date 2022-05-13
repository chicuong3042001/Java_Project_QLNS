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

            rs = stmt.executeQuery();

            ArrayList<NhanVienDTO> nhanvien = new ArrayList();
            while (rs.next()) {
                nhanvien.add(new NhanVienDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
            }
            return nhanvien;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }

    public ArrayList<NhanVienDTO> getNhanVien(NhanVienDTO data) {
        try {
            String table = "";
            Object[] selection = data.getSelection();
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            table += "HinhNV = ? ,";
                        case 2 ->
                            table += "TenNV = ? ,";
                        case 3 ->
                            table += "NgaySinh = ? ,";
                        case 4 ->
                            table += "GioiTinh = ? ,";
                        case 5 ->
                            table += "DiaChi = ? ,";
                        case 6 ->
                            table += "SoCMND = ? ,";
                        case 7 ->
                            table += "SoDienThoai = ? ,";
                        case 8 ->
                            table += "Email = ? ,";
                    }
                }
            }
            table = table.substring(0, table.length() - 1);

            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM nhanvien WHERE " + table);

            int index = 1;
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            stmt.setString(index++, data.getHinhNV());
                        case 2 ->
                            stmt.setString(index++, data.getTenNV());
                        case 3 ->
                            stmt.setDate(index++, data.getNgaySinhSQL());
                        case 4 ->
                            stmt.setString(index++, data.getGioiTinh());
                        case 5 ->
                            stmt.setString(index++, data.getDiaChi());
                        case 6 ->
                            stmt.setString(index++, data.getSoCMND());
                        case 7 ->
                            stmt.setString(index++, data.getSoDienThoai());
                        case 8 ->
                            stmt.setString(index++, data.getEmail());
                    }
                }
            }

            rs = stmt.executeQuery();

            ArrayList<NhanVienDTO> nhanvien = new ArrayList();
            while (rs.next()) {
                nhanvien.add(new NhanVienDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));
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
            stmt.setDate(4, nhanvien.getNgaySinhSQL());
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
            Object[] selection = nhanvien.getSelection();
            String table = "";
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            table += "HinhNV = ? ,";
                        case 2 ->
                            table += "TenNV = ? ,";
                        case 3 ->
                            table += "NgaySinh = ? ,";
                        case 4 ->
                            table += "GioiTinh = ? ,";
                        case 5 ->
                            table += "DiaChi = ? ,";
                        case 6 ->
                            table += "SoCMND = ? ,";
                        case 7 ->
                            table += "SoDienThoai = ? ,";
                        case 8 ->
                            table += "Email = ? ,";
                    }
                }
            }
            table = table.substring(0, table.length() - 1);

            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "UPDATE nhanvien SET " + table + "WHERE MaNV = ?");

            int index = 1;
            for (int i = 0; i < selection.length; i++) {
                if ((boolean) selection[i]) {
                    switch (i + 1) {
                        case 1 ->
                            stmt.setString(index++, nhanvien.getHinhNV());
                        case 2 ->
                            stmt.setString(index++, nhanvien.getTenNV());
                        case 3 ->
                            stmt.setDate(4, nhanvien.getNgaySinhSQL());
                        case 4 ->
                            stmt.setString(index++, nhanvien.getGioiTinh());
                        case 5 ->
                            stmt.setString(index++, nhanvien.getDiaChi());
                        case 6 ->
                            stmt.setString(index++, nhanvien.getSoCMND());
                        case 7 ->
                            stmt.setString(index++, nhanvien.getSoDienThoai());
                        case 8 ->
                            stmt.setString(index++, nhanvien.getEmail());
                    }
                }
            }
            stmt.setString(index++, nhanvien.getHinhNV());

            stmt.setString(index, nhanvien.getMaNV());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
}
