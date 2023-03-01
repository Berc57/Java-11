/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nov4;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Nov4 {

    public static int atlag(int egy, int ket){
        return (egy + ket) / 2;
    }
    
    public static void vonal() {
        System.out.println("*************************");
        System.out.println("*        Feladat        *");
        System.out.println("*************************");
    }
    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Add meg az első számot: ");
        int egy = bill.nextInt();
        System.out.print("Add meg a második számot: ");
        int ket = bill.nextInt();
        
        System.out.println("A két szám átlaga: " + atlag(egy,ket));
        
        vonal();
        
        System.out.print("Add meg az első számot: ");
        int elso = bill.nextInt();
        System.out.print("Add meg a második számot: ");
        int maso = bill.nextInt();
        int randomszam = (int) (Math.random() * maso-elso+1) + elso;
        System.out.println("A két szám közötti random szám: " + randomszam);
    }
    
}
