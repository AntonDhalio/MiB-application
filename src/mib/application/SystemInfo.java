/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author anton
 */
public class SystemInfo extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private HuvudmenyAdmin menyAdmin;
    /**
     * Creates new form SystemInfo
     */
    public SystemInfo(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        laggTillInfoIBoxOmrade();
        laggTillInfoIBoxUtrustning();
        laggTillInfoIBoxAlien();
        laggTillInfoIBoxAgent();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        statArea = new javax.swing.JTextArea();
        tillbakaKnapp = new javax.swing.JButton();
        skrivUtKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Övergripande statistik om systemet");

        statArea.setColumns(20);
        statArea.setRows(5);
        jScrollPane1.setViewportView(statArea);

        tillbakaKnapp.setText("<Tillbaka");
        tillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaKnappActionPerformed(evt);
            }
        });

        skrivUtKnapp.setText("Skriv ut rapport");
        skrivUtKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skrivUtKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tillbakaKnapp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(skrivUtKnapp)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tillbakaKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(skrivUtKnapp)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void laggTillInfoIBoxAgent(){
        try{
            String antalAgenter = idb.fetchSingle("SELECT COUNT(*) FROM agent");
            String antalAdmins = idb.fetchSingle("SELECT COUNT(*) FROM agent Where Administrator='J'");
            String antalFaltAgent = idb.fetchSingle("SELECT COUNT(*) FROM faltagent");
            
            statArea.insert("\n", 0);
            statArea.insert("   Antal fältagenter: " + antalFaltAgent + "\n", 0);
            statArea.insert("   Antal administratörer: " + antalAdmins + "\n", 0);
            statArea.insert("   Totalt antal registrerade agenter: " + antalAgenter + "\n", 0);
            statArea.insert("AGENTER:\n", 0);           
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }
    
    private void laggTillInfoIBoxAlien(){
        try{    
            String antalAliens = idb.fetchSingle("SELECT COUNT(*) FROM alien");
            String antalBogs = idb.fetchSingle("SELECT COUNT(*) FROM boglodite");
            String antalSquids = idb.fetchSingle("SELECT COUNT(*) FROM squid");
            String antalWorms = idb.fetchSingle("SELECT COUNT(*) FROM worm");
            
            statArea.insert("\n", 0);
            statArea.insert("   Antal Worms: " + antalWorms + "\n", 0);
            statArea.insert("   Antal Squids: " + antalSquids + "\n", 0);
            statArea.insert("   Antal Boglodites: " + antalBogs + "\n", 0);
            statArea.insert("   Totalt antal registrerade utomjordingar: " + antalAliens + "\n", 0);
            statArea.insert("UTOMJORDINGAR:\n", 0);
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }
    
    private void laggTillInfoIBoxUtrustning(){
        try{
            String mangdUtrustning = idb.fetchSingle("SELECT COUNT(*) FROM utrustning");
            String antalFordon = idb.fetchSingle("SELECT COUNT(*) FROM fordon");
            String mangdTeknik = idb.fetchSingle("SELECT COUNT(*) FROM teknik");
            String mangdVapen = idb.fetchSingle("SELECT COUNT(*) FROM vapen");
            String mangdKomm = idb.fetchSingle("SELECT COUNT(*) FROM kommunikation");
            String utkvittUtr = idb.fetchSingle("SELECT COUNT(*) FROM innehar_utrustning");
            String utkvittFordon = idb.fetchSingle("SELECT COUNT(*) FROM innehar_fordon");
            
            statArea.insert("\n", 0);
            statArea.insert("   Utkvitterade fordon: " + utkvittFordon + "\n", 0);
            statArea.insert("   Utkvitterad utrustning: " + utkvittUtr + "\n", 0);
            statArea.insert("   Antal kommuikationsutrustning: " + mangdKomm + "\n", 0);
            statArea.insert("   Antal teknik: " + mangdTeknik + "\n", 0);
            statArea.insert("   Antal vapen " + mangdVapen + "\n", 0);
            statArea.insert("   Totalt antal registrerade fordon: " + antalFordon + "\n", 0);
            statArea.insert("   Total mängd registrerad utrustning: " + mangdUtrustning + "\n", 0);
            statArea.insert("UTRUSTNING OCH FORDON:\n", 0);
        }
        
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }
    
    private void laggTillInfoIBoxOmrade(){
        try{
            String antalOmraden = idb.fetchSingle("SELECT COUNT(*) FROM omrade");
            String antalPlatser = idb.fetchSingle("SELECT COUNT(*) FROM plats");
            
            statArea.insert("\n", 0);
            statArea.insert("   Totalt antal platser inom alla områden: " + antalPlatser + "\n", 0);
            statArea.insert("   Totalt antal registrerade områden: " + antalOmraden + "\n", 0);
            statArea.insert("OMRÅDEN OCH PLATSER:\n", 0); 
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
    }
    
    private void skrivUtKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skrivUtKnappActionPerformed
        try {
            statArea.print();
        } catch (PrinterException ex) {
            Logger.getLogger(SystemInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_skrivUtKnappActionPerformed

    private void tillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaKnappActionPerformed
        menyAdmin = new HuvudmenyAdmin(idb,id);
        menyAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_tillbakaKnappActionPerformed

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
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemInfo(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton skrivUtKnapp;
    private javax.swing.JTextArea statArea;
    private javax.swing.JButton tillbakaKnapp;
    // End of variables declaration//GEN-END:variables
}
