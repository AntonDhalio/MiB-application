/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mathildabernebyhaeffner
 */
public class AlienBytLosen extends javax.swing.JFrame {
    private static InfDB idb;
    private static String id;
    private AlienStartsida startSida;

    /**
     * Creates new form AlienBytLosen
     */
    public AlienBytLosen(InfDB idb, String id) {
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
        jLabel3 = new javax.swing.JLabel();
        txtNuvarandeLosen = new javax.swing.JTextField();
        txtNyttLosen = new javax.swing.JTextField();
        txtBekraftaLosen = new javax.swing.JTextField();
        tomFaltKnapp = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuvarande Lösenord:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nytt Lösenord:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        txtNuvarandeLosen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNuvarandeLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, 30));

        txtNyttLosen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNyttLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 270, 30));

        txtBekraftaLosen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtBekraftaLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 270, 30));

        tomFaltKnapp.setBackground(new java.awt.Color(0, 0, 0));
        tomFaltKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        tomFaltKnapp.setForeground(new java.awt.Color(102, 153, 255));
        tomFaltKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tomFaltKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tomFaltKnappMouseReleased(evt);
            }
        });
        tomFaltKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cancel.png"))); // NOI18N
        tomFaltKnapp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Töm fält");
        tomFaltKnapp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        getContentPane().add(tomFaltKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 110, 30));

        godkännKnapp.setBackground(new java.awt.Color(0, 0, 0));
        godkännKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        godkännKnapp.setForeground(new java.awt.Color(102, 153, 255));
        godkännKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        godkännKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                godkännKnappMouseReleased(evt);
            }
        });
        godkännKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        godkännKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Godkänn");
        godkännKnapp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bekräfta lösenord");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
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
        lblMIB.setText("Byt lösenord");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tomFaltKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tomFaltKnappMouseReleased
        txtBekraftaLosen.setText("");
        txtNuvarandeLosen.setText("");
        txtNyttLosen.setText("");
    }//GEN-LAST:event_tomFaltKnappMouseReleased

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased
        if(Validering.txtFieldBegransad6(txtNyttLosen) || Validering.txtFieldBegransad6(txtBekraftaLosen)){
        try {
            String nyttLosen = txtNyttLosen.getText();
            String nuvarandeLosen = idb.fetchSingle("SELECT Losenord FROM Alien WHERE Alien_ID=" + id);
            String nuvarandeInmatning = txtNuvarandeLosen.getText();
            String bekrafta = txtBekraftaLosen.getText();
            if (nuvarandeInmatning.equals(nuvarandeLosen) && nyttLosen.equals(bekrafta)) {
               idb.update("UPDATE Alien SET Losenord ='" + nyttLosen + "' WHERE Alien_ID=" + id);
               JOptionPane.showMessageDialog(null, "Lösenordet har ändrats!");
               startSida = new AlienStartsida(idb, id);
               startSida.setVisible(true);
               dispose();
            }
               else if (!nuvarandeInmatning.equals(nuvarandeLosen)) {
                    JOptionPane.showMessageDialog(null, "Fel lösenord! Försök igen!");
               }
               else if(!nyttLosen.equals(bekrafta)){
                    JOptionPane.showMessageDialog(null, "Nytt lösenord och bekräftelse matchar inte");
               }            
               else if (nyttLosen.equals("") || bekrafta.equals("")) {
                    JOptionPane.showMessageDialog(null, "Lösenordet får inte vara tomt!");
               }
            
        } catch (InfException e) {
          JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        AlienStartsida as = new AlienStartsida(idb, id);
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goBackMouseReleased

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
            java.util.logging.Logger.getLogger(AlienBytLosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienBytLosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienBytLosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienBytLosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel tomFaltKnapp;
    private javax.swing.JTextField txtBekraftaLosen;
    private javax.swing.JTextField txtNuvarandeLosen;
    private javax.swing.JTextField txtNyttLosen;
    // End of variables declaration//GEN-END:variables
}
