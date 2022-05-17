/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.TrinhDoHocVanBUS;
import DTO.TrinhDoHocVanDTO;
import static GUI.FrmDSNV.resize;
import static GUI.FrmDSNV.setTimeout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chicu
 */
public class FrmTDHV extends javax.swing.JPanel {

    JComboBox studyCBB = new JComboBox();
    JTextField employeeIDField = new JTextField();
    JLabel searchLabel = new JLabel(new ImageIcon(getClass().getResource("/GUI/Images/buttonsearch.png")));
    JLabel employeeIDLabel = new JLabel("Nhập mã nhân viên:");
    JTable searchTable = new JTable();
    TrinhDoHocVanBUS tdhvbus;
    TrinhDoHocVanDTO tdhvdto;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form FrmTDHV
     */
    public FrmTDHV() {
        initComponents();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        tdhvbus = new TrinhDoHocVanBUS();
        tdhvdto = new TrinhDoHocVanDTO();
        studyTable.setModel(defaultTableModel);
        setTDHVData(tdhvbus.getTrinhDoHocVan());
    }
    public void setTDHVData(ArrayList<TrinhDoHocVanDTO> TDHVs) {
        for (TrinhDoHocVanDTO TDHV : TDHVs) {
            defaultTableModel.addRow(new Object[]{
                TDHV.getMaTDHV(),
                TDHV.getTenTDHV()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studyTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel2.getWidth(), jPanel2.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        studyIDLabel = new javax.swing.JLabel();
        studyIDField = new javax.swing.JTextField();
        studyNameField = new javax.swing.JTextField();
        studyDeleteBtn = new javax.swing.JButton();
        studySaveBtn = new javax.swing.JButton();
        studyCancelBtn = new javax.swing.JButton();
        studyAddBtn = new javax.swing.JButton();
        studyNameLabel = new javax.swing.JLabel();
        virtualLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel3.getWidth(), jPanel3.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        studyBtn = new javax.swing.JLabel();
        studySearchBtn = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel1.getWidth(), jPanel1.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        jLabel1 = new javax.swing.JLabel();
        selectBtn = new javax.swing.JButton();

        studyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã TDHV", "Tên TDHV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studyTable.setColumnSelectionAllowed(true);
        studyTable.setOpaque(false);
        studyTable.setRequestFocusEnabled(false);
        studyTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(studyTable);
        studyTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 600));

        studyIDLabel.setText("Mã học vấn:");

        studyDeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/xoa.png"))); // NOI18N
        studyDeleteBtn.setText("Xóa");
        studyDeleteBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        studyDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyDeleteBtnActionPerformed(evt);
            }
        });

        studySaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/sua.png"))); // NOI18N
        studySaveBtn.setText("Sửa");
        studySaveBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        studySaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studySaveBtnActionPerformed(evt);
            }
        });

        studyCancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/huy.png"))); // NOI18N
        studyCancelBtn.setText("Hủy");
        studyCancelBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        studyCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyCancelBtnActionPerformed(evt);
            }
        });

        studyAddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add.png"))); // NOI18N
        studyAddBtn.setText("Thêm");
        studyAddBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        studyAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studyAddBtnActionPerformed(evt);
            }
        });

        studyNameLabel.setText("Tên học vấn:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studyNameLabel)
                            .addComponent(studyIDLabel)
                            .addComponent(studyIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(virtualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studyAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studySaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studyDeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studyCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(studyIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studyIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studyNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(virtualLabel)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studyAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studyDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studyCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studySaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        studyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/hocvan.png"))); // NOI18N
        studyBtn.setText("Học vấn");
        studyBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 51, 255)));
        studyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studyBtnMouseClicked(evt);
            }
        });

        studySearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/search.png"))); // NOI18N
        studySearchBtn.setText("Tìm kiếm");
        studySearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studySearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studySearchBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(studyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studySearchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studySearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(207, 24));

        jLabel1.setText("Thông tin học vấn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        selectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/chon.png"))); // NOI18N
        selectBtn.setText("Chọn");
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selectBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void hiddenMenu(boolean flag, String noidung) {
        studyIDLabel.setText(noidung);
        studyIDField.setVisible(flag);
        studyNameLabel.setVisible(flag);
        studyNameField.setVisible(flag);
        studyAddBtn.setVisible(flag);
        studyDeleteBtn.setVisible(flag);
        studySaveBtn.setVisible(flag);
        studyCancelBtn.setVisible(flag);
        studyTable.setVisible(flag);
    }
    boolean init = true;

    public boolean getInit() {
        return this.init;
    }

    public void frmsearch(JPanel jPanel2, JTextField studyIDField, JLabel studyIDLabel, JTable studyTable) {
        if (init) {
            studyCBB.setSize(150, 25);
            studyCBB.setLocation(studyIDField.getX(), studyIDField.getY());
            studyCBB.addItem("Mã Học Sinh");
            studyCBB.addItem("Tên Học Sinh");
            jPanel2.add(studyCBB);
            employeeIDField.setSize(150, 25);
            employeeIDField.setLocation(studyNameField.getX(), studyNameField.getY());
            jPanel2.add(employeeIDField);
            employeeIDLabel.setSize(130,17);
            employeeIDLabel.setLocation(studyCBB.getX(), studyCBB.getY()+50);
            jPanel2.add(employeeIDLabel);
            searchLabel.setSize(170, 25);
            searchLabel.setLocation(virtualLabel.getX(), virtualLabel.getY());
            searchLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            searchLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    //phuong thuc search 

                }
            });
            jPanel2.add(searchLabel);
            addTable(studyTable);
            init = false;
        } else {
            studyCBB.setVisible(true);
            employeeIDField.setVisible(true);
            employeeIDLabel.setVisible(true);
            searchTable.setVisible(true);
        }

    }
    
    public void addTable(JTable studyTable){
            searchTable.setSize(studyTable.getSize());
            searchTable.setLocation(studyTable.getX(), studyTable.getY()+10);
            studyTable.setVisible(false);
            searchTable.setModel(defaultTableModel);
            defaultTableModel.addColumn("Mã TDHV");
            defaultTableModel.addColumn("Tên TDHV");
            defaultTableModel.addColumn("Tên nhân viên");
            
            jPanel2.add(searchTable);
    }
    
    private void studyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studyBtnMouseClicked
        // TODO add your handling code here:
        if (!getInit()) {
            hiddenMenu(true, "Mã trình độ học vấn:");
            studyCBB.setVisible(false);
            employeeIDField.setVisible(false);
            employeeIDLabel.setVisible(false);
            searchTable.setVisible(false);
        }
    }//GEN-LAST:event_studyBtnMouseClicked

    private void studySearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studySearchBtnMouseClicked
        hiddenMenu(false, "Chọn trình độ học vấn:");
        frmsearch(jPanel2, studyIDField, studyIDLabel,studyTable);
    }//GEN-LAST:event_studySearchBtnMouseClicked

    private void studyCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyCancelBtnActionPerformed
        // TODO add your handling code here:
        studyIDField.setText("");
        studyNameField.setText("");
        studyIDField.setEnabled(true);
    }//GEN-LAST:event_studyCancelBtnActionPerformed

    private void studyAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyAddBtnActionPerformed
        // TODO add your handling code here:
        if("".equals(studyIDField.getText()) || "".equals(studyNameField.getText())) {
            JOptionPane.showMessageDialog(this, "Không được bỏ trống dữ liệu nhập vào !!!","Lỗi",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            tdhvdto.setMaTDHV(studyIDField.getText());
            tdhvdto.setTenTDHV(studyNameField.getText());
            tdhvbus.addTrinhDoHocVan(tdhvdto);
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công !!!");
            defaultTableModel.setRowCount(0);
            setTDHVData(tdhvbus.getTrinhDoHocVan());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);

        }
    }//GEN-LAST:event_studyAddBtnActionPerformed

    private void studyDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyDeleteBtnActionPerformed
        // TODO add your handling code here:
        int row = studyTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn TDHV cần xóa !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không ?");
            
            if (confirm == JOptionPane.YES_OPTION) {
                String studyCode = String.valueOf(studyTable.getValueAt(row, 0));
                
                tdhvbus.deleteTrinhDoHocVan(studyCode);
                defaultTableModel.setRowCount(0);
                setTDHVData(tdhvbus.getTrinhDoHocVan());
            }
        }
    }//GEN-LAST:event_studyDeleteBtnActionPerformed

    private void studySaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studySaveBtnActionPerformed
        // TODO add your handling code here:
        int row = studyTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn TDHV cần sửa !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            tdhvdto.setMaTDHV(studyIDField.getText());
            tdhvdto.setTenTDHV(studyNameField.getText());
            

            tdhvbus.updateTrinhDoHocVan(tdhvdto);
            JOptionPane.showMessageDialog(this, "Sửa nhân viên thành công !!!");
            defaultTableModel.setRowCount(0);
            setTDHVData(tdhvbus.getTrinhDoHocVan());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_studySaveBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        // TODO add your handling code here:
        showInfo();
    }//GEN-LAST:event_selectBtnActionPerformed

    public void showInfo() {
        int row = studyTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn TDHV cần sửa !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else {
            String studyCode = String.valueOf(studyTable.getValueAt(row, 0));
            tdhvdto = tdhvbus.findTDHVByID(studyCode);
            studyIDField.setText(tdhvdto.getMaTDHV());
            studyIDField.setEnabled(false);
            studyNameField.setText(tdhvdto.getTenTDHV());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectBtn;
    private javax.swing.JButton studyAddBtn;
    private javax.swing.JLabel studyBtn;
    private javax.swing.JButton studyCancelBtn;
    private javax.swing.JButton studyDeleteBtn;
    private javax.swing.JTextField studyIDField;
    private javax.swing.JLabel studyIDLabel;
    private javax.swing.JTextField studyNameField;
    private javax.swing.JLabel studyNameLabel;
    private javax.swing.JButton studySaveBtn;
    private javax.swing.JLabel studySearchBtn;
    private javax.swing.JTable studyTable;
    private javax.swing.JLabel virtualLabel;
    // End of variables declaration//GEN-END:variables
}
