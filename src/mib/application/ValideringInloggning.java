/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author mariaforsberg
 */
public class ValideringInloggning {
    
 
     //En metod för att kolla om rutan för ID-nummer är tom eller inte
    
    public static boolean txtFieldHarVarde(JTextField aktuellRuta)
    {
         boolean resultat = true;
        
         if(aktuellRuta.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null, "Fältet får ej lämnas tomt. Vänligen skriv in ett ID-nummer.");
             resultat = false;
         }
        return resultat;
    }
    
}
