/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.awt.event.ItemListener;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mariaforsberg
 */
public class AdminHanteraAgent extends javax.swing.JFrame {
    
    private static InfDB idb;
    private static String id;

    /*
     * Creates new form AdminHanteraAgent
     */
    public AdminHanteraAgent(InfDB idb, String id) {
        this.idb = idb;
        this.id = id;
        initComponents();
        boxHanteraAgenter.addItem("Gör ett val...");
        boxHanteraAgenter.addItem("Registrera ny agent");
        boxHanteraAgenter.addItem("Tilldela administratörsstatus");
        boxHanteraAgenter.addItem("Ändra information om agent");
        boxHanteraAgenter.addItem("Ta bort agent ur systemet");
        boxHanteraAgenter.addItem("Ändra information om områdeschefer");
        boxHanteraAgenter.addItem("Ändra information om kontorschef");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        boxHanteraAgenter = new javax.swing.JComboBox<>();
        lblMIB = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Välj nedan vad du vill göra:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        boxHanteraAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxHanteraAgenterActionPerformed(evt);
            }
        });
        getContentPane().add(boxHanteraAgenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 293, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Hantera agenter");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
        goBack.setToolTipText("");
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackMouseReleased(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxHanteraAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxHanteraAgenterActionPerformed
        switch(boxHanteraAgenter.getSelectedIndex()) {
            case 0:
                break;
            case 1: 
                new RegistreraNyAgent(idb, id).setVisible(true);
                dispose();
                break;
            case 2: 
                new TilldelaAdminStatus(idb, id).setVisible(true);
                dispose();
                break;
            case 3:
                new AndraAgent(idb, id).setVisible(true);
                dispose();
                break;
            case 4: new TaBortAgent(idb, id).setVisible(true);
                    dispose();
                    break;
            case 5: new AndraOmradesChef(idb, id).setVisible(true);
                    dispose();
                    break;
            case 6: new AndraKontorsChef(idb, id).setVisible(true);
                    dispose();
                    break;   
        }
            
    }//GEN-LAST:event_boxHanteraAgenterActionPerformed

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        new HuvudmenyAdmin(idb, id).setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseReleased

    public void addItemListener(ItemListener a){}
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
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHanteraAgent(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxHanteraAgenter;
    private javax.swing.JLabel goBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblMIB;
    // End of variables declaration//GEN-END:variables
}
