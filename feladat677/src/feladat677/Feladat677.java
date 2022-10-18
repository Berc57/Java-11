/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat677;
import java.util.Scanner;
/**
 *
 * @author diak
 */
public class Feladat677 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Adj meg egy egész számot: ");
        int szam1;
        szam1 = bill.nextInt();
        
        
        System.out.print("Adj meg egy egész számot: ");
        int szam2;
        szam2 = bill.nextInt();
        
        
        System.out.print("Adj meg egy egész számot: ");
        int szam3;
        szam3= bill.nextInt();
        
        
        if ((szam1*szam1) + (szam2*szam2) == (szam3*szam3));
        System.out.println("");
    }
    
}
