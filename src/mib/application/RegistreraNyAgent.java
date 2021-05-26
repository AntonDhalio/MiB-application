/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;

/**
 *
 * @author mariaforsberg
 */
public class RegistreraNyAgent extends javax.swing.JFrame {

    private static InfDB idb;
    private char adminStatus;
    private ArrayList<String> omrade;
    private String valtOmrade;
    private static String idNummer;
    private ArrayList<String> kontor;

    /**
     * Creates new form RegistreraNyAgent
     */
    public RegistreraNyAgent(InfDB idb, String idNUmmer) {
        this.idb = idb;
        this.idNummer = idNummer;
        initComponents();
        boxAdminStatus.insertItemAt("Ej administratör", 0);
        boxAdminStatus.insertItemAt("Administratör", 1);
        boxAdminStatus.setSelectedIndex(0);
        boxValjKontor.setVisible(false);
        boxAnsvarigForOmrade.setVisible(false);
        lblValjKontor.setVisible(false);
        lblValjOmrade.setVisible(false);
        
        
            try{
                idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
                omrade = idb.fetchColumn("SELECT Benamning FROM Omrade");
                omrade.forEach(benamning -> {
                    boxAnsvarigForOmrade.addItem(benamning);
                    
                    
            });
                
                kontor = idb.fetchColumn("SELECT Kontorsbeteckning FROM Kontorschef");
                kontor.forEach(kontorsNamn -> {
                    boxValjKontor.addItem(kontorsNamn);
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

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        btnAvbryt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblValjOmrade = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        boxAnsvarigForOmrade = new javax.swing.JComboBox<>();
        boxAdminStatus = new javax.swing.JComboBox<>();
        boxTypAvAgent = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        boxValjKontor = new javax.swing.JComboBox<>();
        lblValjKontor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAvbryt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btnAvbryt.setText("Avbryt");
        btnAvbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvbrytActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRERA NY AGENT");

        jLabel2.setText("Namn");

        jLabel3.setText("Telefonnummer");

        jLabel5.setText("Administratörsstatus");

        jLabel6.setText("Lösenord");

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Lösenordet får inte innehålla fler än 6 tecken");

        lblValjOmrade.setText("Ansvarig för område...");

        btnRegistrera.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        boxAnsvarigForOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAnsvarigForOmradeActionPerformed(evt);
            }
        });

        boxAdminStatus.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        boxAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxAdminStatusActionPerformed(evt);
            }
        });

        boxTypAvAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gör ett val...", "Fältagent", "Kontorschef" }));
        boxTypAvAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTypAvAgentActionPerformed(evt);
            }
        });

        jLabel4.setText("Välj typ av agent:");

        lblValjKontor.setText("Välj kontor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAvbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(btnRegistrera))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(45, 45, 45)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jLabel2))
                                                .addComponent(txtNamn)
                                                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(boxAdminStatus, 0, 161, Short.MAX_VALUE)
                                            .addComponent(boxTypAvAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblValjKontor)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblValjOmrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(boxAnsvarigForOmrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(boxValjKontor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(boxAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxTypAvAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValjOmrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxAnsvarigForOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValjKontor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxValjKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrera)
                    .addComponent(btnAvbryt))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvbrytActionPerformed
        new AdminHanteraAgent(idb, idNummer).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAvbrytActionPerformed

    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        
        LocalDate dagensDatum = LocalDate.now();
        String namn = txtNamn.getText();
        String telefon = txtTelefon.getText();
        String losenord = txtLosenord.getText();
        String datum = dagensDatum.toString();
        String valtKontor = (String)boxValjKontor.getSelectedItem();
        
        
        if(Validering.txtFieldBegransad6(txtLosenord) && Validering.txtFieldBegransad20(txtNamn) && Validering.txtFieldBegransad30(txtTelefon) && Validering.ValtEttAlternativ(boxTypAvAgent)){

        
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            String nextID = idb.getAutoIncrement("Agent", "Agent_ID");
            String omradesIDFraga = "SELECT Omrades_ID FROM Omrade WHERE Benamning ='" + valtOmrade + "'";
            String hamtaOmradesID = idb.fetchSingle(omradesIDFraga);
            int intOmradesID = Integer.parseInt(hamtaOmradesID);
            idb.insert("INSERT INTO Agent VALUES(" + nextID + ",'" + namn + "','" + telefon + "','" + datum + "','" + adminStatus + "','" + losenord + "'," + intOmradesID + ")");
            
            if(boxTypAvAgent.getSelectedIndex() == 1){
                idb.insert("INSERT INTO Faltagent VALUES(" + nextID + ")");    
            }
            else if(boxTypAvAgent.getSelectedIndex() == 2){
                    idb.update("UPDATE Kontorschef SET Agent_ID='" + nextID + "'WHERE Kontorsbeteckning='" + valtKontor + "'");
                        }
            
           
            
            JOptionPane.showMessageDialog(null, "Registrerigen lyckades! " + namn + " med ID-nummer " + nextID + " är nu tillagd i systemet");
        
     
        } catch (InfException e) {
            System.out.println(e);
        }
        
       
      }

    }//GEN-LAST:event_btnRegistreraActionPerformed

    private void boxAnsvarigForOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAnsvarigForOmradeActionPerformed
        valtOmrade = (String)boxAnsvarigForOmrade.getSelectedItem();  
    }//GEN-LAST:event_boxAnsvarigForOmradeActionPerformed

    private void boxAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxAdminStatusActionPerformed
        switch (boxAdminStatus.getSelectedIndex()) {
            case 0:
                adminStatus = 'N';
            break;
            case 1:
                adminStatus = 'J';
            break;
        }
    }//GEN-LAST:event_boxAdminStatusActionPerformed

    private void boxTypAvAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTypAvAgentActionPerformed
        switch (boxTypAvAgent.getSelectedIndex()) {
            case 0:
                boxValjKontor.setVisible(false);
                lblValjKontor.setVisible(false);
                lblValjOmrade.setVisible(false);
                boxAnsvarigForOmrade.setVisible(false);
                break;
            case 1:
                boxValjKontor.setVisible(false);
                lblValjKontor.setVisible(false);
                lblValjOmrade.setVisible(true);
                boxAnsvarigForOmrade.setVisible(true);
                break;
            case 2:
                boxAnsvarigForOmrade.setVisible(true);
                lblValjOmrade.setVisible(true);
                lblValjKontor.setVisible(true);
                boxValjKontor.setVisible(true);
                break;
                
        
        }
    }//GEN-LAST:event_boxTypAvAgentActionPerformed

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
            java.util.logging.Logger.getLogger(RegistreraNyAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistreraNyAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistreraNyAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistreraNyAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistreraNyAgent(idb, idNummer).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAdminStatus;
    private javax.swing.JComboBox<String> boxAnsvarigForOmrade;
    private javax.swing.JComboBox<String> boxTypAvAgent;
    private javax.swing.JComboBox<String> boxValjKontor;
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblValjKontor;
    private javax.swing.JLabel lblValjOmrade;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
