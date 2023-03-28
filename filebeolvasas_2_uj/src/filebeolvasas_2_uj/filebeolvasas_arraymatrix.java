/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas_2_uj;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author diak
 */
public class filebeolvasas_arraymatrix {
    public static void main(String[] args) {
        
        RandomAccessFile raf;
        String sor;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        
        try{
            raf = new RandomAccessFile("adat3.txt","r");
            
            int db = Integer.parseInt(raf.readLine());;                 
            sor = raf.readLine();
            
            for(int i = 0; i < db; i++){
                matrix.add(Integer.parseInt(sor));                 
                sor = raf.readLine();
            }
            raf.close();
        }
        catch(IOException e)
        {
            System.err.println("HIBA");
        }
        
        
        for (int i = 0; i < matrix.size(); i++) {
            System.out.println(matrix.get(i));
        }
        
    }
}
