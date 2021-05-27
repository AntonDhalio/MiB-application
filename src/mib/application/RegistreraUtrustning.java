/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
/**
 *
 * @author anton
 */
public class RegistreraUtrustning extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private AgentMeny agentMeny;
    private AdminUtrustningHantera hanteraUtrustning;
    /**
     * Creates new form RegistreraUtrustning
     */
    public RegistreraUtrustning(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        utrustningDetalj.setVisible(false);
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
        utrustningNamn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelFranBox = new javax.swing.JLabel();
        utrustningDetalj = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        arKomm = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        arTeknik = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        arVapen = new javax.swing.JCheckBox();
        avbrytKnapp = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 34, -1, -1));
        getContentPane().add(utrustningNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 160, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Namnge den nya utrustningen");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 240, -1));

        labelFranBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelFranBox.setForeground(new java.awt.Color(102, 153, 255));
        getContentPane().add(labelFranBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 240, 20));
        getContentPane().add(utrustningDetalj, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 160, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        jPanel4.setForeground(new java.awt.Color(102, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arKomm.setBackground(new java.awt.Color(0, 0, 0));
        arKomm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        arKomm.setForeground(new java.awt.Color(102, 153, 255));
        arKomm.setText("Kommunikation");
        arKomm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arKommActionPerformed(evt);
            }
        });
        jPanel4.add(arKomm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 170, 40));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        jPanel3.setForeground(new java.awt.Color(102, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arTeknik.setBackground(new java.awt.Color(0, 0, 0));
        arTeknik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        arTeknik.setForeground(new java.awt.Color(102, 153, 255));
        arTeknik.setText("Teknik");
        arTeknik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arTeknikActionPerformed(evt);
            }
        });
        jPanel3.add(arTeknik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 100, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        jPanel1.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 100, 50));

        arVapen.setBackground(new java.awt.Color(0, 0, 0));
        arVapen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        arVapen.setForeground(new java.awt.Color(102, 153, 255));
        arVapen.setText("Vapen");
        arVapen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arVapenActionPerformed(evt);
            }
        });
        jPanel1.add(arVapen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 40));

        avbrytKnapp.setBackground(new java.awt.Color(0, 0, 0));
        avbrytKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        avbrytKnapp.setForeground(new java.awt.Color(102, 153, 255));
        avbrytKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        avbrytKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avbrytKnappMouseClicked(evt);
            }
        });
        avbrytKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cancel.png"))); // NOI18N
        avbrytKnapp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Avbryt");
        avbrytKnapp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        getContentPane().add(avbrytKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 110, 30));

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        godkännKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Godkänn");
        godkännKnapp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 110, 30));

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
        lblMIB.setText("Vilken utrustning vill du registrera");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void arVapenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arVapenActionPerformed
        if(arVapen.isSelected()){
            arTeknik.setEnabled(false);
            arKomm.setEnabled(false);
            utrustningDetalj.setVisible(true);
            labelFranBox.setText("Ange vapnets kaliber");
        }
        else{
            arTeknik.setEnabled(true);
            arKomm.setEnabled(true);
            utrustningDetalj.setVisible(false);
            labelFranBox.setText("");
        }
    }//GEN-LAST:event_arVapenActionPerformed

    private void arKommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arKommActionPerformed
        if(arKomm.isSelected()){
            arTeknik.setEnabled(false);
            arVapen.setEnabled(false);
            utrustningDetalj.setVisible(true);
            labelFranBox.setText("Ange överföringsteknik");
        }
        else{
            arTeknik.setEnabled(true);
            arVapen.setEnabled(true);
            utrustningDetalj.setVisible(false);
            labelFranBox.setText("");
        }
    }//GEN-LAST:event_arKommActionPerformed

    private void arTeknikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arTeknikActionPerformed
        if(arTeknik.isSelected()){
            arVapen.setEnabled(false);
            arKomm.setEnabled(false);
            utrustningDetalj.setVisible(true);
            labelFranBox.setText("Ange teknikens kraftkälla");
        }
        else{
            arVapen.setEnabled(true);
            arKomm.setEnabled(true);
            utrustningDetalj.setVisible(false);
            labelFranBox.setText("");
        }
    }//GEN-LAST:event_arTeknikActionPerformed

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        try {
            String arAdmin = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + id);

            if(arAdmin.equals("N")){
                agentMeny = new AgentMeny(idb, id);
                agentMeny.setVisible(true);
                dispose();
            }
            else if(arAdmin.equals("J")){
                new HuvudmenyAdmin(idb, id).setVisible(true);
                dispose();
            }
        }
        catch (InfException ex) {
            System.out.println("Något gick fel");
        }
    }//GEN-LAST:event_goBackMouseClicked

    private void godkännKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseClicked
        if(Validering.txtFieldBegransad20(utrustningNamn) && Validering.txtFieldHarVarde(utrustningDetalj)){
            try{                
                String nextUID = idb.getAutoIncrement("utrustning", "Utrustnings_ID");
                String namn = utrustningNamn.getText();
                String detaljer = utrustningDetalj.getText();                
        
                int reply = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill registrera denna utrustning?","Varning!",JOptionPane.YES_NO_OPTION);
            
                if(reply == JOptionPane.YES_OPTION){
                    
                if(arVapen.isSelected() && Validering.txtFieldBegransad10(utrustningDetalj)){
                    idb.insert("INSERT INTO vapen VALUES(" + nextUID + ",'" + detaljer + "')");
                }
                else if(arKomm.isSelected() && Validering.txtFieldBegransad20(utrustningDetalj)){
                    idb.insert("INSERT INTO kommunikation VALUES(" + nextUID + ",'" + detaljer + "')");
                }
                else if(arTeknik.isSelected() && Validering.txtFieldBegransad20(utrustningDetalj)){
                    idb.insert("INSERT INTO teknik VALUES(" + nextUID + ",'" + detaljer + "')");
                }
                idb.insert("INSERT INTO utrustning VALUES(" + nextUID + ",'" + namn + "')");
                JOptionPane.showMessageDialog(null, "Utrustningen har registrerats!");
            }
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        }
    }//GEN-LAST:event_godkännKnappMouseClicked

    private void avbrytKnappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avbrytKnappMouseClicked
        try {
            String arAdmin = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + id);
        
            if(arAdmin.equals("N")){
                agentMeny = new AgentMeny(idb, id);
                agentMeny.setVisible(true);
                dispose();
            }
            else if(arAdmin.equals("J")){
                hanteraUtrustning = new AdminUtrustningHantera(idb,id);
                hanteraUtrustning.setVisible(true);
                dispose();
            }
        } 
        catch (InfException ex) {
            System.out.println("Något gick fel");
        }
    }//GEN-LAST:event_avbrytKnappMouseClicked

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
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraUtrustning(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox arKomm;
    private javax.swing.JCheckBox arTeknik;
    private javax.swing.JCheckBox arVapen;
    private javax.swing.JPanel avbrytKnapp;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelFranBox;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JTextField utrustningDetalj;
    private javax.swing.JTextField utrustningNamn;
    // End of variables declaration//GEN-END:variables
}
