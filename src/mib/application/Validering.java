/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.*;


/**
 *
 * @author anton
 */
public class Validering {
   
    
    public static boolean txtFieldHarVarde(JTextField aktuellRuta)
    {
         boolean resultat = true;
        
         if(aktuellRuta.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Fältet får ej lämnas tomt. Vänligen skriv in ett ID-nummer.");
             resultat = false;
         }
        return resultat;
    }
    
    public static boolean losenordFaltHarVarde(JPasswordField aktuelltFalt){
      
       boolean resultat = true;
              
       if(String.valueOf(aktuelltFalt.getPassword()) != null){
            JOptionPane.showMessageDialog(null, "Fältet får ej lämnas tomt. Vänligen skriv in lösenord.");
            resultat = false;
       }
       return resultat;       
    }
    
     public static boolean txtFieldBegransad30(JTextField aktuellRuta){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 30){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får endast ha 30 tecken.");
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean txtFieldBegransad20(JTextField aktuellRuta){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får endast ha 20 tecken.");
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean txtFieldBegransad10(JTextField aktuellRuta){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 10){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får endast ha 10 tecken.");
            resultat = false;
        }
        return resultat;
    }
    public static boolean txtFieldBegransad6(JTextField aktuellRuta){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 6){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får endast ha 6 tecken.");
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean datumHarVarde(Date aktuelltDatum){
        boolean resultat = true;
        
        if(aktuelltDatum == null){
            JOptionPane.showMessageDialog(null, "Obs! Datum måste väljas.");
            resultat = false;
        }       
        return resultat;
    }
   
    
}
