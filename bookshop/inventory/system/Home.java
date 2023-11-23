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
            btnManageCategory.setVisible(false);
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
        btnViewBillPlaceOrder = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnChangeSecurityQuestion = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNewBooks = new javax.swing.JButton();
        btnViewEditDeleteBooks = new javax.swing.JButton();
        btnVerifyUser = new javax.swing.JButton();
        btnManageCategory = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(970, 620));
        setSize(new java.awt.Dimension(970, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(255, 255, 204));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 122, 35));

        btnViewBillPlaceOrder.setBackground(new java.awt.Color(255, 255, 204));
        btnViewBillPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewBillPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/overview.png"))); // NOI18N
        btnViewBillPlaceOrder.setText("View Bill and Place order Details");
        btnViewBillPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBillPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 35));

        btnPlaceOrder.setBackground(new java.awt.Color(255, 255, 204));
        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 35));

        btnChangePassword.setBackground(new java.awt.Color(255, 255, 204));
        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password.png"))); // NOI18N
        btnChangePassword.setText("Change Paaswrd");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 250, 35));

        btnChangeSecurityQuestion.setBackground(new java.awt.Color(255, 255, 204));
        btnChangeSecurityQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangeSecurityQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/questionmark.png"))); // NOI18N
        btnChangeSecurityQuestion.setText("Change Security Question");
        btnChangeSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSecurityQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSecurityQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 253, 35));

        btnExit.setBackground(new java.awt.Color(255, 255, 204));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit to app.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 99, 35));

        btnNewBooks.setBackground(new java.awt.Color(255, 255, 204));
        btnNewBooks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        btnNewBooks.setText("New Books");
        btnNewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 143, 30));

        btnViewEditDeleteBooks.setBackground(new java.awt.Color(255, 255, 204));
        btnViewEditDeleteBooks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnViewEditDeleteBooks.setText("View ,Edit & Delete Books");
        btnViewEditDeleteBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteBooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, 30));

        btnVerifyUser.setBackground(new java.awt.Color(255, 255, 204));
        btnVerifyUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verified.png"))); // NOI18N
        btnVerifyUser.setText("View Users");
        btnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 30));

        btnManageCategory.setBackground(new java.awt.Color(255, 255, 204));
        btnManageCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        btnManageCategory.setText("Manage Category");
        btnManageCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 240, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Book Shop Inventory System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setText("*Only For Admin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 600, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 600));

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

    private void btnViewBillPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillPlaceOrderActionPerformed
        // TODO add your handling code here:
         new ViewBillsOrderPlacedDetails().setVisible(true);
    }//GEN-LAST:event_btnViewBillPlaceOrderActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //passing email so identify who created bill
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    // change Password button
    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnChangeSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSecurityQuestionActionPerformed
        // TODO add your handling code here:
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSecurityQuestionActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close Application  ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBooksActionPerformed
        // TODO add your handling code here:
        new AddNewBook().setVisible(true);
    }//GEN-LAST:event_btnNewBooksActionPerformed

    private void btnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUserActionPerformed
        // TODO add your handling code here:
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUserActionPerformed

    private void btnViewEditDeleteBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteBooksActionPerformed
        // TODO add your handling code here:
        new ViewEditDeleteBook().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteBooksActionPerformed

    private void btnManageCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnManageCategoryActionPerformed

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
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangeSecurityQuestion;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageCategory;
    private javax.swing.JButton btnNewBooks;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVerifyUser;
    private javax.swing.JButton btnViewBillPlaceOrder;
    private javax.swing.JButton btnViewEditDeleteBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
