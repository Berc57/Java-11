/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.pkg07;
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
        Scanner bill = new Scanner(System.in);
        System.out.println("Kérek egy számot: ");
        int szam1 = bill.nextInt();
        
        while (szam1 <= 0 | szam1 % 2 != 0){
            System.out.println("Új szám kell");
            szam1 = bill.nextInt();
        }
        int szam2;
        do{    
        System.out.println("Adj meg egy számot");
        szam2 = bill.nextInt();
        } while(!(szam2 > 0 && szam2 % 2 == 0));
        
        int randomszam;
        randomszam = (int) (Math.random() * 10) + 1;
        int szam3;
        System.out.println("Találd ki a számot: ");
        szam3 = bill.nextInt();
        while (szam3 != randomszam){
            System.out.println("Találd ki a számot: ");
            szam3 = bill.nextInt();
            System.out.println("Próbálkozz újra");
            if (szam3 < randomszam){
                System.out.println("A szám nagyobb");
            }
            else if (szam3 > randomszam){
                System.out.println("A szám kisebb");
            }
        }
        
        
        
    }
    
}
