/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mathildabernebyhaeffner
 */
public class TaBortUtrustning extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private AdminUtrustningHantera hanteraUtrustning;
    /**
     * Creates new form TaBortUtrustning
     */
    public TaBortUtrustning(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmbUtrustning = new javax.swing.JComboBox<>();
        goBack = new javax.swing.JLabel();
        TabortKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblBenamning = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 20, 20));
        getContentPane().add(cmbUtrustning, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 137, -1));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
        goBack.setToolTipText("");
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TabortKnapp.setBackground(new java.awt.Color(0, 0, 0));
        TabortKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        TabortKnapp.setForeground(new java.awt.Color(102, 153, 255));
        TabortKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TabortKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabortKnappMouseClicked(evt);
            }
        });
        TabortKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        TabortKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Ta bort");
        TabortKnapp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(TabortKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 110, 30));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Ta bort Utrustning");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        txtNamn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNamnKeyReleased(evt);
            }
        });
        getContentPane().add(txtNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, -1));

        lblBenamning.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBenamning.setForeground(new java.awt.Color(255, 255, 255));
        lblBenamning.setText("Benämning");
        getContentPane().add(lblBenamning, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 156, 70, 20));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        hanteraUtrustning = new AdminUtrustningHantera(idb,id);
        hanteraUtrustning.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseClicked

    private void TabortKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabortKnappMouseClicked
        String valdUtrustning = cmbUtrustning.getSelectedItem().toString();

        try {
            ArrayList<String> innehar_utrustning = idb.fetchColumn("SELECT Utrustnings_ID FROM Innehar_Utrustning");
            ArrayList<String> kommunikation = idb.fetchColumn("SELECT Utrustnings_ID FROM Kommunikation");
            ArrayList<String> teknik = idb.fetchColumn("SELECT Utrustnings_ID FROM Teknik");
            ArrayList<String> vapen = idb.fetchColumn("SELECT Utrustnings_ID FROM Vapen");

            

            String utrNamn = idb.fetchSingle("SELECT Benamning FROM Utrustning WHERE Utrustnings_ID=" + valdUtrustning);

            int reply = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort Utrustning vid namn '" + utrNamn + "'", "Varning!", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                idb.delete("DELETE FROM Utrustning WHERE Utrustnings_ID =" + valdUtrustning);
                
            for (String i : innehar_utrustning) {
                if (i.equals(valdUtrustning)) {
                    idb.delete("DELETE FROM Innehar_Utrustning WHERE Utrustnings_ID=" + valdUtrustning);
                }
            }
            for (String j : kommunikation) {
                if (j.equals(valdUtrustning)) {
                    idb.delete("DELETE FROM Kommunikation WHERE Utrustnings_ID=" + valdUtrustning);
                }
            }
            for (String k : teknik) {
                if (k.equals(valdUtrustning)) {
                    idb.delete("DELETE FROM Teknik WHERE Utrustnings_ID=" + valdUtrustning);
                }
            }
            for (String k : vapen) {
                if (k.equals(valdUtrustning)) {
                    idb.delete("DELETE FROM Vapen WHERE Utrustnings_ID=" + valdUtrustning);
                }
            }
                JOptionPane.showMessageDialog(null, "Utrustning '" + utrNamn + "' borttagen!");
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_TabortKnappMouseClicked

    private void txtNamnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamnKeyReleased
        String sokning = txtNamn.getText().toString();
        
        cmbUtrustning.removeAllItems();
        
        try {
            ArrayList<String> utrustning = idb.fetchColumn("SELECT Utrustnings_ID FROM Utrustning WHERE Benamning LIKE '" + sokning + "'");
            for (String nuvarandeUtrustning : utrustning) {
                System.out.println(nuvarandeUtrustning);
                cmbUtrustning.addItem(nuvarandeUtrustning);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_txtNamnKeyReleased

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
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortUtrustning(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TabortKnapp;
    private javax.swing.JComboBox<String> cmbUtrustning;
    private javax.swing.JLabel goBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblBenamning;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JTextField txtNamn;
    // End of variables declaration//GEN-END:variables
}
