/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mariaforsberg
 */
public class AndraOmradesChef extends javax.swing.JFrame {
    
    private static InfDB idb;
    private ArrayList<String> kontorNamn;
    private ArrayList<String> agentID;
    private static String id;

    /**
     * Creates new form AndraKontorsChef
     */
    public AndraOmradesChef(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        txtChefNamn.setEditable(false);
        
            try{
                agentID = idb.fetchColumn("SELECT Agent_ID FROM Agent ORDER BY Agent_ID ASC");
                agentID.forEach(idNr -> {
                boxChef.addItem(idNr);
                                        });

                kontorNamn = idb.fetchColumn("SELECT Benamning FROM Omrade ORDER BY Benamning ASC");
                kontorNamn.forEach(kontor -> {
                boxValjOmrade.addItem(kontor);
                                        }); 
               }
                catch(InfException e){
                        JOptionPane.showMessageDialog(null, "Något gick fel");
                        System.out.println(e);
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

        boxValjOmrade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        boxChef = new javax.swing.JComboBox<>();
        txtChefNamn = new javax.swing.JTextField();
        lblMIB = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bakgrund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(boxValjOmrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Välj ett område");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 120, 20));

        boxChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxChefActionPerformed(evt);
            }
        });
        getContentPane().add(boxChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 190, -1));

        txtChefNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChefNamnActionPerformed(evt);
            }
        });
        getContentPane().add(txtChefNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 190, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Ändra chef för angivet område");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        godkännKnapp.setBackground(new java.awt.Color(0, 0, 0));
        godkännKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        godkännKnapp.setForeground(new java.awt.Color(102, 153, 255));
        godkännKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        godkännKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                godkännKnappMouseClicked(evt);
            }
        });
        godkännKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        godkännKnapp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("Godkänn");
        godkännKnapp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Välj chef");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 100, 20));

        bakgrund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(bakgrund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxChefActionPerformed
        try{
            String idNr = (String)boxChef.getSelectedItem();
            String hamtaNamn = "SELECT Namn FROM Agent WHERE Agent_ID=" + idNr;
            String namnFraga = idb.fetchSingle(hamtaNamn);
            txtChefNamn.setText(namnFraga);}
        
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println(e);
        }
    }//GEN-LAST:event_boxChefActionPerformed

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        new AdminHanteraAgent(idb, id).setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseClicked

    private void txtChefNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChefNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChefNamnActionPerformed

    private void godkännKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseClicked
        String id = (String)boxChef.getSelectedItem();
        String valtOmrade = (String)boxValjOmrade.getSelectedItem();
        
        try{
            String omradesID = "SELECT Omrades_ID FROM Omrade WHERE Benamning ='" + valtOmrade + "'";
            String hamtaOmradesID = idb.fetchSingle(omradesID);
  
            int svar = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill genomföra ändringarna?", "Obs!", JOptionPane.YES_NO_OPTION);
            
                if(svar == JOptionPane.YES_OPTION){
                    idb.update("UPDATE Omradeschef SET Agent_ID='" + id + "'WHERE Omrade=" + hamtaOmradesID + "");
                    JOptionPane.showMessageDialog(null, "Områdeschefen för " + valtOmrade + " har nu ändrats");
            }  
        }
            catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println(e);
        }
    }//GEN-LAST:event_godkännKnappMouseClicked

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
            java.util.logging.Logger.getLogger(AndraOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraOmradesChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraOmradesChef(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakgrund;
    private javax.swing.JComboBox<String> boxChef;
    private javax.swing.JComboBox<String> boxValjOmrade;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JTextField txtChefNamn;
    // End of variables declaration//GEN-END:variables
}
