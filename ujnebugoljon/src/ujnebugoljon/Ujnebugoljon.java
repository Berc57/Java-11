/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujnebugoljon;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Ujnebugoljon {

   public static boolean novekvo(int szam1, int szam2, int szam3){
       if (szam1 < szam2 & szam2 < szam3)
       {
           return true;
       }
       else{
           return false;
       }
   }
   
    public static int osszeg(int tobbszam){
        
   }
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.println("Adj meg egy számot: ");
        int szam1;
        szam1 = bill.nextInt();
        System.out.println("Adj meg egy számot: ");
        int szam2;
        szam2 = bill.nextInt();
        System.out.println("Adj meg egy számot: ");
        int szam3;
        szam3 = bill.nextInt();
        
        System.out.println("Növekvő sorban vannak?: " + novekvo(szam1, szam2, szam3));
        
        System.out.println("Adj meg egy több jegyű számot: ");
        int tobbszam;
        tobbszam = bill.nextInt();
        
        System.out.println("A szám karaktereinek összege: " + osszeg(tobbszam));
    }
    
}
