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
import javax.swing.JComboBox;


/**
 *
 * @author anton
 */
public class Validering {
   
    
    public static boolean txtFieldHarVarde(JTextField aktuellRuta)
    //Kollar om ett textfält har ett värde och returnerar "true" om så är fallet
    {
         boolean resultat = true;
        
         if(aktuellRuta.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Fältet får ej lämnas tomt. Vänligen skriv in ett ID-nummer.");
             resultat = false;
         }
        return resultat;
    }
    
    public static boolean txtFieldArNummer(JTextField aktuellRuta)
    {
        boolean resultat = true;
        String id = aktuellRuta.getText();
        if(aktuellRuta.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Fältet får ej lämnas tomt. Vänligen skriv in ett ID-nummer.");
             resultat = false;
        }
        else{
            try{
                int i = Integer.parseInt(id.trim());          
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Fältet får inte ha bokstäver. Vänligen skriv in ett ID-nummer.");
                resultat = false;
                System.out.println("Fältet kunde inte konverteras till int");
            }
        }
        return resultat;
    }
    
    public static boolean losenordFaltHarVarde(JPasswordField aktuelltFalt){
    //Kollar om ett lösenordsfält har värde och returnerar isåfall "true"    
       boolean resultat = true;
              
       if(aktuelltFalt.getPassword().length == 0){
            JOptionPane.showMessageDialog(null, "Alla fält måste ha värden. Vänligen skriv in lösenord");
            resultat = false;
       }
       else if(aktuelltFalt.getPassword().length > 6){
            JOptionPane.showMessageDialog(null, "Lösenord får inte bestå av mer än 6 tecken");
            resultat = false;
       }
       return resultat;       
    }
    

     //Kollar om ett textfält har värde och max 30 tecken. Returnerar "true" om så är fallet 
     public static boolean txtFieldBegransad30(JTextField aktuellRuta, String meddelande){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 30){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får endast ha 30 tecken.");
            resultat = false;
        }
        return resultat;
    }
    

  //Kollar om ett textfält har värde och max 20 tecken. Returnerar "true" om så är fallet
    public static boolean txtFieldBegransad20(JTextField aktuellRuta, String meddelande){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får endast ha 20 tecken.");
            resultat = false;
        }
        return resultat;
    }
    

   //Kollar om ett textfält har värde och max 10 tecken. Returnerar "true" om så är fallet
    public static boolean txtFieldBegransad10(JTextField aktuellRuta, String meddelande){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 10){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får endast ha 10 tecken.");
            resultat = false;
        }
        return resultat;
    }

    //Kollar om ett textfält har värde och max 6 tecken. Returnerar "true" om så är fallet
    public static boolean txtFieldBegransad6(JTextField aktuellRuta, String meddelande){
        boolean resultat = true;
        
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 6){
            JOptionPane.showMessageDialog(null, "Obs! " + meddelande + " får endast ha 6 tecken.");
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean datumHarVarde(Date aktuelltDatum){
        //Kollar om ett datum har valts. Returnerar isåfall "true"
        
        boolean resultat = true;
        
        if(aktuelltDatum == null){
            JOptionPane.showMessageDialog(null, "Obs! Datum måste väljas.");
            resultat = false;
        }       
        return resultat;
    }
    
    public static boolean ValtEttAlternativ(JComboBox aktuellBox){
        //Kollar att ett alternativ har valts. Returnerar "true" isåfall.
        
        boolean resultat = true;
        
        if(aktuellBox.getSelectedIndex() <= 0){
            JOptionPane.showMessageDialog(null, "Vänligen välj typ av agent för att slutföra registreringen");
            resultat = false;
        }
        
        return resultat;
    }
    
    public static boolean txtFieldBegransad25(JTextField aktuellRuta){
        //Kollar om ett textfält har värde och max 25 tecken. Returnerar "true" om så är fallet 
        
        boolean resultat = true;
    
        if(aktuellRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får ej lämnas tomt.");
            resultat = false;
        }
        else if(aktuellRuta.getText().length() > 20){
            JOptionPane.showMessageDialog(null, "Obs! Fältet får endast ha 25 tecken.");
            resultat = false;
        }
        
        return resultat;
    }
   
    
}
