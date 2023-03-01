/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keindl_bercel;
import java.util.Scanner;

/**
 *
 * @author diak
 */
public class Keindl_Bercel {
    
    public static boolean maile(String email){
        if (email.contains("@")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        A válaszok kiírása egész mondatos szövegként történjen. Példa: "A tömbben 2 olyan szám van, amit nagyobb szám követ."

Feladatok:
1.
//Kérje be a program a felhasználótól az email címét addig, amíg formailag nem megfelelő címet ad meg
//Az ellenőrzéshez készíts egy saját metódust, ami visszaadja, hogy helyes vagy nem helyes a formátum
//A formátum akkor helyes, ha van benne @ jel
2.
//Hozz létre egy 5 elemű tömböt vagy ArrayList-et. Töltsd fel random egész szám adatokkal 10 és 20 között
//hány olyan szám van a tömbben vagy listában, melyet egy tőle nagyobb szám követ?
//Vizsgáld meg, hogy a tömb elemei növekvő sorrendben állnak-e
        */
        
        //1. feladat
        
        Scanner bill = new Scanner(System.in);
        System.out.print("Add meg az email címed: ");
        String email = bill.nextLine();
        
        while (maile(email) != true){
            if (maile(email)) {
                System.out.println("A gmail cím formailag megfelelő!");
            }
            else{
                System.out.println("A gmail cím formailag NEM megfelelő!");
            }
            System.out.print("Add meg az email címed: ");
            email = bill.nextLine();
        }
        
        //2. feladat
        int[] list = new int[5];
        int randomSzam = (int) (Math.random() * 11) + 10;
        
        for (int i = 0; i < 5; i++){
            randomSzam = (int) (Math.random() * 11) + 10; 
            list[i] = (randomSzam);
        }
        
        int count1 = 0;
        
        for (int i = 0; i < list.length-1; i++){
            if (list[i] < list[i+1]){
                count1 = count1 + 1;
            }
        }
        System.out.println(count1 + " db olyan szám van amit utána egy nagyobb szám követ.");
        
        int count2 = 0;
        
        for (int i = 0; i < list.length-1; i++){
            if (list[i+1] > list[i]){
                count2 = count2 + 1;
            }
        }
        if (count2 == 4){
            System.out.println("A lista elemei növekvő sorrendben vannak!");
        }
        else{
            System.out.println("A lista elemei nincsenek növekvő sorrendben!");
        }
       
        
    }
    
}
