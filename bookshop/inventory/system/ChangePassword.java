/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop.inventory.system;

import dao.UserDao;

/**
 *
 * @author Renuka Gour
 */
public class ChangePassword extends javax.swing.JFrame {

    public String userEmail;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }

    public ChangePassword(String email) {
        initComponents();
        userEmail = email;
        btnUpdate.setEnabled(false);
    }

    //method for validation
    public void validateFIeld() {
        String OldPassword = txtOldPassword.getText();
        String NewPassword = txtNewPassword.getText();
        String ConfirmPassword = txtConfirmPassword.getText();
        if (!OldPassword.equals("") && !NewPassword.equals("") && !ConfirmPassword.equals("") && NewPassword.equals(ConfirmPassword)) {
            btnUpdate.setEnabled(true);
        } else {
            btnUpdate.setEnabled(false);
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
        jLabel4 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnClose1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 161, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 133, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cofirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        txtOldPassword.setBackground(new java.awt.Color(255, 255, 204));
        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 304, 36));

        txtNewPassword.setBackground(new java.awt.Color(255, 255, 204));
        txtNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPasswordActionPerformed(evt);
            }
        });
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 304, 35));

        txtConfirmPassword.setBackground(new java.awt.Color(255, 255, 204));
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 304, 34));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        btnClear.setBackground(new java.awt.Color(255, 255, 204));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Book Shop Inventory System");

        btnClose1.setBackground(new java.awt.Color(204, 204, 204));
        btnClose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310)
                .addComponent(btnClose1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClose1)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg1.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String OldPassword = txtOldPassword.getText();
        String NewPassword = txtNewPassword.getText();
        UserDao.changePassword(userEmail, OldPassword, NewPassword);
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    //released key for old password field
    private void txtOldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPasswordKeyReleased
        // TODO add your handling code here:
        validateFIeld();
    }//GEN-LAST:event_txtOldPasswordKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        validateFIeld();
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        // TODO add your handling code here:
        validateFIeld();
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnClose1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}
