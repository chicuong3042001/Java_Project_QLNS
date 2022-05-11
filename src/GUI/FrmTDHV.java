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
public class FrmTDHV extends javax.swing.JPanel {

    JComboBox studyCBB = new JComboBox();
    JTextField employeeIDField = new JTextField();
    JLabel searchLabel = new JLabel(new ImageIcon(getClass().getResource("/GUI/Images/buttonsearch.png")));
    JButton studyAddButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/add.png")));
    JButton studyDeleteButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/xoa.png")));
    JButton studySaveButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/sua.png")));
    JButton studyCancelButton = new JButton(new ImageIcon(getClass().getResource("/GUI/Images/huy.png")));

    /**
     * Creates new form FrmTDHV
     */
    public FrmTDHV() {
        initComponents();
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

        studyTable.setModel(new javax.swing.table.DefaultTableModel(
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
        studyTable.setOpaque(false);
        studyTable.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(studyTable);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 600));

        studyIDLabel.setText("Mã học vấn:");

        studyDeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/xoa.png"))); // NOI18N
        studyDeleteBtn.setText("Xóa");
        studyDeleteBtn.setPreferredSize(new java.awt.Dimension(90, 30));

        studySaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/sua.png"))); // NOI18N
        studySaveBtn.setText("Sửa");
        studySaveBtn.setPreferredSize(new java.awt.Dimension(90, 30));

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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Thông tin học vấn");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 23));

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
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

    public void hiddenMenu(boolean flag, String noidung, String timtheo) {
        studyIDLabel.setText(noidung);
        studyIDField.setVisible(flag);
        studyNameLabel.setText(timtheo);
        studyNameField.setVisible(flag);
        studyAddBtn.setVisible(flag);
        studyDeleteBtn.setVisible(flag);
        studySaveBtn.setVisible(flag);
        studyCancelBtn.setVisible(flag);
    }
    boolean init = true;

    public boolean getInit() {
        return this.init;
    }

    public void frmsearch(JPanel jPanel2, JTextField studyIDField, JLabel studyIDLabel) {
        if (init) {
            studyCBB.setSize(150, 25);
            studyCBB.setLocation(studyIDField.getX(), studyIDField.getY());
            studyCBB.addItem("Mã Học Sinh");
            studyCBB.addItem("Tên Học Sinh");
            jPanel2.add(studyCBB);
            employeeIDField.setSize(150, 25);
            employeeIDField.setLocation(studyNameField.getX(), studyNameField.getY());
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
            studyAddButton.setSize(90, 30);
            studyAddButton.setText("Thêm");
            studyAddButton.setLocation(studyAddBtn.getX(), studyAddBtn.getY());
            studyDeleteButton.setSize(90, 30);
            studyDeleteButton.setText("Xóa");
            studyDeleteButton.setLocation(studyDeleteBtn.getX(), studyDeleteBtn.getY());
            studySaveButton.setSize(90, 30);
            studySaveButton.setText("Sửa");
            studySaveButton.setLocation(studySaveBtn.getX(), studySaveBtn.getY());
            studyCancelButton.setSize(90, 30);
            studyCancelButton.setText("Hủy");
            studyCancelButton.setLocation(studyCancelBtn.getX(), studyCancelBtn.getY());
            jPanel2.add(studyAddButton);
            jPanel2.add(studyCancelButton);
            jPanel2.add(studyDeleteButton);
            jPanel2.add(studySaveButton);
            init = false;
        } else {
            studyCBB.setVisible(true);
            employeeIDField.setVisible(true);
            searchLabel.setVisible(true);
            studyAddButton.setVisible(true);
            studyCancelButton.setVisible(true);
            studyDeleteButton.setVisible(true);
            studySaveButton.setVisible(true);
        }

    }

    private void studyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studyBtnMouseClicked
        // TODO add your handling code here:
        if (!getInit()) {
            hiddenMenu(true, "Mã chức vụ", "Tên chức vụ");
            studyCBB.setVisible(false);
            employeeIDField.setVisible(false);
            searchLabel.setVisible(false);
            studyAddButton.setVisible(false);
            studyCancelButton.setVisible(false);
            studyDeleteButton.setVisible(false);
            studySaveButton.setVisible(false);
        }
    }//GEN-LAST:event_studyBtnMouseClicked

    private void studySearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studySearchBtnMouseClicked
        hiddenMenu(false, "Chọn chức vụ: ", "Nhập mã nhân viên: ");
        frmsearch(jPanel2, studyIDField, studyIDLabel);
    }//GEN-LAST:event_studySearchBtnMouseClicked

    private void studyCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studyCancelBtnActionPerformed
        // TODO add your handling code here:
        studyIDField.setText("");
        studyNameField.setText("");

    }//GEN-LAST:event_studyCancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
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