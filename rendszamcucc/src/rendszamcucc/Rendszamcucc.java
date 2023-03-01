/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendszamcucc;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Rendszamcucc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Add meg a rendszámot: ");
        String szam = bill.nextLine();
        
        while (!((int) szam.charAt(0) >= 65 && (int) szam.charAt(0) <= 90 
         && (int) szam.charAt(1) >= 65 && (int) szam.charAt(1) <= 90 
         && (int) szam.charAt(2) >= 65 && (int) szam.charAt(2) <= 90
         && (int) szam.charAt(3) >= 48 && (int) szam.charAt(3) <= 57
         && (int) szam.charAt(4) >= 48 && (int) szam.charAt(4) <= 57
         && (int) szam.charAt(5) >= 48 && (int) szam.charAt(5) <= 57
         && szam.length() == 6)) {
            System.out.println("Rossz a formátum, próbáld újra!!");
            szam = bill.nextLine();
        } 
        System.out.println("Jó a formátum!!");
        System.out.println("A rendszámod: " + szam);
    }
    
}
