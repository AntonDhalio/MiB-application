/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author mathildabernebyhaeffner
 */
public class AlienStartsida extends javax.swing.JFrame {
    private InfDB idb;
    private String id;
    private InloggningAlien inloggningAlien;

    /**
     * Creates new form AlienStartsida
     */
    public AlienStartsida(InfDB idb, String id) {
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

        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        infoRutaKnapp = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mailaOC1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        andraLosen1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
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
        lblMIB.setText("Välkommen");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, -1));

        infoRutaKnapp.setBackground(new java.awt.Color(0, 0, 0));
        infoRutaKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        infoRutaKnapp.setForeground(new java.awt.Color(102, 153, 255));
        infoRutaKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoRutaKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoRutaKnappMouseClicked(evt);
            }
        });
        infoRutaKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/info.png"))); // NOI18N
        infoRutaKnapp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Områdesinfo");
        infoRutaKnapp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 0, 140, 80));

        getContentPane().add(infoRutaKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, 80));

        mailaOC1.setBackground(new java.awt.Color(0, 0, 0));
        mailaOC1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        mailaOC1.setForeground(new java.awt.Color(102, 153, 255));
        mailaOC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mailaOC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailaOC1MouseClicked(evt);
            }
        });
        mailaOC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/mail.png"))); // NOI18N
        mailaOC1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("Maila Områdeschef");
        mailaOC1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 150, 80));

        getContentPane().add(mailaOC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, 80));

        andraLosen1.setBackground(new java.awt.Color(0, 0, 0));
        andraLosen1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        andraLosen1.setForeground(new java.awt.Color(102, 153, 255));
        andraLosen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        andraLosen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                andraLosen1MouseClicked(evt);
            }
        });
        andraLosen1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/lock.png"))); // NOI18N
        andraLosen1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 17, 50, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Ändra Lösenord");
        andraLosen1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 150, 80));

        getContentPane().add(andraLosen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 260, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void infoRutaKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoRutaKnappMouseClicked
        InfoRuta ir = new InfoRuta(idb, id);
        ir.setVisible(true);
        dispose();       
    }//GEN-LAST:event_infoRutaKnappMouseClicked

    private void mailaOC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailaOC1MouseClicked
        int bekrafta = JOptionPane.showConfirmDialog(null, "Detta kommer öppna ett annat program på din dator\när du säker på att du vill fortsätta?", "Varning", JOptionPane.YES_NO_OPTION);
        if(bekrafta == JOptionPane.YES_OPTION){
            MailaOC.mailProgram(idb, id);
        }
    }//GEN-LAST:event_mailaOC1MouseClicked

    private void andraLosen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_andraLosen1MouseClicked
        AlienBytLosen abl = new AlienBytLosen(idb, id);
        abl.setVisible(true);
        dispose();
    }//GEN-LAST:event_andraLosen1MouseClicked

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
            java.util.logging.Logger.getLogger(AlienStartsida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienStartsida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienStartsida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienStartsida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel andraLosen1;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel infoRutaKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel mailaOC1;
    // End of variables declaration//GEN-END:variables
}
