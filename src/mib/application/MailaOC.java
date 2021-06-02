/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib.application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author anton
 */
public class MailaOC {
    
    private static InfDB idb;
    
    
    public MailaOC(InfDB idb){    
        this.idb = idb;        
    }
    
    public static void mailProgram(InfDB idb, String id){
       
        try{
            String omradesChef = idb.fetchSingle("SELECT Agent.Namn FROM Agent JOIN Omradeschef ON Omradeschef.Agent_ID = Agent.Agent_ID JOIN Alien ON Plats = Omradeschef.Omrade WHERE Alien_ID=" + id);
            String chefEmail = omradesChef.replaceAll("\\s+", "") + "@MIBScandi.se";
                        
            //Öppnar datorns standard-mailprogram
            Desktop.getDesktop().mail(new URI("mailto:"+chefEmail));
        }
        catch(IOException e){}
        catch(URISyntaxException e){}
        catch(InfException e){}
        
    }
}
