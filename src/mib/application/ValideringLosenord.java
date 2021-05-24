/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
/**
 *
 * @author anton
 */
public class ValideringLosenord {
    
    public static boolean losenordFaltHarVarde(JPasswordField aktuelltFalt){
      
       boolean resultat = true;
       
       
       if(aktuelltFalt.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "Fältet får ej lämnas tomt. Vänligen skriv in ditt lösenord.");
             resultat = false;
       }
       return resultat;
       
    }
}
