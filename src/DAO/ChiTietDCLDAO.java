/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ChiTietDCLDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author dohung
 */
public class ChiTietDCLDAO {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    public ChiTietDCLDAO() {
    }
    
    public ArrayList<ChiTietDCLDTO> getChiTietDCL() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM     chitietdcl");
            ArrayList<ChiTietDCLDTO> chitietdcl = new ArrayList();
            rs = stmt.executeQuery();

            while (rs.next()) {
                    chitietdcl.add(new ChiTietDCLDTO(rs.getString("MaDCL"), rs.getString("MaNV")));
            }
            return chitietdcl;
        } catch (SQLException e) {
            return null;
        } finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
    
    public boolean addChiTietDCL(ChiTietDCLDTO     chitietdcl) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "INSERT INTO chitietdcl (MaDCL, MaNV) VALUES (?, ?)");
            stmt.setString(1, chitietdcl.getMaDCL());
            stmt.setString(2, chitietdcl.getMaNV());
            stmt.executeUpdate();

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean deleteChiTietDCL(ChiTietDCLDTO chitietdcl) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM chitietdcl WHERE MaDCL = ? AND MaNV = ?");
            stmt.setString(1, chitietdcl.getMaDCL());
            stmt.setString(2, chitietdcl.getMaNV());

            stmt.executeUpdate();
            
            if(hasBangLuong()) {
                updateBangLuongNhanVien(chitietdcl.getMaNV());
            }

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    public boolean updateChiTietDCL(ChiTietDCLDTO chitietdcl) {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(
                    "DELETE FROM chitietdcl WHERE MaDCL = ? AND MaNV = ?");
            stmt.setString(1, chitietdcl.getMaDCL());
            stmt.setString(2, chitietdcl.getMaNV());

            stmt.executeUpdate();
            
            if(hasBangLuong()) {
                updateBangLuongNhanVien(chitietdcl.getMaNV());
            }

            return true;

        } catch (SQLException e) {
            return false;
        } finally {
            DBConnection.closeConnection(conn, stmt);
        }
    }
    
    private boolean hasBangLuong() throws SQLException {
        stmt = conn.prepareStatement("SELECT * FROM chitietdcl JOIN chitietluong "
                + "WHERE MONTH(chitietdcl.NgaySuaDoi) = MONTH(chitietluong.NgayLapBang) AND YEAR(chitietdcl.NgaySuaDoi) = YEAR(chitietluong.NgayLapBang) "
                + "AND MONTH(chitietluong.NgayLapBang) = MONTH(CURRENT_DATE) AND YEAR (chitietluong.NgayLapBang) = YEAR(CURRENT_DATE);");
        rs = stmt.executeQuery();
        return rs.next();
    }
    
    private void updateBangLuongNhanVien(String MaNV) throws SQLException {
        String sql = "UPDATE chitietdcl JOIN chitietluong JOIN dieuchinhluong"
                + "	ON chitietdcl.MaNV = chitietdcl.MaNV AND MONTH(chitietdcl.NgaySuaDoi) = MONTH(CURRENT_DATE)"
                + "        AND chitietdcl.MaDCL = dieuchinhluong.MaDCL"
                + "SET chitietluong.HeSoLuong = dieuchinhluong.HeSoLuong"
                + "    chitietluong.NgaySuaDoi = CURRENT_DATE"
                + "WHERE chitietdcl.MaNV = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, MaNV);
        stmt.executeUpdate();
    }
}
