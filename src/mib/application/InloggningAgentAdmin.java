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

        lblIDNummer = new javax.swing.JLabel();
        txtIDNummer = new javax.swing.JTextField();
        lblLosenord = new javax.swing.JLabel();
        pswrdLosenord = new javax.swing.JPasswordField();
        btnLoggaIn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 421));
        setMinimumSize(new java.awt.Dimension(748, 421));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIDNummer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIDNummer.setForeground(new java.awt.Color(255, 255, 255));
        lblIDNummer.setText("ID-nummer");
        getContentPane().add(lblIDNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        txtIDNummer.setPreferredSize(new java.awt.Dimension(7, 21));
        getContentPane().add(txtIDNummer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 202, 30));

        lblLosenord.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLosenord.setForeground(new java.awt.Color(255, 255, 255));
        lblLosenord.setText("Lösenord");
        getContentPane().add(lblLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        pswrdLosenord.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        getContentPane().add(pswrdLosenord, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 202, 30));

        btnLoggaIn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 13)); // NOI18N
        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoggaIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 200, 30));
        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 168, -1, -1));

        goBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/GoBack.png"))); // NOI18N
        goBack.setToolTipText("");
        goBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });
        getContentPane().add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Agent");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 40, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Den här metoden anropas när knappen "Logga in" trycks på, i formuläret
     * Metoden kontrollerar att det inmatade ID:t och lösenordet matchar med
     * lösenordet för angivet ID i databasen
     */
    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed

        


        this.id = txtIDNummer.getText();
        
        
        try{
        String losenordFraga = "SELECT Losenord FROM Agent WHERE Agent_ID =" + id;
        String hamtaLosenord = idb.fetchSingle(losenordFraga);
        String losenord=String.valueOf(pswrdLosenord.getPassword());

        String hamtaAdmin = "SELECT Administrator FROM agent WHERE Agent_ID =" + id;
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
                agentMeny = new AgentMeny(idb, id);
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


    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        valjInloggning = new ValjInloggning(idb);
        valjInloggning.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseClicked

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
    private javax.swing.JLabel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblIDNummer;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPasswordField pswrdLosenord;
    private javax.swing.JTextField txtIDNummer;
    // End of variables declaration//GEN-END:variables
        }
