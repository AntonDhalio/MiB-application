/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class AndraAgent extends javax.swing.JFrame {
    
    private ArrayList<String> agentID;
    private static InfDB idb;
    private static String idNummer;
    private ArrayList<String> omrade;

    /**
     * Creates new form AndraAgent
     */
    public AndraAgent(InfDB idb, String idNummer) {
        initComponents();
        this.idb = idb;
        this.idNummer = idNummer;
        
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
            omrade = idb.fetchColumn("SELECT Benamning FROM Omrade");
            omrade.forEach(ansvararForOmrade -> {
                    boxNyttOmrade.addItem(ansvararForOmrade);
            });
        
            agentID = idb.fetchColumn("SELECT Agent_ID FROM Agent ORDER BY Agent_ID ASC");
            
            agentID.forEach(idNr -> {
                boxIDNummer.addItem(idNr);
            });
                       
            }
        
        catch(InfException e){
        JOptionPane.showMessageDialog(null, "Något gick fel. Vänligen försök igen");
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

        boxIDNummer = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNyttNamn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNyttTelenr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNyttLosenord = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxNyttOmrade = new javax.swing.JComboBox<>();
        btnGodkänn = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boxIDNummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIDNummerActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj agent att hantera:");

        jLabel2.setText("Namn:");

        jLabel3.setText("Telefonnummer:");

        jLabel4.setText("Lösenord:");

        jLabel5.setText("Ansvarig för område:");

        btnGodkänn.setText("Godkänn");
        btnGodkänn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGodkännActionPerformed(evt);
            }
        });

        btnTillbaka.setText("< Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGodkänn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNyttNamn)
                            .addComponent(txtNyttTelenr)
                            .addComponent(txtNyttLosenord)
                            .addComponent(boxNyttOmrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxIDNummer, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxIDNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNyttTelenr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNyttLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxNyttOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGodkänn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTillbaka)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxIDNummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIDNummerActionPerformed
        
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            String id = (String)boxIDNummer.getSelectedItem();
            String namn = idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID =" + id);
            String telefon = idb.fetchSingle("SELECT Telefon FROM Agent WHERE Agent_ID=" + id);
            String losenord = idb.fetchSingle("SELECT Losenord FROM Agent WHERE Agent_ID=" + id);
            int ansvarOmrade = Integer.parseInt(idb.fetchSingle("SELECT Omrade FROM Agent WHERE Agent_ID=" + id));
            String ansvararForOmrade = idb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID=" + ansvarOmrade);
            boxNyttOmrade.setSelectedItem(ansvararForOmrade);
            
            
            txtNyttNamn.setText(namn);
            txtNyttTelenr.setText(telefon);
            txtNyttLosenord.setText(losenord);
            
        }
            catch(InfException e){}
        
   
    }//GEN-LAST:event_boxIDNummerActionPerformed

    private void btnGodkännActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGodkännActionPerformed
        int valdAgent = Integer.parseInt((String)boxIDNummer.getSelectedItem());
        
        
        if(Validering.txtFieldBegransad6(txtNyttLosenord) && Validering.txtFieldBegransad30(txtNyttTelenr) && Validering.txtFieldBegransad20(txtNyttNamn)){
        
            try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            String namn = txtNyttNamn.getText();
            String telefon = txtNyttTelenr.getText();
            String losenord = txtNyttLosenord.getText();
            String valtOmrade = (String)boxNyttOmrade.getSelectedItem();  
            String omradesIDFraga = "SELECT Omrades_ID FROM Omrade WHERE Benamning ='" + valtOmrade + "'";
            String hamtaOmradesID = idb.fetchSingle(omradesIDFraga);
            int intOmradesID = Integer.parseInt(hamtaOmradesID);
            
            int svara = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill genomföra dessa ändringar?", "Obs!", JOptionPane.YES_NO_OPTION);
            
            if(svara == JOptionPane.YES_OPTION){
                System.out.println(intOmradesID);
            idb.update("UPDATE Agent SET Namn='" + namn + "'WHERE Agent_ID=" + valdAgent + "");
            idb.update("UPDATE Agent SET Telefon='" + telefon + "'WHERE Agent_ID=" + valdAgent + "");
            idb.update("UPDATE Agent SET Losenord='" + losenord + "'WHERE Agent_ID=" + valdAgent + "");
            idb.update("UPDATE Agent SET Omrade='" + intOmradesID + "'WHERE Agent_ID=" + valdAgent + "");
            
            JOptionPane.showMessageDialog(null, "Ändringarna har nu genomförts");
            }
            
            }
            catch(InfException e){
            JOptionPane.showMessageDialog(null, "Oj! Något gick fel");
            System.out.println(e);
            }
        
        
        
        }
    }//GEN-LAST:event_btnGodkännActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new AdminHanteraAgent(idb, idNummer).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

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
            java.util.logging.Logger.getLogger(AndraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraAgent(idb, idNummer).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxIDNummer;
    private javax.swing.JComboBox<String> boxNyttOmrade;
    private javax.swing.JButton btnGodkänn;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtNyttLosenord;
    private javax.swing.JTextField txtNyttNamn;
    private javax.swing.JTextField txtNyttTelenr;
    // End of variables declaration//GEN-END:variables
}
