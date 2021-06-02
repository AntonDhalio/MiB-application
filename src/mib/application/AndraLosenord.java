/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author anton
 */
public class AndraLosenord extends javax.swing.JFrame {
    
    private static InfDB idb;
    private static String id;
    private AgentMeny agentMeny;

    /**
     * Creates new form AndraLosenord
     */
    public AndraLosenord(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuvarandeLosen = new javax.swing.JPasswordField();
        nyttLosen = new javax.swing.JPasswordField();
        bekraftaLosen = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        avbrytKnapp = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        godkännKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(nuvarandeLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 270, 30));
        getContentPane().add(nyttLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 270, 30));
        getContentPane().add(bekraftaLosen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 270, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuvarande lösenord:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nytt lösenord:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bekräfta lösenord:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

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
        lblMIB.setText("Byt lösenord");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        avbrytKnapp.setBackground(new java.awt.Color(0, 0, 0));
        avbrytKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        avbrytKnapp.setForeground(new java.awt.Color(102, 153, 255));
        avbrytKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        avbrytKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                avbrytKnappMouseReleased(evt);
            }
        });
        avbrytKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/cancel.png"))); // NOI18N
        avbrytKnapp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Avbryt");
        avbrytKnapp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 30));

        getContentPane().add(avbrytKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 110, 30));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Godkänn");
        godkännKnapp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(godkännKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void godkännKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_godkännKnappMouseReleased
        if(Validering.losenordFaltHarVarde(nuvarandeLosen) && Validering.losenordFaltHarVarde(nyttLosen) && Validering.losenordFaltHarVarde(bekraftaLosen)){
        try{
        
        String gamalLosen = "SELECT Losenord FROM Agent WHERE Agent_ID=" + id;
        String hamtaGamalLosen = idb.fetchSingle(gamalLosen);
        String inputGamalLosen = String.valueOf(nuvarandeLosen.getPassword());
        String nyttLosenord = String.valueOf(nyttLosen.getPassword());
        String bekraftaLosenord = String.valueOf(bekraftaLosen.getPassword());
        
        
        if(hamtaGamalLosen.equals(inputGamalLosen) && bekraftaLosenord.equals(nyttLosenord)){
           int reply = JOptionPane.showConfirmDialog(null,"Är du säker på att du vill ändra lösenordet?","Varning!",JOptionPane.YES_NO_OPTION);
           
           if (reply == JOptionPane.YES_OPTION){
               idb.update("UPDATE agent SET Losenord='" + nyttLosenord +"' where Agent_ID=" + id);
               JOptionPane.showMessageDialog(null, "Ditt lösenord har ändrats!");
           }
        }
        else{
        JOptionPane.showMessageDialog(null, "Lösenorden matchar inte");}
        }
        
        catch(Exception e) {
        
            JOptionPane.showMessageDialog(null, "Ett fel uppstod");
        }
        }
    }//GEN-LAST:event_godkännKnappMouseReleased

    private void avbrytKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avbrytKnappMouseReleased
        bekraftaLosen.setText("");
        nuvarandeLosen.setText("");
        nyttLosen.setText("");
    }//GEN-LAST:event_avbrytKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        try {
            String arAdmin = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + id);

            if(arAdmin.equals("N")){
                agentMeny = new AgentMeny(idb, id);
                agentMeny.setVisible(true);
                dispose();
            }
            else if(arAdmin.equals("J")){
                new HuvudmenyAdmin(idb, id).setVisible(true);
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
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraLosenord(idb, id).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avbrytKnapp;
    private javax.swing.JPasswordField bekraftaLosen;
    private javax.swing.JLabel goBack;
    private javax.swing.JPanel godkännKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPasswordField nuvarandeLosen;
    private javax.swing.JPasswordField nyttLosen;
    // End of variables declaration//GEN-END:variables
}
