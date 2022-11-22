/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20221122;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Main {

    public static void vonal() {
        System.out.println("*************************");
        System.out.println("*        Feladat        *");
        System.out.println("*************************");
    }
    
    public static int legkisebb(int szam1, int szam2, int szam3){
        return Math.min(Math.min(szam1, szam2),szam3);
    }
    
    public static String kozepso(String szoveg){
        int hossz = szoveg.length();
        int hely;
        int length;
        if (hossz % 2 == 0)
        {
            hely = hossz / 2 - 1;
            length = 2;
        } 
        else
        {    
           hely = hossz / 2;
           length = 1;
        }
        return szoveg.substring(hely, hely + length);
    }
    
    public static int maganhangzok(String szo){
        int count = 0;
        for (int i=0 ; i<szo.length(); i++){
            char ch = szo.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
            {
            count ++;
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("Add meg a mondatod");
        String szo;
        szo = bill.nextLine();
        System.out.print("Adj meg egy egész számot: ");
        int szam1;
        szam1 = bill.nextInt();
        System.out.print("Meg még egyet: ");
        int szam2;
        szam2 = bill.nextInt();
        System.out.print("És mégegyet: ");
        int szam3;
        szam3 = bill.nextInt();
        
        System.out.println("A legkisebb szám a 3 közül: " + legkisebb(szam1, szam2, szam3));
        
        vonal();
        
        System.out.println("Adj meg egy szót: ");
        System.out.println("A középső betűje vagy betűjük: " + kozepso(szo));
        
        vonal();
        
        System.out.println("Adj meg egy mondatot amiben meg akarod számolni a magánhangzókat: ");
        String szoveg;
        szoveg = bill.nextLine();
        System.out.println("Magánhangzók száma: " + maganhangzok(szo));
        
        vonal();
        
        System.out.println();
        
    }
    
}
