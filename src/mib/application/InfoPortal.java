/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

/**
 *
 * @author anton
 */
public class InfoPortal extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private AgentMeny agentMeny;
    private ArrayList<String> valjInfo;
    private String info;
    
    /**
     * Creates new form InfoPortal
     */
    public InfoPortal(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
       
        idRasBox.removeAllItems();
        try{
        ArrayList<String> valjInfo = new ArrayList<>();
        valjInfo.add("Välj information du vill se");
        valjInfo.add("Se utomjordingar i område");
        valjInfo.add("Se utomjordingar per ras");
        valjInfo.add("Se utomjordingar som registrerats under en period");
        valjInfo.add("Se all information om en utomjording");
        valjInfo.add("Se vem som är områdeschef för ett områdeskontor");
        valjInfo.add("Se statistik för ansvarande agenter");
        valjInfo.add("Se utkvitterad utrustning");
        for(String dennaInfo: valjInfo){
            valBox.addItem(dennaInfo);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        infoFalt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        idRasBox = new javax.swing.JComboBox<>();
        tillbakaKnapp = new javax.swing.JButton();
        sok = new javax.swing.JButton();
        valBox = new javax.swing.JComboBox<>();
        datum1 = new com.toedter.calendar.JDateChooser();
        datum2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoFalt.setColumns(20);
        infoFalt.setRows(5);
        jScrollPane1.setViewportView(infoFalt);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Välkommen till informationsportalen");

        idRasBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRasBoxActionPerformed(evt);
            }
        });

        tillbakaKnapp.setText("<tillbaka");
        tillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaKnappActionPerformed(evt);
            }
        });

        sok.setText("Sök");
        sok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokActionPerformed(evt);
            }
        });

        valBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idRasBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datum1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(datum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(tillbakaKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(sok)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tillbakaKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(idRasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(datum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(datum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(sok)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaKnappActionPerformed
        agentMeny = new AgentMeny(idb, id);
        agentMeny.setVisible(true);
        dispose();
    }//GEN-LAST:event_tillbakaKnappActionPerformed

    private void sokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokActionPerformed
        infoFalt.selectAll();
        infoFalt.replaceSelection("");
        
        //If sats för att se vilka aliens som finns i ett specifikt område
        if(info.equals("Se utomjordingar i område")){
            String omrade = (String)idRasBox.getSelectedItem();
            try{
                ArrayList<String> omradeAlien = idb.fetchColumn("SELECT Alien_ID FROM alien WHERE Plats=" + omrade);
                
                for(String dennaAlien: omradeAlien){
                    infoFalt.insert(dennaAlien + "\n", 0);                                       
                }
            }            
            catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Något gick fel");
                    }
        }
        //if-else för att se vilka aliens som tillhör en viss ras
        else if(info.equals("Se utomjordingar per ras")){
            String ras = (String)idRasBox.getSelectedItem();
            try{
                ArrayList<String> rasAlien = idb.fetchColumn("SELECT Alien_ID FROM " + ras);
                for(String dennaAlien: rasAlien){
                    infoFalt.insert(dennaAlien + "\n", 0);
                }
            }            
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }
        //If-else för att se vilka utomjordingar som registrerats mellan olika datum
        else if(info.equals("Se utomjordingar som registrerats under en period")){
            Date startDatum = datum1.getDate();           
            Date slutDatum = datum2.getDate();
                       
            try{
                ArrayList<String> aid = idb.fetchColumn("SELECT Alien_ID FROM alien");
                HashMap<String, String> regDatum = idb.fetchRow("SELECT Alien_ID, Registreringsdatum FROM alien where id=" + aid);
                for(String dettaDatum: regDatum.values()){                   
                    Date datumet = new SimpleDateFormat("yyyy-MM-dd").parse(dettaDatum);
                    if(datumet.before(slutDatum) && datumet.after(startDatum)){
                                                
                    }
                
                }
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }
        //If-else för att se all information om en specifik alien
        else if(info.equals("Se all information om en utomjording")){
            String aid = (String)idRasBox.getSelectedItem();
            try{
                HashMap<String, String> alienInfo = idb.fetchRow("SELECT * FROM alien WHERE Alien_ID=" + aid);
                Iterator<String> itr = alienInfo.values().iterator();
                while(itr.hasNext()){
                    infoFalt.insert(itr.next() + "\n", 0);
                }
                }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Något gick fel");
                }    
        }
        //If else för att se vem som är områdeschef
        else if(info.equals("Se vem som är områdeschef för ett områdeskontor")){
            String omrade = (String)idRasBox.getSelectedItem();
            try{
                String chefOmrade = idb.fetchSingle("SELECT Agent_ID FROM omradeschef where Omrade=" + omrade);
                String chefNamn = idb.fetchSingle("SELECT Namn FROM agent where Agent_ID=" + chefOmrade);
                infoFalt.insert("Namn: " + chefNamn + "\n", 0);
                infoFalt.insert("Agent ID: " + chefOmrade +  "\n", 0);
                infoFalt.insert("Områdeschefen är:" + "\n", 0);
            }
                catch(InfException e){
                JOptionPane.showMessageDialog(null, "Något gick fel");
            }
        }
       
    }//GEN-LAST:event_sokActionPerformed

    private void valBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valBoxActionPerformed
        this.info = (String)valBox.getSelectedItem();
        try{
            if(info.equals(null)){
            }
            else if(info.equals("Välj information du vill se")){
                idRasBox.removeAllItems();
                idRasBox.setEnabled(false);
                datum1.setEnabled(false);
                datum2.setEnabled(false);
            }
            else if(info.equals("Se utomjordingar i område")){
                idRasBox.removeAllItems();
                idRasBox.setEnabled(true);
                datum1.setEnabled(false);
                datum2.setEnabled(false);
                alienPlats();
            }
            else if(info.equals("Se utomjordingar per ras")){
                idRasBox.removeAllItems();
                idRasBox.setEnabled(true);
                datum1.setEnabled(false);
                datum2.setEnabled(false);
                alienRas();                
            }
            else if(info.equals("Se utomjordingar som registrerats under en period")){
                idRasBox.removeAllItems();
                idRasBox.setEnabled(false);
                datum1.setEnabled(true);
                datum2.setEnabled(true);
            }
            else if(info.equals("Se all information om en utomjording")){
                idRasBox.removeAllItems();
                idRasBox.setEnabled(true);
                datum1.setEnabled(false);
                datum2.setEnabled(false);
                alienId();
            }
            else if(info.equals("Se vem som är områdeschef för ett områdeskontor")){
                idRasBox.removeAllItems();
                idRasBox.setEnabled(true);
                datum1.setEnabled(false);
                datum2.setEnabled(false);
                alienPlats();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_valBoxActionPerformed

    private void idRasBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRasBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRasBoxActionPerformed

    public void alienPlats(){
        ArrayList<String> omraden = new ArrayList<>();
        try{
            omraden = idb.fetchColumn("SELECT Omrades_ID FROM omrade");
            for(String dettaOmrade: omraden){
                idRasBox.addItem(dettaOmrade);
            }
        }       
        catch(InfException e){
        JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }
    
    public void alienRas(){
        ArrayList<String> raser = new ArrayList<>();
        raser.add("boglodite");
        raser.add("squid");
        raser.add("worm");
        for(String dennaRas: raser){
            idRasBox.addItem(dennaRas);
        }
    }
    
    public void alienId(){
        ArrayList<String> idAlien = new ArrayList<>();
        try{
            idAlien = idb.fetchColumn("SELECT Alien_ID FROM alien");
            for(String dettaId: idAlien){
                idRasBox.addItem(dettaId);
            }
        }
        
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(InfoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoPortal(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datum1;
    private com.toedter.calendar.JDateChooser datum2;
    private javax.swing.JComboBox<String> idRasBox;
    private javax.swing.JTextArea infoFalt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sok;
    private javax.swing.JButton tillbakaKnapp;
    private javax.swing.JComboBox<String> valBox;
    // End of variables declaration//GEN-END:variables
}
