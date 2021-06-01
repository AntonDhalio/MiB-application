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
    private HanteraUtomjordingAdmin hanteraUtAdmin;
    private ArrayList<String> agenter;
    private ArrayList<String> plats;
    private ArrayList<String> ras;
    
    
    /**
     * Creates new form RegistreraUtomjording
     */
    public RegistreraUtomjording(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        
        try{
            ArrayList<String> agenter = idb.fetchColumn("SELECT Agent_ID FROM agent");
            for(String nuvarandeAgent: agenter){
                agentBox.addItem(nuvarandeAgent);
            }
        
            ArrayList<String> plats = idb.fetchColumn("SELECT Plats_ID FROM plats");
            for(String nuvarandePlats: plats){
                omradeBox.addItem(nuvarandePlats);
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

        namnLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telefonLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        namnFalt = new javax.swing.JTextField();
        losenordFalt = new javax.swing.JTextField();
        telnrFalt = new javax.swing.JTextField();
        rasBox = new javax.swing.JComboBox<>();
        agentBox = new javax.swing.JComboBox<>();
        omradeBox = new javax.swing.JComboBox<>();
        godkännKnapp = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        avbrytKnapp1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namnLabel.setForeground(new java.awt.Color(255, 255, 255));
        namnLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        namnLabel.setText("Namn");
        getContentPane().add(namnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, -1));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passwordLabel.setText("Lösenord");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Ras");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, -1));

        telefonLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefonLabel.setForeground(new java.awt.Color(255, 255, 255));
        telefonLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        telefonLabel.setText("Telefonnummer");
        getContentPane().add(telefonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Ansvarig agent");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Boendeplats");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Registrera en ny alien");
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
        getContentPane().add(namnFalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 127, -1));
        getContentPane().add(losenordFalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 127, -1));
        getContentPane().add(telnrFalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 127, -1));

        getContentPane().add(rasBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 127, -1));

        getContentPane().add(agentBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 127, -1));

        getContentPane().add(omradeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 127, -1));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        godkännKnapp.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 153, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Registrera");
        godkännKnapp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 350, 110, 30));

        avbrytKnapp1.setBackground(new java.awt.Color(0, 0, 0));
        avbrytKnapp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        avbrytKnapp1.setForeground(new java.awt.Color(102, 153, 255));
        avbrytKnapp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        avbrytKnapp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                avbrytKnapp1MouseReleased(evt);
            }
        });
        avbrytKnapp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cancel.png"))); // NOI18N
        avbrytKnapp1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Töm fält");
        avbrytKnapp1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        getContentPane().add(avbrytKnapp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 350, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased
        if(Validering.txtFieldBegransad20(namnFalt, namnLabel.getText()) && Validering.txtFieldBegransad6(losenordFalt, passwordLabel.getText()) && Validering.txtFieldBegransad30(telnrFalt, telefonLabel.getText())){
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
                idb.insert("INSERT INTO alien VALUES(" + nextId + ",'" + datum + "','" + losenord + "','" + namn + "','" + telNr + "'," + regOmrade + "," + regAgent + ")");
                
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
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void avbrytKnapp1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avbrytKnapp1MouseReleased
        namnFalt.setText("");
        losenordFalt.setText("");
        telnrFalt.setText("");
    }//GEN-LAST:event_avbrytKnapp1MouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        try {
            String arAdmin = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + id);

            if(arAdmin.equals("N")){
                new HanteraUtomjording(idb, id).setVisible(true);
                dispose();
            }
            else if(arAdmin.equals("J")){
                new HanteraUtomjordingAdmin(idb, id).setVisible(true);
                dispose();
            }
        }
        catch (InfException ex) {
            System.out.println("Något gick fel");
        }
    }//GEN-LAST:event_goBackMouseReleased

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
    private javax.swing.JPanel avbrytKnapp1;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JTextField losenordFalt;
    private javax.swing.JTextField namnFalt;
    private javax.swing.JLabel namnLabel;
    private javax.swing.JComboBox<String> omradeBox;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> rasBox;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JTextField telnrFalt;
    // End of variables declaration//GEN-END:variables
}
