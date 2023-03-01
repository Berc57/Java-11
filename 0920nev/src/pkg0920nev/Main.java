/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0920nev;
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
        
        System.out.print("Adj meg egy számot: ");
        int szam = bill.nextInt();
        
        for (int i = 0; i < szam; i++)
        {
            System.out.println("Hello!!");
        }
        if (szam % 2 == 0)
        {
            System.out.println("A szám páros");
        }
        if (!(szam % 2 == 0))
        {
            System.out.println("A szám nem páros");
        }
        for (int i = 0; i < szam; i++)
        {
            System.out.print((i+1)+"     ");
        }
        System.out.println("");
        
        for (int i = szam; i > 0; i--)
        {
            System.out.print(i+"     ");
        }
        System.out.println("");
        System.out.println("Csak a párosak: ");
        
        for (int i = 0; i < szam; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
        
        System.out.println("Találd ki a számot!!: ");
        int talaldki = bill.nextInt();
        
        while (!( talaldki == szam))
        {
            System.out.println("Próbáld újra!! ");
            talaldki = bill.nextInt();
        }
        System.out.println("Ügyes!!");
    }
    
}
