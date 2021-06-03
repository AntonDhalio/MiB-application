/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anton
 */
public class KvitteraUtrustning extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    /**
     * Creates new form KvitteraUtrustning
     */
    public KvitteraUtrustning(InfDB idb, String id) {
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

        utrustningButtonGroup = new javax.swing.ButtonGroup();
        utrustningsNamnBox = new javax.swing.JTextField();
        utrustningIDBox = new javax.swing.JComboBox<>();
        lblMIB = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lamnaTillbakaCheckBox = new javax.swing.JCheckBox();
        utkvitteraCheckBox = new javax.swing.JCheckBox();
        godkännKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(utrustningsNamnBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 160, -1));

        utrustningIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utrustningIDBoxActionPerformed(evt);
            }
        });
        getContentPane().add(utrustningIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 160, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Utkvittera eller lämna tillbaka utrustning");
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

        lamnaTillbakaCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        lamnaTillbakaCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        lamnaTillbakaCheckBox.setText("Lämna tillbaka");
        lamnaTillbakaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamnaTillbakaCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(lamnaTillbakaCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        utkvitteraCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        utkvitteraCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        utkvitteraCheckBox.setText("Utkvittera");
        utkvitteraCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utkvitteraCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(utkvitteraCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("Godkänn");
        godkännKnapp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Utrustningsnamn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 110, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Utrustnings-ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 110, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased
        LocalDate dagensDatum = LocalDate.now();
        String datum = dagensDatum.toString();
        String UID = utrustningIDBox.getSelectedItem().toString();
        if(utkvitteraCheckBox.isSelected()){
            try {
                idb.insert("INSERT INTO innehar_utrustning VALUES(" + id + ", " + UID + ", '" + datum + "')");
                JOptionPane.showMessageDialog(null, "Utrustningen utkvitterades");
            } 
            catch (InfException ex) {
                System.out.println("Något gick fel med databasen");
            }
        }
        else if(lamnaTillbakaCheckBox.isSelected()){
            try {
                idb.delete("DELETE FROM innehar_utrustning WHERE Utrustnings_ID=" + UID);
                JOptionPane.showMessageDialog(null, "Utrustningen är nu tillbaka i lagret");
            } 
            catch (InfException ex) {
                System.out.println("Något gick fel med databasen");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Vänligen välj en funktion för att fortsätta");
        }
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        try {
            String arAdmin = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + id);

            if(arAdmin.equals("N")){
                new HanteraUtrustningAgent(idb, id).setVisible(true);               
                dispose();
            }
            else if(arAdmin.equals("J")){
                new AdminUtrustningHantera(idb, id).setVisible(true);
                dispose();
            }
        }
        catch (InfException ex) {
            System.out.println("Något gick fel");
        }
    }//GEN-LAST:event_goBackMouseReleased

    private void utrustningIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utrustningIDBoxActionPerformed
        utrustningsNamnBox.removeAll();        
        if(utrustningIDBox.getItemCount() > 0){
        String valtID = utrustningIDBox.getSelectedItem().toString();
        try{
            
            String utrNamn = idb.fetchSingle("SELECT Benamning FROM utrustning WHERE Utrustnings_ID=" + valtID);
            utrustningsNamnBox.setText(utrNamn);
            
        }    
        catch(InfException e){
            System.out.println("Något gick fel med databasen");
        } 
        }
    }//GEN-LAST:event_utrustningIDBoxActionPerformed

    private void utkvitteraCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utkvitteraCheckBoxActionPerformed
        if(utkvitteraCheckBox.isSelected()){
            lamnaTillbakaCheckBox.setEnabled(false);                        
            try{                
                ArrayList<String> utkvitteradUtrustning = idb.fetchColumn("SELECT Utrustnings_ID FROM innehar_utrustning");
                ArrayList<String> allUtrustning = idb.fetchColumn("SELECT Utrustnings_ID FROM utrustning");
                for(String UID : allUtrustning){
                    utrustningIDBox.addItem(UID);
                }
                for(String dettaID : utkvitteradUtrustning){
                    utrustningIDBox.removeItem(dettaID);
                }
            }       
            catch(InfException e){
                System.out.println("Något gick fel med databasen");
            }
        }
        else{
            lamnaTillbakaCheckBox.setEnabled(true);
            utrustningIDBox.removeAllItems();
            utrustningsNamnBox.setText("");
        }
    }//GEN-LAST:event_utkvitteraCheckBoxActionPerformed

    private void lamnaTillbakaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamnaTillbakaCheckBoxActionPerformed
        if(lamnaTillbakaCheckBox.isSelected()){
            utkvitteraCheckBox.setEnabled(false);
            try{
                ArrayList<String> utkvitteradUtrustning = idb.fetchColumn("SELECT Utrustnings_ID FROM innehar_utrustning");
                for(String dettaID : utkvitteradUtrustning){
                    utrustningIDBox.addItem(dettaID);
                }
            }       
            catch(InfException e){
                System.out.println("Något gick fel med databasen");
            }
        }
        else{
            utkvitteraCheckBox.setEnabled(true);
            utrustningIDBox.removeAllItems();
            utrustningsNamnBox.setText("");
        }     
    }//GEN-LAST:event_lamnaTillbakaCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JCheckBox lamnaTillbakaCheckBox;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JCheckBox utkvitteraCheckBox;
    private javax.swing.ButtonGroup utrustningButtonGroup;
    private javax.swing.JComboBox<String> utrustningIDBox;
    private javax.swing.JTextField utrustningsNamnBox;
    // End of variables declaration//GEN-END:variables
}