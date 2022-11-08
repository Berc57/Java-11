/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok2_1008;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Metodusok2_1008 {

    public static int gula(int oldal, int magas)
    {
        int terfogat = ((oldal * oldal) * magas) / 3;
        return terfogat;
    }
    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Add meg az oldalt: ");
        int oldal = bill.nextInt();
        System.out.print("Add meg a magasságot: ");
        int magas = bill.nextInt();
        
        System.out.println("A gúla térfogata: " + gula(oldal, magas));
    }
    
}
