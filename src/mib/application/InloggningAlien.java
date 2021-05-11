/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import javax.swing.JOptionPane;
import mib.application.ValjInloggning;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mariaforsberg
 */
public class InloggningAlien extends javax.swing.JFrame {
    
    private ValjInloggning valjInloggning;
    private InfDB idb;

    /**
     * Creates new form InloggningAlien
     */
    public InloggningAlien() {
        initComponents();
        
        try {
        idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch(InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
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

        jProgressBar1 = new javax.swing.JProgressBar();
        lblLoggaInAlien = new javax.swing.JLabel();
        pswrdLosenord = new javax.swing.JPasswordField();
        lblLosenord = new javax.swing.JLabel();
        lblIDNummer = new javax.swing.JLabel();
        txtIDNummer = new javax.swing.JTextField();
        btnLoggaIn = new javax.swing.JButton();
        btbTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLoggaInAlien.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        lblLoggaInAlien.setText("LOGGA IN SOM ALIEN");

        pswrdLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N

        lblLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblLosenord.setText("Lösenord");

        lblIDNummer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblIDNummer.setText("ID-nummer");

        txtIDNummer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N

        btnLoggaIn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        btbTillbaka.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btbTillbaka.setText("< Tillbaka");
        btbTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoggaIn)
                            .addComponent(lblLoggaInAlien)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pswrdLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(txtIDNummer, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblIDNummer))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblLosenord))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btbTillbaka)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btbTillbaka)
                .addGap(27, 27, 27)
                .addComponent(lblLoggaInAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblIDNummer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswrdLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoggaIn)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btbTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbTillbakaActionPerformed
        valjInloggning = new ValjInloggning();
        valjInloggning.setVisible(true);
        dispose();
    }//GEN-LAST:event_btbTillbakaActionPerformed

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        try {
        String idNummer = txtIDNummer.getText();
        String hamtaLosenord = "SELECT Losenord FROM Alien where Alien_ID =" + idNummer;
        String losenordFraga = idb.fetchSingle(hamtaLosenord);
       
        String losenord=String.valueOf(pswrdLosenord.getPassword());
        
        
        if(losenord.equals(losenordFraga)) {
            System.out.println("Internt meddelande: Inloggningen lyckades!");
            
      
        } else {
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord eller ID-nummer. Vänligen försök igen");
            }
        } 
        
        catch(Exception e) {
        
        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

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
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InloggningAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InloggningAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbTillbaka;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblIDNummer;
    private javax.swing.JLabel lblLoggaInAlien;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JPasswordField pswrdLosenord;
    private javax.swing.JTextField txtIDNummer;
    // End of variables declaration//GEN-END:variables
}
