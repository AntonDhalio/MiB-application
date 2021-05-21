/*
 * En klass för att kunna välja vad man ska logga in som
 */
package mib.application;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mariaforsberg
 */
public class ValjInloggning extends javax.swing.JFrame {
    
 
    private static InfDB idb;

    /**
     * Creates new form ValjInloggning
     */
    public ValjInloggning(InfDB idb) {
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

        lblMIB = new javax.swing.JLabel();
        btnLoggaInAgent = new javax.swing.JButton();
        btnLoggaInAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMIB.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        lblMIB.setText("MEN IN BLACK SKANDINAVIEN");

        btnLoggaInAgent.setText("Logga in som agent/administratör");
        btnLoggaInAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInAgentActionPerformed(evt);
            }
        });

        btnLoggaInAlien.setText("Logga in som alien");
        btnLoggaInAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblMIB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoggaInAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoggaInAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblMIB)
                .addGap(31, 31, 31)
                .addComponent(btnLoggaInAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLoggaInAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Öppnar inloggningsfönstret för agenter och administratörer
    private void btnLoggaInAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInAgentActionPerformed
        
    }//GEN-LAST:event_btnLoggaInAgentActionPerformed

    //Öppnar inloggningsfönstret för aliens
    private void btnLoggaInAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInAlienActionPerformed
        
    }//GEN-LAST:event_btnLoggaInAlienActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaInAgent;
    private javax.swing.JButton btnLoggaInAlien;
    private javax.swing.JLabel lblMIB;
    // End of variables declaration//GEN-END:variables
}
