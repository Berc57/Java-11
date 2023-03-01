/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1209feladat;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Main {

    public static double ize(int osszeg, int ev, int kamat){
        return osszeg * (kamat / 10) * ev;
    }
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.print("Add meg az összeget: ");
        int osszeg = bill.nextInt();
        System.out.print("Add meg a kamatot (%): ");
        int kamat = bill.nextInt();
        System.out.print("Add meg az évet: ");
        int ev = bill.nextInt();
        
        System.out.println("Ennyi lesz a pénz: " +  ize(osszeg, ev, kamat));
    }
    
}
