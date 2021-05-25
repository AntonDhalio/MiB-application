/*
 * Inloggningsfönster för aliens
 */
package mib.application;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mariaforsberg
 */
public class InloggningAlien extends javax.swing.JFrame {
    
    private ValjInloggning valjInloggning;
    private AlienStartsida alienStartsida;
    private InfDB idb;
    private static String id;

    /**
     * Skapar ett nytt inloggningsfönster för aliens, med uppkoppling till
     * databasen
     */
    public InloggningAlien(InfDB idb) {
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

        jProgressBar1 = new javax.swing.JProgressBar();
        lblLoggaInAlien = new javax.swing.JLabel();
        pswrdLosenord = new javax.swing.JPasswordField();
        lblLosenord = new javax.swing.JLabel();
        lblIDNummer = new javax.swing.JLabel();
        txtIDNummer = new javax.swing.JTextField();
        btnLoggaIn = new javax.swing.JButton();
        btbTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLoggaInAlien.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        lblLoggaInAlien.setText("LOGGA IN SOM ALIEN");

        pswrdLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N

        lblLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblLosenord.setText("Lösenord");

        lblIDNummer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblIDNummer.setText("ID-nummer");

        txtIDNummer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N

        btnLoggaIn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        btbTillbaka.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btbTillbaka.setText("< Tillbaka");
        btbTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoggaIn)
                            .addComponent(lblLoggaInAlien)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pswrdLosenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(txtIDNummer, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblIDNummer))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblLosenord))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btbTillbaka)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btbTillbaka)
                .addGap(27, 27, 27)
                .addComponent(lblLoggaInAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(lblIDNummer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDNummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLosenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswrdLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoggaIn)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //En metod för att kunna gå tillbaka till föregående sida
    private void btbTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbTillbakaActionPerformed
        valjInloggning = new ValjInloggning(idb);
        valjInloggning.setVisible(true);
        dispose();
    }//GEN-LAST:event_btbTillbakaActionPerformed

    /**
     * Den här metoden anropas när knappen "Logga in" trycks på, i formuläret
     * Metoden kontrollerar att det inmatade ID:t och lösenordet matchar med
     * lösenordet för angivet ID i databasen
     */
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed

        //Externt metodanrop för att kolla om textfältet har ett värde
        if(ValideringInloggning.txtFieldHarVarde(txtIDNummer)){
            
        try {
        String idNummer = txtIDNummer.getText();
        this.id = idNummer;
        String hamtaLosenord = "SELECT Losenord FROM Alien where Alien_ID =" + idNummer;
        String losenordFraga = idb.fetchSingle(hamtaLosenord);
        String losenord=String.valueOf(pswrdLosenord.getPassword());
        
        if(losenord.equals(losenordFraga)) {
            alienStartsida = new AlienStartsida(idb, id);
            alienStartsida.setVisible(true);
            dispose();
            System.out.println("Internt meddelande: Inloggningen lyckades!");
        } else {
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord eller ID-nummer. Vänligen försök igen");
            }
        } 
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Ett fel uppstod");
            }
      
       }
    }//GEN-LAST:event_btnLoggaInActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbTillbaka;
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblIDNummer;
    private javax.swing.JLabel lblLoggaInAlien;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JPasswordField pswrdLosenord;
    private javax.swing.JTextField txtIDNummer;
    // End of variables declaration//GEN-END:variables
}
