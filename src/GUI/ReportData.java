/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author HHH
 */
public class ReportData {

    public void reportNhanVien() {
        try {
            Hashtable map = new Hashtable();
            Connection conn = DBConnection.getConnection();
            JasperReport rpt = JasperCompileManager.compileReport("src/Report/reportNhanVien.jrxml");
            JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
            JasperViewer.viewReport(p, false);
            
            conn.close();

        } catch (JRException ex) {
            Logger.getLogger(ReportData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReportData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void reportBangLuong(String maNV) {
        try {
            Hashtable map = new Hashtable();
            map.put("maNV", maNV);
            Connection conn = DBConnection.getConnection();
            JasperReport rpt = JasperCompileManager.compileReport("src/Report/reportNhanVien.jrxml");
            JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
            JasperViewer.viewReport(p, false);
            
            conn.close();

        } catch (JRException ex) {
            Logger.getLogger(ReportData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReportData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
