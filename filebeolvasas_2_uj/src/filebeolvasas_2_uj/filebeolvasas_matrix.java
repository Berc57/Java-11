/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas_2_uj;
import java.io.RandomAccessFile;
import java.io.*;

/**
 *
 * @author diak
 */
public class filebeolvasas_matrix {
    public static void main(String[] args) {
        
        RandomAccessFile raf;
        String sor;
        int[][] szamok1 = new int[5][4];
        
        try{
            raf = new RandomAccessFile("adat3.txt","r");
            int i = 0;
            sor = raf.readLine();
            while (sor != null) {
                String[] asdasd = sor.split(" ");
                for(int j = 0; j < 4; j++){
                    szamok1[i][j] = Integer.parseInt(asdasd[j]);                  
                }
                i++;
                sor = raf.readLine();
            }
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        
        
        for (int i = 0; i < szamok1.length; i++) {
            for (int j = 0; j < szamok1[i].length; j++){
                System.out.print(szamok1[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
}
