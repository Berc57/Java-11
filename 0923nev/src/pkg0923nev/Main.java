/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0923nev;
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
        
        System.out.print("Add meg az A oldalt: ");
        int a = bill.nextInt();
        System.out.print("Add meg az B oldalt: ");
        int b = bill.nextInt();
        System.out.print("Add meg az C oldalt: ");
        int c = bill.nextInt();
        
        if ((a*a)+(b*b) == (c*c)) 
        {
            System.out.println("A " + a + " , " + b + " és " + c + " derékszögű!!");
        }
        else
        {
            System.out.println("Nem derékszögű");
        }
        System.out.print("Add meg az A oldalt: ");
        int a2 = bill.nextInt();
        System.out.print("Add meg az B oldalt: ");
        int b2 = bill.nextInt();
        
        double c2 = Math.sqrt((a*a)+(b*b));
        
        System.out.println("A C oldal: " + c2 );
    }
    
}
