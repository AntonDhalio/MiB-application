/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

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

        stat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        agentKnapp = new javax.swing.JButton();
        alienKnapp = new javax.swing.JButton();
        utrKnapp = new javax.swing.JButton();
        portalKnapp = new javax.swing.JButton();
        losenKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stat.setText("System statistik");
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Meny agent(admin)");

        agentKnapp.setText("Hantera agenter");
        agentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentKnappActionPerformed(evt);
            }
        });

        alienKnapp.setText("Hantera utomjordingar");
        alienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienKnappActionPerformed(evt);
            }
        });

        utrKnapp.setText("Hantera utrustning");
        utrKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrKnappActionPerformed(evt);
            }
        });

        portalKnapp.setText("Informationsportalen");
        portalKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portalKnappActionPerformed(evt);
            }
        });

        losenKnapp.setText("Ändra lösenord");
        losenKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losenKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alienKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(portalKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agentKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(utrKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(losenKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(utrKnapp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agentKnapp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienKnapp)
                    .addComponent(losenKnapp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stat)
                    .addComponent(portalKnapp))
                .addGap(75, 75, 75))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
        sysInfo = new SystemInfo(idb, id);
        sysInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_statActionPerformed

    private void agentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentKnappActionPerformed
        hanteraAgent = new AdminHanteraAgent(idb,id);
        hanteraAgent.setVisible(true);
        dispose();
    }//GEN-LAST:event_agentKnappActionPerformed

    private void utrKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrKnappActionPerformed
        hanteraUtrustning = new AdminUtrustningHantera(idb, id);
        hanteraUtrustning.setVisible(true);
        dispose();
    }//GEN-LAST:event_utrKnappActionPerformed

    private void alienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienKnappActionPerformed
        hanteraAlienAdmin = new HanteraUtomjordingAdmin(idb,id);
        hanteraAlienAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_alienKnappActionPerformed

    private void losenKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losenKnappActionPerformed
        andraLosenord = new AndraLosenord(idb, id);
        andraLosenord.setVisible(true);
        dispose();
    }//GEN-LAST:event_losenKnappActionPerformed

    private void portalKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portalKnappActionPerformed
        infoPortal = new InfoPortal(idb, id);
        infoPortal.setVisible(true);
        dispose();
    }//GEN-LAST:event_portalKnappActionPerformed

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
            java.util.logging.Logger.getLogger(HuvudmenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuvudmenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuvudmenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuvudmenyAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuvudmenyAdmin(idb,id).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agentKnapp;
    private javax.swing.JButton alienKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton losenKnapp;
    private javax.swing.JButton portalKnapp;
    private javax.swing.JButton stat;
    private javax.swing.JButton utrKnapp;
    // End of variables declaration//GEN-END:variables
}
