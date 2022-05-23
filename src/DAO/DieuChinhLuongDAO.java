/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DieuChinhLuongDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dohung
 */
public class DieuChinhLuongDAO {

    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public DieuChinhLuongDAO() {
    }

    public ArrayList<DieuChinhLuongDTO> getDieuChinhLuong() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM dieuchinhluong");
            rs = stmt.executeQuery();
            
            ArrayList<DieuChinhLuongDTO> dieuchinhluong = new ArrayList();
            
            while(rs.next()) {
                dieuchinhluong.add(new DieuChinhLuongDTO(rs.getString("MaDCL"), rs.getDouble("HeSoLuong"), rs.getDate("NgaySuaDoi")));
            }
            
            return dieuchinhluong;
        } catch (SQLException ex) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("INSERT INTO dieuchinhluong (MaDCL, HeSoLuong, NgaySuaDoi) VALUES (?,?,CURRENT_DATE)");
            stmt.setString(1, dieuchinhluong.getMaDCL());
            stmt.setDouble(2, dieuchinhluong.getHeSoLuong());
            
            return true;
            
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteDieuChinhLuong(String id) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM Dieuchinhluong WHERE MaDCL = ?");
            stmt.setString(1, id);

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }

    public boolean deleteDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM dieuchinhluong WHERE MaDCL = ?");
            stmt.setString(1, dieuchinhluong.getMaDCL());

            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateDieuChinhLuong(DieuChinhLuongDTO dieuchinhluong) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("UPDATE dieuchinhluong SET HeSoLuong = ?, NgaySuaDoi = CURRENT_DATE WHERE MaDCL = ?");
            stmt.setDouble(1, dieuchinhluong.getHeSoLuong());
            stmt.setString(2, dieuchinhluong.getMaDCL());
            
            stmt.executeUpdate();
            if(hasBangLuong()) {
                updateLuongAllNhanVien();
            }
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    private boolean hasBangLuong() throws SQLException {
        stmt = conn.prepareStatement("SELECT * FROM dieuchinhluong JOIN chitietluong "
                + "WHERE MONTH(dieuchinhluong.NgaySuaDoi) = MONTH(chitietluong.NgayLapBang) AND YEAR(dieuchinhluong.NgaySuaDoi) = YEAR(chitietluong.NgayLapBang) ");
        rs = stmt.executeQuery();
        return rs.next();
    }
    
    private ArrayList<String> getMaNhanVien() throws SQLException {
        stmt = conn.prepareStatement(
                "SELECT chitietdcl.MaNV FROM chitietdcl JOIN dieuchinhluong ON chitietktkl.MaDCL = dieuchinhluong.MaDCL "
                + "WHERE MONTH(dieuchinhluong.NgaySuaDoi) = MONTH(CURRENT_DATE) AND YEAR(dieuchinhluong.NgaySuaDoi) = YEAR(CURRENT_DATE) "
                + "AND MONTH(dieuchinhluong.NgayQuyetDinh) = MONTH(CURRENT_DATE) AND YEAR(dieuchinhluong.NgayQuyetDinh) = YEAR(CURRENT_DATE);");

        ArrayList<String> MaNhanVien = new ArrayList();
        rs = stmt.executeQuery();

        while (rs.next()) {
            MaNhanVien.add(rs.getString("MaNV"));
        }

        return MaNhanVien;
    }
    
    private void updateLuongAllNhanVien() throws SQLException {
        String sql = "UPDATE chitietdcl JOIN chitietluong JOIN dieuchinhluong"
                + "	ON chitietdcl.MaNV = chitietdcl.MaNV AND MONTH(chitietdcl.NgaySuaDoi) = MONTH(CURRENT_DATE)"
                + "        AND chitietdcl.MaDCL = dieuchinhluong.MaDCL"
                + "SET chitietluong.HeSoLuong = dieuchinhluong.HeSoLuong"
                + "    chitietluong.NgaySuaDoi = CURRENT_DATE"
                + "WHERE chitietdcl.MaNV = ?";
        stmt = conn.prepareStatement(sql);
        
        ArrayList<String> MaNhanVien = getMaNhanVien();
        for (String ma : MaNhanVien) {
            stmt.setString(1, ma);
            stmt.setString(2, ma);
            stmt.executeUpdate();
        }
    }
}
