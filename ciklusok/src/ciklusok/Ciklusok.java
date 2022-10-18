/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciklusok;

/**
 *
 * @author diak
 */
public class Ciklusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        //növekmények ciklus (FOR)
        for (i = 0; i < 5; i++){
            System.out.println(i);
        }
        //FOR visszafele
        for (i = 4; i > -1; i--){
            System.out.println(i);
        }
        for (i = 0; i < 8; i+=2){
            System.out.println(i);
        }
        //előtesztelő ciklus
        int szam = 0;
        while(szam < 5){
            System.out.println(szam);
            szam += 1;
        
        }
        int parosszam = 1;
        while(parosszam < 20){
            System.out.println(szam);
            if (parosszam % 2 == 0){
                System.out.println("Páros");
            }
            else{
                System.out.println("Nem páros");
                parosszam++;
            }
        
        }
    }
    
}
