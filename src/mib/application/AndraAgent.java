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


public class AndraAgent extends javax.swing.JFrame {
    
    private ArrayList<String> agentID;
    private static InfDB idb;
    private static String id;
    private ArrayList<String> omrade;
    private ArrayList<HashMap<String,String>> agenterna;
    

    /**
     * Creates new form AndraAgent
     */
    public AndraAgent(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
        
        try{
            //For each loop som ser till att alla ID:n och namn listas i en drop-down-meny
            agenterna = idb.fetchRows("SELECT Agent_ID, Namn FROM agent");
            for(HashMap enAgent : agenterna){
                boxIDNummer.addItem(enAgent.get("Agent_ID").toString() + " : " + enAgent.get("Namn").toString());
            }           
            //Kod som hämtar ut hela namn-kolumnen för områden i databasen
            omrade = idb.fetchColumn("SELECT Benamning FROM Omrade");
            
            //For each loop som gör att alla områdesnamn listas i en drop-down-meny
            omrade.forEach(ansvararForOmrade -> {
                    boxNyttOmrade.addItem(ansvararForOmrade);
                                                });
            //Kod som hämtar ut hela agent-ID-kolumnen för agenter i databasen. Alla ID:n sorteras i stigande ordning
            agentID = idb.fetchColumn("SELECT Agent_ID FROM Agent ORDER BY Agent_ID ASC");                 
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
        namnLabel = new javax.swing.JLabel();
        txtNyttNamn = new javax.swing.JTextField();
        telefonLabel = new javax.swing.JLabel();
        txtNyttTelenr = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        txtNyttLosenord = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxNyttOmrade = new javax.swing.JComboBox<>();
        lblMIB = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxIDNummer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIDNummerActionPerformed(evt);
            }
        });
        getContentPane().add(boxIDNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 171, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Välj agent att hantera");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 120, 20));

        namnLabel.setForeground(new java.awt.Color(255, 255, 255));
        namnLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        namnLabel.setText("Namn");
        getContentPane().add(namnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 120, 20));
        getContentPane().add(txtNyttNamn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 171, -1));

        telefonLabel.setForeground(new java.awt.Color(255, 255, 255));
        telefonLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        telefonLabel.setText("Telefonnummer");
        getContentPane().add(telefonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 120, 20));
        getContentPane().add(txtNyttTelenr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 171, -1));

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        passwordLabel.setText("Lösenord");
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 120, 20));
        getContentPane().add(txtNyttLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 171, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Ansvarig för område");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, 20));

        getContentPane().add(boxNyttOmrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 171, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("Hantera agent");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

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

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 110, 30));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
        goBack.setToolTipText("");
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                goBackMouseReleased(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boxIDNummerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIDNummerActionPerformed
        // Denna kod hämtar data från databasen från det agent-ID man har valt, med SQL-frågor
        try{
            int index = boxIDNummer.getSelectedIndex();
            String idNr = agenterna.get(index).get("Agent_ID");
            String namn = idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID =" + idNr);
            String telefon = idb.fetchSingle("SELECT Telefon FROM Agent WHERE Agent_ID=" + idNr);
            String losenord = idb.fetchSingle("SELECT Losenord FROM Agent WHERE Agent_ID=" + idNr);
            int ansvarOmrade = Integer.parseInt(idb.fetchSingle("SELECT Omrade FROM Agent WHERE Agent_ID=" + idNr));
            String ansvararForOmrade = idb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID=" + ansvarOmrade);
            boxNyttOmrade.setSelectedItem(ansvararForOmrade);
            
            //Kod som fyller fälten i gränssnittet med den data som precis hämtats från databsen
            txtNyttNamn.setText(namn);
            txtNyttTelenr.setText(telefon);
            txtNyttLosenord.setText(losenord);
            
        }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Hoppsan! Det gick tyvärr inte att registrera den nya informationen. \n"
                        + "Vänligen försök igen");
            }
        
   
    }//GEN-LAST:event_boxIDNummerActionPerformed

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased
        int index = boxIDNummer.getSelectedIndex();
        int valdAgent = Integer.parseInt(agenterna.get(index).get("Agent_ID"));

        //Första if-satsen består av ett externt metodanrop till valideringsklassen för att validera inmatningen för lösenord, namn och telefonnummer
        if(Validering.txtFieldBegransad6(txtNyttLosenord, passwordLabel.getText()) && Validering.txtFieldBegransad30(txtNyttTelenr, telefonLabel.getText()) && Validering.txtFieldBegransad20(txtNyttNamn, namnLabel.getText())){

        
            //Om valideringen går igenom så hämtas all inmatning från fälten i gränssnittet
            try{
            String namn = txtNyttNamn.getText();
            String telefon = txtNyttTelenr.getText();
            String losenord = txtNyttLosenord.getText();
            String valtOmrade = (String)boxNyttOmrade.getSelectedItem();  
            
            //Nedanstående rad hämtar områdes-ID:t för det namn på området som valts
            String omradesIDFraga = "SELECT Omrades_ID FROM Omrade WHERE Benamning ='" + valtOmrade + "'";
            String hamtaOmradesID = idb.fetchSingle(omradesIDFraga);
            int intOmradesID = Integer.parseInt(hamtaOmradesID);
            
            //Denna kod ser till att användaren måste godkänna att ändringarna går igenom, via en pop-up-ruta
            int svara = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill genomföra dessa ändringar?", "Obs!", JOptionPane.YES_NO_OPTION);
                
                // Vid godkännande av ändringarna uppdateras databasen med alla förändringar
                if(svara == JOptionPane.YES_OPTION){            
                    idb.update("UPDATE Agent SET Namn='" + namn + "'WHERE Agent_ID=" + valdAgent + "");
                    idb.update("UPDATE Agent SET Telefon='" + telefon + "'WHERE Agent_ID=" + valdAgent + "");
                    idb.update("UPDATE Agent SET Losenord='" + losenord + "'WHERE Agent_ID=" + valdAgent + "");
                    idb.update("UPDATE Agent SET Omrade='" + intOmradesID + "'WHERE Agent_ID=" + valdAgent + "");
                    
                    //Pop-up-ruta för att bekräfta att allt har gått som det ska
                    JOptionPane.showMessageDialog(null, "Ändringarna har nu genomförts");
                                                    }
            
            }
                catch(InfException e){
                        JOptionPane.showMessageDialog(null, "Oj! Något gick fel");
                        System.out.println(e);
                                     }
        }
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        new AdminHanteraAgent(idb, id).setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxIDNummer;
    private javax.swing.JComboBox<String> boxNyttOmrade;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JLabel namnLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JTextField txtNyttLosenord;
    private javax.swing.JTextField txtNyttNamn;
    private javax.swing.JTextField txtNyttTelenr;
    // End of variables declaration//GEN-END:variables
}
