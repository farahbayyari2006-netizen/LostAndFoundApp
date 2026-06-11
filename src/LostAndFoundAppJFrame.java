
public class LostAndFoundAppJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LostAndFoundAppJFrame
     */
    public LostAndFoundAppJFrame() {
        initComponents();
        
    this.setSize(410, 700);
    this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLostAndFound = new javax.swing.JLabel();
        lblWel = new javax.swing.JLabel();
        lblLostOrFound = new javax.swing.JLabel();
        butSignin = new javax.swing.JButton();
        lblReg = new javax.swing.JLabel();
        lblacc = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lost & Found App");
        setPreferredSize(new java.awt.Dimension(100, 101));
        setResizable(false);

        lblLostAndFound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/تصميم بدون عنوان (2).png"))); // NOI18N

        lblWel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblWel.setForeground(new java.awt.Color(0, 0, 102));
        lblWel.setText("Welcome");

        lblLostOrFound.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblLostOrFound.setForeground(new java.awt.Color(0, 0, 153));
        lblLostOrFound.setText("Find what you lost, or help others find theirs");

        butSignin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        butSignin.setForeground(new java.awt.Color(0, 0, 102));
        butSignin.setText("Sign in");
        butSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSigninActionPerformed(evt);
            }
        });

        lblReg.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblReg.setForeground(new java.awt.Color(0, 0, 102));
        lblReg.setText("Register");
        lblReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegMouseClicked(evt);
            }
        });

        lblacc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblacc.setForeground(new java.awt.Color(0, 0, 153));
        lblacc.setText("Don't have an account? ");

        lblLanguage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLanguage.setForeground(new java.awt.Color(0, 0, 102));
        lblLanguage.setText("English");
        lblLanguage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLanguageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLanguage)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLostAndFound)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblLostOrFound))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblacc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReg)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(lblLanguage)
                .addGap(17, 17, 17)
                .addComponent(lblLostAndFound)
                .addGap(18, 18, 18)
                .addComponent(lblWel)
                .addGap(26, 26, 26)
                .addComponent(lblLostOrFound)
                .addGap(75, 75, 75)
                .addComponent(butSignin)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblacc)
                    .addComponent(lblReg))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSigninActionPerformed
       this.dispose();
      new SignInFrame().setVisible(true);
        


    }//GEN-LAST:event_butSigninActionPerformed

    private void lblRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegMouseClicked
       this.dispose();
       new RegisterFrame().setVisible(true); 


    }//GEN-LAST:event_lblRegMouseClicked

    private void lblLanguageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLanguageMouseClicked
     if (lblLanguage.getText().equals("English")) {
    lblLanguage.setText("العربية");
} else {
    lblLanguage.setText("English");
}   

    }//GEN-LAST:event_lblLanguageMouseClicked

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
            java.util.logging.Logger.getLogger(LostAndFoundAppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LostAndFoundAppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LostAndFoundAppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LostAndFoundAppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LostAndFoundAppJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butSignin;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblLostAndFound;
    private javax.swing.JLabel lblLostOrFound;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblWel;
    private javax.swing.JLabel lblacc;
    // End of variables declaration//GEN-END:variables
}
