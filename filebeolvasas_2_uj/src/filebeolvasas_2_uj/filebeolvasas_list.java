/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas_2_uj;
import java.io.RandomAccessFile;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author diak
 */
public class filebeolvasas_list {
    public static void main(String[] args) {
        
        RandomAccessFile raf;
        String sor;
        ArrayList<Integer> szamok1 = new ArrayList<>();
        
        try{
            raf = new RandomAccessFile("szamok2.txt","r");
            
            int db = Integer.parseInt(raf.readLine());;                 
            sor = raf.readLine();
            
            for(int i = 0; i < db; i++){
                szamok1.add(Integer.parseInt(sor));                 
                sor = raf.readLine();
            }
            raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        
        
        for (int i = 0; i < szamok1.size(); i++) {
            System.out.println(szamok1.get(i));
        }
        
    }
}
