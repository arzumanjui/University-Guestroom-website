/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jui
 */
public class AddRoom extends javax.swing.JFrame {

    /**
     * Creates new form AddRoom
     */
    public AddRoom() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        txtRoomId = new javax.swing.JTextField();
        btnAddRoom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformation = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Room");
        setMinimumSize(new java.awt.Dimension(500, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jLabel1.setText("Add Room");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 370, 40);

        jLabel3.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Room ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 140, 22);

        jLabel4.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 280, 140, 22);

        jLabel5.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Information");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 150, 140, 22);

        txtFee.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        getContentPane().add(txtFee);
        txtFee.setBounds(180, 120, 250, 28);

        txtRoomId.setEditable(false);
        txtRoomId.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        txtRoomId.setText("Will set by applicaton");
        getContentPane().add(txtRoomId);
        txtRoomId.setBounds(180, 90, 250, 28);

        btnAddRoom.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        btnAddRoom.setText("Add Room");
        btnAddRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddRoomMouseClicked(evt);
            }
        });
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddRoom);
        btnAddRoom.setBounds(180, 320, 140, 50);

        txtInformation.setColumns(20);
        txtInformation.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        txtInformation.setRows(5);
        jScrollPane1.setViewportView(txtInformation);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 150, 250, 116);

        jLabel6.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fee");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 120, 140, 22);

        txtGender.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        getContentPane().add(txtGender);
        txtGender.setBounds(180, 280, 250, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        // TODO add your handling code here:
        String fee = txtFee.getText();
        String information = txtInformation.getText();
        String gender = (String) txtGender.getSelectedItem();

//        System.out.println(gender);
//        System.out.println(information);
//        System.out.println(fee);

        if (!fee.equals("") && !gender.equals("")) {
            DbConnection dbinfo = new DbConnection();
            String dburl = dbinfo.dburl;
            String dbuser = dbinfo.dbuser;
            String dbuspass = dbinfo.dbuserpass;

            try ( Connection con = DriverManager.getConnection(dburl, dbuser, dbuspass)) {
                Statement stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO `rooms` (`gender`, `information`, `fee`, `isEmpty`) VALUES ('" + gender + "', '" + information + "', '" + fee + "', '0')");
                JOptionPane.showMessageDialog(null, "Room Added.", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void btnAddRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddRoomMouseClicked

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
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFee;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextArea txtInformation;
    private javax.swing.JTextField txtRoomId;
    // End of variables declaration//GEN-END:variables
}
