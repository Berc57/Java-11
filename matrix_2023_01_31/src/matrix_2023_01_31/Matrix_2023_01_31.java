/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_2023_01_31;
import java.util.ArrayList;
/**
 *
 * @author diak
 */
public class Matrix_2023_01_31 {
    public static void asd(){
        System.out.println("---------------------------------------------------");
    }
    public static void matrix(int[][] szamok){
        int randomSzam;
        int i;
        int j;
        
        //mátrix létrehozása
        for (i = 0; i < 4; i++){
            for (int ot = 0; ot < 5; ot++){
                szamok[i][ot] = randomSzam = (int) (Math.random() * 10) + 0;
                System.out.print(szamok[i][ot] +  " ");
            }
            System.out.println();
        }
    }
    public static void visszafele(int[][] szamok){
        for (int i = szamok.length-1; i >= 0; i--){
            for (int j = szamok[i].length-1; j >= 0; j--){
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int osszeg(int[][] szamok){
        int osszeg = 0;
        for (int i = 0; i < szamok.length; i++){
            for (int j = 0; j < szamok[i].length; j++){
                osszeg = osszeg + szamok[i][j];
            }
        }
        return osszeg;
    }
    
    public static boolean parose(int[][] szamok){
        int teljes = 10;
        int count1 = 0;
        for (int i = 0; i < szamok.length; i++){
            for (int j = 0; j < szamok[i].length; j++){
                if (szamok[i][j] % 2 == 0){
                    count1 = count1 + 1;
                }
            }
        }
        if (count1 > teljes){
            return true;
        }
        else {
            return false;
        }
    }
    public static void dupla(int[][] szamok){
        for (int i = 0; i < szamok.length; i++){
            for (int j = 0; j < szamok[0].length; j++){
                szamok[i][j] = szamok[i][j] * 2;
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] szamok = new int[4][5];
        matrix(szamok);
        
       //kiiratni visszafele
       System.out.println("A mátrix visszafele: ");
       visszafele(szamok);
       asd();
       
       //összege
        System.out.println("Összege: " + osszeg(szamok));
        asd();
        
        //több mint a fele páros e
        System.out.println("Páros több mint a fele?: " + parose(szamok));
        asd();
       
        //megduplázza a mátrixot
        System.out.println("Duplázva:");
        dupla(szamok);
        
        for (int i = 0; i < szamok.length; i++ ){
            for (int j = 0; j < szamok[i].length; j++){
                System.out.print(szamok[i][j] + " ");
            }
            System.out.println();
        
        }
    }
    
}
