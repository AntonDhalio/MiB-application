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

        jLabel1 = new javax.swing.JLabel();
        nuvarandeLosen = new javax.swing.JPasswordField();
        nyttLosen = new javax.swing.JPasswordField();
        bekraftaLosen = new javax.swing.JPasswordField();
        Godkann = new javax.swing.JButton();
        avbryt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Ändra lösenord");

        Godkann.setText("Godkänn");
        Godkann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GodkannActionPerformed(evt);
            }
        });

        avbryt.setText("Avbryt");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        jLabel2.setText("Nuvarande lösenord:");

        jLabel3.setText("Nytt lösenord:");

        jLabel4.setText("Bekräfta lösenord:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bekraftaLosen)
                            .addComponent(nyttLosen)
                            .addComponent(nuvarandeLosen)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Godkann)
                                .addGap(65, 65, 65)
                                .addComponent(avbryt)
                                .addGap(12, 12, 12)))))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyttLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bekraftaLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Godkann)
                    .addComponent(avbryt))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GodkannActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GodkannActionPerformed
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
    }//GEN-LAST:event_GodkannActionPerformed

    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
        agentMeny = new AgentMeny(idb, id);
        agentMeny.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_avbrytActionPerformed

    
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
    private javax.swing.JButton Godkann;
    private javax.swing.JButton avbryt;
    private javax.swing.JPasswordField bekraftaLosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField nuvarandeLosen;
    private javax.swing.JPasswordField nyttLosen;
    // End of variables declaration//GEN-END:variables
}