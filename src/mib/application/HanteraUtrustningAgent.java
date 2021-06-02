/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import oru.inf.InfDB;

/**
 *
 * @author anton
 */
public class HanteraUtrustningAgent extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    /**
     * Creates new form hanteraUtrustningAgent
     */
    public HanteraUtrustningAgent(InfDB idb, String id) {
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

        lblMIB = new javax.swing.JLabel();
        hanteraUtrustningKnapp = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        utkvitteraKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        bakgrund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Vad vill du göra med utrustningen?");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        hanteraUtrustningKnapp.setBackground(new java.awt.Color(0, 0, 0));
        hanteraUtrustningKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        hanteraUtrustningKnapp.setForeground(new java.awt.Color(102, 153, 255));
        hanteraUtrustningKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hanteraUtrustningKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hanteraUtrustningKnappMouseReleased(evt);
            }
        });
        hanteraUtrustningKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Backpack.png"))); // NOI18N
        hanteraUtrustningKnapp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Lägg till utrustning");
        hanteraUtrustningKnapp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(hanteraUtrustningKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 260, 80));

        utkvitteraKnapp.setBackground(new java.awt.Color(0, 0, 0));
        utkvitteraKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        utkvitteraKnapp.setForeground(new java.awt.Color(102, 153, 255));
        utkvitteraKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        utkvitteraKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                utkvitteraKnappMouseReleased(evt);
            }
        });
        utkvitteraKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/utkvittera.png"))); // NOI18N
        utkvitteraKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Utkvittera och återlämna");
        utkvitteraKnapp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 170, 80));

        getContentPane().add(utkvitteraKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 260, 80));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackMouseReleased(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        bakgrund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(bakgrund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hanteraUtrustningKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hanteraUtrustningKnappMouseReleased
        new RegistreraUtrustning(idb,id).setVisible(true);
        dispose();
    }//GEN-LAST:event_hanteraUtrustningKnappMouseReleased

    private void utkvitteraKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_utkvitteraKnappMouseReleased
        new KvitteraUtrustning(idb,id).setVisible(true);
        dispose();
    }//GEN-LAST:event_utkvitteraKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        new AgentMeny(idb,id).setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakgrund;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel hanteraUtrustningKnapp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel utkvitteraKnapp;
    // End of variables declaration//GEN-END:variables
}
