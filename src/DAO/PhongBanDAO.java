/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PhongBanDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author chicu
 */
public class PhongBanDAO {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public PhongBanDAO() {
    }

    public ArrayList<PhongBanDTO> getPhongBan() {
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM phongban");
            ArrayList<PhongBanDTO> phongbanDAO = new ArrayList();

            rs = stmt.executeQuery();
            while(rs.next()) {
                phongbanDAO.add(new PhongBanDTO(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4)));
            }
            return phongbanDAO;
        }
        catch(SQLException e) {
            return null;
        }
        finally {
            DBConnection.closeConnection(conn, stmt, rs);
        }
    }
}
