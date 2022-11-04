/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendszaminput;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Rendszaminput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        
        System.out.print("Add meg a rendszámot: ");
        String rendszam = bill.nextLine();
        System.out.println("A rendszám: " + rendszam);
        System.out.println("A rendszám 3 betűje: " + rendszam.substring(0, 3));
        System.out.println("A rendszám 3 száma: " + rendszam.substring(3, rendszam.length()));
        String szamokstring = rendszam.substring(3, rendszam.length());
        
        String egy = rendszam.substring(3);
        String ketto = rendszam.substring(4);
        String harom = rendszam.substring(5);
        String szamok = "0123456789";
        System.out.println(egy);
        
        if(rendszam.length() == 6){
            int szam1 = Integer.parseInt(szamokstring);
            System.out.println("Ezaz");
        }
        else{
         System.out.println("Nem jó.. adj meg más formátumot!!");   
        }
        
    }
    
}
