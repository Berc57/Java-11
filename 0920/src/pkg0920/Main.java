/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0920;

import java.util.Scanner;
/**
 *
 * @author diak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int szam;
        szam = 5;
        int szam1;
        szam1 = szam;
        for( ; ; ) {
            if (szam == 0) break;
            System.out.println("Hello!");
            szam--;
        }
        if (szam1 % 2 == 0) {
            System.out.println("Páros");
            }
            else {
            System.out.println("Páratlan");
            }
        
        
        
        
        for( ; ;) {
            System.out.print(szam +"\t");
            if (szam == szam1) break;
            szam++;
        }
        System.out.println();
        for( ; ;) {
            System.out.print(szam +"\t");
            if (szam == 0) break;
            szam--;
        }
        
        System.out.println();
        for( ; ;) {
            if (szam % 2 == 0 && szam !=0)
                System.out.println(szam);
            if (szam == szam1) break;
            szam++;
        }
        Scanner bill = new Scanner(System.in);
        
        int megadott;
        megadott = 0;
        for( ; ;){
            if(megadott == szam1) break;
            System.out.print("Kérem adjon meg egy számot: ");
            megadott = bill.nextInt();
        }
    }
    
}
