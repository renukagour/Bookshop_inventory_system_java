/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop.inventory.system;

import javax.swing.JOptionPane;

/**
 *
 * @author Renuka Gour
 */
public class Home extends javax.swing.JFrame {

    public String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("admin@gmail.com")) {
            btnCategory.setVisible(false);
            btnNewBooks.setVisible(false);
            btnViewEditDeleteBooks.setVisible(false);
            btnVerifyUser.setVisible(false);

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

        btnLogout = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewBooks = new javax.swing.JButton();
        btnViewEditDeleteBooks = new javax.swing.JButton();
        btnVerifyUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 24, 122, 35));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/overview.png"))); // NOI18N
        jButton2.setText("View Bill and Place order Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 24, -1, 35));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N
        jButton3.setText("Place Order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 24, 163, 35));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        jButton4.setText("Change Paaswrd");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 181, 35));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/questionmark.png"))); // NOI18N
        jButton5.setText("Change Security Question");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 253, 35));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit to app.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1223, 24, 99, 35));

        btnCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        btnCategory.setText("Manage Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 711, 200, -1));

        btnNewBooks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        btnNewBooks.setText("New Books");
        btnNewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 711, 143, -1));

        btnViewEditDeleteBooks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnViewEditDeleteBooks.setText("View ,Edit & Delete Books");
        getContentPane().add(btnViewEditDeleteBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 711, -1, -1));

        btnVerifyUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verified.png"))); // NOI18N
        btnVerifyUser.setText("Verify User");
        btnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 711, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // change Password button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close Application  ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
           System.exit(0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewBooksActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUserActionPerformed
        // TODO add your handling code here:
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUserActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewBooks;
    private javax.swing.JButton btnVerifyUser;
    private javax.swing.JButton btnViewEditDeleteBooks;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
