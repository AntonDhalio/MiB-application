/*
 * En klass för validering av fälten vid inloggning
 */
package mib.application;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mariaforsberg
 */
public class ValideringInloggning {
    
    private static InfDB idb;
    
    public ValideringInloggning()
    {
        this.idb = idb;
    }
    
 
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
    
    public static boolean korrektLosenord(JTextField idNummerRuta, JPasswordField losenordRuta)
    {
        boolean resultat = false;
        
        try {
        String idNummer = idNummerRuta.getText();
        String hamtaLosenord = "SELECT Losenord FROM Agent WHERE Agent_ID =" + idNummer;
        String losenordFraga = idb.fetchSingle(hamtaLosenord);
        String losenord=String.valueOf(losenordRuta.getPassword());

       
        if(losenord.equals(losenordFraga)) {
            resultat = true;
                                           }
        
            else {
            JOptionPane.showMessageDialog(null, "Felaktigt lösenord eller ID-nummer. Vänligen försök igen");
                   
                 }
            }
        
        catch(Exception e) {}
    
        return resultat;
    }
    
    public static boolean isAdmin(JTextField idNummerRuta)
    {
        boolean resultat = false;
            String idNummer = idNummerRuta.getText();
            String hamtaAdminStatus = "SELECT Administrator FROM Agent WHERE Agent_ID =" + idNummer;
        
            try{
                String adminStatusFraga = idb.fetchSingle(hamtaAdminStatus);
                String adminStatus = String.valueOf(adminStatusFraga);
               
            
                if(adminStatus.equals("J")){
                    resultat = true;
                }
            }
                catch(Exception e) {}
        
                    return resultat;
    }
    
}
