/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mariaforsberg
 */
public class AndraKontorsChef extends javax.swing.JFrame {
    
    private static InfDB idb;
    private ArrayList<String> kontorNamn;
    private ArrayList<String> agentID;
    private ArrayList<HashMap<String,String>> agenterna;
    private static String id;

    /**
     * Creates new form AndraKontorsChef
     */
    public AndraKontorsChef (InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        txtNyttKontor.setVisible(false);
        lblKontorsnamn.setVisible(false);
        
            try{
                //Hämtar kolumnen med agent-ID:n ur agent-tabellen i databasen
                agenterna = idb.fetchRows("SELECT Agent_ID, Namn FROM agent");
            
            //Genom en for each loop listas alla agent-ID:n i en drop-down-meny
            for(HashMap enAgent : agenterna){
                boxKontorsChef.addItem(enAgent.get("Agent_ID").toString() + " : " + enAgent.get("Namn").toString());
            }
            //Kod som hämtar ut kolumnen med namn på kontoren från databasen, och sorterar dem i bokstavsordningen A-Ö
            kontorNamn = idb.fetchColumn("SELECT Kontorsbeteckning FROM Kontorschef ORDER BY Kontorsbeteckning ASC");
                
            //En for each loop som listar alla kontorsnamn i en drop-down-meny
            kontorNamn.forEach(kontor -> {
            boxValjKontor.addItem(kontor);
            }); 
        
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println(e);
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

        boxValjKontor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boxKontorsChef = new javax.swing.JComboBox<>();
        btnLaggTillKontor = new javax.swing.JRadioButton();
        txtNyttKontor = new javax.swing.JTextField();
        lblKontorsnamn = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(boxValjKontor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 190, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Välj ett kontor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Välj kontorschef");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 220, 120, 20));

        getContentPane().add(boxKontorsChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 190, -1));

        btnLaggTillKontor.setBackground(new java.awt.Color(0, 0, 0));
        btnLaggTillKontor.setForeground(new java.awt.Color(255, 255, 255));
        btnLaggTillKontor.setText("Jag vill lägga till ett nytt kontor");
        btnLaggTillKontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillKontorActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaggTillKontor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));
        getContentPane().add(txtNyttKontor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 190, -1));

        lblKontorsnamn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblKontorsnamn.setForeground(new java.awt.Color(255, 255, 255));
        lblKontorsnamn.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblKontorsnamn.setText("Namn på kontoret");
        getContentPane().add(lblKontorsnamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 20));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Ändra kontorschefen för angivet kontor");
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        godkännKnapp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 153, 255));
        jLabel11.setText("Godkänn");
        godkännKnapp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillKontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillKontorActionPerformed
        /** Metod för att lägga till ett nytt kontor om det man vill ha inte finns i listan
         * Om knappen för att lägga till nytt kontor väljs, så dyker ett textfält upp där man
         * skriver in namn på det nya kontoret
         * Avmarkeras knappen så döljs textfältet igen
         */
        
        if(btnLaggTillKontor.isSelected()){
            txtNyttKontor.setVisible(true);
            lblKontorsnamn.setVisible(true);
        }
            else{
            txtNyttKontor.setVisible(false);
            lblKontorsnamn.setVisible(false);
        }
    }//GEN-LAST:event_btnLaggTillKontorActionPerformed

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased
        int i = boxKontorsChef.getSelectedIndex();
        String idNr = agenterna.get(i).get("Agent_ID");
        String kontor = (String)boxValjKontor.getSelectedItem();
        
            try{
                //Kod som gör att användaren måste bekräfta valet av ny kontorschef, genom en pop-up-ruta där man kan bekräfta eller avvisa
                int svar = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill genomföra ändringarna?", "Obs!", JOptionPane.YES_NO_OPTION);
            
                /* Om användaren har valt att lägga i ett nytt kontor och valideringen av det textfältet går igenom,
                * Läggs den valda agenten till som kontorschef och även namnet på det nya kontoret läggs till i databasen
                */
                if(svar == JOptionPane.YES_OPTION && btnLaggTillKontor.isSelected() && Validering.txtFieldBegransad25(txtNyttKontor)){
                    kontor = txtNyttKontor.getText();
                    idb.insert("INSERT INTO Kontorschef VALUES(" + idNr + ", '" + kontor + "')");
              
                    JOptionPane.showMessageDialog(null, "Kontorschefen för " + kontor + " har nu lagts till");
                                                   }
                    //Om användaren har valt ett kontor från listan, uppdateras chefen för ett redan befintligt kontor                               
                    else if(svar == JOptionPane.YES_OPTION){
                    idb.update("UPDATE Kontorschef SET Agent_ID='" + idNr + "'WHERE Kontorsbeteckning='" + kontor + "'");
           
                    JOptionPane.showMessageDialog(null, "Kontorschefen för " + kontor + " har nu ändrats");
                    }                              
                }
        catch(InfException e){
            System.out.println(e);
            }
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        new AdminHanteraAgent(idb, id).setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxKontorsChef;
    private javax.swing.JComboBox<String> boxValjKontor;
    private javax.swing.JRadioButton btnLaggTillKontor;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblKontorsnamn;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JTextField txtNyttKontor;
    // End of variables declaration//GEN-END:variables
}
