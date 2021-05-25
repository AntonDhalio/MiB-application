/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.io.*;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author anton
 */
public class UtskriftFile {
    
    private static InfDB idb;
    
    public UtskriftFile(InfDB idb){
    this.idb = idb;
    }
    
    
    public static void skapaRapport(){
    
    try{       
        String antalAgenter = idb.fetchSingle("SELECT COUNT(*) FROM agent");
        String antalAdmins = idb.fetchSingle("SELECT COUNT(*) FROM agent Where Administrator='J'");
        String antalFaltAgent = idb.fetchSingle("SELECT COUNT(*) FROM faltagent");
        String antalAliens = idb.fetchSingle("SELECT COUNT(*) FROM alien");
        String antalBogs = idb.fetchSingle("SELECT COUNT(*) FROM boglodite");
        String antalSquids = idb.fetchSingle("SELECT COUNT(*) FROM squid");
        String antalWorms = idb.fetchSingle("SELECT COUNT(*) FROM worm");
        String mangdUtrustning = idb.fetchSingle("SELECT COUNT(*) FROM utrustning");
        String antalFordon = idb.fetchSingle("SELECT COUNT(*) FROM fordon");
        String mangdTeknik = idb.fetchSingle("SELECT COUNT(*) FROM teknik");
        String mangdVapen = idb.fetchSingle("SELECT COUNT(*) FROM vapen");
        String mangdKomm = idb.fetchSingle("SELECT COUNT(*) FROM kommunikation");
        String utkvittUtr = idb.fetchSingle("SELECT COUNT(*) FROM innehar_utrustning");
        String utkvittFordon = idb.fetchSingle("SELECT COUNT(*) FROM innehar_fordon");
        String antalOmraden = idb.fetchSingle("SELECT COUNT(*) FROM omrade");
        String antalPlatser = idb.fetchSingle("SELECT COUNT(*) FROM plats");
        
        
        File file = new File("Rapport.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        
        writer.write("AGENT\n");
        writer.write("Totalt antal agenter: " + antalAgenter + "\n");
        writer.write("Antal administratörer: " + antalAdmins + "\n");
        writer.write("Antal fältagenter: " + antalFaltAgent + "\n");
        writer.write("\n");
        writer.write("UTOMJORDING\n");
        writer.write("Totalt antal utomjordingar: " + antalAliens + "\n");
        writer.write("Antal Boglodites: " + antalBogs + "\n");
        writer.write("Antal Squids: " + antalSquids + "\n");
        writer.write("Antal Worms: " + antalWorms + "\n");
        writer.write("\n");
        writer.write("UTRUSTNING OCH FORDON\n");
        writer.write("Total mängd registrerad utrustning: " + mangdUtrustning + "\n");
        writer.write("Totalt antal registrerade fordon: " + antalFordon + "\n");
        writer.write("Utrustning av klass teknik: " + mangdTeknik + "\n");
        writer.write("Utrustning av klass vapen: " + mangdVapen + "\n");
        writer.write("Utrustning av klass kommunikation: " + mangdKomm + "\n");
        writer.write("Utkvitterad utrustning: " + utkvittUtr + "\n");
        writer.write("Utkvitterade fordon: " + utkvittFordon + "\n");
        writer.write("\n");
        writer.write("OMRÅDEN OCH PLATSER\n");
        writer.write("Totalt antal registrerade områden: " + antalOmraden  + "\n");
        writer.write("Totalt antal platser inom registrerade områden: " + antalPlatser + "\n");
        writer.close();
        JOptionPane.showMessageDialog(null, "Du har skapat en rapport!");
        
        
        
    }
    catch(IOException e){
        JOptionPane.showMessageDialog(null, "Något gick fel");
    }
    catch(InfException e){
        JOptionPane.showMessageDialog(null, "Något gick fel med databasen");
    }
}
}
    

