/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas_2_uj;
import java.io.*;
import java.io.RandomAccessFile;

/**
 *
 * @author diak
 */
public class Filebeolvasas_2_uj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RandomAccessFile raf;
        String sor;
        int[] szamok1 = new int[6];
        
        try{
            raf = new RandomAccessFile("szamok2.txt","r");
            
            int db = 0;                 
            sor = raf.readLine();       
            while(sor != null)          
            {
                szamok1[db] = Integer.parseInt(sor);        
                db++;                   
                sor = raf.readLine();
            }
            raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        
        
        for (int i = 0; i < szamok1.length; i++) {
            System.out.println(szamok1[i]);
        }
        
    }
    
}
