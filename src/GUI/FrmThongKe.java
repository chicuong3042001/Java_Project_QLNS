/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.ChucVuBUS;
import BUS.NhanVienBUS;
import BUS.PhongBanBUS;
import BUS.TrinhDoHocVanBUS;
import DAO.PhongBanDAO;
import DTO.ChucVuDTO;
import DTO.NhanVienDTO;
import DTO.PhongBanDTO;
import DTO.TrinhDoHocVanDTO;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chicu
 */
public class FrmThongKe extends javax.swing.JPanel {

    public NhanVienBUS nvbus;
    public NhanVienDTO nvdto;
    public ArrayList<NhanVienDTO> arrNVDTO;
    public DefaultTableModel defaultTableModel;

    /**
     * Creates new form FrmThongKe
     */
    public FrmThongKe() {
        initComponents();
        nvbus = new NhanVienBUS();
        nvdto = new NhanVienDTO();
        arrNVDTO = new ArrayList<>();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };
        dataTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã nhân viên");
        defaultTableModel.addColumn("Tên nhân viên");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel2.getWidth(), jPanel2.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        jLabel2 = new javax.swing.JLabel();
        danhMucCBB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        showBtn = new javax.swing.JButton();
        infoField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel1.getWidth(), jPanel1.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 600));

        jLabel2.setText("Chọn danh mục:");

        danhMucCBB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mã phòng ban", "Mã chức vụ", "Mã trình độ học vấn" }));

        jLabel3.setText("Nhập thông tin:");

        showBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/show.png"))); // NOI18N
        showBtn.setText("Xem danh sách");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(danhMucCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(infoField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(showBtn)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(danhMucCBB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(showBtn)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(207, 24));

        jLabel1.setText("Thống kê");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setEmployeeDataByMaPB(ArrayList<NhanVienDTO> employees, String MaPB) {
        for (NhanVienDTO employee : employees) {
            MaPB = MaPB.toLowerCase();
            if (employee.getMaPB().toLowerCase().equals(MaPB)) {
                defaultTableModel.addRow(new Object[]{
                    employee.getMaNV(),
                    employee.getTenNV(),});
            }
        }
    }

    public void setEmployeeDataByMaCV(ArrayList<NhanVienDTO> employees, String MaCV) {
        for (NhanVienDTO employee : employees) {
            MaCV = MaCV.toLowerCase();
            if (employee.getMaCV().toLowerCase().equals(MaCV)) {
                defaultTableModel.addRow(new Object[]{
                    employee.getMaNV(),
                    employee.getTenNV(),});
            }
        }
    }

    public void setEmployeeDataByMaTDHV(ArrayList<NhanVienDTO> employees, String MaTDHV) {
        for (NhanVienDTO employee : employees) {
            MaTDHV = MaTDHV.toLowerCase();
            if (employee.getMaTDHV().toLowerCase().equals(MaTDHV)) {
                defaultTableModel.addRow(new Object[]{
                    employee.getMaNV(),
                    employee.getTenNV(),});
            }
        }
    }

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:

        switch (danhMucCBB.getSelectedIndex()) {
            case 0: {
                String MaPB = infoField.getText().trim();
                if ("".equals(MaPB)) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setEmployeeDataByMaPB(nvbus.getNhanVien(), MaPB);
                break;
            }
            case 1: {
                String MaCV = infoField.getText().trim();
                if ("".equals(MaCV)) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setEmployeeDataByMaCV(nvbus.getNhanVien(), MaCV);
                break;

            }
            case 2:
                String MaTDHV = infoField.getText().trim();
                if ("".equals(MaTDHV)) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                dataTable.removeAll();
                defaultTableModel.setRowCount(0);
                setEmployeeDataByMaTDHV(nvbus.getNhanVien(), MaTDHV);
                break;

        }
    }//GEN-LAST:event_showBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox danhMucCBB;
    private javax.swing.JTable dataTable;
    private javax.swing.JTextField infoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables
}