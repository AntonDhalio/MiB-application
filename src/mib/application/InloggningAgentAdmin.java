/*
 * Inloggningsfönstret för agenter och administratörer
 */
package mib.application;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mariaforsberg
 */
public class InloggningAgentAdmin extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private ValjInloggning valjInloggning;
    private AgentMeny agentMeny;
    private HuvudmenyAdmin huvudmenyAdmin;
    

    /**
     * Skapar nytt formulär av InloggningsFonster med uppkoppling till
     * databasen
     */
    public InloggningAgentAdmin(InfDB idb) {
        initComponents();
        this.idb = idb;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoggaIn = new javax.swing.JLabel();
        lblIDNummer = new javax.swing.JLabel();
        txtIDNummer = new javax.swing.JTextField();
        lblLosenord = new javax.swing.JLabel();
        pswrdLosenord = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLoggaIn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 20)); // NOI18N
        lblLoggaIn.setText("LOGGA IN SOM AGENT/ADMINISTRATÖR");

        lblIDNummer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblIDNummer.setText("ID-nummer");

        lblLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblLosenord.setText("Lösenord");

        pswrdLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N

        btnLoggaIn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        btnTillbaka.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblIDNummer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLoggaIn)
                            .addComponent(pswrdLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(txtIDNummer))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoggaIn, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnTillbaka)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLoggaIn)
                .addGap(30, 30, 30)
                .addComponent(lblIDNummer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLosenord)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswrdLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnLoggaIn)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Den här metoden anropas när knappen "Logga in" trycks på, i formuläret
     * Metoden kontrollerar att det inmatade ID:t och lösenordet matchar med
     * lösenordet för angivet ID i databasen
     */
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed

        


        String idNummer = txtIDNummer.getText();
        
        try{
        String losenordFraga = "SELECT Losenord FROM Agent WHERE Agent_ID =" + idNummer;
        String hamtaLosenord = idb.fetchSingle(losenordFraga);
        String losenord=String.valueOf(pswrdLosenord.getPassword());
        String adminStatusFraga = "SELECT Administrator FROM Agent WHERE Agent_ID =" + idNummer;
        String hamtaAdminStatus = idb.fetchSingle(adminStatusFraga);

        String hamtaAdmin = "SELECT Administrator FROM agent WHERE Agent_ID =" + idNummer;
        String admin = idb.fetchSingle(hamtaAdmin);

        if(losenord.equals(hamtaLosenord)) {
            System.out.println("Internt meddelande: Inloggningen lyckades!");

            //if-else sats för att se om det är en vanlig agent eller en admin
            //som loggar in
            if(admin.equals("J")){
                huvudmenyAdmin = new HuvudmenyAdmin(idb, id);
                huvudmenyAdmin.setVisible(true);
                dispose();
            }

            else{
                agentMeny = new AgentMeny(idb, idNummer);
                agentMeny.setVisible(true);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord eller ID-nummer. Vänligen försök igen");
            new InloggningAgentAdmin(idb).setVisible(true);
            }
        
        
        } catch(Exception e){}
       
        dispose();

    


    }//GEN-LAST:event_btnLoggaInActionPerformed


     //En metod för att kunna gå tillbaka till föregående sida
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        valjInloggning = new ValjInloggning(idb);
        valjInloggning.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    public static void main(String[] args)
    {
    /**
     * Den här metoden ska egentligen inte vara här
     * Låter den ligga kvar för att jag ska kunna köra denna klass direkt
     * vid testning av klassens funktioner
     */
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIDNummer;
    private javax.swing.JLabel lblLoggaIn;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JPasswordField pswrdLosenord;
    private javax.swing.JTextField txtIDNummer;
    // End of variables declaration//GEN-END:variables
        }
