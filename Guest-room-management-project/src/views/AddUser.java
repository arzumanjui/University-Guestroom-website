/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jui
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProInfo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New User");
        setMinimumSize(new java.awt.Dimension(500, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Fira Sans", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        jLabel1.setText("Add Guest");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 440, 40);

        jLabel2.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Gender");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 260, 160, 30);

        jLabel3.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 110, 160, 22);

        jLabel4.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Phone No.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 160, 22);

        jLabel5.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 170, 160, 22);

        jLabel6.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Address");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 200, 160, 22);

        txtProInfo.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        getContentPane().add(txtProInfo);
        txtProInfo.setBounds(210, 230, 210, 28);

        txtName.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        getContentPane().add(txtName);
        txtName.setBounds(210, 110, 210, 28);

        txtPhoneNo.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        getContentPane().add(txtPhoneNo);
        txtPhoneNo.setBounds(210, 140, 210, 28);

        txtEmail.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        getContentPane().add(txtEmail);
        txtEmail.setBounds(210, 170, 210, 28);

        txtAddress.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        getContentPane().add(txtAddress);
        txtAddress.setBounds(210, 200, 210, 28);

        btnAddUser.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        btnAddUser.setText("Add");
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
        });
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddUser);
        btnAddUser.setBounds(210, 300, 140, 50);

        jLabel7.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Professional Info.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 230, 160, 30);

        txtGender.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(txtGender);
        txtGender.setBounds(210, 260, 210, 28);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
        String name = txtName.getText();
        String phone = txtPhoneNo.getText();
        String email = txtEmail.getText();
        String profeInfo = txtProInfo.getText();
        String address = txtAddress.getText();
        String gender = (String) txtGender.getSelectedItem();

//        System.out.println(gender);
//        System.out.println(information);
//        System.out.println(fee);
        if (!name.equals("") && !phone.equals("") && !profeInfo.equals("") && !gender.equals("")) {
            DbConnection dbinfo = new DbConnection();
            String dburl = dbinfo.dburl;
            String dbuser = dbinfo.dbuser;
            String dbuspass = dbinfo.dbuserpass;

            try ( Connection con = DriverManager.getConnection(dburl, dbuser, dbuspass)) {
                Statement stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO `users` (`name`, `phone_no`, `email`, `address`, `professional`, `gender`) VALUES ('"+name+"', '"+phone+"', '"+email+"', '"+address+"', '"+profeInfo+"', '"+gender+"');");
                JOptionPane.showMessageDialog(null, "User Added.", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error!!", "Please provide all information.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAddUserMouseClicked

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtProInfo;
    // End of variables declaration//GEN-END:variables
}
