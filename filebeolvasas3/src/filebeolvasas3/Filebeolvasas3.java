/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas3;
import java.io.*;
import java.io.RandomAccessFile;
/**
 *
 * @author diak
 */
public class Filebeolvasas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RandomAccessFile raf;
        String sor;
        String[] nevek2 = new String[5];
        
        try
        {
            raf = new RandomAccessFile("nevek2.txt","r");
            
            raf.readLine();
            int db = 0;                 //számlálót indítok
            sor = raf.readLine();       // első sort beolvasom
            while(sor != null)          //addig fusson amig a sor nem null (amig van benne valami)
            {
                nevek2[db] = sor;        //a neveket tartalmazó tömbbe teszi a kiolvasott
                db++;                   //számláló növelése (a while NEM növeli)
                sor = raf.readLine();   //beolvasom a következő sort
            }
            
            raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        for (int i = 0; i < nevek2.length; i++) {
            System.out.println(nevek2[i]);
            
           
        }
    }
    
}
