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
    
    private InloggningAgentAdmin loggaIn;
    private InloggningAlien loggaInAlien;
    private InfDB idb;

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
        jLabel2 = new javax.swing.JLabel();
        valjAgent = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valjAlien = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(748, 421));
        setMinimumSize(new java.awt.Dimension(748, 421));
        setPreferredSize(new java.awt.Dimension(760, 458));
        setSize(new java.awt.Dimension(748, 421));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMIB.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        lblMIB.setForeground(new java.awt.Color(255, 255, 255));
        lblMIB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMIB.setText("MEN IN BLACK");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 740, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SKANDINAVIEN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 740, -1));

        valjAgent.setBackground(new java.awt.Color(0, 0, 0));
        valjAgent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        valjAgent.setForeground(new java.awt.Color(102, 153, 255));
        valjAgent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valjAgent.setMinimumSize(new java.awt.Dimension(222, 80));
        valjAgent.setPreferredSize(new java.awt.Dimension(222, 80));
        valjAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                valjAgentMouseReleased(evt);
            }
        });
        valjAgent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/MiB Man.png"))); // NOI18N
        valjAgent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 80, 80));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Logga in som agent");
        valjAgent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 0, 220, 80));

        getContentPane().add(valjAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 280, 260, 80));

        valjAlien.setBackground(new java.awt.Color(0, 0, 0));
        valjAlien.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        valjAlien.setForeground(new java.awt.Color(102, 153, 255));
        valjAlien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valjAlien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                valjAlienMouseReleased(evt);
            }
        });
        valjAlien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/alien-logo2.png"))); // NOI18N
        valjAlien.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Logga in som alien");
        valjAlien.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 0, 210, 80));

        getContentPane().add(valjAlien, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 260, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 748, 421));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valjAgentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valjAgentMouseReleased
        loggaIn = new InloggningAgentAdmin(idb);
        loggaIn.setVisible(true);
        dispose();
    }//GEN-LAST:event_valjAgentMouseReleased

    private void valjAlienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valjAlienMouseReleased
        loggaInAlien = new InloggningAlien(idb);
        loggaInAlien.setVisible(true);
        dispose();
    }//GEN-LAST:event_valjAlienMouseReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel valjAgent;
    private javax.swing.JPanel valjAlien;
    // End of variables declaration//GEN-END:variables
}
