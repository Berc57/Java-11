/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2023_02_28.matrix;

/**
 *
 * @author diak
 */
public class Matrix {
    public static void matrix(int[][] szamok){
        int randomSzam;
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                szamok[i][j] = randomSzam = (int) (Math.random() * 5) + 65;
                System.out.print(szamok[i][j] +  ", ");
            }
            System.out.println();
        }
    }
     public static void matrix2(int[][] szamok2){
        int randomSzam;
        
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                szamok2[i][j] = randomSzam = (int) (Math.random() * 5) + 65;
                System.out.print(szamok2[i][j] + ", ");
            }
            System.out.println();
            
        }
    }
    public static void max(int[][] szamok){
        int max;
        int sorszam = 0;
        for (int i = 0; i < szamok.length; i++){
            max = 0;
            sorszam = sorszam + 1;
            for (int j = 0; j < szamok[0].length; j++){
                if (szamok[i][j] > max){
                    max = szamok[i][j];
                }
                
            }
            System.out.println("Az " + sorszam + ". sor legnagyobb száma: " + max);
        }
    }
    public static void minoszlop(int[][] szamok){
        int sorszam = 0;
        int min;
        for (int j = 0; j < szamok[0].length; j++){
            min = 69;
            for (int i = 0; i < szamok.length; i++){
                if (szamok[i][j] < min){
                    min = szamok[i][j];
                    sorszam = sorszam + 1;
                }
                
            }
            System.out.println("Az " + sorszam + ". sor legnagyobb száma: " + min);
        }
    }
    public static void osszead(int[][] szamok, int[][] szamok2){
        for (int i = 0; i < szamok.length; i++){
            for (int j = 0; j < szamok[0].length; j++){
                szamok2[i][j] = szamok[i][j] + szamok2[i][j];
                System.out.print(szamok2[i][j] + ", ");
            }
            System.out.println();
        }
    }
    public static float hanyados(int[][] szamok, int[][] szamok2){
        for (int i = 0; i < szamok.length; i++){
            for (int j = 0; j < szamok[0].length; j++){
                float szamok4 = (float)szamok[i][j] / (float)szamok2[i][j];
                System.out.print(szamok4 + ", ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int[] stat(int[][] szamok){
        int[] stat = new int[256];
        for (int i = 0; i < szamok.length; i++){
            for (int j = 0; j < szamok[i].length; j++){
                int item = szamok[i][j];
                stat[item]++;
            }
        }
        return stat;
    }
    
    public static void main(String[] args) {
        int[][] szamok = new int[5][5];
        System.out.println("Mátrix: ");
        matrix(szamok);
        System.out.println("Max: ");
        max(szamok);
        System.out.println("Min oszlopok: ");
        minoszlop(szamok);
        
        int[][] szamok2 = new int[5][5];
        System.out.println("Mátrix 2: ");
        matrix2(szamok2);
        System.out.println("Összeadva: ");
        osszead(szamok, szamok2);
        System.out.println("Hányadosai: ");
        hanyados(szamok, szamok2);
        stat(szamok);
    }   
}
