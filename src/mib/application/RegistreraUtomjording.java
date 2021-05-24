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
import java.time.LocalDate;
/**
 *
 * @author anton
 */
public class RegistreraUtomjording extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private HanteraUtomjording hanteraUtomjording;
    private ArrayList<String> agenter;
    private ArrayList<String> omrade;
    private ArrayList<String> ras;
    
    
    /**
     * Creates new form RegistreraUtomjording
     */
    public RegistreraUtomjording(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        agentBox.removeAllItems();
        omradeBox.removeAllItems();
        rasBox.removeAllItems();
        try{
            ArrayList<String> agenter = idb.fetchColumn("SELECT Agent_ID FROM agent");
            for(String nuvarandeAgent: agenter){
                agentBox.addItem(nuvarandeAgent);
            }
        
            ArrayList<String> omrade = idb.fetchColumn("SELECT Omrades_ID FROM omrade");
            for(String nuvarandeOmrade: omrade){
                omradeBox.addItem(nuvarandeOmrade);
            }
            
            ArrayList<String> ras = new ArrayList<String>();
            ras.add("boglodite");
            ras.add("squid");
            ras.add("worm");
            for(String nuvarandeRas: ras){
               rasBox.addItem(nuvarandeRas);
            }
        }
        
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Ett fel uppstod");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namnFalt = new javax.swing.JTextField();
        losenordFalt = new javax.swing.JTextField();
        telnrFalt = new javax.swing.JTextField();
        rasBox = new javax.swing.JComboBox<>();
        agentBox = new javax.swing.JComboBox<>();
        omradeBox = new javax.swing.JComboBox<>();
        godkannKnapp = new javax.swing.JButton();
        avbrytKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fyll i nedanstående information för att registrera en ny utomjording");

        jLabel2.setText("Namn");

        jLabel3.setText("Lösenord");

        jLabel4.setText("Ras");

        jLabel5.setText("Telefonnummer");

        jLabel6.setText("Ansvarig agent");

        jLabel7.setText("Boendeplats");

        rasBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        agentBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        omradeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(omradeBox, 0, 127, Short.MAX_VALUE)
                            .addComponent(agentBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rasBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telnrFalt)
                            .addComponent(losenordFalt)
                            .addComponent(namnFalt)))
                    .addComponent(jLabel1))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(godkannKnapp)
                .addGap(68, 68, 68)
                .addComponent(avbrytKnapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namnFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(losenordFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telnrFalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rasBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(agentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(omradeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(godkannKnapp)
                    .addComponent(avbrytKnapp))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void godkannKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_godkannKnappActionPerformed
        if(Validering.txtFieldBegransad30(telnrFalt) && Validering.txtFieldBegransad6(losenordFalt) && Validering.txtFieldBegransad20(namnFalt)){
        try{
            String namn = namnFalt.getText();
            String losenord = losenordFalt.getText();
            String telNr = telnrFalt.getText();
            String regRas = (String)rasBox.getSelectedItem();
            String regAgent = (String)agentBox.getSelectedItem();
            String regOmrade = (String)omradeBox.getSelectedItem();
            String nextId = idb.getAutoIncrement("alien", "Alien_ID");
            LocalDate date = LocalDate.now();
            String datum = date.toString();
            
            
            if(namn.equals("") || losenord.equals("")){
                JOptionPane.showMessageDialog(null, "Fyll i de kravsatta fälten!");
            }
            //OBS! lägg till så att man själv får välja values på boglodite och squid!!
            else{
                idb.insert("INSERT INTO alien VALUES(" + nextId + ",'" + datum + "','" + namn + "','" + losenord + "','" + telNr + "'," + regOmrade + "," + regAgent + ")");
                
                if(regRas.equals("worm")){
                    idb.insert("INSERT INTO " + regRas + " VALUES(" + nextId + ")");
                }
                else if(regRas.equals("boglodite")){
                    idb.insert("INSERT INTO " + regRas + " VALUES(" + nextId + ",3)");
                }
                else if(regRas.equals("squid")){
                idb.insert("INSERT INTO " + regRas + " VALUES(" + nextId + ", 6)");
                }
                JOptionPane.showMessageDialog(null, "Utomjordingen har registrerats!");
            }
        }
        
        catch(InfException ex){
            JOptionPane.showMessageDialog(null, "Ett fel uppstod");
        }
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
            java.util.logging.Logger.getLogger(RegistreraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraUtomjording.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraUtomjording(idb, id).setVisible(true);
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
    private javax.swing.JTextField losenordFalt;
    private javax.swing.JTextField namnFalt;
    private javax.swing.JComboBox<String> omradeBox;
    private javax.swing.JComboBox<String> rasBox;
    private javax.swing.JTextField telnrFalt;
    // End of variables declaration//GEN-END:variables
}