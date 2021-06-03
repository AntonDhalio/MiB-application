/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mathildabernebyhaeffner
 */
public class InfoAgent extends javax.swing.JFrame {
    private InfDB idb;
    private String id;
    private ArrayList<HashMap<String,String>> agenterna;
    private HashMap<String,String> agentInfo;
    private ArrayList<String> omradesChefer;

    /**
     * Creates new form InfoRuta
     */
    public InfoAgent(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        
        try {
            //Hämtar kolumnen med agent-ID:n ur agent-tabellen i databasen
            agenterna = idb.fetchRows("SELECT Agent_ID, Namn FROM agent");
                   
            //Genom en for each loop listas alla agent-ID:n i en drop-down-meny
            for(HashMap enAgent : agenterna){
                valjAgent.addItem(enAgent.get("Agent_ID").toString() + " : " + enAgent.get("Namn").toString());
            }
        }
        catch (InfException ex) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        valjAgent = new javax.swing.JComboBox<>();
        sokKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInfo.setBackground(new java.awt.Color(0, 0, 0));
        txtInfo.setColumns(20);
        txtInfo.setForeground(new java.awt.Color(255, 255, 255));
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 340, 230));

        valjAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valjAgentActionPerformed(evt);
            }
        });
        getContentPane().add(valjAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

        sokKnapp.setBackground(new java.awt.Color(0, 0, 0));
        sokKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        sokKnapp.setForeground(new java.awt.Color(102, 153, 255));
        sokKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sokKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sokKnappMouseReleased(evt);
            }
        });
        sokKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        sokKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Sök");
        sokKnapp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 60, 30));

        getContentPane().add(sokKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 110, 30));

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
        lblMIB.setText("Information om agent");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        new AdminHanteraAgent(idb, id).setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_goBackMouseReleased

    private void valjAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valjAgentActionPerformed
        int i = valjAgent.getSelectedIndex();
        String idNr = agenterna.get(i).get("Agent_ID");
        
        try {
            agentInfo = idb.fetchRow("SELECT * FROM agent WHERE Agent_ID=" + idNr);
            
        } 
        catch (InfException ex) {
            System.out.println("Något gick fel med databasen");
        }
    }//GEN-LAST:event_valjAgentActionPerformed

    private void sokKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sokKnappMouseReleased
              
        try {            
            txtInfo.selectAll();
            txtInfo.replaceSelection("");
            boolean arChef = false;
            String AID = agentInfo.get("Agent_ID");
            String chefOmrade = idb.fetchSingle("SELECT Omrade FROM omradeschef WHERE Agent_ID=" + AID);
            String chefOmradeNamn = idb.fetchSingle("SELECT Benamning FROM omrade WHERE Omrades_ID=" + chefOmrade);
            String admin = agentInfo.get("Administrator");
            String omradesId = agentInfo.get("Omrade");
            String omradeNamn = idb.fetchSingle("SELECT Benamning FROM omrade WHERE Omrades_ID=" + omradesId);
            omradesChefer = idb.fetchColumn("SELECT Agent_ID FROM omradeschef");
            
            for(String enChef : omradesChefer){
                if(enChef.equals(AID)){
                    
                    arChef = true;
                }
            }
            if(!arChef){
                txtInfo.insert("Områdeschef: Denna agent är inte en områdeschef\n", 0);
            }
            else if(arChef){
                txtInfo.insert("Områdeschef: Denna agent är områdeschef över " + chefOmradeNamn + "\n", 0);
            }
            if(admin.equals("N")){
                txtInfo.insert("Administratör: Nej\n", 0);
            }
            else if(admin.equals("J")){
                txtInfo.insert("Administratör: Ja\n", 0);
            }
            txtInfo.insert("Registreringsdatum: " + agentInfo.get("Anstallningsdatum") + "\n",0);
            txtInfo.insert("Arbetar i: " + omradeNamn + "\n", 0);
            txtInfo.insert("Namn: " + agentInfo.get("Namn") + "\n",0);
            txtInfo.insert("Telefon: " + agentInfo.get("Telefon") + "\n",0);
            txtInfo.insert("ID: " + agentInfo.get("Agent_ID") + "\n",0);
            txtInfo.insert("Namn: " + agentInfo.get("Namn") + "\n",0);
            
            
            
        }
        catch (InfException ex) {
            Logger.getLogger(InfoAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sokKnappMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel sokKnapp;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JComboBox<String> valjAgent;
    // End of variables declaration//GEN-END:variables
}