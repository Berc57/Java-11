/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2022.pkg10.pkg18;
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
        
        System.out.print("Adj meg egy egész, pozitív számot: ");
        int szam1 = bill.nextInt();
        System.out.println("A számod: " + szam1);
        System.out.print("Adj meg még egy egész, pozitív számot: ");
        int szam2 = bill.nextInt();
        System.out.println("A számod: " + szam2);
        
        int megoldas = 0;
        for(int i = 1; i <= (szam1*szam2); i++){
            if(((i % szam1) == 0) && ((i % szam2) == 0)){
                megoldas = i;
                break;
        }
       }
        

        
        
        System.out.println("A legkisebb közös többszörös: " + megoldas );
    }
    
}
