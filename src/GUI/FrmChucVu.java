/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author chicu
 */
public class FrmChucVu extends javax.swing.JPanel {

    JComboBox rankCBB = new JComboBox();
    JTextField employeeIDField = new JTextField();
    JLabel searchLabel = new JLabel(new ImageIcon(getClass().getResource("/GUI/Images/buttonsearch.png")));
    JButton rankAddButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/add.png")));
    JLabel employeeIDLabel = new JLabel("Nhập mã nhân viên:");
    JButton rankDeleteButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/xoa.png")));
    JButton rankSaveButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/sua.png")));
    JButton rankCancelButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/huy.png")));

    /**
     * Creates new form FrmChucVu
     */
    public FrmChucVu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
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
        rankIDLabel = new javax.swing.JLabel();
        rankIDField = new javax.swing.JTextField();
        rankNameField = new javax.swing.JTextField();
        rankDeleteBtn = new javax.swing.JButton();
        rankSaveBtn = new javax.swing.JButton();
        rankCancelBtn = new javax.swing.JButton();
        rankAddBtn = new javax.swing.JButton();
        rankNameLabel = new javax.swing.JLabel();
        virtualLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rankTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel1.getWidth(), jPanel1.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel(){    
            public void paintComponent(Graphics g){     
                ImageIcon icon=new ImageIcon(getClass().getResource("/GUI/Images/bg2.png"));     
                g.drawImage(icon.getImage(),0 , 0, jPanel3.getWidth(), jPanel3.getHeight(), null);       
                setOpaque(false);     
                super.paintComponent(g);     
            } 
        };
        rankBtn = new javax.swing.JLabel();
        rankSearchBtn = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 600));

        rankIDLabel.setText("Mã chức vụ:");

        rankDeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/xoa.png"))); // NOI18N
        rankDeleteBtn.setText("Xóa");
        rankDeleteBtn.setPreferredSize(new java.awt.Dimension(90, 30));

        rankSaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/sua.png"))); // NOI18N
        rankSaveBtn.setText("Sửa");
        rankSaveBtn.setPreferredSize(new java.awt.Dimension(90, 30));

        rankCancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/huy.png"))); // NOI18N
        rankCancelBtn.setText("Hủy");
        rankCancelBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        rankCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankCancelBtnActionPerformed(evt);
            }
        });

        rankAddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/add.png"))); // NOI18N
        rankAddBtn.setText("Thêm");
        rankAddBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        rankAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankAddBtnActionPerformed(evt);
            }
        });

        rankNameLabel.setText("Tên chức vụ:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rankNameLabel)
                            .addComponent(rankIDLabel)
                            .addComponent(rankIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rankNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(virtualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rankAddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rankDeleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rankCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rankIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rankIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rankNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rankNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(virtualLabel)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankAddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        rankTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rankTable.setOpaque(false);
        rankTable.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(rankTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(207, 24));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Thông tin chức vụ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 23));

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        rankBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/chuyenmon.png"))); // NOI18N
        rankBtn.setText("Chức vụ");
        rankBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 51, 255)));
        rankBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rankBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankBtnMouseClicked(evt);
            }
        });

        rankSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/search.png"))); // NOI18N
        rankSearchBtn.setText("Tìm kiếm");
        rankSearchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rankSearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rankSearchBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rankSearchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void hiddenMenu(boolean flag, String noidung) {
        rankIDLabel.setText(noidung);
        rankIDField.setVisible(flag);
        rankNameLabel.setVisible(flag);
        rankNameField.setVisible(flag);
        rankAddBtn.setVisible(flag);
        rankDeleteBtn.setVisible(flag);
        rankSaveBtn.setVisible(flag);
        rankCancelBtn.setVisible(flag);
    }
    boolean init = true;

    public boolean getInit() {
        return this.init;
    }

    public void frmsearch(JPanel jPanel2, JTextField rankIDField, JLabel rankIDLabel) {
        if (init) {
            rankCBB.setSize(150, 25);
            rankCBB.setLocation(rankIDField.getX(), rankIDField.getY());
            rankCBB.addItem("Mã Học Sinh");
            rankCBB.addItem("Tên Học Sinh");
            jPanel2.add(rankCBB);
            employeeIDLabel.setSize(130,17);
            employeeIDLabel.setLocation(rankCBB.getX(), rankCBB.getY()+50);
            jPanel2.add(employeeIDLabel);
            employeeIDField.setSize(150, 25);
            employeeIDField.setLocation(rankNameField.getX(), rankNameField.getY());
            jPanel2.add(employeeIDField);
            searchLabel.setSize(170, 25);
            searchLabel.setLocation(virtualLabel.getX(), virtualLabel.getY());
            searchLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            searchLabel.addMouseListener(new MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    //phuong thuc search 

                }
            });
            jPanel2.add(searchLabel);
            rankAddButton.setSize(90, 30);
            rankAddButton.setText("Thêm");
            rankAddButton.setLocation(rankAddBtn.getX(), rankAddBtn.getY());
            rankDeleteButton.setSize(90, 30);
            rankDeleteButton.setText("Xóa");
            rankDeleteButton.setLocation(rankDeleteBtn.getX(), rankDeleteBtn.getY());
            rankSaveButton.setSize(90, 30);
            rankSaveButton.setText("Sửa");
            rankSaveButton.setLocation(rankSaveBtn.getX(), rankSaveBtn.getY());
            rankCancelButton.setSize(90, 30);
            rankCancelButton.setText("Hủy");
            rankCancelButton.setLocation(rankCancelBtn.getX(), rankCancelBtn.getY());

            jPanel2.add(rankAddButton);
            jPanel2.add(rankCancelButton);
            jPanel2.add(rankDeleteButton);
            jPanel2.add(rankSaveButton);
            init = false;
        } else {
            rankCBB.setVisible(true);
            employeeIDField.setVisible(true);
            employeeIDLabel.setVisible(true);
            searchLabel.setVisible(true);
            rankAddButton.setVisible(true);
            rankCancelButton.setVisible(true);
            rankDeleteButton.setVisible(true);
            rankSaveButton.setVisible(true);
        }

    }

    private void rankBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankBtnMouseClicked
        // TODO add your handling code here:
        if (!getInit()) {
            hiddenMenu(true, "Mã chức vụ");
            rankCBB.setVisible(false);
            employeeIDField.setVisible(false);
            employeeIDLabel.setVisible(false);
            rankNameLabel.setVisible(true);
            searchLabel.setVisible(false);
            rankAddButton.setVisible(false);
            rankCancelButton.setVisible(false);
            rankDeleteButton.setVisible(false);
            rankSaveButton.setVisible(false);
        }
    }//GEN-LAST:event_rankBtnMouseClicked

    private void rankSearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rankSearchBtnMouseClicked
        hiddenMenu(false, "Chọn chức vụ: ");
        frmsearch(jPanel2, rankIDField, rankIDLabel);
    }//GEN-LAST:event_rankSearchBtnMouseClicked

    private void rankCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankCancelBtnActionPerformed
        // TODO add your handling code here:
        rankIDField.setText("");
        rankNameField.setText("");
    }//GEN-LAST:event_rankCancelBtnActionPerformed

    private void rankAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankAddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rankAddBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rankAddBtn;
    private javax.swing.JLabel rankBtn;
    private javax.swing.JButton rankCancelBtn;
    private javax.swing.JButton rankDeleteBtn;
    private javax.swing.JTextField rankIDField;
    private javax.swing.JLabel rankIDLabel;
    private javax.swing.JTextField rankNameField;
    private javax.swing.JLabel rankNameLabel;
    private javax.swing.JButton rankSaveBtn;
    private javax.swing.JLabel rankSearchBtn;
    private javax.swing.JTable rankTable;
    private javax.swing.JLabel virtualLabel;
    // End of variables declaration//GEN-END:variables
}
