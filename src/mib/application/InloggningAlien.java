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
        pswrdLosenord = new javax.swing.JPasswordField();
        lblLosenord = new javax.swing.JLabel();
        lblIDNummer = new javax.swing.JLabel();
        txtIDNummer = new javax.swing.JTextField();
        btnLoggaIn = new javax.swing.JButton();
        btbTillbaka = new javax.swing.JButton();
        lblMIB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 421));
        setMinimumSize(new java.awt.Dimension(748, 421));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pswrdLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        getContentPane().add(pswrdLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 202, 30));

        lblLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblLosenord.setForeground(new java.awt.Color(255, 255, 255));
        lblLosenord.setText("Lösenord");
        getContentPane().add(lblLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        lblIDNummer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        lblIDNummer.setForeground(new java.awt.Color(255, 255, 255));
        lblIDNummer.setText("ID-nummer");
        getContentPane().add(lblIDNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        txtIDNummer.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        getContentPane().add(txtIDNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 202, 30));

        btnLoggaIn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoggaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 200, 30));

        btbTillbaka.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btbTillbaka.setText("< Tillbaka");
        btbTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbTillbakaActionPerformed(evt);
            }
        });
        getContentPane().add(btbTillbaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblMIB.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("MEN IN BLACK");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 30, 750, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SKANDINAVIEN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 740, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        if(Validering.txtFieldHarVarde(txtIDNummer)){
            
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblIDNummer;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPasswordField pswrdLosenord;
    private javax.swing.JTextField txtIDNummer;
    // End of variables declaration//GEN-END:variables
}
