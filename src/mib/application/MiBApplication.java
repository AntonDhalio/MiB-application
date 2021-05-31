/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;


import oru.inf.InfDB;
import oru.inf.InfException;

public class MiBApplication {

    private static InfDB idb;
    
    public static void main(String[] args) throws InfException {
        
        
        
        try{
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            
            //Denna kod ser till att inloggningsfönstret öppnas direkt vid körning
            new ValjInloggning(idb).setVisible(true);
        }
        catch(InfException ex){
            ex.getMessage();
        }
        
        
        
    }
    
    
}
