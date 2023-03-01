/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2023.pkg02.pkg21;
import java.util.Scanner;


public class Main {
    public static void primszam(int szam1){
        if (szam1 % szam1 == 0 && szam1 % 1 == 0 && szam1 % 2 != 0){
            System.out.println("A(z) " + szam1 + " prím szám!!");
        }
        else{
            System.out.println("A(z) " + szam1 + " NEM prím szám!!");
        }
    }

    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        int szam1 = 1;
        
        while (szam1 != 0){
            System.out.print("Adj meg egy számot: ");
            szam1 = bill.nextInt();
            primszam(szam1);
        }
        
    }
    
}
