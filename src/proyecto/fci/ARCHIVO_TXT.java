/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.fci;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author EVOTEC
 */
public class ARCHIVO_TXT {
    
    
    public String leertxt(String direccion) {
        String TEXTO ="";
        try{
            FileReader fr=new FileReader(direccion);
        BufferedReader txt=new  BufferedReader(fr);
        String TEMP = "";
        String txtRead;
        while((txtRead=txt.readLine()) != null){
            
           TEMP=TEMP+txtRead; 
        }
       TEXTO=TEMP;
        
        }
        
        catch (Exception e){}
        
        
        return TEXTO ;
    }
    
    
 
}
