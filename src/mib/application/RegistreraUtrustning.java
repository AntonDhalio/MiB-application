/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.time.LocalDate;
import java.util.ArrayList;
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
    private ArrayList<String> agentID;
    /**
     * Creates new form RegistreraUtrustning
     */
    public RegistreraUtrustning(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;

        agentBox.addItem("");
        
        try{
            agentID = idb.fetchColumn("SELECT Agent_ID FROM Agent ORDER BY Agent_ID ASC");
            for(String dettaID: agentID){
                String agentNamn = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID=" + dettaID);
                agentBox.addItem(agentNamn);
            }
        }
            catch(InfException e){
                System.out.println("Något gick fel med databasen");
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

        utrustningNamn = new javax.swing.JTextField();
        namnLabel = new javax.swing.JLabel();
        labelFranBox = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        arKomm = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        arTeknik = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        arVapen = new javax.swing.JCheckBox();
        tomFaltKnapp = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        utrustningDetalj = new javax.swing.JTextField();
        agentBox = new javax.swing.JComboBox<>();
        namnLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(utrustningNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 160, -1));

        namnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namnLabel.setForeground(new java.awt.Color(255, 255, 255));
        namnLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namnLabel.setText("Utkvittera till agent (valfritt)");
        getContentPane().add(namnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, -1));

        labelFranBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFranBox.setForeground(new java.awt.Color(255, 255, 255));
        labelFranBox.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(labelFranBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 170, 20));

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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 170, 40));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 100, 40));

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, 40));

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

        getContentPane().add(tomFaltKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 110, 30));

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

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 110, 30));
        getContentPane().add(utrustningDetalj, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 160, -1));

        getContentPane().add(agentBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 160, 20));

        namnLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namnLabel1.setForeground(new java.awt.Color(255, 255, 255));
        namnLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namnLabel1.setText("Namnge den nya utrustningen");
        getContentPane().add(namnLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, -1));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
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
        lblMIB.setText("Registrera ny utrustning");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void arVapenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arVapenActionPerformed
        // Denna kod hanterar vad som ska ske om användaren matar in att hen vill registrera ett vapen
        if(arVapen.isSelected()){
            arTeknik.setEnabled(false);
            arKomm.setEnabled(false);            
            labelFranBox.setText("Ange vapnets kaliber");
        }
        else{
            // Denna kod hanterar vad som ska ske om teknik ska registreras
            arTeknik.setEnabled(true);
            arKomm.setEnabled(true);
            labelFranBox.setText("");
        }
    }//GEN-LAST:event_arVapenActionPerformed

    private void arKommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arKommActionPerformed
        // Denna kod hanterar vad som ska ske om användaren matar in att hen vill registrera kommunikation
        if(arKomm.isSelected()){
            arTeknik.setEnabled(false);
            arVapen.setEnabled(false);
            labelFranBox.setText("Ange överföringsteknik");
        }
        else{
            // Denna kod hanterar vad som ska ske om teknik ska registreras
            arTeknik.setEnabled(true);
            arVapen.setEnabled(true);
            labelFranBox.setText("");
        }
    }//GEN-LAST:event_arKommActionPerformed

    private void arTeknikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arTeknikActionPerformed
        // Denna kod hanterar vad som ska ske om användaren matar in att hen vill registrera kommunikation
        if(arTeknik.isSelected()){
            arVapen.setEnabled(false);
            arKomm.setEnabled(false);
            labelFranBox.setText("Ange teknikens kraftkälla");
        }
        else{
            // Denna kod hanterar vad som ska ske om teknik ska registreras
            arVapen.setEnabled(true);
            arKomm.setEnabled(true);
            labelFranBox.setText("");
        }
    }//GEN-LAST:event_arTeknikActionPerformed

    private void tomFaltKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tomFaltKnappMouseReleased
        // Metod för att tömma fälten på tecken
        utrustningNamn.setText("");
        utrustningDetalj.setText("");
        agentBox.setSelectedIndex(0);
    }//GEN-LAST:event_tomFaltKnappMouseReleased

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased

        // Externt metodanrop för att kontrollera att utrustningsnamn och detaljer är ifyllda korrekt
        if(Validering.txtFieldBegransad20(utrustningNamn, "namn")){
            try{                
                LocalDate dagensDatum = LocalDate.now();
                String datum = dagensDatum.toString();
                String nextUID = idb.getAutoIncrement("utrustning", "Utrustnings_ID");
                
                
                String namn = utrustningNamn.getText();

                String detaljer = utrustningDetalj.getText();
                String agentNamn = (String)agentBox.getSelectedItem();
                String AID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE Namn='" + agentNamn + "'");
                            
                if(arVapen.isSelected() && Validering.txtFieldBegransad10(utrustningDetalj, "Kaliber")){
                    int reply = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill registrera denna utrustning?","Varning!",JOptionPane.YES_NO_OPTION);           
                    if(reply == JOptionPane.YES_OPTION){
                        idb.insert("INSERT INTO vapen VALUES(" + nextUID + ",'" + detaljer + "')");
                        idb.insert("INSERT INTO utrustning VALUES(" + nextUID + ",'" + namn + "')");
                        if(agentNamn != ""){
                            idb.insert("INSERT INTO innehar_utrustning VALUES(" + AID + ", " + nextUID + ", '" + datum + "')");
                        }
                        JOptionPane.showMessageDialog(null, "Utrustningen har registrerats!");
                    }
                }
                else if(arKomm.isSelected() && Validering.txtFieldBegransad20(utrustningDetalj, "Överföringsteknik")){
                    int reply = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill registrera denna utrustning?","Varning!",JOptionPane.YES_NO_OPTION);           
                    if(reply == JOptionPane.YES_OPTION){
                        idb.insert("INSERT INTO kommunikation VALUES(" + nextUID + ",'" + detaljer + "')");
                        idb.insert("INSERT INTO utrustning VALUES(" + nextUID + ",'" + namn + "')");
                        if(agentNamn != ""){
                            idb.insert("INSERT INTO innehar_utrustning VALUES(" + AID + ", " + nextUID + ", '" + datum + "')");
                        }
                        JOptionPane.showMessageDialog(null, "Utrustningen har registrerats!");
                    }
                }
                else if(arTeknik.isSelected() && Validering.txtFieldBegransad20(utrustningDetalj, "Kraftkälla")){
                    int reply = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill registrera denna utrustning?","Varning!",JOptionPane.YES_NO_OPTION);           
                    if(reply == JOptionPane.YES_OPTION){
                        idb.insert("INSERT INTO teknik VALUES(" + nextUID + ",'" + detaljer + "')");
                        idb.insert("INSERT INTO utrustning VALUES(" + nextUID + ",'" + namn + "')");                       
                        if(agentNamn != ""){
                            idb.insert("INSERT INTO innehar_utrustning VALUES(" + AID + ", " + nextUID + ", '" + datum + "')");
                        }
                        JOptionPane.showMessageDialog(null, "Utrustningen har registrerats!");
                    }
                }
        }       
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        }
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        /*
        Kollar adminstatus för den inloggade agenten, för att veta vilken huvudmeny användaren 
        ska skickas tillbaka till vid anvädning av "tillbaka"-knappen
        */
        try {
            String arAdmin = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + id);

            if(arAdmin.equals("N")){
                new HanteraUtrustningAgent(idb,id).setVisible(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agentBox;
    private javax.swing.JCheckBox arKomm;
    private javax.swing.JCheckBox arTeknik;
    private javax.swing.JCheckBox arVapen;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
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
    private javax.swing.JLabel namnLabel;
    private javax.swing.JLabel namnLabel1;
    private javax.swing.JPanel tomFaltKnapp;
    private javax.swing.JTextField utrustningDetalj;
    private javax.swing.JTextField utrustningNamn;
    // End of variables declaration//GEN-END:variables
}
