/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beolvasasrandomizalas;

import java.util.Scanner;

/**
 *
 * @author diak
 */
public class BeolvasasRandomizalas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner bill = new Scanner(System.in);
        
        //adat beolvasás billentyűzetről - egész szám
        System.out.print("Adj meg egy egész számot: ");
        int szam1;
        szam1 = bill.nextInt();
        System.out.println("A beolvasott érték: " + szam1);
        
        System.out.print("Adj meg egy valós számot: ");
        float szam2;
        szam2 = bill.nextFloat();
        System.out.println("A beolvasott egész szám értéke: " + szam2);
        
        System.out.print("Adj meg egy szöveget: ");
        String szoveg1;
        szoveg1 = bill.next();
        System.out.println("A beolvasott string: " + szoveg1);
        
        //randomizált szám generálás
        //Math.random=( * intervallum_méret) + alsó;
        int randomSzam = (int) (Math.random() * 21) + 10; //10-30 közötti szám
        System.out.println(randomSzam);
        randomSzam = (int) (Math.random() * 71) - 55; // -55-15 között
        System.out.println(randomSzam);
        randomSzam = (int) (Math.random() * 46) - 40; // -40-5 között
        System.out.println(randomSzam);
        randomSzam = (int) (Math.random() * 46) + 60; //60-105 közötti szám
        System.out.println(randomSzam);
        randomSzam = (int) (Math.random() * 26) -45; //-45-(-20) közötti szám
        System.out.println(randomSzam);
        
    }
    
}
