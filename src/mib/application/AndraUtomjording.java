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
/**
 *
 * @author anton
 */
public class AndraUtomjording extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private HanteraUtomjording hanteraUtomjording;
    private ArrayList<String> utomjording;
    private ArrayList<String> agenter;
    private ArrayList<String> omrade;
    private ArrayList<String> ras;
    private ArrayList<String> boglodite;
    private ArrayList<String> squid;
    private ArrayList<String> worm;
    private String gamalRas;
    /**
     * Creates new form AndraUtomjording
     */
    public AndraUtomjording(InfDB idb, String id) {
        initComponents();
        this.idb=idb;
        this.id=id;
        agentBox.removeAllItems();
        omradeBox.removeAllItems();
        rasBox.removeAllItems();
        utomjordingBox.removeAllItems();
        
        try{
            ArrayList<String> utomjording = idb.fetchColumn("SELECT Alien_ID FROM alien");
            for(String nuvarandeUtomjording: utomjording){
                utomjordingBox.addItem(nuvarandeUtomjording);
            }
            

        }
        
        catch(InfException e){
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        utomjordingBox = new javax.swing.JComboBox<>();
        namnFalt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        losenordFalt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telnrFalt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        omradeBox = new javax.swing.JComboBox<>();
        agentBox = new javax.swing.JComboBox<>();
        rasBox = new javax.swing.JComboBox<>();
        godkannKnapp = new javax.swing.JButton();
        avbrytKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Justera information");

        jLabel2.setText("Vilken utomjording vill du hantera?");

        utomjordingBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        utomjordingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utomjordingBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Namn");

        jLabel4.setText("Lösenord");

        jLabel5.setText("TelefonNr.");

        jLabel6.setText("Område");

        jLabel7.setText("Ansvarig Agent");

        jLabel8.setText("Ras");

        omradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        agentBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        godkannKnapp.setText("Godkänn");
        godkannKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                godkannKnappActionPerformed(evt);
            }
        });

        avbrytKnapp.setText("Avbryt");
        avbrytKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(godkannKnapp)
                        .addGap(30, 30, 30)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(avbrytKnapp)
                    .addComponent(namnFalt)
                    .addComponent(utomjordingBox, 0, 115, Short.MAX_VALUE)
                    .addComponent(losenordFalt)
                    .addComponent(telnrFalt)
                    .addComponent(omradeBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agentBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rasBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(utomjordingBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(losenordFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telnrFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(omradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(agentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avbrytKnapp)
                    .addComponent(godkannKnapp))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void utomjordingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utomjordingBoxActionPerformed
        String valdUtomjording = (String)utomjordingBox.getSelectedItem();
        try{
            omradeBox.removeAllItems();
            rasBox.removeAllItems();
            agentBox.removeAllItems();
            String namn = idb.fetchSingle("SELECT Namn FROM alien WHERE Alien_ID=" + valdUtomjording);
            namnFalt.setText(namn);
            String losenord = idb.fetchSingle("SELECT Losenord FROM alien WHERE Alien_ID=" + valdUtomjording);
            losenordFalt.setText(losenord);
            String telNr = idb.fetchSingle("SELECT Telefon FROM alien WHERE Alien_ID=" + valdUtomjording);
            telnrFalt.setText(telNr);
            String valtOmrade = idb.fetchSingle("SELECT Plats FROM alien WHERE Alien_ID=" + valdUtomjording);
            String valdAgent = idb.fetchSingle("SELECT Ansvarig_Agent FROM alien WHERE Alien_ID=" + valdUtomjording);
            
            ArrayList<String> omrade = idb.fetchColumn("SELECT Omrades_ID FROM omrade");
            for(String nuvarandeOmrade: omrade){
                omradeBox.addItem(nuvarandeOmrade);
            }
            ArrayList<String> agent = idb.fetchColumn("SELECT Agent_ID FROM agent");
            for(String nuvarandeAgent: agent){
                agentBox.addItem(nuvarandeAgent);
            }
            ArrayList<String> ras = new ArrayList<String>();
            ras.add("Ras inte registrerad");
            ras.add("boglodite");
            ras.add("squid");
            ras.add("worm");
            for(String nuvarandeRas: ras){
               rasBox.addItem(nuvarandeRas);
            }
            
            omradeBox.setSelectedItem(valtOmrade);
            agentBox.setSelectedItem(valdAgent);
            
            ArrayList<String> boglodite = idb.fetchColumn("SELECT Alien_ID FROM boglodite");
            
            ArrayList<String> squid = idb.fetchColumn("SELECT Alien_ID FROM squid");
            
            ArrayList<String> worm = idb.fetchColumn("SELECT Alien_ID FROM worm");
            
            for(String i: boglodite){
            if(i.equals(valdUtomjording)){
                rasBox.setSelectedItem(ras.get(1));
            }
            }
            for(String j: squid){
            if(j.equals(valdUtomjording)){
                rasBox.setSelectedItem(ras.get(2));
            }
            }
            for(String k: worm){
            if(k.equals(valdUtomjording)){
                rasBox.setSelectedItem(ras.get(3));
            }
            }
            String gamalRas = (String)rasBox.getSelectedItem();
            
            
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_utomjordingBoxActionPerformed

    private void godkannKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_godkannKnappActionPerformed
        String valdUtomjording = (String)utomjordingBox.getSelectedItem();
        try{
            String namn = namnFalt.getText();
            String losenord = losenordFalt.getText();
            String telNr = telnrFalt.getText();
            String regRas = (String)rasBox.getSelectedItem();
            String regAgent = (String)agentBox.getSelectedItem();
            String regOmrade = (String)omradeBox.getSelectedItem();
            
            int reply = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ändra dessa uppgifter?", "Varning!", JOptionPane.YES_NO_OPTION);
            
            if(reply == JOptionPane.YES_OPTION){
                idb.update("UPDATE alien SET Namn='" + namn + "' where Alien_ID=" + valdUtomjording);
                idb.update("UPDATE alien SET Losenord='" + losenord + "' where Alien_ID=" + valdUtomjording);
                idb.update("UPDATE alien SET Telefon='" + telNr + "' where Alien_ID=" + valdUtomjording);
                idb.update("UPDATE alien SET Ansvarig_Agent='" + regAgent + "' where Alien_ID=" + valdUtomjording);
                idb.update("UPDATE alien SET Plats='" + regOmrade + "' where Alien_ID=" + valdUtomjording);
                if(gamalRas != null){
                idb.delete("DELETE FROM " + gamalRas + " WHERE Alien_ID=" + valdUtomjording);
                }
                if(regRas.equals("boglodite")){
                    idb.insert("INSERT INTO boglodite VALUES(" + valdUtomjording + ", 3)");
                }
                else if(regRas.equals("squid")){
                    idb.insert("INSERT INTO squid VALUES(" + valdUtomjording + ", 6)");
                }
                else if(regRas.equals("worm")){
                    idb.insert("INSERT INTO worm VALUES(" + valdUtomjording + ")");
                }
                JOptionPane.showMessageDialog(null, "Ändringar genomförda");
            }
        }
        
        catch(InfException e){
        JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }//GEN-LAST:event_godkannKnappActionPerformed

    private void avbrytKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytKnappActionPerformed
        hanteraUtomjording = new HanteraUtomjording(idb,id);
        hanteraUtomjording.setVisible(true);
        dispose();
    }//GEN-LAST:event_avbrytKnappActionPerformed

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
            java.util.logging.Logger.getLogger(AndraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraUtomjording(idb,id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agentBox;
    private javax.swing.JButton avbrytKnapp;
    private javax.swing.JButton godkannKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField losenordFalt;
    private javax.swing.JTextField namnFalt;
    private javax.swing.JComboBox<String> omradeBox;
    private javax.swing.JComboBox<String> rasBox;
    private javax.swing.JTextField telnrFalt;
    private javax.swing.JComboBox<String> utomjordingBox;
    // End of variables declaration//GEN-END:variables
}
