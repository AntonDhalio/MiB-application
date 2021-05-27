/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author anton
 */
public class AgentMeny extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private AndraLosenord andraLosenord;
    private RegistreraUtrustning regUtrustning;
    private HanteraUtomjording hanteraUtomJ;
    private InfoPortal infoPortal;
    /**
     * Creates new form AgentMeny
     */
    public AgentMeny(InfDB idb, String idNummer) {
        initComponents();
        this.idb = idb;
        id = idNummer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bytLosenKnapp = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        infoPortalKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hanteraUtrustningKnapp = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hanteraAlienKnapp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        bakgrund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bytLosenKnapp.setBackground(new java.awt.Color(0, 0, 0));
        bytLosenKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        bytLosenKnapp.setForeground(new java.awt.Color(102, 153, 255));
        bytLosenKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bytLosenKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bytLosenKnappMouseClicked(evt);
            }
        });
        bytLosenKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lock.png"))); // NOI18N
        bytLosenKnapp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("Byt lösenord");
        bytLosenKnapp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(bytLosenKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 260, 80));

        infoPortalKnapp.setBackground(new java.awt.Color(0, 0, 0));
        infoPortalKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        infoPortalKnapp.setForeground(new java.awt.Color(102, 153, 255));
        infoPortalKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoPortalKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoPortalKnappMouseClicked(evt);
            }
        });
        infoPortalKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/info.png"))); // NOI18N
        infoPortalKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Informationsportalen");
        infoPortalKnapp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(infoPortalKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, 80));

        hanteraUtrustningKnapp.setBackground(new java.awt.Color(0, 0, 0));
        hanteraUtrustningKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        hanteraUtrustningKnapp.setForeground(new java.awt.Color(102, 153, 255));
        hanteraUtrustningKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hanteraUtrustningKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hanteraUtrustningKnappMouseClicked(evt);
            }
        });
        hanteraUtrustningKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Backpack.png"))); // NOI18N
        hanteraUtrustningKnapp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Hantera utrustning");
        hanteraUtrustningKnapp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(hanteraUtrustningKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 260, 80));

        hanteraAlienKnapp.setBackground(new java.awt.Color(0, 0, 0));
        hanteraAlienKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        hanteraAlienKnapp.setForeground(new java.awt.Color(102, 153, 255));
        hanteraAlienKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hanteraAlienKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hanteraAlienKnappMouseClicked(evt);
            }
        });
        hanteraAlienKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/alien-logo2.png"))); // NOI18N
        hanteraAlienKnapp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Hantera utomjordingar");
        hanteraAlienKnapp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(hanteraAlienKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, 80));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/exit.png"))); // NOI18N
        goBack.setToolTipText("");
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Välkommen Agent");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        bakgrund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(bakgrund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hanteraAlienKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hanteraAlienKnappMouseClicked
        hanteraUtomJ = new HanteraUtomjording(idb,id);
        hanteraUtomJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_hanteraAlienKnappMouseClicked

    private void hanteraUtrustningKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hanteraUtrustningKnappMouseClicked
        regUtrustning = new RegistreraUtrustning(idb, id);
        regUtrustning.setVisible(true);
        dispose();
    }//GEN-LAST:event_hanteraUtrustningKnappMouseClicked

    private void infoPortalKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPortalKnappMouseClicked
        infoPortal = new InfoPortal(idb, id);
        infoPortal.setVisible(true);
        dispose();
    }//GEN-LAST:event_infoPortalKnappMouseClicked

    private void bytLosenKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bytLosenKnappMouseClicked
        andraLosenord = new AndraLosenord(idb, id);
        andraLosenord.setVisible(true);
        dispose();
    }//GEN-LAST:event_bytLosenKnappMouseClicked

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        int reply = JOptionPane.showConfirmDialog(null, "Du håller på att logga ut.\nÄr du säker på att du vill fortsätta?", "Logga ut?", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION){
            new ValjInloggning(idb).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_goBackMouseClicked

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
            java.util.logging.Logger.getLogger(AgentMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentMeny(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakgrund;
    private javax.swing.JPanel bytLosenKnapp;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel hanteraAlienKnapp;
    private javax.swing.JPanel hanteraUtrustningKnapp;
    private javax.swing.JPanel infoPortalKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblMIB;
    // End of variables declaration//GEN-END:variables
}
