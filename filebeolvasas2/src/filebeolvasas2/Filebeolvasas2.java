/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas2;
import java.io.*;
import java.io.RandomAccessFile;

/**
 *
 * @author diak
 */
public class Filebeolvasas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandomAccessFile raf;
        String sor;
        int[] nevek = new int[4];
        
        try
        {
            raf = new RandomAccessFile("szamok.txt","r");
            
            int db = 0;                 //számlálót indítok
            sor = raf.readLine();       // első sort beolvasom
            while(sor != null)          //addig fusson amig a sor nem null (amig van benne valami)
            {
                nevek[db] = Integer.parseInt(sor);        //a neveket tartalmazó tömbbe teszi a kiolvasott
                db++;                   //számláló növelése (a while NEM növeli)
                sor = raf.readLine();   //beolvasom a következő sort
            }
            
            raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        for (int i = 0; i < nevek.length; i++) {
            System.out.println(nevek[i]);
            
           
        }
        
    }
    
}
