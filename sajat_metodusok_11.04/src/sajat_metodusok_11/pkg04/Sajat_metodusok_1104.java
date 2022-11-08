/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sajat_metodusok_11.pkg04;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Sajat_metodusok_1104 {
    
    public static double atlag(int szam1, int szam2)
    {
        int szam3 = szam1 + szam2;
        int osszeg = szam3 / 2;
        return osszeg;
    }
    
    public static void vonal()
    {
        System.out.println("*************************");
        System.out.println("*        Feladat        *");
        System.out.println("*************************");    
    }
    
    public static int tartomany(int also, int felso)
    {
        int randomSzam = (int) (Math.random() * (felso-also+1)) + also;
        return randomSzam;
    }
    
    public static int gula(int oldal, int magas)
    {
        int terfogat = ((oldal * oldal) * magas) / 3;
        return terfogat;
    }
    
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Adj meg egy számot ");
        int szam1 = bill.nextInt();
        System.out.print("Adj meg még egy számot ");
        int szam2 = bill.nextInt();
        double osszeg = atlag(szam1, szam2);
        System.out.println(osszeg);
        
        vonal();
        
        System.out.print("Adj meg egy alsó határt: ");
        int also = bill.nextInt();
        System.out.print("Adj meg egy felső határt: ");
        int felso = bill.nextInt();
        int lenyegtelen;
        if (felso < also){
            lenyegtelen = felso;
            felso = also;
            also = lenyegtelen;
            System.out.println("Csere!!, " + "Alsó: " + also + ", Felső: " + felso);
        }
        int generalt = tartomany(also, felso);
        System.out.println(generalt);
        
        vonal();
        
        int[] tomb = new int[20];
        for(int i = 0; i < 20; i++){
            tomb[i] = tartomany(also, felso);
            System.out.print(tomb[i] + ", ");
        }
        System.out.println("");
        vonal();
        
        System.out.print("Add meg az oldalt: ");
        int oldal = bill.nextInt();
        System.out.print("Add meg a magasságot: ");
        int magas = bill.nextInt();
        
        System.out.println("A gúla térfogata: " + gula(oldal, magas));
        
    }
    
}
