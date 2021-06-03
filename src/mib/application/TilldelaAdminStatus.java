/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mariaforsberg
 */
public class TilldelaAdminStatus extends javax.swing.JFrame {
    private ArrayList<String> agentID;
    private static InfDB idb;
    private static String id;
    private ArrayList<HashMap<String,String>> agenterna;
    

    /**
     * Creates new form TilldelaAdminStatus
     */
    public TilldelaAdminStatus(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
              
        try{ 
            //Hämtar kolumnen med agent-ID:n ur agent-tabellen i databasen
            agenterna = idb.fetchRows("SELECT Agent_ID, Namn FROM agent");
            
            //Genom en for each loop listas alla agent-ID:n i en drop-down-meny
            for(HashMap enAgent : agenterna){
                boxAgenter.addItem(enAgent.get("Agent_ID").toString() + " : " + enAgent.get("Namn").toString());               
            }
        }
            catch(InfException e){
            JOptionPane.showMessageDialog(null, "Hoppsan! Det gick inte att hämta ID:n. Vänligen försök igen");
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

        jProgressBar1 = new javax.swing.JProgressBar();
        boxAgenter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(boxAgenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 190, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Välj agent");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, 20));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Tilldela agent administratörsstatus");
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Godkänn");
        godkännKnapp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 110, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased
        //Uppdaterar berörd agent till administratör när användaren klickar på "godkänn"
        try {
            int i = boxAgenter.getSelectedIndex();
            String idNr = agenterna.get(i).get("Agent_ID");
            String adminStatus = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + idNr);
            //Uppdaterar kolumnen för administratörsstatus med ett "J", vilket innebär att man är admin
            if(adminStatus.equals("N")){
                idb.update("UPDATE Agent SET Administrator= 'J' WHERE Agent_ID =" + idNr);
                JOptionPane.showMessageDialog(null, "Tilldelningen av administratörsstatus lyckades!");
            }
            else if(adminStatus.equals("J")){
                JOptionPane.showMessageDialog(null, "Agenten är redan en administratör");
            }
        } 
        catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Hoppsan! Det gick tyvärr inte att tilldela administratörsstatus. Vänligen försök igen");
            }
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        new AdminHanteraAgent(idb, id).setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxAgenter;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblMIB;
    // End of variables declaration//GEN-END:variables
}
