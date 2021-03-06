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
public class AdminUtrustningHantera extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private TaBortUtrustning taBortUtrustning;
    private RegistreraUtrustning regUtrustning;
    private HuvudmenyAdmin menyAdmin;
    /**
     * Creates new form AdminUtrustningHantera
     */
    public AdminUtrustningHantera(InfDB idb, String id) {
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
        goBack = new javax.swing.JLabel();
        hanteraUtrustningKnapp1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        laggTillUtrustningKnapp = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        taBortUtrustningKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bakgrund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Vad vill du g??ra med utrustningen?");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackMouseReleased(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        hanteraUtrustningKnapp1.setBackground(new java.awt.Color(0, 0, 0));
        hanteraUtrustningKnapp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        hanteraUtrustningKnapp1.setForeground(new java.awt.Color(102, 153, 255));
        hanteraUtrustningKnapp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hanteraUtrustningKnapp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hanteraUtrustningKnapp1MouseReleased(evt);
            }
        });
        hanteraUtrustningKnapp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/utkvittera.png"))); // NOI18N
        hanteraUtrustningKnapp1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Utkvittera eller ??terl??mna");
        hanteraUtrustningKnapp1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 60));

        getContentPane().add(hanteraUtrustningKnapp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 160, 200, 140));

        laggTillUtrustningKnapp.setBackground(new java.awt.Color(0, 0, 0));
        laggTillUtrustningKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        laggTillUtrustningKnapp.setForeground(new java.awt.Color(102, 153, 255));
        laggTillUtrustningKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laggTillUtrustningKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                laggTillUtrustningKnappMouseReleased(evt);
            }
        });
        laggTillUtrustningKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Backpack.png"))); // NOI18N
        laggTillUtrustningKnapp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("L??gg utrustning");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        laggTillUtrustningKnapp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 60));

        getContentPane().add(laggTillUtrustningKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 140));

        taBortUtrustningKnapp.setBackground(new java.awt.Color(0, 0, 0));
        taBortUtrustningKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        taBortUtrustningKnapp.setForeground(new java.awt.Color(102, 153, 255));
        taBortUtrustningKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        taBortUtrustningKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                taBortUtrustningKnappMouseReleased(evt);
            }
        });
        taBortUtrustningKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/trash.png"))); // NOI18N
        taBortUtrustningKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ta bort utrustning");
        taBortUtrustningKnapp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 60));

        getContentPane().add(taBortUtrustningKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 160, 200, 140));

        bakgrund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(bakgrund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        menyAdmin = new HuvudmenyAdmin(idb,id);
        menyAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseReleased

    private void laggTillUtrustningKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laggTillUtrustningKnappMouseReleased
        regUtrustning = new RegistreraUtrustning(idb, id);
        regUtrustning.setVisible(true);
        dispose();
    }//GEN-LAST:event_laggTillUtrustningKnappMouseReleased

    private void taBortUtrustningKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taBortUtrustningKnappMouseReleased
        //Metod 
        taBortUtrustning = new TaBortUtrustning(idb, id);
        taBortUtrustning.setVisible(true);
        dispose();
    }//GEN-LAST:event_taBortUtrustningKnappMouseReleased


    private void hanteraUtrustningKnapp1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hanteraUtrustningKnapp1MouseReleased
        new KvitteraUtrustning(idb, id).setVisible(true);
        dispose();
    }//GEN-LAST:event_hanteraUtrustningKnapp1MouseReleased

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
            java.util.logging.Logger.getLogger(AdminUtrustningHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUtrustningHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUtrustningHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUtrustningHantera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUtrustningHantera(idb,id).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakgrund;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel hanteraUtrustningKnapp1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel laggTillUtrustningKnapp;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel taBortUtrustningKnapp;
    // End of variables declaration//GEN-END:variables
}
