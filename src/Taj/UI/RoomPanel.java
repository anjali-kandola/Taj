/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taj.UI;

import Taj.DatabaseOperation.DatabaseOperation;
import Taj.Classes.Room;
import Taj.Classes.RoomFare;
import Taj.DatabaseOperation.RoomDb;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Faysal Ahmed
 */
public class RoomPanel extends javax.swing.JDialog {

    /**
     * Creates new form RoomPanel
     */
    
    RoomFare roomType = new RoomFare();
    Room room = new Room("");
    
    ResultSet result;
    ArrayList<String> roomClass = new ArrayList<>();
    
    //DatabaseOperation db = new DatabaseOperation();
    RoomDb roomdb = new RoomDb();
    public RoomPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(new Color(241,241,242));
        populateCombo();
        populateRoomTable();
        populateRoomTypeTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_rooms = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        check_phone = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        tf_roomNo = new javax.swing.JTextField();
        combo_roomType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        check_tv = new javax.swing.JCheckBox();
        check_wifi = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        check_gizer = new javax.swing.JCheckBox();
        tf_roomID = new javax.swing.JTextField();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        tf_beds = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_addRoomType = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_deleteRoomType = new javax.swing.JButton();
        tf_roomType = new javax.swing.JTextField();
        tf_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_editRoomType = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_roomType = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        table_rooms.setModel(new javax.swing.table.DefaultTableModel(
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
        table_rooms.setToolTipText("");
        table_rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_roomsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_rooms);

        jPanel4.setBackground(new java.awt.Color(230, 231, 232));

        check_phone.setText("Phone Service");

        jLabel3.setText("Beds");

        jLabel1.setText("Room ID");

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EditButton.png"))); // NOI18N
        btn_edit.setEnabled(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jLabel6.setText("Category");

        check_tv.setText("TV");

        check_wifi.setText("WIFI");
        check_wifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_wifiActionPerformed(evt);
            }
        });

        jLabel2.setText("Room No");

        check_gizer.setText("Gizer");

        tf_roomID.setEditable(false);
        tf_roomID.setBackground(new java.awt.Color(204, 204, 255));

        btn_delete.setBackground(new java.awt.Color(255, 0, 0));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteButton.png"))); // NOI18N
        btn_delete.setEnabled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DefaultButton.png"))); // NOI18N
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_roomType, 0, 100, Short.MAX_VALUE)
                            .addComponent(tf_roomID)
                            .addComponent(tf_roomNo)
                            .addComponent(tf_beds)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(check_tv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(check_phone))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(check_wifi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(check_gizer, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_roomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_roomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_beds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo_roomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_tv)
                    .addComponent(check_phone))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_gizer)
                    .addComponent(check_wifi))
                .addGap(18, 18, 18)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reset.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Room Information", jPanel1);

        jPanel3.setBackground(new java.awt.Color(230, 231, 232));

        btn_addRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DefaultButton.png"))); // NOI18N
        btn_addRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addRoomTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("Price");

        btn_deleteRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DeleteButton.png"))); // NOI18N
        btn_deleteRoomType.setEnabled(false);
        btn_deleteRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteRoomTypeActionPerformed(evt);
            }
        });

        tf_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_priceKeyTyped(evt);
            }
        });

        jLabel4.setText("Room Type");

        btn_editRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EditButton.png"))); // NOI18N
        btn_editRoomType.setEnabled(false);
        btn_editRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editRoomTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_editRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_addRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_deleteRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_roomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btn_addRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_editRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_deleteRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        table_roomType.setModel(new javax.swing.table.DefaultTableModel(
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
        table_roomType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_roomTypeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_roomType);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Room Class", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addRoomTypeActionPerformed
        roomTypeObjectCreation();
        roomdb.insertRoomType(roomType);
        //populateRoomTable();
        populateRoomTypeTable();
        
    }//GEN-LAST:event_btn_addRoomTypeActionPerformed

    private void populateCombo()
    {
        try {
            ResultSet rs = roomdb.getRoomType();
            while(rs.next())
            {
                roomClass.add(rs.getString("type"));
                combo_roomType.addItem(rs.getString("type"));
            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Combo Fillup failed");
        }
    
    }
    
    private void populateRoomTypeTable()
    {
        //System.out.println(tabbedPane.getSelectedIndex());
        result = roomdb.getRoomType();
        table_roomType.setModel(DbUtils.resultSetToTableModel(result));
        roomdb.flushAll();
    }
    
    private void populateRoomTable()
    {
        result = roomdb.getRooms();
        table_rooms.setModel(DbUtils.resultSetToTableModel(result));
        roomdb.flushAll();
    }
    
    private void tf_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_priceKeyTyped
        char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tf_priceKeyTyped

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       
       roomObjectCreation();
       roomdb.insertRoom(room);
       populateRoomTable();
       clearRoomPanel();
        
        //System.out.println(combo_roomType.getSelectedItem().toString());
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editRoomTypeActionPerformed
        roomTypeObjectCreation();
        roomdb.updateRoomType(roomType);
        populateRoomTypeTable();
        btn_editRoomType.setEnabled(false);
        btn_addRoomType.setEnabled(true);
        
        
    }//GEN-LAST:event_btn_editRoomTypeActionPerformed

    private void table_roomTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_roomTypeMouseClicked
        roomType = new RoomFare();
        int row = table_roomType.getSelectedRow();
        displayToTextField(row);
        btn_addRoomType.setEnabled(false);
        btn_editRoomType.setEnabled(true);
        btn_deleteRoomType.setEnabled(true);
    }//GEN-LAST:event_table_roomTypeMouseClicked

    private void table_roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_roomsMouseClicked
        room = new Room(null);
        btn_edit.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_add.setEnabled(false);
        int row = table_rooms.getSelectedRow();
        displayToRoomTextField(row);
       // System.out.println(table_rooms.getValueAt(row, 1)+"");
        //System.out.println(">>>>>>> "+row );
        
    }//GEN-LAST:event_table_roomsMouseClicked

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        roomObjectCreation();
        roomdb.updateRoom(room);
        populateRoomTable();
        clearRoomPanel();
        btn_add.setEnabled(true);
        
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int roomId =Integer.parseInt( tf_roomID.getText() );
        roomdb.deleteRoom(roomId);
        populateRoomTable();
        clearRoomPanel();
        btn_add.setEnabled(true);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clearRoomPanel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_deleteRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteRoomTypeActionPerformed
        //int roomId =Integer.parseInt( tf_roomType.getText() );
        
        JOptionPane.showMessageDialog(null, "no method written yet");
        
    }//GEN-LAST:event_btn_deleteRoomTypeActionPerformed

    private void check_wifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_wifiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_wifiActionPerformed

    private void clearRoomPanel()
    {
        
        room = new Room(null);
        tf_beds.setText("");
        tf_price.setText("");
        tf_roomID.setText("");
        tf_roomNo.setText("");
        tf_roomType.setText("");
        table_rooms.clearSelection();
        check_gizer.setSelected(false);
        check_phone.setSelected(false);
        check_tv.setSelected(false);
        check_wifi.setSelected(false);
        combo_roomType.setSelectedIndex(0);
        
        btn_add.setEnabled(true);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        
        
        
        
    }
    
    private void clearRoomTypePanel()
    {
        roomType = new RoomFare();
        tf_roomType.setText("");
        tf_price.setText("");
        btn_addRoomType.setEnabled(true);
        btn_editRoomType.setEnabled(false);
        btn_deleteRoomType.setEnabled(false);
    }
    
    private void displayToRoomTextField(int row)
    {
       // for(int i=0; combo_roomType.)
        tf_roomID.setText(table_rooms.getModel().getValueAt(row, 0)+"");
        tf_roomNo.setText(table_rooms.getModel().getValueAt(row, 1)+"");
        tf_beds.setText(table_rooms.getModel().getValueAt(row, 2)+"");
        check_tv.setSelected((table_rooms.getModel().getValueAt(row, 3)+"").equals("true") ? true:false);
        check_wifi.setSelected((table_rooms.getModel().getValueAt(row, 4)+"").equals("true") ? true:false);
        check_gizer.setSelected((table_rooms.getModel().getValueAt(row, 5)+"").equals("true") ? true:false);
        check_phone.setSelected((table_rooms.getModel().getValueAt(row, 6)+"").equals("true") ? true:false);
        int selectedIndex = getComboSearchIndex(table_rooms.getModel().getValueAt(row, 7)+"");  
        combo_roomType.setSelectedIndex(selectedIndex);
        //tv,wifi,gizer,phone
        //value ? "true" : "false";
        
    }
      private void displayToTextField(int row) {
          tf_roomType.setText(table_roomType.getModel().getValueAt(row, 0)+"");
          tf_price.setText(table_roomType.getModel().getValueAt(row, 1)+"");
          
        }
      
      private int getComboSearchIndex(String item)
      {
          for( int i=0;i<roomClass.size() ; i++)
          {
              if(item.equals(roomClass.get(i)))
              {
                  return i;
              }
          }
          return -1;
      }
    
    private void roomObjectCreation()
    {
        // ************************************** null add korsi "" er jaygay  *********************
        room = new Room(null);
        room.setRoom_no(tf_roomNo.getText());
        room.setBed_number(Integer.parseInt(tf_beds.getText()));
        room.setHasTV(check_tv.isSelected());
        room.setHasWIFI(check_wifi.isSelected());
        room.setHasGizer(check_gizer.isSelected());
        room.setHasPhone(check_phone.isSelected());
        
        // setting the inner object of RoomType
        
        room.setRoom_class(new RoomFare());
        room.getRoom_class().setRoom_type(combo_roomType.getSelectedItem().toString());
        
        try
        {
            room.setRoom_id(Integer.parseInt(tf_roomID.getText()));
        }
        catch(Exception ex)
        {
            room.setRoom_id(-1);
        }
    }
    private void roomTypeObjectCreation()
    {
        roomType = new RoomFare();
        roomType.setRoom_type(tf_roomType.getText());
        roomType.setPricePerDay(Integer.parseInt(tf_price.getText()));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RoomPanel dialog = new RoomPanel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_addRoomType;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_deleteRoomType;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_editRoomType;
    private javax.swing.JCheckBox check_gizer;
    private javax.swing.JCheckBox check_phone;
    private javax.swing.JCheckBox check_tv;
    private javax.swing.JCheckBox check_wifi;
    private javax.swing.JComboBox combo_roomType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table_roomType;
    private javax.swing.JTable table_rooms;
    private javax.swing.JTextField tf_beds;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_roomID;
    private javax.swing.JTextField tf_roomNo;
    private javax.swing.JTextField tf_roomType;
    // End of variables declaration//GEN-END:variables

  
}
