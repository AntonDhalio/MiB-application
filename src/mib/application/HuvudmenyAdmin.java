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
 * @author mariaforsberg
 */
public class HuvudmenyAdmin extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private SystemInfo sysInfo;
    private AndraLosenord andraLosenord;
    private AdminUtrustningHantera hanteraUtrustning;
    private HanteraUtomjordingAdmin hanteraAlienAdmin;
    private InfoPortal infoPortal;
    private AdminHanteraAgent hanteraAgent;


    /**
     * Creates new form HuvudmenyAdmin
     */

    public HuvudmenyAdmin(InfDB idb, String id) {

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

        jLabel1 = new javax.swing.JLabel();
        hanteraAgentKnapp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hanteraAlienKnapp1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        infoPortalKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hanteraUtrustningKnapp = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        statistikKnapp = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bytLosenKnapp = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Admin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        hanteraAgentKnapp.setBackground(new java.awt.Color(0, 0, 0));
        hanteraAgentKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        hanteraAgentKnapp.setForeground(new java.awt.Color(102, 153, 255));
        hanteraAgentKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hanteraAgentKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hanteraAgentKnappMouseReleased(evt);
            }
        });
        hanteraAgentKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/MiB Man.png"))); // NOI18N
        hanteraAgentKnapp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Hantera agenter");
        hanteraAgentKnapp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 150, 80));

        getContentPane().add(hanteraAgentKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 260, 80));

        hanteraAlienKnapp1.setBackground(new java.awt.Color(0, 0, 0));
        hanteraAlienKnapp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        hanteraAlienKnapp1.setForeground(new java.awt.Color(102, 153, 255));
        hanteraAlienKnapp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hanteraAlienKnapp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hanteraAlienKnapp1MouseReleased(evt);
            }
        });
        hanteraAlienKnapp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/alien-logo2.png"))); // NOI18N
        hanteraAlienKnapp1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Hantera utomjordingar");
        hanteraAlienKnapp1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(hanteraAlienKnapp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 260, 80));

        infoPortalKnapp.setBackground(new java.awt.Color(0, 0, 0));
        infoPortalKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        infoPortalKnapp.setForeground(new java.awt.Color(102, 153, 255));
        infoPortalKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoPortalKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                infoPortalKnappMouseReleased(evt);
            }
        });
        infoPortalKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/info.png"))); // NOI18N
        infoPortalKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setText("Informationsportalen");
        infoPortalKnapp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(infoPortalKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 260, 80));

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Backpack.png"))); // NOI18N
        hanteraUtrustningKnapp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setText("Hantera utrustning");
        hanteraUtrustningKnapp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(hanteraUtrustningKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 260, 80));

        statistikKnapp.setBackground(new java.awt.Color(0, 0, 0));
        statistikKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        statistikKnapp.setForeground(new java.awt.Color(102, 153, 255));
        statistikKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        statistikKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                statistikKnappMouseReleased(evt);
            }
        });
        statistikKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Print.png"))); // NOI18N
        statistikKnapp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 153, 255));
        jLabel14.setText("Statistik");
        statistikKnapp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(statistikKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 260, 80));

        bytLosenKnapp.setBackground(new java.awt.Color(0, 0, 0));
        bytLosenKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        bytLosenKnapp.setForeground(new java.awt.Color(102, 153, 255));
        bytLosenKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bytLosenKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bytLosenKnappMouseReleased(evt);
            }
        });
        bytLosenKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lock.png"))); // NOI18N
        bytLosenKnapp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("Byt lösenord");
        bytLosenKnapp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 80));

        getContentPane().add(bytLosenKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 260, 80));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/exit.png"))); // NOI18N
        goBack.setToolTipText("");
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackMouseReleased(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Välkommen Agent");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hanteraAgentKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hanteraAgentKnappMouseReleased
        hanteraAgent = new AdminHanteraAgent(idb,id);
        hanteraAgent.setVisible(true);
        dispose();
    }//GEN-LAST:event_hanteraAgentKnappMouseReleased

    private void hanteraAlienKnapp1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hanteraAlienKnapp1MouseReleased
        hanteraAlienAdmin = new HanteraUtomjordingAdmin(idb,id);
        hanteraAlienAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_hanteraAlienKnapp1MouseReleased

    private void infoPortalKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoPortalKnappMouseReleased
        infoPortal = new InfoPortal(idb, id);
        infoPortal.setVisible(true);
        dispose();
    }//GEN-LAST:event_infoPortalKnappMouseReleased

    private void hanteraUtrustningKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hanteraUtrustningKnappMouseReleased
        hanteraUtrustning = new AdminUtrustningHantera(idb, id);
        hanteraUtrustning.setVisible(true);
        dispose();
    }//GEN-LAST:event_hanteraUtrustningKnappMouseReleased

    private void statistikKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statistikKnappMouseReleased
        sysInfo = new SystemInfo(idb, id);
        sysInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_statistikKnappMouseReleased

    private void bytLosenKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bytLosenKnappMouseReleased
        andraLosenord = new AndraLosenord(idb, id);
        andraLosenord.setVisible(true);
        dispose();
    }//GEN-LAST:event_bytLosenKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        //Metod för att logga ut från systemet. Koden ser till att användaren måste bekräfta innan utloggning sker
        int reply = JOptionPane.showConfirmDialog(null, "Du håller på att logga ut.\nÄr du säker på att du vill fortsätta?", "Logga ut?", JOptionPane.YES_NO_OPTION);
        
        //Vid tryck på "yes"-knappen, loggas användaren ut
        if(reply == JOptionPane.YES_OPTION){
            new ValjInloggning(idb).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_goBackMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bytLosenKnapp;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel hanteraAgentKnapp;
    private javax.swing.JPanel hanteraAlienKnapp1;
    private javax.swing.JPanel hanteraUtrustningKnapp;
    private javax.swing.JPanel infoPortalKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel statistikKnapp;
    // End of variables declaration//GEN-END:variables
}
