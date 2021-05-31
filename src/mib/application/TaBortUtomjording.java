/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mathildabernebyhaeffner
 */
public class TaBortUtomjording extends javax.swing.JFrame {

    private static InfDB idb;
    private static String id;
    private HanteraUtomjordingAdmin hanteraUtAdmin;

    /**
     * Creates new form TaBortUtomjording
     */
    public TaBortUtomjording(InfDB idb, String id) {
        initComponents();
        this.idb = idb;
        this.id = id;

        try {
            //Hämtar alla alien-ID:n från databasen och sorterar i stigande ordning
            ArrayList<String> utomjording = idb.fetchColumn("SELECT Alien_ID FROM alien ORDER BY Alien_ID ASC");
            
            //En for each loop för att lista alla id-nummer i en drop-down-meny
            for (String nuvarandeUtomjording : utomjording) {
                cmbID.addItem(nuvarandeUtomjording);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
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

        cmbID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        goBack = new javax.swing.JLabel();
        lblMIB = new javax.swing.JLabel();
        taBortKnapp = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(cmbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 230, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 20, -1));

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
        lblMIB.setText("Ta bort utomjording");
        lblMIB.setToolTipText("");
        getContentPane().add(lblMIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, -1));

        taBortKnapp.setBackground(new java.awt.Color(0, 0, 0));
        taBortKnapp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 255), 2, true));
        taBortKnapp.setForeground(new java.awt.Color(102, 153, 255));
        taBortKnapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        taBortKnapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                taBortKnappMouseReleased(evt);
            }
        });
        taBortKnapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/accept.png"))); // NOI18N
        taBortKnapp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Ta bort");
        taBortKnapp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(taBortKnapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 245, 110, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design/spaceBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void taBortKnappMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taBortKnappMouseReleased
        String valdUtomjording = cmbID.getSelectedItem().toString();

        try {
            //Hämtar ut kolumnen "utrustning-ID" från alla tabeller i databasen där utrustnings-ID:t förekommer
            ArrayList<String> boglodite = idb.fetchColumn("SELECT Alien_ID FROM Boglodite");
            ArrayList<String> squid = idb.fetchColumn("SELECT Alien_ID FROM Squid");
            ArrayList<String> worm = idb.fetchColumn("SELECT Alien_ID FROM Worm");

            String namn = idb.fetchSingle("SELECT Namn FROM Alien WHERE Alien_ID=" + valdUtomjording);
            
            //Kod som framkallar en varningsruta när användaren försöker ta bort en alien
            int reply = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort Alien '" + namn, "Varning!", JOptionPane.YES_NO_OPTION);
            
             /*Om användaren bekräftar borttagningen, ser nedanstående kod till att vald alien 
            försvinner ur alien tabellen och att dens ras/raser även försvinner genom for each loopar, 
            med if-satser vars syfte är att jämföra valt alien-ID med alien-ID:n i databastabellerna. Borttagning sker vid hittad matchning 
            */
            if (reply == JOptionPane.YES_OPTION) {
                idb.delete("DELETE FROM Alien WHERE Alien_ID =" + valdUtomjording);
           
            for (String i : boglodite) {
                if (i.equals(valdUtomjording)) {
                    idb.delete("DELETE FROM Boglodite WHERE Alien_ID=" + valdUtomjording);
                }
            }
            for (String j : squid) {
                if (j.equals(valdUtomjording)) {
                    idb.delete("DELETE FROM Squid WHERE Alien_ID=" + valdUtomjording);
                }
            }
            for (String k : worm) {
                if (k.equals(valdUtomjording)) {
                    idb.delete("DELETE FROM Worm WHERE Alien_ID=" + valdUtomjording);
                }
            }
                JOptionPane.showMessageDialog(null, "Alien '" + namn + "' borttagen!");
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_taBortKnappMouseReleased

    private void goBackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseReleased
        /*
        Kollar adminstatus för den inloggade agenten, för att veta vilken huvudmeny användaren 
        ska skickas tillbaka till vid anvädning av "tillbaka"-knappen
        */
        
        try {
            String arAdmin = idb.fetchSingle("SELECT Administrator FROM agent WHERE Agent_ID=" + id);

            if(arAdmin.equals("N")){
                new HanteraUtomjording(idb, id).setVisible(true);
                dispose();
            }
            else if(arAdmin.equals("J")){
                new HanteraUtomjordingAdmin(idb, id).setVisible(true);
                dispose();
            }
        }
        catch (InfException ex) {
            System.out.println("Något gick fel");
        }
    }//GEN-LAST:event_goBackMouseReleased
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbID;
    private javax.swing.JLabel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblMIB;
    private javax.swing.JPanel taBortKnapp;
    // End of variables declaration//GEN-END:variables
 }