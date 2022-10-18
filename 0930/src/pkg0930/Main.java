/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0930;

/**
 *
 * @author diak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomSzam = (int) (Math.random() * 7) + 1;
        System.out.println(randomSzam);
        
        if (randomSzam == 1){
            System.out.println("Hétfő");
        }
        else if (randomSzam == 2){
            System.out.println("Kedd");
        }
        else if (randomSzam == 3){
            System.out.println("Szerda");
        }
        else if (randomSzam == 4){
            System.out.println("Csütörtök");
        }
        else if (randomSzam == 5){
            System.out.println("Péntek");
        }
        else if (randomSzam == 6){
            System.out.println("Szombat");
        }
        else if (randomSzam == 7){
            System.out.println("Vasárnap");
        }

    }
    
}
