/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jui
 */
public class DealloteRoom extends javax.swing.JFrame {

    public String roomNo[] = new String[500];
    public String roomGen[] = new String[500];
    public String roomPrice[] = new String[500];
    public String currentGuest[] = new String[500];
    public String userId[] = new String[500];
    public String userName[] = new String[500];
    public String userGender[] = new String[500];

    /**
     * Creates new form DealloteRoom
     */
    public DealloteRoom() {
        initComponents();
        DbConnection dbinfo = new DbConnection();
        String dburl = dbinfo.dburl;
        String dbuser = dbinfo.dbuser;
        String dbuspass = dbinfo.dbuserpass;
        try ( Connection con = DriverManager.getConnection(dburl, dbuser, dbuspass)) {
            //here bauet_guestroom is database name, root is username and password
            //System.out.println("Database connected successfuly.");
            Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT `id`, `gender`, `fee`, `current_guest` FROM `rooms` WHERE `isEmpty`=1");
            int i = 0;
            while (rs1.next()) {

                //System.out.println("#"+rs1.getString(1)+"-for "+rs1.getString(2)+"-"+rs1.getString(3)+"/=");
                comboRoomId.addItem("#" + rs1.getString(1) + "-for " + rs1.getString(2) + "-" + rs1.getString(3) + "/=");
//                lblRoomInfo.setText("#"+rs1.getString(1)+"-for "+rs1.getString(2)+"-"+rs1.getString(3)+"/=");
                roomNo[i] = rs1.getString(1);
                roomGen[i] = rs1.getString(2);
                roomPrice[i] = rs1.getString(3);
                currentGuest[i] = rs1.getString(4);
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(DealloteRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboRoomId = new javax.swing.JComboBox<>();
        btnDeallocate = new javax.swing.JButton();
        lblCurrentGuest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deallocate Room");
        setMinimumSize(new java.awt.Dimension(570, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jLabel1.setText("Deallocate Room");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 530, 40);

        jLabel2.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Room");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 80, 22);

        jLabel3.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Guest");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 150, 80, 22);

        comboRoomId.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        comboRoomId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoomIdActionPerformed(evt);
            }
        });
        getContentPane().add(comboRoomId);
        comboRoomId.setBounds(160, 100, 320, 28);

        btnDeallocate.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        btnDeallocate.setText("Deallocate");
        btnDeallocate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeallocateMouseClicked(evt);
            }
        });
        btnDeallocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeallocateActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeallocate);
        btnDeallocate.setBounds(220, 190, 140, 40);

        lblCurrentGuest.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        lblCurrentGuest.setText("Current Guest");
        getContentPane().add(lblCurrentGuest);
        lblCurrentGuest.setBounds(160, 140, 320, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeallocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeallocateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeallocateActionPerformed

    private void comboRoomIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoomIdActionPerformed
        // TODO add your handling code here:
        int index = comboRoomId.getSelectedIndex();
        DbConnection dbinfo = new DbConnection();
        String dburl = dbinfo.dburl;
        String dbuser = dbinfo.dbuser;
        String dbuspass = dbinfo.dbuserpass;
        try ( Connection con = DriverManager.getConnection(dburl, dbuser, dbuspass)) {
            //here bauet_guestroom is database name, root is username and password
            //System.out.println("Database connected successfuly.");
            Statement stmt = con.createStatement();
            ResultSet rs1 = stmt.executeQuery("SELECT `name` FROM `users` WHERE `id`='" + currentGuest[index] + "'");

            while (rs1.next()) {
                lblCurrentGuest.setText("#" + currentGuest[index] + " - " + rs1.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DealloteRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboRoomIdActionPerformed

    private void btnDeallocateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeallocateMouseClicked
        int index = comboRoomId.getSelectedIndex();
        DbConnection dbinfo = new DbConnection();
        String dburl = dbinfo.dburl;
        String dbuser = dbinfo.dbuser;
        String dbuspass = dbinfo.dbuserpass;
        try ( Connection con = DriverManager.getConnection(dburl, dbuser, dbuspass)) {
            //here bauet_guestroom is database name, root is username and password
            //System.out.println("Database connected successfuly.");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE `rooms` SET `isEmpty` = '0', `current_guest` = 'N/A' WHERE `rooms`.`id` = "+roomNo[index]);
            stmt.executeUpdate("UPDATE `users` SET `isAlloted` = '0' WHERE `users`.`id` = "+currentGuest[index]);
            JOptionPane.showMessageDialog(null, "Room deallocated successfully.", "Success!!", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(DealloteRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeallocateMouseClicked

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
            java.util.logging.Logger.getLogger(DealloteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealloteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealloteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealloteRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DealloteRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeallocate;
    private javax.swing.JComboBox<String> comboRoomId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCurrentGuest;
    // End of variables declaration//GEN-END:variables
}
